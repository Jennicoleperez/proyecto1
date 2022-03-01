/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer Pérez
 */
public class Funciones {
    /**
     *
     * Método lee el archivo local
     */ 
         
    public Listas leerTxt(){
        ListaUsuario listaUsuario = new ListaUsuario();
        ListaRelaciones listaRelaciones = new ListaRelaciones();
               
        String linea;
        String datos_txt = "";
        String path = "test\\datosUsuarios.txt";
        File file = new File(path);        
                                            
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            else{
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);   
                    
                    while ((linea = br.readLine()) != null ){
                        if (!linea.isEmpty()){
                            datos_txt += linea + "\n";                      
                        }
                    }
                    
                    if (!"".equals(datos_txt)&& !datos_txt.isEmpty()){
                        String[] datos_split = datos_txt.split("\n");                                              
                        int i = 0;                        
                        
                        if("Usuarios".equals(datos_split[i])) {
                            i++;
                            while (!datos_split[i].equals("Relaciones")) {
                                String[] usuarios_split = datos_split[i].split(",");                                                 
                                listaUsuario.agregarFinal(Integer.parseInt(usuarios_split[0]), usuarios_split[1]);
                                i++;
                            }                                                                    }
                        if ("Relaciones".equals(datos_split[i])) {
            
                            i++;
                            while (i < datos_split.length) {
                                String[] relaciones_split = datos_split[i].split(", ");

                                listaRelaciones.agregarFinalRelaciones(Integer.parseInt(relaciones_split[0]), Integer.parseInt(relaciones_split[1]), Integer.parseInt(relaciones_split[2]));
                                i++;
                            }
                        }
                    }
                    
                    br.close();
                    JOptionPane.showMessageDialog(null, "Lectura exitosa.");
                    
                }
                }catch (Exception err){
                    JOptionPane.showMessageDialog(null, "Error al leer los datos.");
                }
                  return new Listas(listaUsuario, listaRelaciones);                            
    }
    /**
     *
     * Método lee el archivo cargado desde otra carpeta
     */
    public Listas leerTxtCargado(){
        ListaUsuario listaUsuario = new ListaUsuario();
        ListaRelaciones listaRelaciones = new ListaRelaciones();
               
        String linea;
        String datos_txt = "";

        try {
            JFileChooser fileC = new JFileChooser();
            fileC.showOpenDialog(null);
            File file = fileC.getSelectedFile();
            if (!file.exists()) {
                file.createNewFile(); //si el archivo no existe, lo crea
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((linea = br.readLine()) != null) {
                    if (!linea.isEmpty()) {
                        datos_txt += linea + "\n";
                    }
                }
                if (!"".equals(datos_txt)&& !datos_txt.isEmpty()){
                        String[] datos_split = datos_txt.split("\n");                                              
                        int i = 0;                        
                        
                        if("Usuarios".equals(datos_split[i])) {
                            i++;
                            while (!datos_split[i].equals("Relaciones")) {
                                String[] usuarios_split = datos_split[i].split(",");                                                 
                                listaUsuario.agregarFinal(Integer.parseInt(usuarios_split[0]), usuarios_split[1]);
                                i++;
                            }
                        }
                        if ("Relaciones".equals(datos_split[i])) {
            
                            i++;
                            while (i < datos_split.length) {
                                String[] relaciones_split = datos_split[i].split(", ");

                                listaRelaciones.agregarFinalRelaciones(Integer.parseInt(relaciones_split[0]), Integer.parseInt(relaciones_split[1]), Integer.parseInt(relaciones_split[2]));
                                i++;
                            }
                        }
                    }
                    
                    br.close();
                    JOptionPane.showMessageDialog(null, "Lectura exitosa.");
                    
                }
                }catch (Exception err){
                    JOptionPane.showMessageDialog(null, "Error al leer los datos.");
                }
                  return new Listas(listaUsuario, listaRelaciones);  
    }

    /**
     *
     * Método que reescribe el archivo txt a partir de los cambios hechos por el
     * usuario
     */
    public void escribirTxt(Listas listas){  
        ListaUsuario listaUsuario = listas.getListaUsuario();
        ListaRelaciones listaRelaciones = listas.getListaRelaciones();
        
        String info = "";
            info += listaUsuario.getInformacionListaUsuario();
            info += listaRelaciones.getInformacionListaRelaciones();

            try {
                PrintWriter pw = new PrintWriter("test\\datosUsuarios.txt");
                pw.print(info);
                pw.close();
                JOptionPane.showMessageDialog(null, "Se actualizó el repositorio correctamente.");
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            }
    }
    
    public String [] getRelaciones(Listas listas) {
        String [] relUsuarios = listas.getListaRelaciones().getArrayRelacion();
        String [] relaciones = new String[relUsuarios.length];

        int j = 0;
        for (int i = 0; i < relUsuarios.length; i++) {
            relaciones[j] = relUsuarios[i];
            j++;
        }

        return relaciones;
    }
    
    /**
     *
     * Genera el archivo txt en lenguaje de Graphviz para luego generar
     * la imagen del grafo
     */
    public void generarArchivoGraphviz(Listas listas) {

        String info = "strict graph" + "\n"
                + "{" + "\n"
                + "rankdir=LR;" + "\n";
        
        String[] nodos = listas.getListaUsuario().getIDs();

        for (int i = 0; i < nodos.length; i++) {
            info += nodos[i] + ";" + "\n";
        }

        ListaRelaciones listaRelaciones = listas.getListaRelaciones();

        info += listaRelaciones.getRelacionesGraphviz();
        info += "}" + "\n";
        System.out.println(info);
        try {
            PrintWriter pw = new PrintWriter("test\\grafo.txt");
            pw.print(info);
            pw.close();

        } catch (Exception e) {

        }
    }

    /**
     *
     * Genera la imagen del grafo 
     * @param listas listas con todos los datos
     */

    public void generarGrafoJpg(Listas listas) {
        try {
            this.generarArchivoGraphviz(listas);
            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";

            String fileInputPath = "test\\grafo.txt";
            String fileOutputPath = "test\\grafoImagen.jpg";

            String tParam = "-Tjpg";

            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }
}
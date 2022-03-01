/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

/**
 *
 * @author Jennifer Pérez
 */
public class MatrizAdyacencia {

    int numNodos;
    int[][] matriz;
    int[] valores;
    int posicion;

    public MatrizAdyacencia(int numNodos) {
        this.numNodos = numNodos;
        this.matriz = new int[numNodos][numNodos];
        this.valores = new int[numNodos];
        this.posicion = 0;
    }

    public void agregarVert(int usuario1, int usuario2) {
        matriz[usuario1][usuario2] = 1;
    }

    public void agregarVert(int usuario1, int usuario2, int tiempoDeAmistad) {
        matriz[usuario1][usuario2] = tiempoDeAmistad;
    }

    /**
     *
     * Método la matriz de adyacencia sin los pesos correspondientes, utilizada
     * posteriormente para el recorridos DFS
     *
     * @return matriz de adyacencia sin los pesos correspondientes
     *
     */
    public int[][] getMatrizSP() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else if (matriz[i][j] == 0) {
                    matriz[i][j] = 0;
                }

            }
        }
        return matriz;
    }

    public void imprimirMatriz() {
  
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "     ");
            }
            System.out.println("");
        }
    }
}

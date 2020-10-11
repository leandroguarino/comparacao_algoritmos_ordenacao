/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula18_comparacao_algoritmos_ordenacao_codigo;

/**
 *
 * @author leandro
 */
public class InsertionSort {
    public static int[] sort(int[] vetor){
        int aux, j;
        for(int i=1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1; 
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        return vetor;
    }
}

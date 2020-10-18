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
    public static Resultado sort(int[] vetor){
        int trocas = 0; 
        int aux, j;
        for(int i=1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1; 
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
                trocas++;
            }
            vetor[j+1] = aux;
            trocas++;
        }
        return new Resultado(vetor, trocas);
    }
}

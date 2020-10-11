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
public class ShellSort {
    public static int[] sort(int[] vetor){
        int h = 1;
        int n = vetor.length;
        while(h < n){
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);
        
        int elemento, j;
        while(h > 0){
            for(int i = h; i < n; i++){
                elemento = vetor[i];
                j = i;
                while(j >= h && vetor[j - h] > elemento){
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = elemento;
            }
            h = h / 2;
        }
        return vetor;
    }
}

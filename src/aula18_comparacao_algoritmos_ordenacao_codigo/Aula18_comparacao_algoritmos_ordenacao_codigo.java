package aula18_comparacao_algoritmos_ordenacao_codigo;

public class Aula18_comparacao_algoritmos_ordenacao_codigo {

    public static void main(String[] args) {
        int[] vetor = new int[100000]; //vetor de 100.000 elementos
        int[] vetorClone = null;
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        long inicio, fim;
        
        vetorClone = vetor.clone();        
        inicio = System.currentTimeMillis();
        BubbleSort.sort(vetorClone);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Bubble Sort: " + (fim-inicio) + " ms");
        
        vetorClone = vetor.clone();        
        inicio = System.currentTimeMillis();
        InsertionSort.sort(vetorClone);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Insertion Sort: " + (fim-inicio) + " ms");
        
        vetorClone = vetor.clone();        
        inicio = System.currentTimeMillis();
        SelectionSort.sort(vetorClone);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Selection Sort: " + (fim-inicio) + " ms");
        
        vetorClone = vetor.clone();        
        inicio = System.currentTimeMillis();
        ShellSort.sort(vetorClone);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Shell Sort: " + (fim-inicio) + " ms");
        
        vetorClone = vetor.clone();        
        inicio = System.currentTimeMillis();
        HeapSort.sort(vetorClone);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Heap Sort: " + (fim-inicio) + " ms");
        
        vetorClone = vetor.clone();        
        inicio = System.currentTimeMillis();
        QuickSort.sort(vetorClone, 0, vetorClone.length-1);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Quick Sort: " + (fim-inicio) + " ms");
              
        
    }
    
}

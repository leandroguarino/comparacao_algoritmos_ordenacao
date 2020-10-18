package aula18_comparacao_algoritmos_ordenacao_codigo;

public class Resultado {
    private int[] vetor;
    private int trocas;
    
    public Resultado(int[] vetor, int trocas){
        this.vetor = vetor;
        this.trocas = trocas;
    }

    public int[] getVetor() {
        return vetor;
    }

    public int getTrocas() {
        return trocas;
    }
    
    
}

public class Exercicio01 {
    public static void executar() {

        double[] vetor = new double[5];
        double valorFinal = 0;
        for (int i = 0; i < 5; i++) {
            double valor = Prompt.lerDecimal("Digite um número:");
            vetor[i] = valor;
            valorFinal = valorFinal + valor;
        }
        double media = valorFinal / 5;
        Prompt.imprimir("Média: " + media);
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < media) {
                Prompt.imprimir("Menor: " + vetor[i]);
            } else if (vetor[i] == media) {
                Prompt.imprimir("Igual: " + vetor[i]);
            } else if (vetor[i] > media) {
                Prompt.imprimir("Maior: " + vetor[i]);
            }
        }
    }
}

public class Exercicio13 {
    public static void executar() {
        int n = Prompt.lerInteiro("Digite um número: ");

        int[] vetor = new int[n];

        vetor[0] = 1;
        vetor[1] = 1;
        for (int i = 2; i < n; i++) {
            vetor[i] = vetor[i - 1] + vetor[i - 2];
            Prompt.imprimir("Vetor: " + vetor[i]);
        }
    }
}

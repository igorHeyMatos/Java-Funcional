public class Exercicio09 {
    public static void executar() {
        double[] A = new double[5];
        double[] B = new double[5];
        double[] C = new double[5];

        for (int i = 0; i < 5; i++) {
            A[i] = Prompt.lerDecimal("Digite um número para o vetor A: ");
        }

        for (int i = 0; i < 5; i++) {
            B[i] = Prompt.lerDecimal("Digite um número para o vetor B: ");
        }

        for (int i = 0; i < 5; i++) {

            if (i % 2 == 0) {
                C[i] = A[i];
                Prompt.imprimir("Par: " + C[i]);
            } else {
                C[i] = B[i];
                Prompt.imprimir("Impar: " + C[i]);
            }
        }
    }
}

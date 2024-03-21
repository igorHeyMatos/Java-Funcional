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

            if (A[i] % 2 == 0) {
                C[i] = A[i];
            } else if (B[i] % 2 == 1) {
                C[i] = B[i];
            }

        }

        for (int i = 0; i < 5; i++) {

            if (i % 2 == 0) {
                Prompt.imprimir("Par: " + C[i]);
            } else {
                Prompt.imprimir("Impar: " + C[i]);
            }
        }
    }
}

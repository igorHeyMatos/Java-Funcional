public class Exercicio10 {
    public static void executar() {
        double[] A = new double[5];
        double[] B = new double[5];

        for (int i = 0; i < 5; i++) {
            A[i] = Prompt.lerDecimal("Digite um elemento: ");
        }

        for (int c = 0; c < 5; c++) {
            Prompt.imprimir("A: " + A[c]);
        }

        for (int j = 5 - 1; j >= 0; j--) {
            B[j] = A[j];
            Prompt.imprimir("B: " + B[j]);
        }
    }
}

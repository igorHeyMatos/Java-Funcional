public class Exercicio08 {
    public static void executar() {
        String[] A = new String[5];
        String[] B = new String[5];
        String[] C = new String[5];

        for (int i = 0; i < 5; i++) {
            A[i] = Prompt.lerLinha("Digite algo para concatenar: ");
            B[i] = Prompt.lerLinha("Digite algo para concatenar: ");

            C[i] = A[i] + B[i];
        }

        for (int i = 0; i < 5; i++) {
            Prompt.imprimir("Resultado: " + C[i]);
            Prompt.imprimir("<------------------------>");
        }

    }
}

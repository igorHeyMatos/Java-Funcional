public class Exercicio15 {
    public static void executar() {
        int[] vetor = new int[5];
        int num = 1;

        for (int i = 0; i < 5; i++) {
            while (true) {
                vetor[i] = Prompt.lerInteiro("Digite um número: ");

                if (vetor[i] > num) {
                    num = vetor[i];
                    break;
                } else {
                    Prompt.imprimir("Número invalido!");
                }
            }
        }

        Prompt.imprimir("<---------------->");

        for (int c = 0; c < 5; c++) {
            Prompt.imprimir("Número: " + vetor[c]);
        }

    }
}

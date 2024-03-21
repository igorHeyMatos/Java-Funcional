public class Exercicio15 {
    public static void executar() {
        int[] vetor = new int[5];
        int[] maior = new int[5];

        maior[0] = 0;
        for (int i = 0; i < 5; i++) {
            do {
                vetor[i] = Prompt.lerInteiro("Digite um número: ");
                if (vetor[i] < maior[i]) {
                    Prompt.imprimir("Digite novamente! Valor invalido!");
                } else {
                    maior[i] = vetor[i];
                }
            } while (vetor[i] < maior[i]);
        }

        for (int c = 0; c < 5; c++) {
            Prompt.imprimir("Número: " + maior[c]);
        }
    }
}

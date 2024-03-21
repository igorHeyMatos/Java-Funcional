public class Exercicio11 {
    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int resultado = 0;

        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite um número: ");
        }

        Prompt.imprimir("<--------------------------->");

        for (int c = 0; c < 5; c++) {
            vetorB[c] = Prompt.lerInteiro("Digite um número: ");
        }

        Prompt.imprimir("<--------------------------->");

        for (int r = 0; r < 5; r++) {
            resultado = resultado + (vetorA[r] * vetorB[r]);
            Prompt.imprimir(r + ": " + resultado);
        }

        Prompt.imprimir("<--------------------------->");

        Prompt.imprimir("Resultado: " + resultado);

    }
}

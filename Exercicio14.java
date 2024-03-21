public class Exercicio14 {
    public static void executar() {
        int[] vetorA = new int[5];
        int maior = 0;

        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite um número: ");
            if (vetorA[i] > maior) {
                maior = vetorA[i];
            }
        }

        for (int c = 0; c < 5; c++) {
            if (vetorA[c] < maior) {
                Prompt.imprimir("Número: " + vetorA[c]);
            }
            if(c >= 4){
                Prompt.imprimir("Maior: " + maior);
            }
        }

    }
}

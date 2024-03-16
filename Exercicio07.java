public class Exercicio07 {
    public static void executar() {
        double[] primeiroVet = new double[5];
        double[] segundoVet = new double[5];

        for (int i = 0; i < 5; i++) {
            primeiroVet[i] = Prompt.lerDecimal("Digite um número: ");
        }

        Prompt.imprimir("Segundo vetor:");

        for (int i = 0; i < 5; i++) {
            segundoVet[i] = Prompt.lerDecimal("Digite um número: ");
        }

        int cont = 0;
        for (int i = 0; i < 5; i++) {
            if (primeiroVet[i] == segundoVet[i]) {
                cont++;
            }
        }

        if (cont == 5) {
            Prompt.imprimir("Vetores iguais.");
        } else {
            Prompt.imprimir("Os vetores não são iguas.");
        }
    }
}

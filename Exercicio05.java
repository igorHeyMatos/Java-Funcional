public class Exercicio05 {
    public static void executar() {

        double[] vet = new double[5];

        for (int i = 0; i < 5; i++) {
            vet[i] = Prompt.lerDecimal("Digite um número: ");
        }
        double n = Prompt.lerDecimal("Digite um número qualquer: ");
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            if (n == vet[i]) {
                cont++;
            }
        }
        if (cont == 1) {
            Prompt.imprimir("Apareceu: " + cont + " vez");
        } else {
            Prompt.imprimir("Apareceu: " + cont + " vezes.");
        }

    }
}

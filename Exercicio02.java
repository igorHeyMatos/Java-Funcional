public class Exercicio02 {
    public static void executar() {
        int sequencia = Prompt.lerInteiro("Digite a quantidade da sequência: ");
        double[] vet = new double[sequencia];
        for (int i = 0; i < sequencia; i++) {
            double num = Prompt.lerDecimal("Digite um número: ");
            vet[i] = num;
        }

        for (int i = 0; i < sequencia; i++) {
            Prompt.imprimir("Número: " + vet[i]);
            if (vet[i] > 0) {
                Prompt.imprimir("Positivo.");
            } else if (vet[i] < 0) {
                Prompt.imprimir("Negativo.");
            } else {
                Prompt.imprimir("Zero.");
            }
            Prompt.imprimir("<---------------------->");
        }
    }
}

public class Exercicio03 {
    public static void executar() {
        int tamVetor = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        double[] vet = new double[tamVetor];
        double[] vetDobro = new double[tamVetor];
        for (int i = 0; i < tamVetor; i++) {
            double num = Prompt.lerDecimal("Digite um número: ");
            vet[i] = num;
            vetDobro[i] = num * 2;
        }

        Prompt.imprimir("Vetor com valores dobrados:");
        for (int i = 0; i < tamVetor; i++) {
            Prompt.imprimir("Valor: " + vetDobro[i]);
        }
    }
}

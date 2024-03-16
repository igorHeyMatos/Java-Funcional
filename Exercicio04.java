import java.util.Random;

public class Exercicio04 {
    public static void executar() {
        Random numeroAleatorio = new Random();

        int n = numeroAleatorio.nextInt(11);

        double[] vet = new double[5];
        for (int i = 0; i < 5; i++) {
            vet[i] = Prompt.lerDecimal("Digite um número: ");
        }

        for (int i = 0; i < 5; i++) {
            if (vet[i] < n) {
                Prompt.imprimir("Índice: " + i);
            }
        }
        Prompt.imprimir("N: " + n);
    }
}

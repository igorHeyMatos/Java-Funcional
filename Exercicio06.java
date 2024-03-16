public class Exercicio06 {
    public static void executar() {
        double[] notas = new double[5];

        double[] pesos = new double[5];

        for (int i = 0; i < 5; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + i + " do aluno: ");
            pesos[i] = Prompt.lerDecimal("Digite o peso: ");
        }

        double totalNotas = 0;
        double totalPesos = 0;
        for (int i = 0; i < 5; i++) {

            totalNotas = totalNotas + (notas[i] * pesos[i]);
            totalPesos = totalPesos  + (pesos[i] + pesos[i]);
        }

        double mediaPond = totalNotas / totalPesos;
        Prompt.imprimir("Média ponderada: " + mediaPond);
    }
}

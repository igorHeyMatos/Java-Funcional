public class Exercicio12 {
    public static void executar(){
        int[] vetorA = new int[12];
        int resultado = 1;

        for(int i = 0; i < 12; i ++){
            vetorA[i] = Prompt.lerInteiro("Digite um número: ");
        }

        Prompt.imprimir("<----------------------->");

        for(int c = 0; c < 12; c++){
            if(vetorA[c] % 2 == 0 && vetorA[c] != 0 && vetorA[c] > 0){
                resultado = resultado * vetorA[c];
                Prompt.imprimir(c + ": " + resultado);
            }
        }
        Prompt.imprimir("<---------------------->");

        Prompt.imprimir("Resultado: "+ resultado);

    }
}

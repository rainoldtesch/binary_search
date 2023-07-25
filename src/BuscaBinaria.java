public class BuscaBinaria {
    public static int buscar(int[] array, int numero) {
        int comeco = 0;
        int fim = array.length - 1;

        int iteracoes = 0;

        while (comeco <= fim) {
            iteracoes++;

            int meio = (comeco + fim) / 2;

            if (numero < array[meio]) {
                fim = meio - 1;
            } else if (numero > array[meio]) {
                comeco = meio + 1;
            } else {
                System.out.println("Numero de iterações: " + iteracoes);
                return meio;
            }
        }

        return -1;
    }
}
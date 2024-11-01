import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class ExercicioVetor {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        Random rand = new Random();
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(10) + 1;
        }

        bubbleSort(vetor);

        int menorValor = vetor[0];
        int maiorValor = vetor[vetor.length - 1];
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);

        double mediana = (vetor[24] + vetor[25]) / 2.0;
        System.out.println("Mediana: " + mediana);

        Map<Integer, Integer> frequencia = new HashMap<>();
        for (int valor : vetor) {
            frequencia.put(valor, frequencia.getOrDefault(valor, 0) + 1);
        }
        
        System.out.println("Frequência dos valores:");
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int[] vetorUnico = frequencia.keySet().stream().mapToInt(i -> i).toArray();
        System.out.println("Vetor sem valores repetidos: " + Arrays.toString(vetorUnico));
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetorOriginal = new int[10]; // Armazena a cópia do vetor original

        // Preenchendo o vetor
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite apenas números inteiros.");
                scanner.next();
                System.out.print("Número " + (i + 1) + ": ");
            }
            vetor[i] = scanner.nextInt();
            vetorOriginal[i] = vetor[i]; // Armazena cada número no vetor original
        }

        // Mostrando o vetor na forma como foi preenchido
        System.out.println("Vetor na forma como foi preenchido:");
        System.out.println(Arrays.toString(vetor));

        // Ordenando em ordem crescente
        Arrays.sort(vetor);
        System.out.println("Vetor em ordem crescente:");
        System.out.println(Arrays.toString(vetor));

        // Ordenando em ordem decrescente
        int[] vetorDecrescente = Arrays.copyOf(vetor, vetor.length); // Cria uma cópia do vetor ordenado
        for (int i = 0; i < vetorDecrescente.length / 2; i++) {
            int temp = vetorDecrescente[i];
            vetorDecrescente[i] = vetorDecrescente[vetorDecrescente.length - 1 - i];
            vetorDecrescente[vetorDecrescente.length - 1 - i] = temp;
        }
        System.out.println("Vetor em ordem decrescente:");
        System.out.println(Arrays.toString(vetorDecrescente));

        // Imprimindo o vetor na ordem original
        System.out.println("Vetor na ordem original:");
        System.out.println(Arrays.toString(vetorOriginal));

        scanner.close();
    }
}

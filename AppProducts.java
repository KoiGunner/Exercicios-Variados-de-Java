/*

Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos;
Armazene os n produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.

*/

import java.util.Locale;
import java.util.Scanner;

public class AppProducts {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] vect = new Products[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Products(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.printf("Average price: %.2f%n", avg);



        sc.close();
    }
}

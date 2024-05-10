/*

Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos;
Armazene os n produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.

*/

public class Products {
    private String name;
    private double price;

    public Products(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){ return price; }
    public void setPrice(double price){ this.price = price; }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }


}

/*
  Crie uma classe chamada Rectangle para representar um triangulo

  O retângulo deve armazenar as informações do tamanho dos seus lados

  Para criar um retângulo, os tamanhos dos lados devem ser fornecidos

  Alternativamente, se ambos os lados forem do mesmo tamanho, apenas um valor pode ser forneceido
  Depois de criado, os lados não podem ser alterados

  Crie um método square() , que retorna a área do triângulo (basta multiplicar os tamanhos dos dois lados).

  Crie um programa que exemplifica o que foi citado acima 
*/

public class Rectangle{
  private final double width;
  private final double height;
  private final double square;

  public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
    square = width * height;
  }

  public Rectangle(double width){
    this(width,width);
  }

  public double square(){
    return square;
  }  
}

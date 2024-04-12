/*  

Lista de exercícios

1º Escrever a classe Pessoa encapsulada contendo nome e idade, 
construtor (nome e idade) e com o método Imprime que mostra no Console
os dados da pessoa

Resolvido!!

2º Escrever a classe Aluno encapsulada e derivada da classe base Pessoa 
contendo a matricula (int). Fazer construtor (nome, idade e matrícula) e com
o método Imprime, que imprime no console os dados da Pessoa

3º Escrever a classe TestaAluno, que contém o método main, onde serão criadas 3 alunos:
a Ana Souza 31 anos, matricula 1234, a Bia Nunes, 25 anos, matrícula 5678 e Paulo Santos, 
45 anos, matrícula 9876

4º Dentro do main usar o método imprime para mostrar na console as informações dos 3 alunos criados em
tempo de execução.

*/

public class Person{
  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public Person(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age; 
  }

  public void print(){
    System.out.println(name);
    System.out.println(age);
  }
}

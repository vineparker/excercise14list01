import java.util.Scanner;

class Main {
  /*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
  Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
  João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
  Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
  Imprima os dados do programa com as mensagens adequadas.
  */ 
  public static void main(String[] args) {

    // declaração da variáveis 
    Scanner input = new Scanner(System.in);
    float kgpescado, res1, res2;
    
    // informe o valor em quilos da pesca
    String textoUm = "Insira o valor em kg do pescado: ";
    System.out.println(textoUm);
    System.out.println();
    kgpescado = input.nextFloat();
    
    
    if (kgpescado > 50 ) {
      res2 = (kgpescado - 50);
      res1 = (res2 * 4);
      
      System.out.println("Voce excedeu o limite em: " + res2 + "Kg. Voce devera pagar R$" + res1 + " pelo excedente.");

    } else {
      System.out.println("O peso inserido esta dentro do limite aceito. ");
    }

   
    input.close();
  }
}






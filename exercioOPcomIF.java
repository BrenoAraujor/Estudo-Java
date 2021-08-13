import java.util.Scanner;


public class exercioOPcomIF {
    public static void main(String[]args){
    Scanner resposta = new Scanner(System.in);

    System.out.print("Digite a sua data de nascimento: ");
    int ano = resposta.nextInt();
    int idade = 2021 - ano;
     int falta = idade - 18;
    if (idade>=18){
       System.out.print("Parabén você foi aprovado para fazer o exame CNH");

    } else {
     falta = Math.abs(falta);
      System.out.print("Infelizmente ainda falta " +falta+" ano(s) para conseguir fazer o seu exame");

    }



    }
}

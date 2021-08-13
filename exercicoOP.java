import java.util.Scanner;

public class exercicoOP {
    public static void main(String[]args){
    Scanner resp = new Scanner(System.in);

    int ano;

    System.out.print("Em que ano nasceu?");
     ano = resp.nextInt();

     int idade = 2021 - ano;

     String situa = (idade>=18)?"Você já pode ser preso":"Vá tirar a catinga do mixo";

     System.out.print(situa);





    }
}

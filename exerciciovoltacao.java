import java.util.Scanner;

public class exerciciovoltacao {
    public static void main(String[]args){
    Scanner respos = new Scanner(System.in);
    int ano;
    System.out.print("Em que ano Nasceu?");
    ano = respos.nextInt();
   int  idade = 2021 - ano;

   String situa = ((idade>=16&&idade<18 ) || (idade>=18&&idade<60))?"Com a sua idade, você é obrigado a votar":"Não é obrigado a , votar";
    System.out.print(situa);




    }
}

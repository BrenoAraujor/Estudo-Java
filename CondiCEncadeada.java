import java.util.Scanner;

public class CondiCEncadeada {
    public static void main(String[]args){
     Scanner r = new Scanner(System.in);
      System.out.print("Em que ano nasceu?");
     int ano = r.nextInt();
     int idade = 2021 -ano;

     if (idade < 16){
      System.out.print("Não Vota");
     } else {
       if((idade>=16 && idade<18) || (idade>70)){
         System.out.print("voto opcional");
       } else {
           System.out.print("Voto obrigatório");


       }

     }
 


    }
}

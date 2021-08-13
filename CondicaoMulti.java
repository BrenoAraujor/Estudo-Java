import java.util.Scanner;

public class CondicaoMulti {
    public static void main(String[]agrs){
     Scanner res = new  Scanner(System.in);
      int pernas = res.nextInt();
      String tipo;
      switch(pernas){
        case 1:
        
           tipo = "Saci";
           break;
        case 2:
           tipo = "Bípede";
           break;
        case 4:
           tipo = "Quadrúpede";
           break;
        case 6,8:
           tipo = "aranha";
           break;   
           default:
             tipo = "ET";
      }
      System.out.print(tipo);

    }
}

import java.util.Scanner;

public class EsempioDiInput {
   public static void main(String[] args){

     Scanner scan = new Scanner(System.in);
     System.out.print("inserire un numero: ");
     //legge il numero inserito da tastiera
     int num = scan.nextInt();
     //chiude lo scanner dopo l'uso
     scan.close();
     //mostra il numero a video
     System.out.println("il numero inserito è: "+num);
   }
}

import java.util.Scanner;

public class NumPositivoNegativo{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("inserire un numero: ");
    int num = scan.nextInt();

    scan.close();

    if(num > 0){
      System.out.print(num+" e' positivo");
    }else if(num < 0){
      System.out.print(num+" e' negativo");
    }else{
      System.out.println("il numero inserito e' uguale a 0");
    }
  }
}

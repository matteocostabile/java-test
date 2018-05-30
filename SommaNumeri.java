import java.util.Scanner;

public class SommaNumeri{
  public static void main(String[] args){
    float num1, num2, somma;
    Scanner scan = new Scanner(System.in);

    System.out.print("inserire il primo numero: ");
    num1 = scan.nextFloat();

    System.out.print("inserire il secondo numero: ");
    num2 = scan.nextFloat();
    scan.close();

    somma = num1 + num2;
    System.out.println("somma = "+somma);
  }
}

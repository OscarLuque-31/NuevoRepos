import java.util.Scanner;
public class Suma {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Introduce el primer número: ");
    double num1 = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce el segundo número: ");
    double num2 = Double.parseDouble(sc.nextLine());
    
    System.out.println("La suma de estos dos números es " + (num1+num2));

    

  }

}

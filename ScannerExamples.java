import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      
        System.out.println("Enter two numbers");

   // string = input.nextLine();
   // int num1 = input.nextInt();
   // int num2 = input.nextInt();
      double dbl1 = input.nextDouble();
      double dbl2 = input.nextDouble();
    System.out.println("Double is "+ (dbl1+dbl2));

    input.close();
  }
}

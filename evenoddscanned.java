import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    System.out.println("Enter two numbers");
   int num1 = input.nextInt();
   int num2 = input.nextInt();
    if (num1>num2)
    {
      System.out.println(num1+" is greater");
    }
    else
    {
      System.out.println(num2+" is greater");
    }
  //---------------------------------------------
  /*int s = 25;
    if(s>30)
  {
    System.out.println("number is greater than 30");
  }
    if(s>20)
    {
      System.out.println("The number is greater than 20");
    }
      if(s>10)
      {
        System.out.println("The number is greater than 10");
       }*/
 //-------------------------------------------------
    
  }
}
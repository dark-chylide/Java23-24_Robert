import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("oOOO()");
    System.out.println(" /  _) ");
    System.out.println(" |  ( ");
    System.out.println(" \\__)");

     System.out.println("          ()OOOo");
     System.out.println("          (_ ");
     System.out.println("          )  | ");
     System.out.println("          (__\\");
  
    System.out.println("oOOO()");
    System.out.println(" /  _) ");
    System.out.println(" |  ( ");
    System.out.println(" \\__)");

     System.out.println("          ()OOOo");
     System.out.println("          (_ ");
     System.out.println("          )  | ");
     System.out.println("          (__\\");

    System.out.println("____________________________");
  

    Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

    int G = input.nextInt();


   if(G>=100)
    {
      System.out.println("The grade is an A+");
    }
    if(G<90)
    {
      System.out.println("The grade is an A");
    }
     else if(G<80)
    {
      System.out.println("The grade is a B");
    } 
   else if(G<70)
    {
      System.out.println("The grade is a C");
    } 
   else if(G<60)
    {
      System.out.println("The grade is a D");
    }
    else if(G<50)
    {
      System.out.println("The grade is a F, they have failed");
    } 

   
    System.out.println("___________________");

      Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a number");

    int r = input.nextInt();
    final double pi = 3.14;
    double area;
    if(r>0)
    {
     area= pi*r*r;
    System.out.println ("Area is "+area);
    } 
    else{
      System.out.println("Negative radius is not possible");
    }
    input1.close();
  }
}
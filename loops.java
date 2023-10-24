class Main {
  public static void main(String[] args) {
    for(int i=2; i<=10; i+=2)
        {
         System.out.println(i);
        }
    System.out.println("----------------");
   //-----------------------------
    for(int i=10; i>=2; i-=2)
    {
     System.out.println(i);
    }
    System.out.println("----------------");
    //-----------------------------
   int sum = 0;
    for(int i=0; i<=10; i++)
      {
       sum+=i; 
      }
     System.out.println("Sum of 10 numbers is "+sum);
    System.out.println("----------------");
 //-----------------------------
    int i=0;
    while(i<11)
      {
        System.out.println(i);
        i++;
      }
    System.out.println("--------------");

    //----------------------------
  int j = 0;
    do
  {
    System.out.println(j);
    j++;
  }
  while(j<=10);
    System.out.println("End of loop class");
  }
}
class Main {
  public static void main(String[] args) {
    int[] arr = new int[]{8,10,2,7,4,56};
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) 
    {
      if (arr[i] > max)
      {
        max = arr[i];
      }
    }
    System.out.println("The biggest number is " + max);
    //-----------------------
    int ar[] = {1, 2, 3, 4, 5, 8 , 10, 89, 101};
      System.out.println(ar.length);

    System.out.println("_________________-");
    String [] name = {"Alexander","Asees", "Adam" };  
  for(int i=0; i<name.length; i++)
    {
      System.out.println(name[i]);
    }
  }
}

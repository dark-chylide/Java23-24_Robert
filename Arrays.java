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
  }
}
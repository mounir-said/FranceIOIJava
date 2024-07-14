import algorea.Scanner;

class Main {
   static Scanner entrée = new Scanner(System.in);

   public static void main(String[] args) {
      int côté = entrée.nextInt();
      System.out.println(23 * côté * côté);
   }
}
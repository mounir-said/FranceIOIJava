import algorea.Scanner;
class Main {
   static Scanner entrée = new Scanner(System.in);
   public static void main(String[] args) {
      int nbJours = entrée.nextInt();
      System.out.println(nbJours * 16 * 60 * 60);
   }
}
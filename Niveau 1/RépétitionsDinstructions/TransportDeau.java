import static algorea.Robot.*;
class Main {
   public static void main(String[] args) {
      gauche();
      gauche();
      System.out.println("Bonjour, laissez-moi vous aider");
      ramasser();
      for (int I = 1; I <= 32; I++) {
         droite();
      }
      deposer();
   }
}
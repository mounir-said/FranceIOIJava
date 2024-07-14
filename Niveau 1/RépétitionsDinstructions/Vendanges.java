import static algorea.Robot.*;
class Main {
   public static void main(String[] args) {
      for (int i = 1; i <= 20; i = i + 1) {
         ramasser();
         for (int i2 = 1; i2 <= 15; i2 = i2 + 1) {
            droite();
         }
         deposer();
         for (int i2 = 1; i2 <= 15; i2 = i2 + 1) {
            gauche();
         }
      }
   }
}
import static algorea.Robot.*;
class Main {
   public static void main(String[] args) {
      for (int i = 1; i <= 108; i = i + 1) {
         for (int i2 = 1; i2 <= 13; i2 = i2 + 1) {
            haut();
         }
         for (int i2 = 1; i2 <= 13; i2 = i2 + 1) {
            droite();
         }
         for (int i2 = 1; i2 <= 13; i2 = i2 + 1) {
            bas();
         }
         for (int i2 = 1; i2 <= 13; i2 = i2 + 1) {
            gauche();
         }
      }
   }
}
import static algorea.Robot.*;
class Main {
   public static void main(String[] args) {
      int anneau = 1;
      for (int loop1 = 1; loop1 <= 10; loop1 = loop1 + 1) {
         for (int loop2 = 1; loop2 <= anneau; loop2 = loop2 + 1) {
            droite();
         }
         ramasser();
         for (int loop2 = 1; loop2 <= anneau; loop2 = loop2 + 1) {
            gauche();
         }
         deposer();
         anneau = anneau + 1;
      }
   }
}
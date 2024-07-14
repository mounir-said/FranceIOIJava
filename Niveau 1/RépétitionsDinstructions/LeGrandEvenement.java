import static algorea.Robot.*;
class Main {
   public static void main(String[] args) {
      haut();
      // Allers-retours sur les 9 lignes du haut,
      // pour les 8 premières colonnes
      for (int i = 1; i <= 4; i = i + 1) {
         for (int i2 = 1; i2 <= 8; i2 = i2 + 1) {
            haut();
         }
         droite();
         for (int i2 = 1; i2 <= 8; i2 = i2 + 1) {
            bas();
         }
         droite();
      }
    
      // Deux dernières colonnes avec redescente jusqu'en bas
      for (int i = 1; i <= 8; i = i + 1) {
         haut();
      }
      droite();
      for (int i = 1; i <= 9; i = i + 1) {
         bas();
      }
    
      // Et on rentre à la position de départ
      for (int i = 1; i <= 9; i = i + 1) {
         gauche();
      }
   }
}
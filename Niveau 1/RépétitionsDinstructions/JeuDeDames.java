class Main {
   public static void main(String[] args) {
      for (int i = 1; i <= 20; i = i + 1) {
         for (int i2 = 1; i2 <= 20; i2 = i2 + 1) {
            System.out.print("OX");
         }
         System.out.println();
    
         for (int i2 = 1; i2 <= 20; i2 = i2 + 1) {
            System.out.print("XO");
         }
         System.out.println();
      }
   }
}
class Main {
  public static void main(String[] args) {
     int ligne = 1;
     for (int loop1 = 1; loop1 <= 20; loop1 = loop1 + 1) {
        int colonne = 1;
        for (int loop2 = 1; loop2 <= 20; loop2 = loop2 + 1) {
           System.out.print((colonne * ligne) + " ");
           colonne = colonne + 1;
        }
        System.out.println();
        ligne = ligne + 1;
     }
  }
}
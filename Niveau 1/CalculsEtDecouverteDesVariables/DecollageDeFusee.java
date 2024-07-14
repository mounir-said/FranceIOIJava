class Main {
  public static void main(String[] args) {
     int compte = 100;
     for (int loop = 1; loop <= 101; loop = loop + 1) {
        System.out.println(compte);
        compte = compte - 1;
     }
     System.out.println("Décollage !");
  }
}
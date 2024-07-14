class Main {
  public static void main(String[] args) {
     int totalBonbons = 0;
     int numTir = 1;
     for (int loop = 1; loop <= 50; loop = loop + 1) {
        totalBonbons = totalBonbons + numTir;
        System.out.println(totalBonbons);
        numTir = numTir + 1;
     }
  }
}
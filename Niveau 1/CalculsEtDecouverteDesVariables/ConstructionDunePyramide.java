class Main {
  public static void main(String[] args) {
     int nbCubes = 0;
     int largeurArête = 1;
     for (int loop = 1; loop <= 9; loop = loop + 1) {
        nbCubes = nbCubes + largeurArête * largeurArête * largeurArête;
        largeurArête = largeurArête + 2;
     }
     System.out.println(nbCubes);
  }
}
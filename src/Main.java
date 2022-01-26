 class Main {
    public static void main(String[] args) {
        GenerateTokenMethod gene = new GenerateTokenMethod();
        Interaction inter = new Interaction();

        System.out.println("Podane przez ciebie liczby wygenerują ciąg losowych znaków.");
        printResults(gene, inter);
        System.out.println("Zamykanie programu.");
    }
     private static void printResults(GenerateTokenMethod gene, Interaction inter) {
      final int TRIES = 3;
         for (int i = 0; i < TRIES; i++) {
             System.out.println("Podaj liczbę.");
             gene.generateToken(inter.getNumberFromUser());
         }
     }
 }




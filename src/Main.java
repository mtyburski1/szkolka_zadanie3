 class Main {
    public static void main(String[] args) {
        GenerateTokenMethod gene = new GenerateTokenMethod();
        Interaction inter = new Interaction();

        System.out.println("Podane przez ciebie liczby wygenerują ciąg losowych znaków.");
        printResults(gene, inter);
        System.out.println("Zamykanie programu.");
    }
     private static void printResults(GenerateTokenMethod gene, Interaction inter) {
         for (int i = 0; i < 3; i++) {
             System.out.println("Podaj liczbę.");
             gene.generateToken(inter.getNumberFromUser());
         }
     }
 }




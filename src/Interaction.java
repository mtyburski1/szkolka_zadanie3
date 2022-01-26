import java.util.InputMismatchException;
import java.util.Scanner;

public class Interaction {
    private static Scanner sc = new Scanner(System.in);

    public int getNumberFromUser() {
        int userNumber = 0;
        while (true) {
            try {
                userNumber = sc.nextInt();
                return userNumber;
            } catch (InputMismatchException e) {
                System.out.println("Niedozwolony znak. Podaj liczbę.");
                sc.nextLine();

            }
        }
    }
}

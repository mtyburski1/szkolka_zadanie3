import java.util.Random;

public class GenerateTokenMethod {
    private static Random random = new Random();

    public String generateToken (int elements){
        String result = "g4#2%hQQ5^YY5!2";
        for (int i = 0; i < elements; i++) {
            System.out.print(result.charAt(random.nextInt(result.length())));
        }
        System.out.println();
        System.out.println("Liczba znaków: " + elements);
        return result;
    }
}

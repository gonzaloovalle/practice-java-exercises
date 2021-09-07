import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What will you say to Bob? ");
        String userResponse = sc.nextLine().trim();
        System.out.println(userResponse);

        if (userResponse.endsWith("?")) {
            System.out.println("Sure");
        } else if (userResponse.endsWith("!")) {
            System.out.println("Woah, chill out!");
        } else if (userResponse.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}

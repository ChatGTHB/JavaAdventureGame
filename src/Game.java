import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to adventure game!");
        System.out.print("Enter a name, please! : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Dear " + player.getName() + " welcome to this dark and foggy island!!! Everything that happens here is real!");
        System.out.println("Please select a character : ");
        player.selectChar();
    }
}

import java.util.*;

class guesser {
    // Storing the number which is guessed
    int guessNUM;

    public int GuessNUMBER() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser kindly enter the number : ");
        guessNUM = sc.nextInt();
        return guessNUM;
    }
}

class player {
    int PlayerGuess;

    public int GuessNUMBER() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Player please guess your number and input it in console : ");
        PlayerGuess = sc.nextInt();
        return PlayerGuess;
    }
}

class umpire {
    int numfromguesser;
    int numfromp1;
    int numfromp2;
    int numfromp3;

    public void collect_from_guesser() {
        // To invoke from guesser class
        guesser g = new guesser();
        numfromguesser = g.GuessNUMBER();
    }

    public void collect_from_players() {
        // Creation of objects
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();

        numfromp1 = p1.GuessNUMBER();
        numfromp2 = p2.GuessNUMBER();
        numfromp3 = p3.GuessNUMBER();

    }

    void compare() {
        if (numfromguesser == numfromp1) {
            if (numfromguesser == numfromp2 && numfromguesser == numfromp3) {
                System.out.println("All 3 won the game. ");
            } else if (numfromguesser == numfromp2) {
                System.out.println("Player 1 and player 2 won the game. ");
            } else if (numfromguesser == numfromp3) {
                System.out.println("Player 1 and player 3 won the game. ");
            } else {
                System.out.println("Player 1 won the game. ");
            }
        } else if (numfromguesser == numfromp2) {
            if (numfromguesser == numfromp3) {
                System.out.println("Player 2 and Player3 won the game");
            } else {
                System.out.println("Player 2 won the game");
            }
        } else if (numfromguesser == numfromp3) {
            System.out.println("Player 3 won the game. ");
        } else {
            System.out.println("Game lost !!");
        }
    }

}

public class Guesser_game {
    public static void main(String[] args) {
        umpire u = new umpire();
        u.collect_from_guesser();
		u.collect_from_players();
		u.compare();
    }
}
import java.util.Scanner;

public class RolePlayGame {
    private static final String HELLO_MESSAGE = "You are playing fighting role part game !!!";
    private static final String NAME_MESSAGE = " enter your name please";
    private static final String PLAYER_ONE = "Player one ";
    private static final String KICK_TURN = "choose your kick: 1 - high kick, 2 - middle kick, 3 - low kick";
    private static final String BLOCK_TURN = "choose your block: 1 - high block, 2 - middle block, 3 - low block";
    public static final String END = " won";
    public static final String DRAW = "It's draw. Nobody won";
    private static final int HIGH_KICK_DAMAGE = 3;
    private static final int MIDDLE_KICK_DAMAGE = 2;
    private static final int LOW_KICK_DAMAGE = 1;
    private static final String PLAYER_TWO = "Player two";
    private static String playerOneName;
    private static String playerTwoName;
    private static int playerOneKick;
    private static int playerOneBlock;
    private static int playerTwoKick;
    private static int playerTwoBlock;
    private static int playerOneHealth = 10;
    private static int playerTwoHealth = 10;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(HELLO_MESSAGE);

        System.out.println(PLAYER_ONE + NAME_MESSAGE);
        playerOneName = scanner.nextLine();
        System.out.println(PLAYER_TWO + NAME_MESSAGE);
        playerTwoName = scanner.nextLine();


        System.out.println(playerOneName + " " + playerTwoName);

        while (playerOneHealth > 0 && playerTwoHealth > 0) {
            playerOneKick = initializeKick(scanner, playerOneName);
            playerOneBlock = initializeBlock(scanner, playerOneName);

            playerTwoKick = initializeKick(scanner, playerTwoName);
            playerTwoBlock = initializeBlock(scanner, playerTwoName);
            endTurn();

            playerTwoHealth -= beKicked(playerOneKick, playerTwoBlock);
            playerOneHealth -= beKicked(playerTwoKick, playerOneBlock);

            checkDeath();

            printHPLeft();
        }
        endGame();
    }
    public static int beKicked(int kick, int block) {
        int HPLose = 0;
        if (kick != block) {
            switch (kick) {
                case 1:
                    HPLose = HIGH_KICK_DAMAGE;
                    break;
                case 2:
                    HPLose = MIDDLE_KICK_DAMAGE;
                    break;
                case 3:
                    HPLose = LOW_KICK_DAMAGE;
                    break;
            }
        }
        return HPLose;
    }
    public static int initializeKick(Scanner scanner, String playerName) {
        System.out.println(playerName + " " + KICK_TURN);
        return scanner.nextInt();
    }
    public static int initializeBlock(Scanner scanner, String playerName) {
        System.out.println(playerName + " " + BLOCK_TURN);
        return scanner.nextInt();
    }
    public static void endTurn() {
        System.out.println(playerOneName + " kick: " + playerOneKick + " block: " + playerOneBlock);
        System.out.println(playerTwoName + " kick: " + playerTwoKick + " block: " + playerTwoBlock);
    }
    public static void checkDeath() {
        if (playerOneHealth < 0) {
            playerOneHealth = 0;
        }
        if (playerTwoHealth < 0) {
            playerTwoHealth = 0;
        }
    }
    public static void printHPLeft() {
        System.out.println(playerOneName + " has " + playerOneHealth + " health");
        System.out.println(playerTwoName + " has " + playerTwoHealth + " health");
    }
    public static void endGame() {
        if(playerOneHealth == playerTwoHealth) {
            System.out.println(DRAW);
        } else if(playerOneHealth > 0){
            System.out.println(playerOneName + END);
        } else {
            System.out.println(playerTwoName + END);
        }
    }
}

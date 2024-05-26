import java.util.Scanner;

public class OlymicData {
    static int length = 5;

    static String[] playerName = new String[length];
    static String[] playerCountry = new String[length];
    static int[] playerMedals = new int[length];
    static int playerCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline
            switch (choice) {
                case 1:
                    addPlayer(scanner);
                    break;
                case 2:
                    displayPlayers();
                    break;
                case 3:
                    findMax();
                    break;
                case 4:
                    displayMaxPlayers();
                    break;
                case 5:
                    System.out.println("Exit Program");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\nPlayer Manager");
        System.out.println("1. Add Player");
        System.out.println("2. Display all Players");
        System.out.println("3. Find Player with Max Medals");
        System.out.println("4. Display Players with Max Medals");
        System.out.println("5. Exit Program");
        System.out.print("Enter your choice: ");
    }

    public static void addPlayer(Scanner scanner) {
        if (playerCount >= length) {
            System.out.println("Too many players");
            return;
        } else {
            System.out.print("Enter Player Name: ");
            String player = scanner.nextLine();
            System.out.print("Enter Country: ");
            String country = scanner.nextLine();
            System.out.print("Enter number of Medals: ");
            int medals = scanner.nextInt();

            playerName[playerCount] = player;
            playerCountry[playerCount] = country;
            playerMedals[playerCount] = medals;
            playerCount++;

            System.out.println("Player added successfully");
        }
    }

    public static void displayPlayers() {
        if (playerCount == 0) {
            System.out.println("No players");
            return;
        } else {
            System.out.println("\nPlayer List");
            for (int i = 0; i <= playerCount; i++) {
                System.out.printf("Name: %s, Country: %s, Medals: %d\n", playerName[i], playerCountry[i], playerMedals[i]);
            }
        }
    }

    public static void findMax() {
        if (playerCount == 0) {
            System.out.println("No players to evaluate");
            return;
        }

        int maxMedals = playerMedals[0];
        String maxPlayer = playerName[0];
        String maxCountry = playerCountry[0];

        for (int i = 1; i < playerCount; i++) {
            if (playerMedals[i] > maxMedals) {
                maxMedals = playerMedals[i];
                maxPlayer = playerName[i];
                maxCountry = playerCountry[i];
            }
        }

        System.out.printf("Player with the most medals: %s from %s with %d medals\n", maxPlayer, maxCountry, maxMedals);
    }

    public static void displayMaxPlayers() {
        if (playerCount == 0) {
            System.out.println("No players");
            return;
        }

        int maxMedals = 0;
        for (int i = 0; i < playerCount; i++) {
            if (playerMedals[i] > maxMedals) {
                maxMedals = playerMedals[i];
            }
        }

        System.out.println("Players with the maximum number of medals:");
        for (int i = 0; i < playerCount; i++) {
            if (playerMedals[i] == maxMedals) {
                System.out.printf("Name: %s, Country: %s, Medals: %d\n", playerName[i], playerCountry[i], playerMedals[i]);
            }
        }
    }
}

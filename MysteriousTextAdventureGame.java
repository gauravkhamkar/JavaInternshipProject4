import java.util.Scanner;

public class MysteriousTextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction to the game
        System.out.println("Welcome to the Mysterious Fantasy Adventure!");
        System.out.println("You are a legendary hero embarking on a quest to save the mystical realm...");

        // Start the game
        playGame(scanner);

        // Close the scanner
        scanner.close();
    }

    public static void playGame(Scanner scanner) {
        // Introduction to the first decision point
        System.out.println("As you journey through the magical realm, you come across a crossroads.");
        System.out.println("There are three paths ahead. Choose your destiny!");
        System.out.println("1. Forest Path");
        System.out.println("2. Mountain Path");
        System.out.println("3. Desert Path");

        // Get the player's choice for the initial path
        int pathChoice = getUserChoice(scanner, 3);

        // Branching based on the chosen path
        switch (pathChoice) {
            case 1:
                // Exploring the Forest Path
                System.out.println("You take the Forest Path and encounter a mysterious figure shrouded in shadows.");
                System.out.println("The figure offers guidance through the dense woods.");
                System.out.println("1. Follow the mysterious guide");
                System.out.println("2. Thank the guide and proceed on your own");

                // Get the player's choice regarding the mysterious guide
                int guideChoice = getUserChoice(scanner, 2);

                if (guideChoice == 1) {
                    // Following the mysterious guide in the forest
                    System.out.println("The mysterious guide leads you to an ancient tree with a hidden door.");
                    System.out.println("You discover a secret passage to the heart of the forest. Onward, brave hero!");
                } else {
                    // Proceeding without the guide
                    System.out.println("You thank the guide and continue on your path, navigating the forest carefully.");
                    System.out.println("As you proceed, you encounter a magical creature. What will you do?");
                    System.out.println("1. Attempt to communicate with the creature");
                    System.out.println("2. Choose an alternate path to avoid the creature");

                    // Get the player's choice regarding the magical creature
                    int creatureChoice = getUserChoice(scanner, 2);

                    if (creatureChoice == 1) {
                        // Communicating with the magical creature
                        System.out.println("You successfully communicate with the creature, gaining its friendship.");
                        System.out.println("The creature guides you to a hidden clearing. Congratulations, hero!");
                    } else {
                        // Choosing an alternate path to avoid the creature
                        System.out.println("You choose an alternate path and avoid the creature without incident.");
                        System.out.println("Your journey continues undisturbed. Onward, resilient hero!");
                    }
                }
                break;

            case 2:
                // Exploring the Mountain Path
                System.out.println("You take the Mountain Path and encounter a mysterious mist that conceals a hidden entrance.");
                System.out.println("1. Enter the mysterious mist");
                System.out.println("2. Search for an alternative route");

                // Get the player's choice regarding the mist
                int mistChoice = getUserChoice(scanner, 2);

                if (mistChoice == 1) {
                    // Entering the mysterious mist and encountering a mystical guide
                    System.out.println("As you enter the mist, you find yourself in a hidden cavern.");
                    System.out.println("A mystical guide appears, offering to reveal the secrets of the cavern. Will you accept?");
                    System.out.println("1. Accept the guide's offer");
                    System.out.println("2. Politely decline and explore on your own");

                    // Get the player's choice regarding the mystical guide's offer
                    int guideOfferChoice = getUserChoice(scanner, 2);

                    if (guideOfferChoice == 1) {
                        // Accepting the guide's offer and gaining ancient knowledge
                        System.out.println("The mystical guide unveils the history of the cavern and grants you ancient knowledge.");
                        System.out.println("You emerge from the mist with newfound wisdom. Continue your legendary quest!");
                    } else {
                        // Declining the guide's offer and exploring independently
                        System.out.println("You decline the guide's offer and explore the cavern independently.");
                        System.out.println("As you traverse deeper, you discover a hidden treasure. Congratulations, hero!");
                    }
                } else {
                    // Searching for an alternative route and overcoming challenges
                    System.out.println("You search for an alternative route and find a challenging but rewarding path.");
                    System.out.println("Your resilience is rewarded, and you overcome the obstacles. Onward, mighty hero!");
                }
                break;

            case 3:
                // Exploring the Desert Path
                System.out.println("You take the Desert Path and encounter a mysterious nomad.");
                System.out.println("The nomad offers you a choice between two mystical artifacts.");
                System.out.println("1. The Orb of Time");
                System.out.println("2. The Veil of Illusion");

                // Get the player's choice regarding the mystical artifacts
                int nomadChoice = getUserChoice(scanner, 2);

                if (nomadChoice == 1) {
                    // Choosing the Orb of Time and gaining enhanced perception
                    System.out.println("You choose the Orb of Time and gain the ability to see glimpses of the past and future.");
                    System.out.println("Your perception is heightened. Continue your journey with foresight, hero!");
                } else {
                    // Choosing the Veil of Illusion and becoming adept at creating illusions
                    System.out.println("You choose the Veil of Illusion and become adept at creating illusions.");
                    System.out.println("You navigate the desert with deceptive ease. Onward, clever hero!");
                }
                break;
        }

        // Continuing the journey with additional challenges and mysteries
        // (More comments added to explain the logic)
        System.out.println("As you progress, a mysterious voice echoes in your mind, guiding you to the heart of the enchanted castle.");
        System.out.println("You enter the castle and discover a hidden chamber filled with ancient symbols.");
        System.out.println("What will you do?");
        System.out.println("1. Attempt to decipher the symbols");
        System.out.println("2. Explore the chamber cautiously");

        // Get the player's choice regarding the chamber exploration
        int chamberChoice = getUserChoice(scanner, 2);

        if (chamberChoice == 1) {
            // Attempting to decipher the symbols and unlocking the castle's secrets
            System.out.println("You successfully decipher the symbols, unlocking the castle's hidden secrets.");
            System.out.println("A mystical portal appears, leading to a realm of untold wonders. Congratulations, hero!");
        } else {
            // Exploring the chamber cautiously and discovering a forgotten artifact
            System.out.println("As you explore cautiously, you uncover a forgotten artifact of great power.");
            System.out.println("The artifact enhances your abilities. Your legend grows. Continue your heroic quest!");
        }

        // Game conclusion
        System.out.println("You have successfully unveiled the mysteries of the enchanted castle and saved the mystical realm!");
        System.out.println("Thank you for playing the Mysterious Text Adventure Game!");
    }

    public static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = 0;
        boolean validInput = false;

        do {
            System.out.print("Enter your choice: ");

            // Validate input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= maxChoice) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + maxChoice);
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume the invalid input
            }
        } while (!validInput);

        return choice;
    }
}

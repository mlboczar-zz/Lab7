import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String goAgain;
        String whatInfo;
        boolean wasInputValid = false;

        System.out.println("Welcome to our Java class!");
        do {
            System.out.println("Which student would you like to learn more about? (enter a number 1-14)");
            int userNum = scan.nextInt()-1;
            scan.nextLine(); //garbage line to reset scanner

            String names[] = {"Megan", "Mike", "Allie", "Jeremy", "Marin", "Nick", "Peter", "Sarah", "Saritha", "Sean", "Stephanie", "Trina", "Lhea", "Lydia"};
            String iceCream[] = {"Cookies n Cream", "Chocolate", "Strawberry", "Vanilla", "Rocky Road", "Chocolate chip", "Butter pecan", "Chocolate", "Vanilla", "Moose Tracks", "Strawberry", "Mint", "Chocolate chip", "Vanilla"};
            String animal[] = {"Cat", "Dog", "Antelope", "Aardvark", "Panda", "Cat", "Goat", "Bumblebee", "Dog", "Frog", "Toad", "Whale", "Shark", "Cow"};
            if (userNum < 0) {
                System.out.println("Sorry, that student does not exist. Please try again.");
                goAgain = "yes";
            }
            if (userNum >= 14) {
                System.out.println("Sorry, that student does not exist. Please try again.");
                goAgain = "yes";
            }
            else if (userNum >= 0 && userNum < 14) {
                System.out.println("Student " + (userNum+1) + " is " + names[(userNum)] + ". What would you like to know about " + names[userNum] + "? (Enter 'favorite ice cream' or 'favorite animal')");
                do {
                whatInfo = scan.nextLine();
                    if (whatInfo.equalsIgnoreCase("favorite ice cream")) {
                        System.out.println(iceCream[(userNum)] + " is " + names[(userNum)] + "'s favorite ice cream!");
                        wasInputValid = true;
                    } else if (whatInfo.equalsIgnoreCase("favorite animal")) {
                        System.out.println(animal[userNum] + "s are " + names[userNum] + "'s favorite animal!");
                        wasInputValid = true;
                    } else {
                        System.out.println("That data does not exist. Please try again. (Enter 'favorite ice cream' or 'favorite animal') ");
                        wasInputValid = false;
                    }
                } while (!wasInputValid);
            }
            System.out.println("Would you like to know more? (Enter yes/no)");
            goAgain = scan.nextLine();
        } while (goAgain.equalsIgnoreCase("yes"));
        System.out.println("Thanks for learning more about our class! Goodbye!");
    }
}


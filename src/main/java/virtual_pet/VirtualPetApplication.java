package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet bubbles = new VirtualPet(10, 5, 5);

        System.out.println("Bubbles the bulldog needs your help with practicing the tricks he learned in obedience school.");
        System.out.println("Help Bubbles stack on the smarts. Can you help him get his Puppy IQ to 50.0?");
        System.out.println(" ");
        System.out.println("Starting Score: ");
        System.out.println("Puppy IQ: " + bubbles.getPuppyIQ());
        System.out.println("Happiness: " + bubbles.getHappyPuppy());
        System.out.println("Dirtiness: " + bubbles.getCleanBubbles());
        System.out.println(" ");
        System.out.println("What do you want to do?");
        System.out.println(" ");
        System.out.println("1: Tell Bubbles to sit.");
        System.out.println("2. Tell Bubbles to roll over.");
        System.out.println("3. Give Bubbles a bath.");
        System.out.println("4. Give Bubbles a treat.");
        System.out.println("5. Nothing.");
        String menuOption = input.nextLine();

        while (bubbles.getPuppyIQ() < 100.00) {
            if (menuOption.equals("1")) {
                System.out.println("Bubbles just sat. (Maybe give him a treat next time.)");
                bubbles.sitBubbles(1);

            } else if (menuOption.equals("2")) {
                System.out.println("Good boy, Bubbles! (Looks like he got a little dirty after that.)");
                bubbles.rollBubbles(1);
                bubbles.batheBubbles(2);

            } else if (menuOption.equals("3")) {
                System.out.println(" We know how much you love your baths, Bubbles. You smell great though!");
                bubbles.batheBubbles(-2);


            } else if (menuOption.equals("4")) {
                System.out.println("Bubbles love his treats. They make him so happy!");
                bubbles.goodBubbles(1);
            } else {
                System.out.println("Bubbles wags his tail in anticipation....");
            }
            System.out.println("Current Score: ");
            System.out.println("Puppy IQ: " + bubbles.getPuppyIQ());
            System.out.println("Happiness: " + bubbles.getHappyPuppy());
            System.out.println("Hygiene: " + bubbles.getCleanBubbles());
            System.out.println(" ");
            System.out.println("What next?");
            System.out.println("Press 1 to tell Bubbles to sit.");
            System.out.println("Press 2 to tell Bubbles to roll over.");
            System.out.println("Press 3 to give Bubbles a bath.");
            System.out.println("Press 4 give Bubbles a treat.");
            System.out.println("Press 5 to do nothing.");
            menuOption = input.nextLine();

        if (bubbles.getCleanBubbles() <= 0) {
            System.out.println("Bubbles, you stink! Press 3 to give Bubbles a bath right away!");
;
        }
        if (bubbles.getPuppyIQ() >= 50.00) {
            System.out.println("Congratulations! Bubbles is a genius thanks to you!");
            System.exit(0);
        }
    }

    }
}




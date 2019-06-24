import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This program will print 'May' when you run it.
        int room = 1;
        boolean cont = true;
        boolean secret=false; // because the secret room would be seen the first time
        int roomVisited = 0;
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        do {
            switch (room) {
                case 1:
                    roomVisited++;
                    System.out.println("You are in the Foyer Room-Contains dead scorpion");
                    System.out.println("Type 'North' to continue out of the room or Type 'q' to quit");
                    String input = keyboard.next();
                    if (input.equalsIgnoreCase("north")) {
                        room = 2;
                    } else if (input.equalsIgnoreCase("q")) {
                        cont = false;
                    }
                    break;

                case 2:
                    roomVisited++;
                    System.out.println("You are in Front Room-Contains paino");
                    System.out.println("Type 'South' to return to Foyer, or 'West' to Library or 'East' to kitchen");
                    input = keyboard.next();
                    if (input.equalsIgnoreCase("south")) {
                        room = 1;
                    } else if (input.equalsIgnoreCase("west")) {
                        room = 3;
                    } else if (input.equalsIgnoreCase("east")) {
                        room = 4;
                    }
                    break;
                case 3:
                    roomVisited++;
                    System.out.println("You are in Library Room-Contains spiders");
                    System.out.println("Type 'East' to go to Front Room or 'North' to the dining room");
                    input = keyboard.next();
                    if (input.equalsIgnoreCase("east")) {
                        room = 2;
                    } else if (input.equalsIgnoreCase("north")) {
                        room = 5;
                    }
                    break;
                case 4:
                    roomVisited++;
                    System.out.println("You are in Kitchen Room-Contains bats");
                    System.out.println("Type 'West' to go to Front room or 'North' to Parlor room");
                    input = keyboard.next();
                    if (input.equalsIgnoreCase("west")) {
                        room = 2;
                    } else if (input.equalsIgnoreCase("north")) {
                        room = 7;
                    }
                    break;
                case 5:
                    roomVisited++;
                    System.out.println("You are in Dining Room-Contains dust empty box");
                    System.out.println("Type 'South' to go to Library room");
                    input = keyboard.next();
                    if (input.equalsIgnoreCase("south")) {
                        room = 3;
                    }
                    break;
                case 6:
                    roomVisited++;
                    int rand = random.nextInt(4);
                    System.out.println("You are in Vault Room-Contains 3 walking skeletons");
                    //1 = 25% chance of finding the secret room
                    if (rand == 1 || secret==true) {
                        System.out.println("You find the Secret Room. Type'Secret' go the Secret room or type 'east' to parlor");
                        input = keyboard.next();
                        secret=true;
                        if (input.equalsIgnoreCase("east")) {
                            room = 7;
                        } else if (input.equalsIgnoreCase("secret")) {
                            room = 8;
                        }
                    } else {
                        System.out.println("Go back 'east' to the Parlor");
                        input = keyboard.next();
                        if (input.equalsIgnoreCase("east")) {
                            room = 7;
                        }
                    }
                    break;

                case 7:
                    roomVisited++;
                    System.out.println("You are in Parlor Room-Contain Treasury Chest");
                    System.out.println("Type 'West' to go to Vault Room or 'South' to the dining room");
                    input = keyboard.next();
                    if (input.equalsIgnoreCase("west")) {
                        room = 6;
                    } else if (input.equalsIgnoreCase("south")) {
                        room = 4;
                    }

                    break;
                case 8:
                    roomVisited++;
                    System.out.println("You are in Secret Room-Contain piles of gold");
                    System.out.println("Type 'West' to continue out of the room to Vault room");
                    input = keyboard.next();
                    if (input.equalsIgnoreCase("west")) {
                        room = 6;
                    }
                    break;
            }
        } while (cont);

        System.out.println("The number of rooms visited: " +roomVisited);
    }

}

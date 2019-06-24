import java.util.Random;
import java.util.Scanner;

public class Main
{public static void main(String[] args)
    {
        //This program will print 'May' when you run it.
        int room = 1;
        boolean cont= true;
        int roomVisited=0;
        Scanner keyboard= new Scanner(System.in);
        Random random = new Random();
        do{
            switch (room) {
                case 1:
                    roomVisited++;
                    System.out.println("You are in the Foyer Room-Contains dead scorpion");
                    System.out.println("Type 'North' to continue out of the room or Type 'q' to quit");
                    String input=keyboard.next();
                    if(input.toLowerCase()=="north"){
                        room=2;
                    }else if (input.toLowerCase()== "q"){
                        cont=false;
                    }
                    break;

                case 2:
                    roomVisited++;
                    System.out.println("You are in Front Room-Contains paino");
                    System.out.println("Type 'South' to return to Foyer, or 'West' to Library or 'East' to kitchen");
                    input=keyboard.next();
                    if(input.toLowerCase()=="south"){
                         room=1;
                    } else if(input.toLowerCase()=="west") {
                        room = 3;
                    } else if(input.toLowerCase()=="east") {
                            room = 4;
                    }
                    break;
                case 3:
                    roomVisited++;
                    System.out.println("You are in Library Room-Contains spiders");
                    System.out.println("Type 'East' to go to Front Room or 'North' to the dining room");
                    input=keyboard.next();
                    if(input.toLowerCase()=="east") {
                        room=2;}
                    else if(input.toLowerCase()=="north") {
                        room=5;
                    }
                    break;
                case 4:
                    roomVisited++;
                    System.out.println("You are in Kitchen Room-Contains bats");
                    System.out.println("Type 'West' to go to Front room or 'North' to Parlor room");
                    input=keyboard.next();
                    if(input.toLowerCase()=="west") {
                        room=2;}
                    else if(input.toLowerCase()=="north") {
                        room=7;
                    }
                    break;
                case 5:
                    roomVisited++;
                    System.out.println("You are in Dining Room-Contains dust empty box");
                    System.out.println("Type 'South' to go to Library room");
                    input=keyboard.next();
                    if(input.toLowerCase()=="south"){
                        room=3;
                    }
                    break;
                case 6:
                    roomVisited++;
                    int rand=random.nextInt(4);
                    System.out.println("You are in Vault Room-Contains 3 walking skeletons");
                    if (rand==1){
                        System.out.println("You find the Secret Room. Go into the 'Secret' room or go 'east' to parlor");
                        input=keyboard.next();
                        if(input.toLowerCase()=="east") {
                            room=7;}
                        else if(input.toLowerCase()=="secret") {
                            room=8;
                        }
                    } else {
                        System.out.println("Go back 'east' to the Parlor");
                        input=keyboard.next();
                        if(input.toLowerCase()=="east"){
                            room=7;
                        }
                    }

                case 7:
                    roomVisited++;
                    System.out.println("You are in Parlor Room-Contain Treasury Chest");
                    System.out.println("Type 'West' to go to Vault Room or 'South' to the dining room");
                    input=keyboard.next();
                    if(input.toLowerCase()=="west") {
                        room=6;}
                    else if(input.toLowerCase()=="south") {
                        room=4;
                    }

                    break;
                case 8:
                    roomVisited++;
                    System.out.println("You are in Secret Room-Contain piles of gold");
                    System.out.println("Type 'West' to continue out of the room to Vault room");
                    input=keyboard.next();
                    if(input.toLowerCase()=="west"){
                        room=6;}
                    break;
            }
        }while(cont);



    }

}

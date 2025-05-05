import java.util.Scanner;

public class Car {
    public static void main(String[] args) {

        // TODO 1: Declare the necessary variables for the car's state and add scanner object
        boolean isEngineOn = false;
        String gear = "P";
        int speed = 0;
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);
        // TODO 2: Display the current state of the car (engine state, gear, speed)
        while(choice!=5) {
            System.out.println("------ Car Dashboard ------");
            System.out.println("Speed: " + speed);
            System.out.println("Engine is on: " + isEngineOn);
            System.out.println("Gear: " + gear);

            // TODO 3: Add print statements for each variable you want to display or options available to the user
            System.out.println("Menu:");
            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Accelerate");
            System.out.println("4. Brake");
            System.out.println("5. Exit");

            // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
            System.out.println("Please enter your choice: ");
            choice = keyboard.nextInt();
            System.out.println("Made choice: " + choice);


            // TODO 5: Implement a switch statement to handle the different menu choices
            switch (choice) {
                case 1:
                    isEngineOn = !isEngineOn;
                    System.out.println("Engine status is on: " + isEngineOn);
                    break;
                case 2:
                    if(isEngineOn==true) {
                        System.out.println("Enter gear (P, D, R): ");
                        gear = keyboard.next();
                        System.out.println("Selected gear: " + gear);
                    }
                    else
                    {
                        System.out.println("Please turn the engine on before changing gear!");
                    }
                    break;
                case 3:
                    if (isEngineOn && !gear.equals("P") || !gear.equals("R")) {
                        if (speed <= 250) {
                            speed += 10;
                            System.out.println("Current speed is: " + speed + "km/h.");
                        }
                        else {
                            System.out.println("You've reached highest possible speed! Your current speed is: " + speed);
                        }
                    } else {
                        System.out.println("Cannot accelerate while engine is off or gear is in Parking (P) mode!");
                    }
                    break;
                case 4:
                    if (isEngineOn && !gear.equals("P")) {
                        if (speed > 0) {
                            speed -= 10;
                            System.out.println("Your current speed is: " + speed);
                        }
                        else {
                            System.out.println("Car is already stopped! Speed is 0 km/h!");
                        }
                        break;

                    } else {
                        System.out.println("Cannot stop while engine is off or gear is in Parking (P) mode!");
                    }
                case 5:
                    break;
                default:
                    System.out.println("Wrong number! Please enter number between 1 and 5!");
                    break;
            }
        }
    }
}
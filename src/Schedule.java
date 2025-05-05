import java.util.Scanner;

/** TODO 1: Import the Scanner **/

// Beginning of the main class. The name of the main class and the file should be same.
public class Schedule {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {
        /** TODO 2: Create a Scanner variable named "keyboard" **/
        Scanner keyboard = new Scanner(System.in);
        int subChoice;
        Scanner input = new Scanner(System.in);
        /** TODO 3: A variable for getting the day of the week is given below **/
        /**         Initialize the variable to have the value 1 **/
        /** 1- is Monday, 2- is Tuesday and so on **/
        int dayOfTheWeek = 1;
        System.out.println("********** MENU *****************");
        System.out.println("These are the choices for week of the day. \n Please enter only values from 1-7:");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");
        System.out.println("***********************************");


        /** TODO 5: Prompt Toni for input. Also let Toni know the valid choices like (1-7). **/
        System.out.println("Please enter a number from 1 to 7.");
        dayOfTheWeek = keyboard.nextInt();


        /** TODO 6: Create a switch with case values from 1-7 to handle the schedule **/
        /**         for the input in "dayOfTheWeek" **/
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");
                System.out.println(" *********** SUB MENU FOR MONDAY ******");
                System.out.println("1. Yes, I had my breakfast.");
                System.out.println("2. No, I would like one");
                System.out.println("**************************************\n");
                System.out.println("Please make a choice!");
                subChoice = input.nextInt();
                if (subChoice == 1) {
                    System.out.println("Good.\nNow you have a catchup meeting at 9AM.\nPrepare your notes.\n");
                } else if (subChoice == 2) {
                    System.out.println("Lets us divert on Highway 54 \nand have a Burger on the drive in\n");
                } else {
                    System.out.println("NO such choice available!\n");
                }
                input.close();
                keyboard.close();
                break;

            case 2:
                System.out.println("Tuesday: Next day after beginning!");
                break;
            case 3:
                System.out.println("Middle of the week!");
                break;
            case 4:
                System.out.println("A day before Friday!");
                break;
            case 5:
                System.out.println("Last workday on this week!");
                break;
            case 6:
                System.out.println("First day for a rest!");
                break;
            case 7:
                System.out.println("Last day on this week!");
                break;

            default:
                System.out.println("Entered wrong number, there is no such day!");
        }

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Trip {
    public static void main(String[] args) {
        int amountOfMoney = 300;
        if(amountOfMoney >= 300){
            System.out.println("Toni has $" + amountOfMoney + ". He is happy and he will: ");
            System.out.println("1. Go to Las Vegas!");
            System.out.println("2. Enjoy some luck games...");
            System.out.println("3. Enjoy some concerts...");
            System.out.println("4. Enjoy fine dining...");
            System.out.println("5. Go on a helicopter ride!");
            System.out.println("6. Go shop for some souvenirs!");
        }

        else if(amountOfMoney>=200 && amountOfMoney < 300){
            System.out.println("Go to Hoover Dam!");
        }
        else if(amountOfMoney >= 100 && amountOfMoney < 200){
            System.out.println("Go to Area 51!");
        }
        else if(amountOfMoney >= 50 && amountOfMoney < 100){
            System.out.println("Buy an icecream!");
        }
        else {
            System.out.println("Toni is not happy and he will not go to Las Vegas. Instead he will think about the money spent!");
        }

        System.out.println("On trip to parents!");
    }
    }

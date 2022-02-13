package machine;

import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int machineWater = 400;
        int machineMilk = 540;
        int machineBeans = 120;
        int machineCups = 9;
        int machineVault = 550;

        Menu(machineVault, machineWater, machineMilk, machineBeans, machineCups);

    }

    public static void State(int machineVault, int machineWater, int machineMilk, int machineBeans, int machineCups){
        Scanner scan = new Scanner(System.in);

        System.out.println("\nThe coffee machine has:");
        System.out.println(machineWater + " ml of water");
        System.out.println(machineMilk + " ml of milk");
        System.out.println(machineBeans + " g of coffee beans");
        System.out.println(machineCups + " disposable cups");
        System.out.println("$" + machineVault + " of money");

    }

    public static void Menu(int machineVault, int machineWater, int machineMilk, int machineBeans, int machineCups){
        Scanner scan = new Scanner(System.in);

        System.out.println("\nWrite action (buy, fill, take or exit):");
        String choice = scan.nextLine();

        switch (choice){
            case "buy" : Buy(machineVault, machineWater, machineMilk, machineBeans, machineCups);
                break;
            case "fill" : Fill(machineVault, machineWater, machineMilk, machineBeans, machineCups);
                break;
            case "take" : Take(machineVault, machineWater, machineMilk, machineBeans, machineCups);
                break;
            case "remaining" : State(machineVault, machineWater, machineMilk, machineBeans, machineCups); Menu(machineVault, machineWater, machineMilk, machineBeans, machineCups);
                break;
            case "exit" : System.exit(0);
            default:
                System.out.println("Choice should be 'buy', 'fill', 'take' or 'exit'...");
                break;
        }
    }

    public static void Buy(int machineVault, int machineWater, int machineMilk, int machineBeans, int machineCups){
        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back, exit:");
        String choice = scan.nextLine();

        switch (choice){
            case "1" : MakeEspresso(machineVault, machineWater, machineMilk, machineBeans, machineCups);
                break;
            case "2" : MakeLatte(machineVault, machineWater, machineMilk, machineBeans, machineCups);
                break;
            case "3" : MakeCappuccino(machineVault, machineWater, machineMilk, machineBeans, machineCups);
                break;
            case "back": Menu(machineVault, machineWater, machineMilk, machineBeans, machineCups);
                break;
            case "exit": System.exit(0);
                break;
            default:
                System.out.println("Choice should be from 1 to 3 or 'back'...");
                break;
        }
    }

    public static void MakeEspresso(int machineVault, int machineWater, int machineMilk, int machineBeans, int machineCups){

        if(machineWater >= 250 && machineBeans >= 16 && machineCups >= 1){
            machineWater -= 250;
            machineBeans -= 16;
            machineVault += 4;
            machineCups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        }
        else{
            if(machineWater < 250){
                System.out.println("Sorry, not enough water!");
            }
            if(machineBeans < 16){
                System.out.println("Sorry, not enough coffee beans!");
            }
            if(machineCups < 1){
                System.out.println("Sorry, not enough disposable cups!");
            }
        }

        Menu(machineVault, machineWater, machineMilk, machineBeans, machineCups);
    }

    public static void MakeLatte(int machineVault, int machineWater, int machineMilk, int machineBeans, int machineCups){

        if(machineWater >= 350 && machineBeans >= 20 && machineMilk >= 75 && machineCups >= 1){
            machineWater -= 350;
            machineMilk -= 75;
            machineBeans -= 20;
            machineVault += 7;
            machineCups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        }
        else{
            if(machineWater < 350){
                System.out.println("Sorry, not enough water!");
            }
            if(machineBeans < 20){
                System.out.println("Sorry, not enough coffee beans!");
            }
            if(machineMilk < 75){
                System.out.println("Sorry, not enough milk!");
            }
            if(machineCups < 1){
                System.out.println("Sorry, not enough disposable cups!");
            }
        }

        Menu(machineVault, machineWater, machineMilk, machineBeans, machineCups);
    }

    public static void MakeCappuccino(int machineVault, int machineWater, int machineMilk, int machineBeans, int machineCups){

        if(machineWater >= 200 && machineBeans >= 12 && machineMilk >= 100 && machineCups >= 1){
            machineWater -= 200;
            machineBeans -= 12;
            machineMilk -= 100;
            machineVault += 6;
            machineCups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        }
        else{
            if(machineWater < 200){
                System.out.println("Sorry, not enough water!");
            }
            if(machineBeans < 12){
                System.out.println("Sorry, not enough coffee beans!");
            }
            if(machineMilk < 100){
                System.out.println("Sorry, not enough milk!");
            }
            if(machineCups < 1){
                System.out.println("Sorry, not enough disposable cups!");
            }
        }

        Menu(machineVault, machineWater, machineMilk, machineBeans, machineCups);
    }

    public static void Fill(int machineVault, int machineWater, int machineMilk, int machineBeans, int machineCups){
        Scanner scan = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        int machineWaterAdd = scan.nextInt();
        machineWater += machineWaterAdd;

        System.out.println("Write how many ml of milk you want to add:");
        int machineMilkAdd = scan.nextInt();
        machineMilk += machineMilkAdd;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int machineBeanAdd = scan.nextInt();
        machineBeans += machineBeanAdd;

        System.out.println("Write how many disposable cups of coffee you want to add:");
        int machineCupsAdd = scan.nextInt();
        machineCups += machineCupsAdd;

        Menu(machineVault, machineWater, machineMilk, machineBeans, machineCups);

    }

    public static void Take(int machineVault, int machineWater, int machineMilk, int machineBeans, int machineCups){

        System.out.println("\nI gave you " + machineVault + "$");
        machineVault = 0;
        State(machineVault, machineWater, machineMilk, machineBeans, machineCups);

    }
}

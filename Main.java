import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("\t******************************************");
        System.out.println("\t         WELCOME TO JAVA DRINKS!          ");
        System.out.println("\t******************************************");

        Item[][] items = new Item[][]{
                {new Item("Pepsi", 1.99, 3), new Item("Fresca", 1.49, 3), new Item("Brisk", 2.00, 3)},
                {new Item("Fanta", 1.99, 2), new Item("Barq's", 1.49, 2), new Item("A & W", 1.25, 3)},
                {new Item("Crush", 1.99, 2), new Item("C-Cola", 1.75, 2), new Item("Berry", 2.25, 4)}
        };

        Machine machine = new Machine(items);
        System.out.println(machine);

        while(true){
            System.out.print("Pick a row: ");
            int row = scan.nextInt();

            System.out.print("Pick a spot in the row: ");
            int spot = scan.nextInt();

            boolean dispensed = machine.dispense(row, spot);
            System.out.println("\n" + machine);

            if(dispensed){
                System.out.println("\nEnjoy your drink! Press 1 to purchase another: ");
            }else{
                System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: ");
            }

            if(scan.nextInt() != 1){
                break;
            }
        }



    }

}

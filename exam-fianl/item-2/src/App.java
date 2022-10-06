import java.util.ArrayList;
import java.util.Scanner;
//ขอโทษที่ hard code ครับทำเป็น static method ไม่ทัน

public class App {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    static boolean mainMenu = false;
    static ArrayList<Coffee> coffees;
    static ArrayList<Beer> beers;
    static ArrayList<Soda> sodas;

    public static void main(String[] args) throws Exception {
        coffees = new ArrayList<>();
        coffees.add(new Coffee(50, "Latte", "Dark", "Columbia"));

        beers = new ArrayList<>();
        beers.add(new Beer(140, "Hoegaarden", 5));

        sodas = new ArrayList<>();
        sodas.add(new Soda(20, "Lemon soda", 50, 80));

        clearConsole();
        System.out.print("Enter \"1234\" to use program >> ");
        try {
            int check = scanner.nextInt();
            if (check == 1234) {
                mainMenu = true;
            } else {
                System.out.println("Exit Program!");
            }
        } catch (Exception e) {
            System.out.println("Exit program!");
        }

        while (mainMenu) {
            showDisplay();
        }
    }

    private static void showDisplay() {
        clearConsole();
        System.out.println("***  Beverage Bar ***");
        System.out.println("[0] Beer");
        System.out.println("[1] Coffee");
        System.out.println("[2] Soda");
        System.out.println("[3] Add beer");
        System.out.println("[4] Add coffee");
        System.out.println("[5] Add soda");
        System.out.println("[6] Check time to sell");
        System.out.println("[7] Exit program");
        System.out.print("Selcted choice: ");
        String selected = scanner.nextLine();
        if (selected.equals("0")) {
            clearConsole();
            showBeer();
        } else if (selected.equals("1")) {
            clearConsole();
            showCoffee();
        } else if (selected.equals("2")) {
            clearConsole();
            showSoda();
        } else if (selected.equals("3")) {
            clearConsole();
            addBeer();
        } else if (selected.equals("4")) {
            clearConsole();
            addCoffee();
        } else if (selected.equals("5")) {
            clearConsole();
            addSoda();
        } else if (selected.equals("6")) {
            clearConsole();
            showTimeToSell();
        } else if (selected.equals("7")) {
            System.exit(0);
        }
    }

    private static void showBeer() {
        System.out.println("*** Beer ***");
        showBeerStock();
        System.out.println("[0] Edit price");
        System.out.println("[1] Check cost");
        System.out.println("[2] Exit to menu");
        System.out.print("Selcted choice : ");
        String selected = scanner.nextLine();
        if (selected.equals("0")) {
            clearConsole();
            showDisplay();
        }
        if (selected.equals("1")) {
            clearConsole();
            changePriceBeer();
        }
        if (selected.equals("2")) {
            clearConsole();
            showCostBeer();
        } else {
            clearConsole();
            showBeer();
        }
    }

    private static void showCoffee() {
        System.out.println("*** Coffee ***");
        showCoffeeStock();
        System.out.println("[0] Edit price");
        System.out.println("[1] Check cost");
        System.out.println("[2] Exit to menu");
        System.out.print("Selcted choice : ");
        String selected = scanner.nextLine();
        if (selected.equals("0")) {
            clearConsole();
            showDisplay();
        }
        if (selected.equals("1")) {
            clearConsole();
            changePriceCoffee();
        }
        if (selected.equals("2")) {
            clearConsole();
            showCostCoffee();
        } else {
            clearConsole();
            showCoffee();
        }
    }

    private static void showSoda() {
        System.out.println("*** Soda ***");
        showSodaStock();
        System.out.println("[0] Edit price");
        System.out.println("[1] Check cost");
        System.out.println("[2] Exit to menu");
        System.out.print("Selcted choice : ");
        String selected = scanner.nextLine();
        if (selected.equals("0")) {
            clearConsole();
            showDisplay();
        }
        if (selected.equals("1")) {
            clearConsole();
            changePriceSoda();
        }
        if (selected.equals("2")) {
            clearConsole();
            showCostSoda();
        } else {
            clearConsole();
            showSoda();
        }
    }

    private static void addCoffee() {
        try {
            System.out.println("*** Add Coffee ***");
            System.out.print("Name : ");
            String name = scannerStr.nextLine();
            System.out.print("Roast : ");
            String roast = scannerStr.nextLine();
            System.out.print("Coffee bean : ");
            String coffeeBean = scannerStr.nextLine();
            System.out.print("Price : ");
            int price = scanner.nextInt();
            coffees.add(new Coffee(price, name, roast, coffeeBean));
            showCoffee();
        } catch (Exception e) {
            clearConsole();
            addCoffee();
        }
       
    }

    private static void addBeer() {
        try {
            System.out.println("*** Add Beer ***");
            System.out.print("Brand : ");
            String brand = scannerStr.nextLine();
            System.out.print("Degree : ");
            int degree = scanner.nextInt();
            System.out.print("Price : ");
            int price = scanner.nextInt();
            beers.add(new Beer(price, brand, degree));
            showBeer();
        } catch (Exception e) {
            clearConsole();
            addBeer();
        }

    }

    private static void addSoda() {
        try {
            System.out.println("*** Add Beer ***");
            System.out.print("Name : ");
            String name = scannerStr.nextLine();
            System.out.print("Sugar level : ");
            int sugarLevel = scanner.nextInt();
            System.out.print("Sparkling level : ");
            int sparklingLevel = scanner.nextInt();
            System.out.print("Price : ");
            int price = scanner.nextInt();
            sodas.add(new Soda(price, name, sugarLevel, sparklingLevel));
            showSoda();
        } catch (Exception e) {
            clearConsole();
            addSoda();
        }

    }

    private static void changePriceBeer() {
        System.out.println("*** Edit price ***");
        showBeerStock();
        System.out.print("Selected beverage : ");
        int selectedBev = scanner.nextInt();
        System.out.print("Price to change : ");
        int priceChange = scanner.nextInt();
        beers.get(selectedBev - 1).editPrice(priceChange);
        clearConsole();
        showBeer();
    }

    private static void changePriceCoffee() {
        System.out.println("*** Edit price ***");
        showCoffeeStock();
        System.out.print("Selected beverage : ");
        int selectedBev = scanner.nextInt();
        System.out.print("Price to change : ");
        int priceChange = scanner.nextInt();
        coffees.get(selectedBev - 1).editPrice(priceChange);
        clearConsole();
        showCoffee();
    }

    private static void changePriceSoda() {
        System.out.println("*** Edit price ***");
        showSodaStock();
        System.out.print("Selected beverage : ");
        int selectedBev = scanner.nextInt();
        System.out.print("Price to change : ");
        int priceChange = scanner.nextInt();
        sodas.get(selectedBev - 1).editPrice(priceChange);
        clearConsole();
        showSoda();
    }

    private static void showCostBeer() {
        System.out.println("*** Cost of Beer ***");
        for (int i = 0; i < beers.size(); i++) {
            System.out.printf("[%d]\n", i + 1);
            System.out.print(beers.get(i));
            System.out.println("[Cost : " + beers.get(i).getCost() + "]\n");
        }
        System.out.println("[0] Edit price");
        System.out.println("[1] Back to Stock");
        System.out.println("[2] Exit to menu");
        System.out.print("Selcted choice : ");
        String selected = scanner.nextLine();
        if (selected.equals("0")) {
            clearConsole();
            changePriceBeer();
        }
        if (selected.equals("1")) {
            clearConsole();
            showBeer();
        }
        if (selected.equals("2")) {
            clearConsole();
            showDisplay();
        } else {
            clearConsole();
            showCostBeer();
        }
    }

    private static void showCostCoffee() {
        System.out.println("*** Cost of Coffee ***");
        for (int i = 0; i < coffees.size(); i++) {
            System.out.printf("[%d]\n", i + 1);
            System.out.print(coffees.get(i));
            System.out.println("[Cost : " + coffees.get(i).getCost() + "]\n");
        }
        System.out.println("[0] Edit price");
        System.out.println("[1] Back to Stock");
        System.out.println("[2] Exit to menu");
        System.out.print("Selcted choice : ");
        String selected = scanner.nextLine();
        if (selected.equals("0")) {
            clearConsole();
            changePriceCoffee();
        }
        if (selected.equals("1")) {
            clearConsole();
            showCoffee();
        }
        if (selected.equals("2")) {
            clearConsole();
            showDisplay();
        } else {
            clearConsole();
            showCostCoffee();
        }
    }

    private static void showCostSoda() {
        System.out.println("*** Cost of Soda ***");
        for (int i = 0; i < sodas.size(); i++) {
            System.out.printf("[%d]\n", i + 1);
            System.out.print(sodas.get(i));
            System.out.println("[Cost : " + sodas.get(i).getCost() + "]\n");
        }
        System.out.println("[0] Edit price");
        System.out.println("[1] Back to Stock");
        System.out.println("[2] Exit to menu");
        System.out.print("Selcted choice : ");
        String selected = scanner.nextLine();
        if (selected.equals("0")) {
            clearConsole();
            changePriceSoda();
        }
        if (selected.equals("1")) {
            clearConsole();
            showSoda();
        }
        if (selected.equals("2")) {
            clearConsole();
            showDisplay();
        } else {
            clearConsole();
            showCostSoda();
        }
    }

    private static void showBeerStock() {
        for (int i = 0; i < beers.size(); i++) {
            System.out.printf("[%d]\n", i + 1);
            System.out.println(beers.get(i));
        }
    }

    private static void showCoffeeStock() {
        for (int i = 0; i < coffees.size(); i++) {
            System.out.printf("[%d]\n", i + 1);
            System.out.println(coffees.get(i));
        }
    }

    private static void showSodaStock() {
        for (int i = 0; i < sodas.size(); i++) {
            System.out.printf("[%d]\n", i + 1);
            System.out.println(sodas.get(i));
        }
    }

    private static void showTimeToSell() {
        System.out.println("Beer : " + beers.get(0).timeToSell());
        System.out.println("Coffee : " + coffees.get(0).timeToSell());
        System.out.println("");
        System.out.println("[0] Exit to menu");
        System.out.print("Selcted choice : ");
        int selected = scanner.nextInt();
        if (selected == 0) {
            clearConsole();
            showDisplay();
        }
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

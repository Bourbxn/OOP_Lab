import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    static boolean mainMenu = true;

    static ArrayList<Beverage> beverages;

    public static void main(String[] args) throws Exception {
        beverages = new ArrayList<>();
        beverages.add(new Coffee(50, "Latte", "Dark", "Columbia"));
        beverages.add(new Beer(140, "Hoegaarden", 5));

        while (true) {
            render();
        }
    }

    private static void render() {
        if (mainMenu) {
            showDisplay();
        }

    }

    private static void showDisplay() {
        clearConsole();
        System.out.println("***  Beverage Bar ***");
        System.out.println("[0] Show stock");
        System.out.println("[1] Add coffee");
        System.out.println("[2] Add beer");
        System.out.print("Selcted choice: ");
        try {
             int selected = scanner.nextInt();
             if (selected == 0) {
                clearConsole();
                showStock();
            } else if (selected == 1) {
                clearConsole();
                addCoffee();
            } else if (selected == 2) {
                clearConsole();
                addBeer();
            }
        } catch (Exception e) {
        
        }
    }

    private static void showStock() {
        System.out.println("*** Stock ***");
        showBev();
        System.out.println("[0] Edit price");
        System.out.println("[1] Check cost");
        System.out.println("[2] Exit to menu");
        System.out.print("Selcted choice : ");
        int selected = scanner.nextInt();
        if(selected==2){
            clearConsole();
            showDisplay();
        }
        if(selected==0){
            clearConsole();
            changePrice();
        }
        if(selected==1){
            clearConsole();
            showCost();
        }
    }

    private static void addCoffee() {
        System.out.println("*** Add Coffee ***");
        System.out.print("Name : ");
        String name = scannerStr.nextLine();
        System.out.print("Roast : ");
        String roast = scannerStr.nextLine();
        System.out.print("Coffee bean : ");
        String coffeeBean = scannerStr.nextLine();
        System.out.print("Price : ");
        int price = scanner.nextInt();
        beverages.add(new Coffee(price, name, roast, coffeeBean));
        showDisplay();
    }

    private static void addBeer() {
        System.out.println("*** Add Beer ***");
        System.out.print("Brand : ");
        String brand = scannerStr.nextLine();
        System.out.print("Degree : ");
        int degree = scanner.nextInt();
        System.out.print("Price : ");
        int price = scanner.nextInt();
        beverages.add(new Beer(price, brand, degree));
        showDisplay();
    }

    private static void changePrice(){
        System.out.println("*** Edit price ***");
        showBev();
        System.out.print("Selected beverage : ");
        int selectedBev = scanner.nextInt();
        System.out.print("Price to change : ");
        int priceChange = scanner.nextInt();
        beverages.get(selectedBev-1).editPrice(priceChange);
        clearConsole();
        showStock();
    }

    private static void showCost(){
        System.out.println("*** Cost ***");
        for (int i = 0; i < beverages.size(); i++) {
            System.out.printf("[%d]\n", i + 1);
            System.out.print(beverages.get(i));
            System.out.println("[Cost : " + beverages.get(i).getCost() + "]\n");
        }
        System.out.println("[0] Edit price");
        System.out.println("[1] Check cost");
        System.out.println("[2] Exit to menu");
        System.out.print("Selcted choice : ");
        int selected = scanner.nextInt();
        if(selected==2){
            clearConsole();
            showDisplay();
        }
        if(selected==0){
            clearConsole();
            changePrice();
        }
        if(selected==1){
            clearConsole();
            showCost();
        }
    }

    private static void showBev(){
        for (int i = 0; i < beverages.size(); i++) {
            System.out.printf("[%d]\n", i + 1);
            System.out.println(beverages.get(i));
        }
    }

    private static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

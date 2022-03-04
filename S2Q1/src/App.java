import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    static boolean mainMenu = true;

    public static void main(String[] args) throws Exception {
        while (true) {
            render();
        }
    }

    public static void render() {
        if (mainMenu) {
            showDisplay();
        }

    }

    public static void showDisplay() {
        LiquorStore liquorStore = new LiquorStore();
        liquorStore.setName("Boss");
        System.out.println("*** Liquor Store Management ***");
        System.out.println("[0] Add Liquor Brand");
        System.out.println("[1] Import Liquor");
        System.out.println("[2] Sell Liquor");
        System.out.println("[3] Show Liquor Stock");
        System.out.println("[4] Show Details");
        System.out.println("[5] Exit Program");
        System.out.print("Selcted choice: ");
        int selected = scanner.nextInt();
        if (selected == 0) {
            System.out.println();
            System.out.print("Enter new brand name: ");
            String brandName = scannerStr.nextLine();
            System.out.print("Enter new brand price: ");
            String brandPrice = scannerStr.nextLine();
            liquorStore.addLiquorBrand(brandName, brandPrice);
        } else if (selected == 1) {
            System.out.println();
            liquorStore.showLiquorPrice();
            System.out.print("Selected choice: ");
            int liquorSelected = scanner.nextInt();
            System.out.print("Amount: ");
            int liquorAmount = scanner.nextInt();
            if (liquorSelected > liquorStore.getSize() || liquorSelected < 0) {
                System.out.println("INPUT ERROR!");
            } else {
                liquorStore.importLiquor(liquorSelected, liquorAmount);
                System.out.printf("Balance left: %.2f\n", liquorStore.getBalance());
            }

        } else if (selected == 2) {
            System.out.println();
            liquorStore.showLiquorAmount();
            System.out.print("Selected choice: ");
            int liquorSelected = scanner.nextInt();
            System.out.print("Amount: ");
            int liquorAmount = scanner.nextInt();
            System.out.print("Profit(1-30 percents): ");
            double liquorPercents = scanner.nextInt();
            if (liquorSelected > liquorStore.getSize() || liquorSelected < 0) {
                System.out.println("INPUT ERROR!");
            } else {
                liquorStore.sellLiquor(liquorSelected, liquorAmount, liquorPercents);
                System.out.printf("Balance left: %.2f\n", liquorStore.getBalance());
            }
        } else if (selected == 3) {
            liquorStore.showLiquor();
        } else if (selected == 4) {
            System.out.println("\nName : " + liquorStore.getName());
            System.out.printf("Balance : %.2f\n", liquorStore.getBalance());
        } else if (selected == 5) {
            System.out.println("\nEnd of Program.");
            System.exit(0);
        } else {
            System.out.println("\nINPUT ERROR!");
        }
        System.out.println();
    }
}

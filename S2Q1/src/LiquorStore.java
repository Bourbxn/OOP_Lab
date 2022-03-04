class LiquorStore {
    private String name;
    private double balance;
    private String[][] liquor;
    private String[][] temp;
    private int size;

    public LiquorStore(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.size = 3;
        liquor = new String[3][size];
        liquor[0][0] = "Blend285";
        liquor[0][1] = "SangSom";
        liquor[0][2] = "Red Label";
        liquor[1][0] = "0";
        liquor[1][1] = "0";
        liquor[1][2] = "0";
        liquor[2][0] = "280";
        liquor[2][1] = "250";
        liquor[2][2] = "400";
    }

    public LiquorStore() {
        this.name = "Admin";
        this.balance = 10000;
        this.size = 3;
        liquor = new String[3][size];
        liquor[0][0] = "Blend285";
        liquor[0][1] = "SangSom";
        liquor[0][2] = "Red Label";
        liquor[1][0] = "0";
        liquor[1][1] = "0";
        liquor[1][2] = "0";
        liquor[2][0] = "280";
        liquor[2][1] = "250";
        liquor[2][2] = "400";
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getSize() {
        return this.size;
    }

    // function
    public void showLiquor() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(liquor[0][i] + " : " + liquor[1][i]);
        }
    }

    public void showLiquorPrice() {
        for (int i = 0; i < size; i++) {
            System.out.print("[" + (i + 1) + "]" + " ");
            System.out.println(liquor[0][i] + " : " + liquor[2][i]);

        }
    }

    public void showLiquorAmount() {
        for (int i = 0; i < size; i++) {
            System.out.print("[" + (i + 1) + "]" + " ");
            System.out.println(liquor[0][i] + " : " + liquor[1][i]);

        }
    }

    public void importLiquor(int selected, int amount) {
        int amountFromStr = Integer.parseInt(liquor[1][selected - 1]) + amount;
        String amountToStr = Integer.toString(amountFromStr);
        this.balance -= Integer.parseInt(liquor[2][selected - 1]) * amount;
        liquor[1][selected - 1] = amountToStr;
        if (this.balance < 0) {
            this.balance += Integer.parseInt(liquor[2][selected - 1]) * amount;
            amountFromStr = Integer.parseInt(liquor[1][selected - 1]) - amount;
            String amountToStrNew = Integer.toString(amountFromStr);
            liquor[1][selected - 1] = amountToStrNew;
            System.out.println("INPUT ERROR!");
        }
    }

    public void sellLiquor(int selected, int amount, double profit) {
        boolean inputError = false;
        int amountFromStr = Integer.parseInt(liquor[1][selected - 1]) - amount;
        if (amountFromStr < 0) {
            amountFromStr += amount;
            inputError = true;
            amount = 0;
        }
        String amountToStr = Integer.toString(amountFromStr);
        this.balance += (Integer.parseInt(liquor[2][selected - 1]) * ((profit + 100) / 100)) * amount;
        liquor[1][selected - 1] = amountToStr;
        if ((profit < 0 || profit > 30) && inputError) {
            this.balance += (Integer.parseInt(liquor[2][selected - 1]) * ((profit + 100) / 100)) * amount;
            inputError = true;
        }
        if (inputError) {
            System.out.println("INPUT ERROR!");
        }
    }

    public void addLiquorBrand(String brandName, String price) {
        temp = new String[3][size];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < size; j++) {
                temp[i][j] = liquor[i][j];
            }
        }
        size++;
        liquor = new String[3][size];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1) {
                    if (i == 0) {
                        liquor[i][j] = brandName;
                    } else if (i == 1) {
                        liquor[i][j] = "0";
                    } else if (i == 2) {
                        liquor[i][j] = price;
                    }
                } else {
                    liquor[i][j] = temp[i][j];
                }
            }
        }
    }
}

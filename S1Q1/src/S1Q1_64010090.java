import java.util.Scanner;
import java.util.Random;

public class S1Q1_64010090 {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        System.out.print("Input size of matrix is : ");
        int size = scannerInt.nextInt();
        if(size<4) {
            System.out.println("INPUT ERROR!");
            System.exit(0);
        }
        System.out.println("Random Matrix is :");
        int[][] matrix = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j] = rand.nextInt(10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Please input value of Row and Column : ");
        String RWSelect = scannerStr.nextLine();
        String[] RWList = RWSelect.split(" ");
        int rowSelect = Integer.parseInt(RWList[0]);
        int columnSelect = Integer.parseInt(RWList[1]);
        if(rowSelect<0 || rowSelect>size-1 || columnSelect<0 || columnSelect>size-1){
            System.out.println("INPUT ERROR!");
            System.exit(0);
        }
        System.out.println("The selected member is "+matrix[rowSelect][columnSelect]);
        memberOnTop(matrix, size, rowSelect, columnSelect);
        memberOnRight(matrix, size, rowSelect, columnSelect);
        memberAtBottom(matrix, size, rowSelect, columnSelect);
        memberOnLeft(matrix, size, rowSelect, columnSelect);
        System.out.println("End of program.");
    }

    public static void memberOnTop(int[][] matrix, int size,int row,int column){
        System.out.print("(i) Members on Top : ");
        for(int i=row-1;i>=0;i--){
            System.out.print(matrix[i][column]);
            if(i!=0) System.out.print(",");
        }
        if(row==0) System.out.print("NO");
        System.out.println();
    }

    public static void memberOnRight(int[][] matrix, int size,int row,int column){
        System.out.print("(i) Members on the Right Hand Side : ");
        for(int i=column+1;i<size;i++){
            System.out.print(matrix[row][i]);
            if(i!=size-1) System.out.print(",");
        }
        if(column==size-1) System.out.print("NO");
        System.out.println();

    }

    public static void memberAtBottom(int[][] matrix, int size,int row,int column){
        System.out.print("(i) Members at the Bottom : ");
        for(int i=row+1;i<size;i++){
            System.out.print(matrix[i][column]);
            if(i!=size-1) System.out.print(",");
        }
        if(row==size-1) System.out.print("NO");
        System.out.println();
    }

    public static void memberOnLeft(int[][] matrix, int size,int row,int column){
        System.out.print("(i) Members on the Left Hand Side : ");
        for(int i=column-1;i>=0;i--){
            System.out.print(matrix[row][i]);
            if(i!=0) System.out.print(",");
        }
        if(column==0) System.out.print("NO");
        System.out.println();
    }

}

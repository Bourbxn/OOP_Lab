import java.util.Scanner;
import java.util.Random;

public class Lab03_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void checkColumn(int[][] matrix,int size){
        boolean haveSame = false;
        for(int i=0;i<size;i++){
            int same = 0;
            for(int j=0;j<size;j++){
                if(matrix[0][i]==matrix[j][i]){
                    same++;
                    if(same==size){
                        System.out.println("All "+ matrix[j][0] +"s on column " + i);
                        haveSame = true;
                    }
                }
                else {
                    break;
                }
            }   
        }
        if(!haveSame) System.out.println("No same numbers on a column");
    }

    public static void checkRow(int[][] matrix,int size){
        boolean haveSame = false;
        for(int i=0;i<size;i++){
            int same = 0;
            for(int j=0;j<size;j++){
                if(matrix[i][0]==matrix[i][j]){
                    same++;
                    if(same==size){
                        System.out.println("All "+ matrix[i][0] +"s on row " + i);
                        haveSame = true;
                    }
                }
                else {
                    break;
                }
            }   
        }
        if(!haveSame) System.out.println("No same numbers on a row");
    }
    public static void main(String[] args){
        Random rand = new Random();
        System.out.print("Enter the size for the matrix: ");
        int num = scanner.nextInt();
        int matrix[][] = new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                matrix[i][j]=rand.nextInt(2);
                System.out.print(matrix[i][j]);
                if(j!=num-1) System.out.print(" ");
            }
            System.out.println();
        }
   
        checkRow(matrix, num);
        checkColumn(matrix, num);
    }
    
}

import java.util.Scanner;

public class Lab02_5 {
    public static void main(String[] args) {
        boolean inputError;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between 1 and 15: ");
        int num = scanner.nextInt();
        if(num<1 || num>15) inputError = true;
        else inputError = false;
        for(int i=0;i<num;i++){
            if(inputError){
                break;
            }
            for(int j=0;j<num*2-((i+1)*2);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.printf("%d ",j+1);
            }
            System.out.print(1);
            for(int j=1;j<=i;j++){
                System.out.printf(" %d",j+1);
            }
            System.out.println();
        }
        if(inputError){
            System.out.println("INPUT ERROR!");
        }
    }
}

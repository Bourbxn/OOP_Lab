import java.lang.Math;

public class App {
    //Palindrome Prime 
    public static boolean checkPrime(int num){
        int factor = 0;
        for(int i = 1;i<=num;i++){
            if(num%i==0) factor++;
            if(factor>2) break;
        }
        if(factor==2) return true;
        else return false;
    }

    public static boolean checkPalindromic(int num){
        String number = Integer.toString(num);
        if(number.length()%2==0){
            int loopRound = number.length()/2;
            int sameRound = 0;
            for(int i = 0;i<loopRound;i++){
                if(Character.compare(number.charAt(loopRound-i-1), number.charAt(loopRound+i))==0){
                    sameRound++;
                }
            }
            if(sameRound==loopRound) return true;
            else return false;
        }
        else{
            int loopRound = (number.length()-1)/2;
            int sameRound = 0;
            for(int i = 0;i<loopRound;i++){
                if(Character.compare(number.charAt(loopRound-i-1), number.charAt(loopRound+i+1))==0){
                    sameRound++;
                }
            }
            if(sameRound==loopRound) return true;
            else return false;
        }
    }

    public static void displayPalindromePrime(){
        StopWatch stopWatch = new StopWatch();
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        int size = 0;
        int num = 1;
        stopWatch.start();
        while(size!=100){
            if(checkPrime(num) && checkPalindromic(num)){
                System.out.print(num + " ");
                size++;
                if(size%10==0) System.out.println();
            }
            num++;
        }
        stopWatch.stop();
        Long elapsedTime = stopWatch.getElapsedTime();
        Double elapsedTimeDouble = elapsedTime.doubleValue();
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.printf("The palindromPrime time is %.1f milliseconds.\n",elapsedTimeDouble);
    }

    //Sort Elements
    public static void showElements(double[] elementsList,int size){
        for(int i=0;i<size;i++){
            System.out.print("    ");
            String floatToString = Double.toString(elementsList[i]);
            if(Character.compare(floatToString.charAt(2), '.')==0){
                System.out.print(" ");
            }
            else if(Character.compare(floatToString.charAt(1), '.')==0){
                System.out.print("  ");
            }
            System.out.printf("%.2f",elementsList[i]);
            if((i+1)%5==0) System.out.println();
        }
    }

    public static void displayElements(){
        StopWatch stopWatch = new StopWatch();
        double[] elementsList = new double[1000];
        for(int i=0;i<1000;i++){
            elementsList[i] = Math.random()*(999)+1;  
        }
        System.out.println("Creating a list containing 1000 elements,");
        showElements(elementsList, 1000);
        System.out.println("List Created.");
        System.out.println("Sorting stopwatch starts...");
        stopWatch.start();
        Double temp = 0.0;
        for(int i=0;i<1000;i++){
            for(int j=1;j<1000-i;j++){
                if(elementsList[j-1]>elementsList[j]){
                    temp = elementsList[j-1];
                    elementsList[j-1]=elementsList[j];
                    elementsList[j]=temp;
                }
            }
        }
        stopWatch.stop();
        Long elapsedTime = stopWatch.getElapsedTime();
        Double elapsedTimeDouble = elapsedTime.doubleValue();
        showElements(elementsList, 1000);
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds.\n",elapsedTimeDouble);
    }

    //Main
    public static void main(String[] args) throws Exception {
        displayElements();
        for(int i=0;i<60;i++) System.out.print("-");
        displayPalindromePrime();
    }
}
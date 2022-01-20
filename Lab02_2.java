import java.util.Random;
import java.util.Scanner;

public class Lab02_2 {
    public static void main(String[] args){
        boolean error;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("scissor (0), rock (1), paper (2): ");
        int numPlayerSRP = scanner.nextInt();
        int numComSRP = random.nextInt(3);
        if(numPlayerSRP > 2 || numPlayerSRP<0){
            System.out.println("INPUT ERROR!");
            error = true;
        }
        else error = false;
        String playerSRP = "";
        if(numPlayerSRP == 0 ){
            playerSRP += "scissor";
        }
        else if(numPlayerSRP == 1){
            playerSRP += "rock";
        }
        else if(numPlayerSRP == 2){
            playerSRP += "paper";
        }
        String comSRP = "";
        if(numComSRP == 0 ){
            comSRP += "scissor";
        }
        else if(numComSRP == 1){
            comSRP += "rock";
        }
        else if(numComSRP == 2){
            comSRP += "paper";
        }
        String result = "";
        if(numComSRP == numPlayerSRP){
            result += ". It is a draw";
        }
        else if(numPlayerSRP == 0 && numComSRP == 1){
            result += ". You lose";
        }
        else if(numPlayerSRP == 0 && numComSRP == 2){
            result += ". You won";
        }
        else if(numPlayerSRP == 1 && numComSRP == 2){
            result += ". You lose";
        }
        else if(numPlayerSRP == 1 && numComSRP == 0){
            result += ". You won";
        }
        else if(numPlayerSRP == 2 && numComSRP == 0){
            result += ". You lose";
        }
        else if(numPlayerSRP == 2 && numComSRP == 1){
            result += ". You won";
        }
        if(!error){
            System.out.println("The computer is "+ comSRP +". You are "+ playerSRP + result);
        }


    }
}

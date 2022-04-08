import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] rank = { "assistant", "associate", "full" };
        try {
            FileWriter salaryTxt = new FileWriter("Salary.txt");
            for (int i = 0; i < 1000; i++) {
                double[] salaryRank = { 50000 + (Math.random() * 30000),
                        60000 + (Math.random() * 50000),
                        75000 + (Math.random() * 55000) };
                int randRank = rand.nextInt(3);
                String dataWrite = String.format("Firstname%d Lastname%d %s %.2f \n", i+1, i+1, rank[randRank],
                        salaryRank[randRank]);
                salaryTxt.write(dataWrite);
            }
            salaryTxt.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
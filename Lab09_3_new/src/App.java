import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 


public class App {
    public static void main(String[] args) {
        try {
            String data = new String("");
            File salaryTxt = new File("Salary.txt");
            Scanner salaryReader = new Scanner(salaryTxt);
            while (salaryReader.hasNextLine()) {
                data += salaryReader.nextLine();
            }
            String[] dataList = data.split(" ");
            
            double totalAsst = getTotal(dataList, "assistant");
            double totalAssc = getTotal(dataList, "associate");
            double totalFull = getTotal(dataList, "full");
            double totalAll = totalAssc + totalAssc + totalFull;
            double avgAsst = getAverage(dataList, "assistant");
            double avgAssc = getAverage(dataList, "associate");
            double avgFull = getAverage(dataList, "full");
            double avgAll = totalAll/1000;

            System.out.printf("Total salary for assistant professor is %.2f\n",totalAsst);
            System.out.printf("Total salary for associate professor is %.2f\n",totalAssc);
            System.out.printf("Total salary for full professor is %.2f\n",totalFull);
            System.out.printf("Total salary for all professor is %.2f\n",totalAll);
            System.out.println("-----------------------------------------------------");
            System.out.printf("Average salary for assistant professor is %.2f\n",avgAsst);
            System.out.printf("Average salary for associate professor is %.2f\n",avgAssc);
            System.out.printf("Average salary for full professor is %.2f\n",avgFull);
            System.out.printf("Average salary for all professor is %.2f\n",avgAll);
            salaryReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static double getTotal(String[] dataList, String rank){
        double total = 0;
        for(int i=2;i<dataList.length;i+=4){
            if(dataList[i].compareTo(rank)==0){
                total += Double.parseDouble(dataList[i+1]);
            }
        }
        return total;
    }

    public static double getAverage(String[] dataList, String rank){
        double total = 0;
        int count = 0;
        for(int i=2;i<dataList.length;i+=4){
            if(dataList[i].compareTo(rank)==0){
                count++;
                total += Double.parseDouble(dataList[i+1]);
            }
        }
        return total/count;
    }
}


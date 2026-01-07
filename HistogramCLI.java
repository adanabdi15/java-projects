import java.util.Random;
import java.util.Scanner;

public class HistogramCLI {
    public static void main(String[] args) {
        boolean again;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        // Declare some variables
        int dice = 0;
        int sides = 0;
        int rolls = 0;
        int dieSum = 0;
        int minIndex = 0;
        int maxIndex = 0;
        Histogram hist;
        int[] counts;
        

        do {
            

            do {
                System.out.print("How many dice do you want? (1 - 3): ");
                dice = scan.nextInt();
            } while (dice < 1 || dice > 3);
            

            do {
                System.out.print("How many sides does each die have? (Choose an option from 2-9): ");
                sides = scan.nextInt();
            } while (sides < 2 || sides > 9);
            

            minIndex = dice;
            maxIndex = dice * sides;
            

            counts = new int[maxIndex + 1];
            

            do {
                System.out.print("How many rolls? (Choose from 1000 - 2 billion): ");
                rolls = scan.nextInt();
            } while (rolls < 1000 || rolls > 2000000000);
            

            for (int i = 0; i < rolls; i++) {
                dieSum = 0;
                
                for (int j = 0; j < dice; j++) {
                    int randomNum = rand.nextInt(sides) + 1;
                    dieSum += randomNum;
                }
                
                counts[dieSum]++;
            }
            

            hist = new Histogram(counts, minIndex, maxIndex, 12);
            

            hist.drawHor();
            System.out.println();
            hist.drawVer();
            
            System.out.print("Continue? (true for yes and false for no) ");
            again = scan.next().equalsIgnoreCase("yes");
            System.out.println();
            
        } while (again);
    }
}

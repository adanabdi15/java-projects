import java.util.Scanner;

public class TwelveDays {

    public static void main(String[] args) throws Exception {

    
        int days;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many days should we do? (1 to 12): ");
        days = scan.nextInt();
        System.out.println();

  
        if (days < 1) days = 1;
        if (days > 12) days = 12;
        for (int i = 1; i <= days; i++) {
            switch (i) {
                case 1:
                    System.out.println("On the " + i + "st day of Christmas, my true love sent to me:");
                    break;
                case 2:
                    System.out.println("On the " + i + "nd day of Christmas, my true love sent to me:");
                    break;
                case 3:
                    System.out.println("On the " + i + "rd day of Christmas, my true love sent to me:");
                    break;
                default:
                    System.out.println("On the " + i + "th day of Christmas, my true love sent to me:");
                    break;
            }
            switch (i) {
                case 12:
                    System.out.println("Twelve Drummers Drumming");
                case 11:
                    System.out.println("Eleven Pipers Piping");
                case 10:
                    System.out.println("Ten Lords a Leaping");
                case 9:
                    System.out.println("Nine Ladies Dancing");
                case 8:
                    System.out.println("Eight Maids a Milking");
                case 7:
                    System.out.println("Seven Swans a Swimming");
                case 6:
                    System.out.println("Six Geese a Laying");
                case 5:
                    System.out.println("Five Golden Rings");
                case 4:
                    System.out.println("Four Calling Birds");
                case 3:
                    System.out.println("Three French Hens");
                case 2:
                    System.out.println("Two Turtle Doves");
                case 1:
                    if (i != 1) {
                        System.out.println("and a Partridge in a Pear Tree");
                    } else {
                        System.out.println("a Partridge in a Pear Tree");
                    }

            }
            System.out.println();
        }


        System.out.println();
        pause(1000);

    }


    private static void pause(int milliseconds) throws Exception {
        Thread.sleep(milliseconds);
 
    }

}


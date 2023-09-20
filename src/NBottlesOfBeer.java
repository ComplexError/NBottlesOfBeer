import java.util.Scanner;

public class NBottlesOfBeer {
    public static void main(String[] args) {

        //initialize Scanner
        Scanner in = new Scanner(System.in);

        //user prompt and input
        System.out.println("How many bottles of beer do you wish to start with?");
        int BottlesOfBeer = in.nextInt();

        //reassigned variable for convenience
        int i = BottlesOfBeer;

        //introduced while to loop while bottles are above 1
        while (i > 1) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                    "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
            i--;
        }
        //last execution with appropriate grammar
        if (i == 1) {
            System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take one down and pass it around, 0 bottles of beer on the wall.\n");
        }
        //concludes song
        System.out.println("0 bottles of beer on the wall, 0 bottles of beer.\n" +
                "Go to the store and buy some more, " + BottlesOfBeer + " bottles of beer on the wall.");
    }
}
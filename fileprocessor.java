
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
public class ScrabbleDriver {
    public static void main (String [] args) throws FileNotFoundException {
        int maxScrabbleScore = 0;
        String lineNumber = "";
        String scrabble;
        Scanner scan1 = new Scanner(System.in);
        PrintStream name = new PrintStream("scorecard.txt");
        System.out.print("please enter a file, with the correct name (use .txt) : ");
        File file = new File(scan1.nextLine());
        Scanner scan2 = new Scanner(file);
        String word = null;
        int score = 0;
        while (scan2.hasNextLine()) {
            score = 0;
            word = scan2.nextLine();
            word = word.toUpperCase(Locale.ROOT);
            Scanner scan3 = new Scanner(word);
            
            for (int i = 0; i < word.length(); i++) {
                int points = Scrabble1(word.charAt(i));

                if (i % 9== 0 && i % 4 == 0 ) {
                    points = points * 4;
                }
                else if (i % 9 == 0) {
                    points = points * 3;

                }
                else if ( i % 4 == 0) {
                    points = points *2;
                }
               score+= points;


            }
            if(maxScrabbleScore < score){
                maxScrabbleScore = score;
                lineNumber = word;
            }
            if (word!= ""){
                name.println("Score: " + score + " " + word); // Samir Sanchez helped me with this line, I kept getting a scorecard but it was repeating since it was outside of the while loop.
            }
        }




        System.out.println( "Max scrabbleScore : " + " [" + maxScrabbleScore + " ]" + " for this line  : " + " [" +  lineNumber + "]" );

        
    }
    public static int  Scrabble1(char points) {

        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        boolean True1 = false;
        int number = 0;

        if (letters [0] == points) {
            return 1;
        }
        if (letters [1] == points) {
            return 3;
        }
        if (letters [2] == points) {
            return 3;
        }
        if (letters [3] == points) {
            return 2;
        }
        if (letters [4] == points) {
            return 1;
        }
        if (letters [5] == points ) {
            return 4;
        }
        if (letters [6] == points) {
            return 2;
        }
        if (letters [7] == points) {
            return 4;
        }
        if (letters [8] == points) {
            return 1;
            
        }
        if (letters [9] == points) {
            return 8;
        }
        if (letters [10] == points ) {
            return 5;
        }
        if (letters [11] == points) {
            return 1;
        }
        if (letters [12] == points) {
            return 3;
        }
        if (letters [13] == points) {
            return 1;
        }
        if (letters[14] == points ){
            return  1;
        }
        if (letters [15] == points) {
            return 3;
        }
        if (letters[16] == points){
            return 10;
        }
        if (letters [17] == points) {
            return 1;
        }
        if (letters [18] == points) {
            return 1;
        }
        if (letters [19] == points) {
            return 1;
        }
        if (letters [20] == points) {
            return 1;
        }
        if (letters [21] == points) {
            return 4;
        }
        if (letters[22] == points) {
            return 4;
        }
        if (letters [23] == points) {
            return 8;
        }
        if (letters [24] == points) {
            return 4;
        }
        if (letters [25] == points) {
            return 10;
        }
        return 0; }}

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select file");
        try {
            String filepath = sc.nextLine();

        System.out.println("What would you like to count? Possible answers: words, lines, chars. Enter 'end' to end program");
        String ans = sc.nextLine();
        switch (ans) {
            case "words":
                CountWords cw = new CountWords();
                System.out.println(cw.count(filepath));
                break;
            case "lines":
                CountLines cl = new CountLines();
                System.out.println(cl.countLines(filepath));
                break;
            case "chars":
                CharsCounter cc = new CharsCounter();
                System.out.println(cc.countLines(filepath));
                break;
        }
        }catch(Exception e){
            System.err.println(e);
            System.out.println("Wrong file name!");
        }

    }
}

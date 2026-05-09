import java.io.File;
import java.util.Scanner;

public class FileAnalyzer {

    public static void main(String[] args) {

        try {

            File file = new File("sample.txt");

            Scanner sc = new Scanner(file);

            int lines = 0;
            int words = 0;
            int characters = 0;

            while(sc.hasNextLine()) {

                String line = sc.nextLine();

                lines++;

                characters += line.length();

                String[] wordList = line.split(" ");

                words += wordList.length;
            }

            System.out.println("Lines = " + lines);
            System.out.println("Words = " + words);
            System.out.println("Characters = " + characters);

            sc.close();

        }

        catch(Exception e) {

            System.out.println("File Not Found");
        }
    }
}
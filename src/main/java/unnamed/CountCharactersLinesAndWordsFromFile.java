package unnamed;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountCharactersLinesAndWordsFromFile {

    public static void main(String args[]) throws IOException {

        String filePath = System.getProperty("user.dir") +"\\src\\sample.txt";
        System.out.println(filePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        int lineCount = 0;
        int wordCount = 0;
        int charcount = 0;

        String line = bufferedReader.readLine();

        while (line != null) {
            lineCount++;

            String[] wordsArray = line.split(" ");
            wordCount = wordCount + wordsArray.length;

            char[] characters = line.toCharArray();
            charcount = charcount + characters.length;

            line = bufferedReader.readLine();
            }

        System.out.println("Line count : " + lineCount);
        System.out.println("Word count : " + wordCount);
        System.out.println("Character count : " + charcount);
        }
    }


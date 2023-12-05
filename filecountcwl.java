import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

 class FileCharacterCounter {

    public static void main(String[] args) throws IOException {
        // Create a FileInputStream object to read the file
        FileInputStream fis = new FileInputStream(args[0]);

        // Create a Reader object to read the file
        Reader rd = new InputStreamReader(fis);

        // Initialize the character count, word count, and line count
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        // Read the file character by character
        int ch;
        while ((ch = rd.read()) != -1) {
            // Increment the character count
            charCount++;

            // If the character is a space, increment the word count
            if (ch== ' ') {
                wordCount++;
            }

            // If the character is a newline character, increment the line count
            if (ch == '\n') {
                lineCount++;
            }
        }

        // Close the Reader object
        rd.close();

        // Print the character count, word count, and line count
        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
    }
}
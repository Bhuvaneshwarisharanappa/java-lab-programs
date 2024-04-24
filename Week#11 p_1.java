import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class MyFileWriter {
    public static void main(String arg[]) {
        try {
            FileWriter fw = new FileWriter("TestFile.txt");
            String s = "\nAll the Best for your exams dear Students.\n";
            char ch[] = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                fw.write(ch[i]);
            }
            String a = "Good Luck and Prepare Well.";
            fw.write(a);
            fw.close();

            FileReader fr = new FileReader("TestFile.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            fr.close();
        } catch (FileNotFoundException nfe) {
            System.out.println("Invalid File Name\nFile does not exist.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
        }
    }
}

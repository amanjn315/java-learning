import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("students.txt");
            writer.write("Aman,101\n");
            writer.write("Sara,102\n");
            writer.write("John,103\n");
            writer.close();
        }
        catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            String line;
            while((line = reader.readLine()) != null){
                String[] student = line.split(",");
                System.out.println("Name: " + student[0] + ", Roll: " + student[1]);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

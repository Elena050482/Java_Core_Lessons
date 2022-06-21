import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class HomeWorkFiveCore {

    public static void main(String[] args) throws IOException, InterruptedException {

        File tempFile = new File("./example.csv");
        tempFile.createNewFile();

        PrintWriter writer = new PrintWriter(tempFile);
        writer.println("Value1; Value2; Value3");
        writer.println("100; 200; 123");
        writer.println("300; 400; 500");
        writer.flush();
        writer.close();
    
        AppData data = new AppData();

        data.readFromFile("./example.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_example.csv");
    }
}

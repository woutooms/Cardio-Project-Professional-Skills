package fact.it.cardioproject.model;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileData {

    private int day;

    public FileData() {
    }

    public void writeFile(){

        try {
            FileWriter myWriter = new FileWriter("FILLINYOURSELF/example-mvc/example-mvc/src/main/resources/data.txt");
            myWriter.write(Integer.toString(day));
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }

    public void getDataFromFile(){

        int fileDay = 0;

        try {
            File myFile = new File("FILLINYOURSELF/example-mvc/example-mvc/src/main/resources/data.txt");
            Scanner myReader = new Scanner(myFile);
            fileDay = Integer.parseInt(myReader.nextLine());
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        this.day = fileDay;
    }

    public int getDay() {
        getDataFromFile();
        return day;
    }

    public void countDay(){
        this.day += 1;
        writeFile();
    }
}

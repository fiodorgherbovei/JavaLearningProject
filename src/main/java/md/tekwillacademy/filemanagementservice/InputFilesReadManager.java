package md.tekwillacademy.filemanagementservice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputFilesReadManager {
    public static void printTheDataFroAFile(String file){
        try {
            System.out.println(Files.readString(Path.of(file)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printDataFromAFileByUsingFileReader (String filepath){
        FileReader fileReader = null;
        try {
             fileReader = new FileReader(filepath);
            int charNumber;
            while ((charNumber = fileReader.read()) !=  -1){
                System.out.print((char)charNumber);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

}

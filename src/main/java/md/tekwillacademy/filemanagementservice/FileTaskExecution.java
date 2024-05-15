package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) {

        File fileObject07 = new File ("src/main/java/md/tekwillacademy/filemanagementservice/fisier.txt");

        FilesManager.informIfTheFileExists(fileObject07);
        System.out.println(FilesManager.createTheFileIDoesNotExists(fileObject07));
        FilesManager.informIfTheFileExists(fileObject07);
        FilesManager.printTheFileName(fileObject07);
        FilesManager.printTheAbsolutePath(fileObject07);
        FilesManager.printIfTheFileIsADirectory(fileObject07);
        FilesManager.deleteTheFileIsExists(fileObject07);

        String path = "src/main/java/md/tekwillacademy/filemanagementservice/writedata.txt";
        OutputFilesWriterManager.writeDataIntoTheFileUsingFileWriter(path, "Content 1");
        OutputFilesWriterManager.writeDataIntoTheFileUsingFileWriter(path, "Content 2");
        OutputFilesWriterManager.writeDataIntoTheBufferUsingFileWriter(path,"Content 3");

        InputFilesReadManager.printTheDataFroAFile(path);
        InputFilesReadManager.printDataFromAFileByUsingFileReader(path);

    }
}

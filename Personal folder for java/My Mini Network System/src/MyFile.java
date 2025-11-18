import Exceptions.FileErrorException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class MyFile {

    static File createFolder(String folderName) {
        File folder = new File(folderName);
        boolean makeDirectory = folder.mkdir();
        return folder;
    }

    static File createFileInAFolder(File folder, String filename) {
        File file = new File(folder, filename);
        try {
            boolean isCreated = file.createNewFile();
            return file;
        } catch (IOException e) {
            throw new FileErrorException("An Error occurred when creating File");
        }
    }

    static File writeToFileInFolder(File folder, String filename, String words) {
        File file = createFileInAFolder(folder, filename);
        try (FileWriter writeTo = new FileWriter(file, true)) {
            writeTo.write(words + "\n");
            return file;
        } catch (IOException e) {
            throw new FileErrorException("There was an Error when created the file");
        }
    }

    static void clearFileInAFolder(File folder, String filename) {
        File file = createFileInAFolder(folder, filename);
        try (FileWriter writeTo = new FileWriter(file)) {
            writeTo.write("");
        } catch (IOException e) {
            throw new FileErrorException("There was an Error when created the file");
        }
    }

    public static File createFile(String nameOfFile) {
        File file = new File(nameOfFile);
        try {
            boolean isCreated = file.createNewFile();
            return file;
        } catch (IOException e) {
            throw new FileErrorException("Theres is a problem in your createFile function");
        }
    }

    public static boolean writeToFile(File file, String words) {
        try (FileWriter writeTo = new FileWriter(file, true)) {
            writeTo.write(words + "\n");
            return true;
        } catch (IOException e) {
            throw new FileErrorException("There was a problem in write to file function");
        }
    }

    public static boolean writeToPhoneBookFile(File file, String sender, String words) {
        try (FileWriter writeTo = new FileWriter(file, true)) {
            long length = file.length();
            writeTo.write(length+" "+sender + "," + words + "\n");
            return true;
        } catch (IOException e) {
            throw new FileErrorException("There was a problem in write to file function");
        }
    }

    public static ArrayList<String> returnFileContent(File file) {
        ArrayList<String> listOfElements = new ArrayList<String>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                listOfElements.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new FileErrorException("The file reader is not working");
        }
        return listOfElements;
    }
}

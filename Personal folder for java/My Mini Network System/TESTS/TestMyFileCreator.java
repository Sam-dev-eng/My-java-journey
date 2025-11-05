import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyFileCreator {
    File folder;
    File file;
    @BeforeEach
    void setup(){
        folder = MyFile.createFolder("Testing");
        file = MyFile.createFile("testingFile.text");
    }

    @Test
    void testIfICanCrateAFolder(){
        assertTrue(folder.exists());
    }
    @Test
    void testIfICanCreateAFileInTheSameFolder(){
        File file = MyFile.createFileInAFolder(folder,"testing-File.text");
        assertTrue(file.exists());
    }
    @Test
    void testIfICanCreateAFileNormally(){
        assertTrue(file.exists());
    }
    @Test
    void testIfICanWriteToAFile(){
      assertTrue(MyFile.writeToFile(file,"words"));
    }
    @Test
    void testToWriteAFileInAFolder(){
        MyFile.writeToFileInFolder(folder,"testing-File.text","words Men");
    }
    @Test
    void testIfICanGetSavedElementsInMyFile(){
        System.out.println(MyFile.returnFileContent(file));
    }
}

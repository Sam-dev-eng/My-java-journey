import DiariesException.NameException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {
    Diaries diaries;
    @BeforeEach
    void setup(){
        diaries = new Diaries();
    }

    @Test
    void testToAddToDiary_findByUserName(){
        diaries.add("userName","password");
        Diary diary = diaries.findByUserName("userName");
        assertEquals("userName", diary.getUserName());
    }
    @Test
    void testToFind_WrongUserName(){
        diaries.add("userName","password");
        assertThrows(NameException.class,()->  diaries.findByUserName("wrongUserName"));
    }
    @Test
    void testForDuplicateName_WhenAdding(){
        diaries.add("userName","password");
        assertThrows(NameException.class,()->  diaries.add("userName","password"));
    }
    @Test
    void testToDelete_Diary(){
        diaries.add("userName","password");
        diaries.delete("userName","password");
        assertThrows(NameException.class,()->  diaries.findByUserName("userName"));
    }
}

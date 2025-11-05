import DiaryExceptions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    void setup(){
        diary = new Diary("userName","password");
    }
    @Test
    void testIfICanUnlockMyDairyWithMyPassword(){
        diary.unlockDiary("password");
        assertTrue(diary.isLocked());
    }
    @Test
    void testIfICanLockMyDiary(){
        diary.lockDiary();
        assertFalse(diary.isLocked());
    }
    @Test
    void testIfICanUnlockWithAWrongPassword(){
        assertThrows(PasswordException.class,()-> diary.unlockDiary("2222"));
        assertFalse(diary.isLocked());
    }
    @Test
    void testIfICanCreateEntry_whenDiaryIsLocked(){
        assertThrows(DiaryAccountLockedException.class,()-> diary.createEntry("title","body"));

    }

    @Test
    void testIfICanCreateEntries_findEntryByIdNumber(){
        diary.unlockDiary("password");
        int IdNumber = diary.createEntry("title","body");
        Entry entry = diary.findEntryById(IdNumber);
        assertEquals(IdNumber,entry.getIdNumber());
    }
    @Test
    void testToFindWrongIdNumber_FindEntryById(){
        diary.unlockDiary("password");
        diary.createEntry("title","body");
        assertThrows(IdNumberException.class,()-> diary.findEntryById(2233));

    }
    @Test
    void testTOUpdateExistingEntry_UpdateEntry(){
        diary.unlockDiary("password");
        int IdNumber = diary.createEntry("title","body");
        Entry entry = diary.findEntryById(IdNumber);
        assertEquals(IdNumber,entry.getIdNumber());
        diary.updateEntry(IdNumber,"newTitle","newBody");
        Entry editedEntry = diary.findEntryById(IdNumber);
        assertEquals("newTitle",editedEntry.getTitle());

    }
}

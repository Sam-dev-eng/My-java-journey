import DiariesException.NameException;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Diaries {
    private static final ArrayList<Diary> diaries = new ArrayList<>();


    public void add(String userName, String password) {
        validateDuplicateUserName(userName);
        File diariey = createNewFileNow();
        Diary newDiary = new Diary(userName,password);
        diaries.add(newDiary);
        try{
        if(diariey != null) {
            try (FileWriter writer = new FileWriter(diariey,true)){
                writer.write(newDiary+"\n");
            }
        }
        }catch (IOException e){
            e.getMessage();
        }
    }
    public Diary findByUserName(String userName) {
        for (Diary diary : diaries) {
            if (diary.getUserName().equals(userName)) {
                return diary;
            }
        }
        throw new NameException("UserName Not found");
    }

    private void validateDuplicateUserName(String userName){
        for (Diary diary : diaries){
            if (diary.getUserName().equals(userName)){
                throw new NameException("Username Already Exist");
            }
        }
    }
    public void delete(String userName,String password) {
        Diary diary = findByUserName(userName);
        diary.unlockDiary(password);
        diaries.remove(diary);
    }
    private File createNewFileNow() {
        File diariey = new File("Diaries.text");
        try{
           boolean created = diariey.createNewFile();
            return diariey;
        }catch (IOException e){
            return null;
        }
    }
}

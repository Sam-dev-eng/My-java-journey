import DiaryExceptions.*;
import java.util.ArrayList;


public class Diary {
    private String userName;
    private final String password;
    private boolean isLocked;
    private int generateId;
    private final ArrayList<Entry> entries = new ArrayList<Entry>();
    public Diary(String userName,String password) {
        this.password = password;
        this.userName = userName;
    }
    public void unlockDiary(String password) {
        validatePassword(password);
         if(!isLocked())isLocked = true;
    }
    private void validatePassword(String password){
        if(!this.password.equals(password)) throw new PasswordException("Incorrect Password");
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void lockDiary() {
        isLocked = false;
    }
    private void validateLocked(){
        if(!isLocked) throw new DiaryAccountLockedException("Diary is locked");
    }
    public int createEntry(String title, String body) {
       validateLocked();
       int iDNumber = ++generateId;
       Entry entry = new Entry(iDNumber,title,body);
       entries.add(entry);
       return iDNumber;
    }
    public Entry findEntryById(int idNumber) {
        validateLocked();
        for (Entry entry : entries){
        if(entry.getIdNumber() == idNumber)return entry;
        }
        throw new IdNumberException("Invalid ID Number");
    }
    public void updateEntry(int idNumber, String newTitle, String newBody) {
        validateLocked();
        Entry entry = findEntryById(idNumber);
        entry.setBody(newBody);
        entry.setTitle(newTitle);
    }
    public void deleteEntry(int IdNumber){
        Entry entry = findEntryById(IdNumber);
        entries.remove(entry);
    }
    public String getUserName(){
        return userName;
    }
    public String toString(){
        return this.userName +"'s Diary";
    }
}

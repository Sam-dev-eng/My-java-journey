import DiariesException.*;
import DiaryExceptions.*;
import javax.swing.*;
public class MainApplication {
    static Diaries diaries = new Diaries();
    static void main() {

        String userInput = input("""
    
    1-> Create New Diary
    2-> Login To My Diary
    0-> exit
    """);
        switch(userInput){
            case "1": newDiary();
            break;
            case "2": login();
            break;
            case "0": print("Good bye fam");
            break;
            default: print("invalid input");
                    main();
        }
    }
    static void newDiary(){
        String userName = input("Enter userName");
        String password = input("Enter your password");
        try {
            diaries.add(userName, password);
            print("Diary Successfully Added");
            main();
        } catch (NameException e){
            print(e.getMessage());
            main();
        }
    }
    static void login(){
        String userName = input("Enter username");
        try {
            Diary diary = diaries.findByUserName(userName);
            account(diary);
        }catch (NameException e){
            print(e.getMessage());
            main();
        }
    }
    static void account(Diary diary){
        String password = input("Enter your password To unlock your Diary");
        try {
            diary.unlockDiary(password);
        }catch (PasswordException e){
            print(e.getMessage());
            main();
       }
        String userInput = input("""
                Welcome To Your Diary -->
                1-> find Entry By ID
                2-> Add Entry
                3-> Delete Entry
                4-> Update Entry
                5-> Lock Diary
                """);
        switch(userInput){
            case "1": findEntryById(diary);
            break;
            case "2": addEntry(diary);
            break;
            case "3": deleteEntry(diary);
            break;
            case "4": updateEntry(diary);
            break;
            case "5": lockDiary(diary);
            break;
            default: print("Invalid Input");
                        account(diary);
        }
    }
    static void findEntryById(Diary diary){
        String IdNumber = input("Enter Your ID");
        try {
           Entry entry = diary.findEntryById(Integer.parseInt(IdNumber));
            yourEntry(entry,diary);
        }catch (DiaryException e){
            print(e.getMessage());
            account(diary);
        }
    }
    static void yourEntry(Entry entry,Diary diary){
        print(entry.toString());
        account(diary);
    }
    static void addEntry(Diary diary){
       String title = input("Enter Your Title");
       String body = input("Enter The Body");
       int IdNumber =  diary.createEntry(title,body);
       print("Your ID Number is "+IdNumber);
       account(diary);
    }
    static void deleteEntry(Diary diary){
        String IdNumber = input("Enter Your Id number");
        try {
            diary.deleteEntry(Integer.parseInt(IdNumber));
            print("Deleted successfully");
            main();
        }catch (IdNumberException e){
            print(e.getMessage());
            account(diary);
        }
    }
    static void updateEntry(Diary diary){
        String IdNumber = input("Enter your Id Number");
        String newTile = input("Enter Your new Title");
        String newBody = input("Enter Your new Body");
        try {
            diary.updateEntry(Integer.parseInt(IdNumber),newTile,newBody);
        }catch (IdNumberException e){
            print(e.getMessage());
            account(diary);
        }
    }
    static void lockDiary(Diary diary){
        print("Diary is Locked!!");
        diary.lockDiary();
        main();
    }

    public static void print(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }
    public static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }
}

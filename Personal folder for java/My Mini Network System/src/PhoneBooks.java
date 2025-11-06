import Exceptions.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBooks {

    static boolean isLocked;
    static HashMap<Contact,PhoneBook> books = new HashMap<>();

    public static void createABook(String userName,String password){
        validateLocked();
        validateDuplicate(userName);
        Contact contact = new Contact(userName,null);
        PhoneBook book = new PhoneBook(userName,password);
        books.put(contact,book);

    }
    public static void addNumberToUser(String userName, String number){
        validateLocked();
        setUser(userName,number);
    }
    public static void sentMessage(String senderName ,String senderNumber,String numberOfreciever,String message){
        for(var objects : books.entrySet()){
        if(objects.getKey().getNumber().equals(numberOfreciever)){
        objects.getValue().addMessages(senderName,senderNumber,message);

            }
        }
    }
    public static PhoneBook findByUserName(String userName){
        for(var objects : books.entrySet()){
        if(objects.getKey().getDefaultName().equals(userName)){
        return objects.getValue();
            }
        }
        throw new ContactNotFoundException("UserName not found");
    }


    private static boolean setUser(String userName,String number){
        HashMap<Contact,PhoneBook> user = new HashMap<>();
        for (var objects : books.entrySet()){
        if (objects.getKey().getDefaultName().equals(userName)) {
            objects.getKey().setNumber(number);
            objects.getValue().setGNetnumber(number);
            return true;
        }
        }
        throw new ContactNotFoundException("This user does not exist");
    }


    private static void addListsToFile() {
        File folder = MyFile.createFolder("PhoneBookS-Folder");
        File file = MyFile.createFileInAFolder(folder, "ListBooksAndContacts.text");
        addContactsToFile(folder);

    }
    private static void addContactsToFile(File folder) {
        for (var contacts : books.entrySet()) {
            MyFile.writeToFileInFolder(folder, "ListBooksAndContacts.text", contacts.getKey() + " " + contacts.getValue());
        }
    }

    private static void addFileToList(){
        File folder = MyFile.createFolder("PhoneBookS-Folder");
        File file = MyFile.createFileInAFolder(folder, "ListBooksAndContacts.text");
        ArrayList<String> fileContent = MyFile.returnFileContent(file);
        splitContents(fileContent);
        MyFile.clearFileInAFolder(folder,"ListBooksAndContacts.text");
    }
    private static void splitContents(ArrayList<String> content){
        for (String contents : content){
            String[] splitContent = contents.split(" ");
            Contact recreatedContact = new Contact(splitContent[0],splitContent[1]);
            recreatedContact.setSaveAs(splitContent[2]);
            recreatedContact.setIsRegistered(Boolean.parseBoolean(splitContent[3]));
            PhoneBook recreatedPhoneBook = new PhoneBook(splitContent[4],splitContent[5]);
            recreatedPhoneBook.setGNetnumber(splitContent[6]);
            books.put(recreatedContact,recreatedPhoneBook);
        }
    }

    private static void validateDuplicate(String userName){
        for (var objects : books.entrySet()){
        if(objects.getKey().getDefaultName().equals(userName)){
        throw new DuplicateNameException("Name already exist");
            }
        }
    }

    public static void lockPhoneBooks() {
        addListsToFile();
        books.clear();
        if(isLocked()) isLocked = false;
    }

    private static boolean isLocked() {
        return isLocked;
    }
    public static void unlockPhoneBooks() {
        addFileToList();
        if(!isLocked()) isLocked = true;
    }
    private static void validateLocked(){
        if(!isLocked()) throw new PhoneBookLockedException("PhoneBooks App is Locked");
    }
}

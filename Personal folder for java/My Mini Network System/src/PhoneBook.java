import Exceptions.*;

import javax.swing.*;
import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneBook {
    private final String userName;
    private final String password;
    private String GNetnumber;
    private boolean isLocked;
    private  final HashMap<String,String> listOfMessages = new HashMap<>();
    private  final HashMap<String,String> listOfCalls = new HashMap<>();
    private  final HashMap<String, String> listOfContacts = new HashMap<>();

    PhoneBook(String UserName, String password){
        this.userName = UserName;
        this.password = password;
    }
    public void unlockPhoneBook(String password) {
        validatePassword(password);
        viewMissedMessage();
        clearMissedMessageFile();
        addFileToList();
        if(!isLocked()) this.isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    private void validatePassword(String password){
        if(!this.password.equals(password)) throw new PasswordException("Incorrect Password");
    }

    public void lockPhoneBook() {
        addListsToFile();
        listOfContacts.clear();
        if(isLocked()) this.isLocked = false;
    }
    public void addAContact(String number, String preferredName){
        validateLocked();
        validateDuplicateName(preferredName);
        listOfContacts.put(preferredName,number);
    }
    public HashMap<String,String> viewListOfContacts(){
        validateLocked();
        return listOfContacts;
    }
    private void validateLocked(){
        if(!isLocked()) throw new PhoneBookLockedException("PhoneBook is Locked");
    }
    private void validateDuplicateName(String name){
        if(listOfContacts.containsKey(name)) throw new DuplicateNameException("Name already exist");
    }
    public void deleteContact(String preferredName, String password) {
        validatePassword(password);
        validateLocked();
        validateAvailability(preferredName);
        listOfContacts.remove(preferredName);
    }
    public void updateNumber(String name, String oldNumber,String newNumber){
        validateLocked();
        validateAvailability(name);
        listOfContacts.replace(name,oldNumber,newNumber);
    }
    public void updateName(String name, String NewName){
        validateLocked();
        validateAvailability(name);
        validateDuplicateName(NewName);
        String number = listOfContacts.get(name);
        listOfContacts.remove(name);
        listOfContacts.put(NewName,number);
    }
    public String findContactByName(String name){
        validateLocked();
        validateAvailability(name);
        return listOfContacts.get(name);
    }
    private void validateAvailability(String name){
        if(!listOfContacts.containsKey(name)) throw new ContactNotFoundException("Contact Name does not exist");
    }
    private void addListsToFile() {
        File folder = MyFile.createFolder(String.format("%s's-PhoneBookFolder",userName));
        File file = MyFile.createFileInAFolder(folder, "ListOfConTacts.text");
        File messages = MyFile.createFileInAFolder(folder, String.format("%s'sMessages.text",userName));
        File calls = MyFile.createFileInAFolder(folder,"Calls.text");
        addContactsToFile(folder);
        addMessagesToFile(folder);
        addCallsToFile(folder);
    }
    private void addContactsToFile(File folder) {
        for (var contacts : listOfContacts.entrySet()) {
            MyFile.writeToFileInFolder(folder, "ListOfConTacts.text", contacts.getKey() + "," + contacts.getValue());
        }
    }
    private void addMessagesToFile(File folder) {
        for (var messages : listOfMessages.entrySet()) {
            MyFile.writeToFileInFolder(folder, String.format("%s'sMessages.text",userName),messages.getKey()+","+messages.getValue());
        }
    }
    private void addCallsToFile(File folder) {
        for (var calls : listOfCalls.entrySet()) {
            MyFile.writeToFileInFolder(folder, "Calls.text",calls.getKey()+","+calls.getValue());
        }
    }


    // add files content to list
    public void addFileToList(){
        File folder = MyFile.createFolder(String.format("%s's-PhoneBookFolder",userName));
        File file = MyFile.createFileInAFolder(folder,"ListOfConTacts.text");
        File messages = MyFile.createFileInAFolder(folder, String.format("%s'sMessages.text",userName));
        File calls = MyFile.createFileInAFolder(folder,"Calls.text");
        ArrayList<String> contents = MyFile.returnFileContent(file);
        ArrayList<String> messageContents = MyFile.returnFileContent(messages);
        ArrayList<String> callContents = MyFile.returnFileContent(calls);
        splitContents(contents,listOfContacts);
        splitContents(messageContents,listOfMessages);
        splitContents(callContents,listOfCalls);

        MyFile.clearFileInAFolder(folder,"ListOfConTacts.text");
        MyFile.clearFileInAFolder(folder,String.format("%s'sMessages.text",userName));
        MyFile.clearFileInAFolder(folder,"Calls.text");

    }
    private void splitContents(ArrayList<String> content,HashMap<String,String> hashMap){
        for(String contents : content) {
            System.out.println(contents+"from split content");
            String[] eachContent = contents.split(",");
            System.out.println(Arrays.toString(eachContent)+" from spliit again");
            hashMap.put(eachContent[0], eachContent[1]);
            System.out.println(listOfMessages);
        }
    }

   public void sendMessage(String name,String message){
       validateAvailability(name);
       String number =  listOfContacts.get(name);
       GNet net = new GNet("GNet");
       net.sendMessage(userName,number,GNetnumber,message);
   }

   public void addCalls(String caller, LocalTime time){
       DateTimeFormatter pattern = DateTimeFormatter.ofPattern("hh:mm a");
       listOfCalls.put(caller,time.format(pattern));
   }
   public void addMessages(String senderName,String senderNumber,String message){
       File folder = MyFile.createFolder(String.format("%s's-PhoneBookFolder",userName));
       File messages = MyFile.createFileInAFolder(folder, String.format("%s'sMessages.text",userName));
       MyFile.writeToPhoneBookFile(messages,senderName,message);
       MyFile.writeToFileInFolder(folder,String.format("%s'sMissedMessages.text",userName),"You have a Message from "+findContactWithNumber(senderNumber,senderName));

   }

    private void viewMissedMessage(){
        File folder = MyFile.createFolder(String.format("%s's-PhoneBookFolder",userName));
        File file = MyFile.createFileInAFolder(folder,String.format("%s'sMissedMessages.text",userName));
        ArrayList<String> contents = MyFile.returnFileContent(file);
        display(contents);
    }
    private void display(ArrayList<String> contents){
        for(String content : contents){
            JOptionPane.showMessageDialog(null,content);
        }
    }
    private void clearMissedMessageFile(){
        File folder = MyFile.createFolder(String.format("%s's-PhoneBookFolder",userName));
        File file = MyFile.createFileInAFolder(folder,String.format("%s'sMissedMessages.text",userName));
        MyFile.clearFileInAFolder(folder,String.format("%s'sMissedMessages.text",userName));
    }

    private String findContactWithNumber(String number,String senderName){
        for(var contacts : listOfContacts.entrySet()){
        if(contacts.getValue().equals(number)){
        return contacts.getKey();
            }
        }
        return senderName;
   }


   public HashMap<String,String> viewMessages(){
        validateLocked();
        return listOfMessages;
   }
   public HashMap<String,String> viewCallers(){
        validateLocked();
        return listOfCalls;
   }
   public void setGNetnumber(String number){
        this.GNetnumber = number;
   }
   public String toString(){
        return this.userName+" "+this.password+" "+this.GNetnumber;
   }
}

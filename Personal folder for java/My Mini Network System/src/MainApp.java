import Exceptions.*;

import javax.swing.*;

public class MainApp {
    void main(){
        PhoneBooks.unlockPhoneBooks();
        String userInput = input("""
                1-> Create Account
                2-> login to Existing Account
                3-> Register Your contact
                4-> Exit
               """);
        switch (userInput){
            case "1": createNewAccount();
            break;
            case "2": login();
            break;
            case "3": registerContact();
            break;
            case "4": PhoneBooks.lockPhoneBooks();
                print("Good bye");
            break;
            default:print("Invalid input");
                        main();
        }
    }

    private void registerContact() {
        GNet net = new GNet("GNet");
        String userName = input("Enter your username\n !!make sure you have a phoneBook account");
        try {
            String number = net.registerContact(userName);
            print(String.format("%s registered successfully Your number is %s",userName,number));
            main();
        }catch (PhoneBookExceptions e){
            print(e.getMessage());
            main();
        }

    }

    private void login() {
        String userName = input("Enter Your username");
        try {
            PhoneBook user = PhoneBooks.findByUserName(userName);
            loginToPhoneBook(user);
        }catch (ContactNotFoundException e){
            print(e.getMessage());
            main();
        }
    }

    private void loginToPhoneBook(PhoneBook user) {
        String phoneBookPassword = input("Enter your password");

        try {
            user.unlockPhoneBook(phoneBookPassword);
            PhoneBooks.lockPhoneBooks();
            goToPhoneBookOPtions(user);
        } catch(PasswordException e){
            print(e.getMessage());
            main();
        }

    }

    private void goToPhoneBookOPtions(PhoneBook user) {
        String userInput = input("""
                1-> Add To Contact
                2-> View Contacts
                3-> send message to a contact
                4-> call a contact
                5-> Delete contact
                6-> update contact Number
                7-> update contact Name
                8-> Find contact by name
                9-> view  messages
                10-> view calls
                11-> lock phone Book
                
                """);
        switch (userInput){
            case "1": addToContact(user);
            break;
            case "2": viewContacts(user);
            break;
            case "3": sendMessage(user);
            break;
            case "4": callAContact(user);
            break;
            case "5": DeleteAContact(user);
            break;
            case "6": updateContactNumber(user);
            break;
            case "7": updateContactName(user);
            break;
            case "8": findContactByName(user);
            break;
            case "9": viewMessages(user);
            break;
            case "10": viewCalls(user);
            break;
            case "11": logOut(user);
            break;
            default: print("Invalid input");
                goToPhoneBookOPtions(user);
        }
    }

    private void logOut(PhoneBook user) {
        user.lockPhoneBook();
        PhoneBooks.unlockPhoneBooks();
        print("PhoneBook Locked");
        main();
    }

    private void viewCalls(PhoneBook user) {
        print("No Callers yet Still working on making calls");
        goToPhoneBookOPtions(user);
    }

    private void viewMessages(PhoneBook user) {
        for(var messages :user.viewMessages().entrySet()){
            print(messages.getValue()+"\n\nsent by"+messages.getKey());
        }
        goToPhoneBookOPtions(user);
    }


    private void findContactByName(PhoneBook user) {
        String name = input("Enter name of contact");
        try {
            String contact = user.findContactByName(name);
            print(String.format("%s's number is %s",name,contact));
            goToPhoneBookOPtions(user);
        }catch (PhoneBookExceptions e){
            print(e.getMessage());
            goToPhoneBookOPtions(user);
        }
    }

    private void updateContactName(PhoneBook user) {
        String name = input("Enter contact name");
        String newName = input("Enter new name u want to add");
        try {
            user.updateName(name, newName);
            print(String.format("%s has been updated successfully",newName));
            goToPhoneBookOPtions(user);
        }catch (PhoneBookExceptions e){
            print(e.getMessage());
            goToPhoneBookOPtions(user);
        }
    }

    private void updateContactNumber(PhoneBook user) {
        String name = input("Enter name of contact");
        String oldNumber = input("Enter the old number");
        String newNumber = input("Enter the new number");

        try {
            user.updateNumber(name, oldNumber, newNumber);
            print(String.format("%s's number updated successfully",name));
            goToPhoneBookOPtions(user);
        }catch (ContactNotFoundException e){
            print(e.getMessage());
            goToPhoneBookOPtions(user);
        }
    }

    private void DeleteAContact(PhoneBook user) {
        String name = input("Enter contact name");
        String password = input("Enter your password");
        try {
            user.deleteContact(name, password);
            print(String.format("%s deleted successfully",name));
            goToPhoneBookOPtions(user);
        }catch (PhoneBookExceptions e){
            print(e.getMessage());
            goToPhoneBookOPtions(user);
        }
    }

    private void callAContact(PhoneBook user) {
//        user.addCalls();
        print("Sorry calling have not been set yet");
        goToPhoneBookOPtions(user);
    }

    private void sendMessage(PhoneBook user) {
        String name = input("name of contact");
        String message = input("Enter message below");
        try {
            user.sendMessage(name, message);
            print("Message sent...");
            goToPhoneBookOPtions(user);
        }catch (PhoneBookExceptions e){
            print(e.getMessage());
            goToPhoneBookOPtions(user);
        }
    }

    private void viewContacts(PhoneBook user) {
        for(var contacts : user.viewListOfContacts().entrySet()){
            print(contacts.getKey()+"->"+contacts.getValue());
        }
        goToPhoneBookOPtions(user);
    }

    private void addToContact(PhoneBook user) {
        String number = input("Enter your number");
        String nameOfContact = input("Enter your preferred name");
        try {
            user.addAContact(number, nameOfContact);
            print(String.format("%s added successfully",nameOfContact));
            goToPhoneBookOPtions(user);
        } catch (PhoneBookExceptions e){
            print(e.getMessage());
            goToPhoneBookOPtions(user);
        }
    }

    private void createNewAccount() {
        String userName = input("Enter Your User Name");
        String password = input("Enter Your Password");
        try {
            PhoneBooks.createABook(userName, password);
            print("Phone Book created Successfully \nGo Back to login");
            main();
        }catch (PhoneBookExceptions e){
            print(e.getMessage());
            main();

        }
    }


    public static void print(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }
    public static  String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }
}

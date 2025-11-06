import Exceptions.ContactNotFoundException;

import java.io.*;
import java.util.ArrayList;

public class GNet {
    String name;

    public GNet(String name){
        this.name = name;
    }
    private static String generateNumbers(){
        int max = 9999999;
        int min = 1000000;
        int randomNumber = (int)(Math.random() *(max - min + 1) + min);
        return "080"+randomNumber;
    }
    public String registerContact(String UserName){
        String phoneNumber = generateNumbers();
       File folder = MyFile.createFolder("GNet-Folder");
//        PhoneBooks.unlockPhoneBooks();
        PhoneBooks.findByUserName(UserName);
        PhoneBooks.addNumberToUser(UserName,phoneNumber);
       File allNumbers = MyFile.writeToFileInFolder(folder,"ALLNumbers.text",phoneNumber);
       return phoneNumber;
    }
    private void validateNumber(String number){
        File folder = MyFile.createFolder("GNet-Folder");
        File file = MyFile.createFileInAFolder(folder,"ALLNumbers.text");
        ArrayList <String> listOfNumbers = MyFile.returnFileContent(file);
        isRegistered(number,listOfNumbers);
    }
    private boolean isRegistered(String number, ArrayList<String> listOfNumbers){
        for(String numbers : listOfNumbers){
        return numbers.equals(number);
        }
        throw new ContactNotFoundException("Number Does not exist");
    }

    public void sendMessage(String senderName,String recieversNumber,String sendersNumber,String message){
        validateNumber(sendersNumber);
        validateNumber(recieversNumber);
        PhoneBooks.unlockPhoneBooks();
        PhoneBooks.sentMessage(senderName,sendersNumber,recieversNumber,message);
        PhoneBooks.lockPhoneBooks();
    }

}










import java.util.Scanner;
public class Menu{
public static void main(String[] args){



}

public static int PhoneBook(int number){
Scanner scanner = new Scanner(System.in);
String options = """
   PHONE BOOKS
ENTER -->>
        1-> Search.
        2-> Service Nos.1.
        3-> Add name. 
        4-> Erase.
        5-> Edith.
        6-> Assign tone.
        7-> send b'card.
        8-> Options-->
        9-> Speed dials.
        10-> Voice tags.

0 --> back
""";
System.out.println(options);
number = scanner.nextInt();

switch (number){
case 1 : PhoneBook.search(number);
break;
case 2: PhoneBook.ServiceNos1();
break;
case 3: PhoneBook.Addname();
break;
case 4:  PhoneBook.Eraser(number);
break;
case 5: PhoneBook.Edit(number);
break;
case 6: PhoneBook.assignTone(number);
break;
case 7: PhoneBook.sendBard(number);
break;
case 8: PhoneBook.Option(number);
break;
case 9: PhoneBook.speedDial(number);
break;
case 10: PhoneBook.voiceTag(number);
break;
case 0: Nokia3.mainMenu(number);
break;
default : System.out.println("Invalid");

}

return number;
}
public static int messages(int number){
Scanner scanner = new Scanner(System.in);
String messages = """
              MESSAGES
Enter-->>
       1-> Write messages
       2-> inbox
       3-> outbox
       4-> picture messages
       5-> Templates
       6-> Smileys
       7-> Messages settings--->
       8-> Info service
       9-> Voice mailbox number
       10-> Service command editor

0-> back 
""";
System.out.println(messages);
number = scanner.nextInt();


switch(number){
case 1 :Messages.writeMessages(number);
break;
case 2: Messages.inBox(number);
break;
case 3: Messages.outBox(number);
break;
case 4: Messages.pictureMessages(number);
break;
case 5: Messages.templates(number);
break;
case 6: Messages.smileys(number);
break;
case 7: Messages.messageSettings(number);
break;
case 8: Messages.infoServices(number);
break;
case 9:  Messages.voiceMail(number);
break;
case 10: Messages.serviceCommand(number);
break; 
case 0 : Nokia3.mainMenu(number);
break;
default : System.out.print("Invalid");
}
return number;
}






}
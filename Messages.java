import java.util.Scanner;
public class Messages{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);




}
public static int writeMessages(int number){
Scanner scanner = new Scanner(System.in);
System.out.println("Write a message");
String userInput = scanner.nextLine();
System.out.println("Message will be sent to who???");
String sentTo = scanner.nextLine();
String message = userInput.toUpperCase();
System.out.println(message + " -Sent to-> " + sentTo + " Successfully!!!\npress 1 for main menu\npress 0 to go back");

int back = scanner.nextInt();
switch(back){
case 0: Menu.messages(back);
break;
case 1: Nokia3.mainMenu(back);
break;
}
return number;
}





public static int inBox(int number){
Scanner scanner = new Scanner(System.in);
String inbox = """

Your Inbox is Empty...

press 0 for mainMenu 
press 1 to go back

""";
System.out.println(inbox);
int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
}
return number;
}



public static int outBox(int number){
Scanner scanner = new Scanner(System.in);
String outbox = """

Your outbox is Empty...

press 0 for mainMenu 
press 1 to go back

""";
System.out.println(outbox);
int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
}
return number;
}




public static int pictureMessages(int number){
Scanner scanner = new Scanner(System.in);
String pictures = """

No Photos yet...

press 0 for mainMenu 
press 1 to go back

""";
System.out.println(pictures);
int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
}
return number;
}

public static int templates(int number){
Scanner scanner = new Scanner(System.in);
String template = """

No Templates yet...

press 0 for mainMenu 
press 1 to go back

""";
System.out.println(template);
int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
}
return number;
}


public static int smileys(int number){
Scanner scanner = new Scanner(System.in);
String smiley = """

No Smileys yet...

press 0 for mainMenu 
press 1 to go back

""";
System.out.println(smiley);
int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
}
return number;
}





public static int messageSettings(int number){
Scanner scanner = new Scanner(System.in);
String numSeven = """
       MESSAGE SETTINGS
Enter-->>

      1-> Set 1
      2-> Common

 0-> mainMenu
10-> back
""";
System.out.println(numSeven);
number = scanner.nextInt();

switch(number){
             case 1: String center = """
        SET 1
Enter-->
       1--> Message center number
       2--> Message sent as
       3--> Message validity
0-> MainMenu
10-> Messages
""";
System.out.println(center);


number = scanner.nextInt();

switch(number){

case 1: System.out.println("Enter Number to add");
int userNumber = scanner.nextInt();
System.out.printf("%d Added successfully\npress 0 for mainMenu\npress 1 for messages\npress 2 for Message settings\n",userNumber);

int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
case 2:messageSettings(back);
break; 
}


break;
case 2: System.out.println("No Message yet...\npress 0 for mainMenu\npress 1 for Messages\npress 2 for Message settings  ");
 back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
case 2:messageSettings(back);
break; 
}



break;
case 3: System.out.println("No Message validity for Now...\npress 0 for mainMenu\npress 1 for Messages\npress 2 for Message settings");
back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
case 2:messageSettings(back);
break; 
}
break;

case 0: Nokia3.mainMenu(number);
break; 
case 10:  messageSettings(number);
break;


default : System.out.println("Invalid");
}
break;
               case 2: String common = """
       COMMON
Enter-->>
      1-> Message center number
      2-> Message sent as
      3-> Message validity

0-> MainMenu
10-> Messages
""";
System.out.println(common);
number = scanner.nextInt();

switch(number){
case 1: System.out.println("Messages center number\n    press 0 for mainMenu\n   press 1 Messages\n   press 2 for Message Setings");
int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
case 2:messageSettings(back);
break; 
}
break;
case 2: System.out.println("Message sent as...\n0-> mainMenu\n1-> Messages\n2-> Messages Settings");
 back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
case 2:messageSettings(back);
break; 
}

break;
case 3: System.out.println("Message validity...\n1-> Messages\n0-> mainMenu\n2-> Message Settings ");
back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
case 2:messageSettings(back);
break; 
}









break;
case 0: Nokia3.mainMenu(number);
break; 
case 10:  messageSettings(number);
break;

default: System.out.println("invalid");
break;
}
break;

     case 0: Nokia3.mainMenu(number);
break;
     case 10: Menu.messages(number);
break;
}
return number;
}

public static int infoServices(int number){
Scanner scanner = new Scanner(System.in);
String info = """

No Info yet...

press 0 for mainMenu 
press 1 to go back

""";
System.out.println(info);
int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
}
return number;
}


public static int voiceMail(int number){
Scanner scanner = new Scanner(System.in);
String mail = """

No voice Mail yet...

press 0 for mainMenu 
press 1 to go back

""";
System.out.println(mail);
int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
}
return number;
}


public static int serviceCommand(int number){
Scanner scanner = new Scanner(System.in);
String command = """

No Service Command yet to edith...

press 0 for mainMenu 
press 1 to go back

""";
System.out.println(command);
int back = scanner.nextInt();
switch(back){
case 1:Menu.messages(back);
break;
case 0:Nokia3.mainMenu(back);
break;
}
return number;
}














}
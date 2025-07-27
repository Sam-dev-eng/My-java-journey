

import java.util.Scanner;
public class Nokia3{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Press any number to enter password");
int input = scanner.nextInt();
 
}

public static void mainMenu(int password){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your password");
do{
 password = scanner.nextInt();
System.out.println("Incorrect Password");
}while(password != 22657622);
System.out.println("WELCOME NONSO");
String prompt = """

Your 
    NOKIA 
         menu
              map
Enter ->
        1-> Phone book    -
        2-> Messages     -
        3-> Chat          -
        4-> Call Register -
        5-> Tone          -
        6-> Setting       -
        7-> Call divert   -
        8-> Games         -
        9-> Calculator    -
        10-> Reminder     -
        11-> Clock        -
        12-> Profile      -
        13-> SIMservices  -

0-> back
       """;
System.out.println(prompt);

int userInput = scanner.nextInt();

switch(userInput){

                                     case 1 : Menu.PhoneBook(userInput);
break;

                                    case 2 : Menu.messages(userInput); 

break;
                               case 3: System.out.println("Chat");
break;
                               case 4: String call = """
        CALL REGISTER

Enter-->
     1--> Missed calls 
     2--> Recieved calls
     3--> Dialled numbers
     4--> Erase recent call lists
     5--> Show call duration 
     6--> Show call costs
     7--> Call cost settings
     8--> Prepaid credit
""";
System.out.println(call);
System.out.println("");
int input = scanner.nextInt();

switch(input){
case 1: System.out.println("Missed calls");
break;
case 2: System.out.println("Recieved calls");
break;
case 3: System.out.println("Dialled numbers")
;break;
case 4: System.out.println("Erase recent call lists");
break;
case 8: System.out.println("Prepaid credit");
break;
case 5: String callDuration = """
       SHOW CALL DURATION
Enter-->

     1--> last call duration
     2--> All calls duration
     3--> Recieved calls duration
     4--> Dialled calls duration
     5--> clear timers
""";
System.out.println(callDuration);
System.out.println("");
int show = scanner.nextInt();
 
switch(show){
case 1: System.out.println("Last call duration");
break;
case 2: System.out.println("All calls duration");
break;
case 3: System.out.println("Recieved calls duration");
break;
case 4: System.out.println("Dialled calls duration");
break;
case 5: System.out.println("Clear timers");
break;
default : System.out.println("invalid");
}

case 6 : String case6 = """
1. Last call cost 
2. All calls cost
3. clear counters
""";
System.out.println(case6);
System.out.println("");
int callCost = scanner.nextInt();
switch(callCost){
case 1: System.out.println("Last call cost");
break;
case 2: System.out.println("All calls cost");
break;
case 3: System.out.println("Clear counters");
break;
default : System.out.println("invalid");
}
case 7: String case7 = """
1. Call cost limit
2. Show costs in
""";
System.out.println(case7);
System.out.println("");
int callSettings = scanner.nextInt();

switch(callSettings){
case 1: System.out.println("Call cost limit");
break;
case 2: System.out.println("Show cost in");
break;
default : System.out.println("invalid");
}
default: System.out.println("invalid");
}

                                      case 5: String tone = """
                  TONE
Enter-->

    1--> Ringing tone 
    2--> Ringing volume
    3--> Incoming call alert 
    4--> Composer
    5--> Message alert tone
    6--> Keypad tones
    7--> Warning and game tone
    8--> vibrating alert 
    9--> Screen saver
""";
System.out.println(tone);

System.out.println("");
int tones1 = scanner.nextInt();

switch(tones1){
case 1: System.out.println("Ring tone");
break;
case 2: System.out.println("Ringing volume");
break;
case 3: System.out.println("Incoming call alert");
break;
case 4: System.out.println("Composer");
break;
case 5: System.out.println("Message alert tone");
break;
case 6: System.out.println("Keypad tone");
break;
case 7: System.out.println("Warning and game tone");
break;
case 8: System.out.println("Vibration alert");
break;
case 9: System.out.println("Screen saver");
break;
}
break;
                              case 6: String settings = """
                   SETTINGS
Enter-->

       1--> Call settings 
       2--> Phone settings 
       3--> Security settings
       4--> Restore factory settings
""";
System.out.println(settings);
System.out.println("");
int input1 = scanner.nextInt();

switch(input1){
case 1 : String callSettings = """
1. Automatic redial 
2. Speed dialing 
3. Call waiting options 
4. Own number sending
5. Phone line in use
6. Automatic answer 
""";
System.out.println(callSettings);
System.out.println("");
int callSetting1 = scanner.nextInt();

switch(callSetting1){
case 1: System.out.println("Automatic redial");
break;
case 2: System.out.println("Speed dialing");
break;
case 3: System.out.println("Call waiting options");
break;
case 4: System.out.println("Own number sending");
break;
case 5: System.out.println("Phone line in use");
break;
case 6: System.out.println("Automatic answer");
break;
default: System.out.println("invalid");
}
break;

case 2: String phoneSettings = """
     PHONE SETTINGS
Enter-->
   
   1--> Language
   2--> Cell info display
   3--> Welcome note
   4--> Network selection
   5--> Lights
   6--> Comfirm SIM services actions
""";
System.out.println(phoneSettings);
System.out.println("");
int phoneSettings1 = scanner.nextInt();

switch(phoneSettings1){
case 1: System.out.println("Language");
break;
case 2: System.out.println("Cell info display");
break;
case 3: System.out.println("Welcome note");
break;
case 4: System.out.println("Network selection");
break;
case 5: System.out.println("Lights");
break;
case 6: System.out.println("Comfirm SIM services actions");
break;
default : System.out.println("invalid");
}
break;

case 3: String securitySettings = """
      SECURITY SETTINGS
Enter-->
    1--> PIN code request
    2--> Call barring services
    3--> Fixed dialling
    4--> Closed user group
    5--> Phone security
    6--> Change access codes 
""";
System.out.println(securitySettings);
break;
   case 4: System.out.println("Restore factory settings");
break;
default : System.out.println("invalid");

System.out.println("");
int security = scanner.nextInt();

switch(security){
case 1: System.out.println("Pin code request");
break;
case 2: System.out.println("Call barring services");
break;
case 3: System.out.println("Fixed dialing");
break;
case 4: System.out.println("Closed user group");
break;
case 5: System.out.println("Phone security");
break;
case 6: System.out.println("Change access codes");
break;
default : System.out.println("invalid");
}
break;
}
break;
                 case 7: System.out.println("Call divert");
break;
                 case 8: System.out.println("Games");
break;
                 case 9: System.out.println("Calculator");
break;
                 case 10: System.out.println("Reminder");
break;
                 case 11: String clock = """
      CLOCK
Enter-->

     1--> Alarm clock
     2--> Clock settings
     3--> Date settings
     4--> Stopwatch
     5--> Countdown timer
     6--> Auto update of date and time
""";
System.out.println(clock);
System.out.println("");
int clocks = scanner.nextInt();

switch(clocks){
case 1: System.out.println("Alarm clock");
break;
case 2: System.out.println("Clock settings");
break;
case 3: System.out.println("Date settings");
break;
case 4: System.out.println("Stopwatch");
break;
case 5: System.out.println("Countdown");
break;
case 6 : System.out.println("Auto update of date and time");
break;
default: System.out.println("invalid");break;
}

break; 
                case 12 : System.out.println("Profiles");
break;
                case 13 : System.out.println("SIM services");

break;
default: System.out.println("invalid");




}






}
public static void phoneBook(int number){
Scanner scanner = new Scanner(System.in);
while (number == 11){
String book = """
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
""";
System.out.println(book);

System.out.println("");
number = scanner.nextInt();

switch(number){
case 1: System.out.println("Search");
 number = scanner.nextInt();
break;

case 2: System.out.println("Service Nos.1");
number = scanner.nextInt();
break;

case 3: System.out.println("Add name");
number = scanner.nextInt();
break;

case 4: System.out.println("Erase");
number = scanner.nextInt();
break;

case 5: System.out.println("Edith");
number = scanner.nextInt();
break;

case 6: System.out.println("Assign tone");
number = scanner.nextInt();
break;

case 7: System.out.println("Send b'card");
number = scanner.nextInt();
break;

case 8 :Nokia3.Options(number);
break;
case 9: System.out.println("Speed dial");
number = scanner.nextInt();
break;

case 10: System.out.println("Voice tags");
number = scanner.nextInt();
break;
}
}
}



public static int Options(int number){
Scanner scanner = new Scanner(System.in);


 String numEight = """
   OPTIONS

Enter-->>

   1-> Type of view
   2-> Memory status 
""";
System.out.println(numEight);

System.out.println("");
number = scanner.nextInt();
switch(number){
case 1: System.out.println("Type of view");
number = scanner.nextInt();
break;
case 2: System.out.println("Memory status");
number = scanner.nextInt();
break;
default: System.out.println("invalid");

}
return number;
}
}

import java.util.Scanner;
public class Nokia2{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int userInput = 0;

while (userInput != 14) {
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
14 -> Exit
       """;
System.out.println(prompt);
userInput = scanner.nextInt();

switch(userInput){

                                     case 1 :int  optionEight = 0;
while ( optionEight != 11){
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

Main menu-> (11)
""";
System.out.println(book);
 optionEight = scanner.nextInt();


switch(optionEight){
case 11: System.out.println("welcome");
break;

case 1: System.out.println("""

Serching...

Back-> (11) """);
int search = scanner.nextInt();
break;

case 2: System.out.println("""
No services yet...

Back-> (11)""" );
int service1 = scanner.nextInt();
break;

case 3: System.out.println("""

Adding name...

Back-> (11)""");
int name = scanner.nextInt();
break;

case 4: System.out.println("""

Are you sure you want to erase...

Back-> (11)""");
int erase = scanner.nextInt();
break;

case 5: System.out.println("""

Editing... 

Back-> (11)""");
int edith = scanner.nextInt();
break;

  case 6: System.out.println("""

Assigning tone 

please wait...

Back-> (11)""" );
int Tone = scanner.nextInt();
break;

   case 7: System.out.println("""

Sending...

Back-> (11)""");
int send = scanner.nextInt();
break;

case 8 :int num = 0;
while ( num != 3){ 
 String numEight = """
   OPTIONS

Enter-->>

   1-> Type of view
   2-> Memory status

Back-> (3) 
""";
System.out.println(numEight);
 num = scanner.nextInt();
switch(num){

case 1: System.out.println("""

viewing...

Back-> (3)""");
int viewing = scanner.nextInt();
break;
case 2: System.out.println("""

Memory = 128gb 

Back-> (3)""");
int memory = scanner.nextInt();
break;
case 3: System.out.println("");
break;

default: System.out.println("invalid");
break;
}
}
break;

     case 9: System.out.println(""" 

Dialing...

Back-> (11)""");
int dial = scanner.nextInt();
break;

     case 10: System.out.println("""

Recording...

Back-> (11)""");
int voice = scanner.nextInt();
break;

}
}
break;  
                               



                              case 2 :int messages1 = 0;

while (messages1 != 12){

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

Back-> (12) 
""";
System.out.println(messages);
 messages1 = scanner.nextInt();

                                       switch(messages1){
  case 12: System.out.println("");
break;

  case 1: System.out.println("""

Text Message..|

Back-> (12)""");
int text = scanner.nextInt();
break;

  case 2: System.out.println("""

Mail is Empty...

Back-> (12)""");
int inbox = scanner.nextInt();
break;

case 3: System.out.println("""

Mail is Empty...

Back-> (12)""");
int outbox = scanner.nextInt();
break;

case 4: System.out.println("""

No pictures yet...

Back-> (12)""");
int pictures = scanner.nextInt();
break;

case 5: System.out.println("""

No Templates...

Back-> (12)""");
int templates = scanner.nextInt();
break;
case 6: System.out.println("""

No Smileys yet...

Back-> (11)""");
int smiley = scanner.nextInt();
break;

case 8: System.out.println("""

No info yet...

Back-> (12)""");
int info = scanner.nextInt();
break;


case 9: System.out.println("""

Type a number|

Back-> (12)""");
int voiceMail = scanner.nextInt();
break;
case 10: System.out.println("""

No Service command...

Back-> (12)""");
int commandService = scanner.nextInt();
break;

              case 7: int messageSet = 0;
                                                while (messageSet != 4){ 
 String numSeven = """
       MESSAGE SETTINGS
Enter-->>

      1-> Set 1
      2-> Common

Back-> (4) 
""";
System.out.println(numSeven);
 messageSet = scanner.nextInt();


                                                          switch(messageSet){

  case 4: System.out.println("");
break;
             case 1: int set1 = 0;
                                                   while (set1 != 5){
String center = """
        SET 1
Enter-->
       1--> Message center number
       2--> Message sent as
       3--> Message validity

Back-> (5)
""";
System.out.println(center);
 set1 = scanner.nextInt();

                                                   switch(set1){

  case 1: System.out.println("""

No number...

Back-> (5)""");
int messageCenter = scanner.nextInt();
break;
   case 2: System.out.println("""

Empty...

Back-> (5)""");
int sentAs = scanner.nextInt();
break;
  case 3: System.out.println("""

Empty...

Back-> (5)""");
int validity = scanner.nextInt();
break;
     
    case 5: System.out.println("");
break;

default : System.out.println("Invalid");

}
}
break;

               case 2:int common1 = 0;
                                   while (common1 != 4){
String common = """
       COMMON
Enter-->>
      1-> Delivery reports
      2-> Reply via same center
      3-> Character support

Back-> (4)
""";
System.out.println(common);

System.out.println("");
 common1 = scanner.nextInt();

                                     switch(common1){
case 1: System.out.println("""

No reports yet...

Back-> (4)""");
int reports = scanner.nextInt();
break;

case 2: System.out.println("""

No Replies yet...

Back-> (4)""");
int replies = scanner.nextInt();
break;

case 3: System.out.println("""

No Character yet...

Back-> (4)""");
int characters = scanner.nextInt();
break;

case 4: System.out.println("");
break;

default: System.out.println("invalid");
break;

}
}

break;
}
}
break;
}
}
break;




                               case 3: System.out.println("""
Chatting...


press (14) for main menu...""");
int chat = scanner.nextInt();
break;
                               case 4: int callReg = 0;
                                             while (callReg != 9) { 

 String call = """
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

Back-> (9)
""";
System.out.println(call);
 callReg = scanner.nextInt();

                                                  switch(callReg){
case 9: System.out.println("");
break;
case 1: System.out.println("""

12 Missed calls...

Back-> (9)""");
int missedCalls = scanner.nextInt();
break;
case 2: System.out.println("""

No recieved calls...

Back-> (9)""");
int recievedCalls1 = scanner.nextInt();
break;

case 3: System.out.println("""

10 dialled Numbers

Back-> (9)""");
int dialledCalls1 = scanner.nextInt();
break;

case 4: System.out.println("""

Are you sure you want to Erase...

Back-> (9)""");
int eraser = scanner.nextInt();
break;

case 8: System.out.println("""

Repay now...

Back-> (9)""");
int repay = scanner.nextInt();
break;

       case 5:int callDuration = 0;
                                    while (callDuration != 6){ 

String callDuration1 = """
       SHOW CALL DURATION
Enter-->

     1--> last call duration
     2--> All calls duration
     3--> Recieved calls duration
     4--> Dialled calls duration
     5--> clear timers

Back-> (6)
""";
System.out.println(callDuration1);
 callDuration = scanner.nextInt();
 
                                             switch(callDuration){
case 1: System.out.println("""

last call was Yesterday...

Back-> (6)""");
int lastCall = scanner.nextInt();
break;
case 2: System.out.println("""

N100 per 1hr...

Back-> (6)""");
int callCost = scanner.nextInt();
break;
case 3: System.out.println("""

200 Recieved calls...

Back-> (6)""");
int recievedCalls = scanner.nextInt();
break;

case 4: System.out.println("""

100 Dialled calls...

Back-> (6)""");
int dialledCalls = scanner.nextInt();
break;
case 5: System.out.println("""

Are u sure that you want to clear timers..

Back-> (6)""");
int clearCall = scanner.nextInt();
break;

case 6: System.out .println("");
break;

default : System.out.println("invalid");
break;
}
}
break;

case 6 :int callCost = 0;
                             while (callCost != 7){
 String case6 = """
     1-> Last call cost 
     2-> All calls cost
     3-> clear counters

Back-> (7)
""";
System.out.println(case6);
 callCost = scanner.nextInt();

                                  switch(callCost){
case 7: System.out.println("");
break;

case 1: System.out.println("""

Last call cost was N100...

Back-> (7)""");
int lastCost = scanner.nextInt();
break;

case 2: System.out.println("""

All call call Cost = N500,000..

Back-> (7)""");
int allCost = scanner.nextInt();
break;
  
 case 3: System.out.println("""

Do you want to clear your counter...

Back-> (7)""");
int counterClear = scanner.nextInt();
break;
default : System.out.println("invalid");
}
}
break;
       
     case 7:int callSettings = 0;

                              while (callSettings != 3){
 String case7 = """
    1-> Call cost limit
    2-> Show costs in

Back-> (3)

""";
System.out.println(case7);
 callSettings = scanner.nextInt();

                                    switch(callSettings){
case 3: System.out.println("");
break;

case 1: System.out.println("""

You have reached your call limit...

Back-> (3)""");
int callLimit = scanner.nextInt();
break;

case 2: System.out.println("""

Show costs in...

Bact-> (3)""");
int showCost = scanner.nextInt();
break;

default : System.out.println("invalid");
}
}

default: System.out.println("invalid");
}
}
break;

                                      case 5: int tones1 = 0;
                              while (tones1 != 10){

String tone = """
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

Back-> (10)
""";
System.out.println(tone);
 tones1 = scanner.nextInt();

                                             switch(tones1){
     case 1: System.out.println("""

Set Ringtone...

Back-> (10)""");
int setRingtone = scanner.nextInt();
break;

    case 2: System.out.println("""

Set Ringing Volume...

Back-> (10)""");
int setVolume = scanner.nextInt();
break;

     case 3: System.out.println("""

20 Incoming Alerts...

Back-> (10)""");
int incomingAlerts = scanner.nextInt();
break;

case 4: System.out.println("""

Composer...

Back-> (10)""");
int composer = scanner.nextInt();
break;

case 5: System.out.println("""

Set alert Tone...

Back-> (10)""");
int alertTone = scanner.nextInt();
break;

case 6: System.out.println("""

Set Keypad Tone...

Back-> (10)""");
int keypadTone = scanner.nextInt();
break;

case 7: System.out.println("""

Set Warning and game tone...

Back-> (10)""");
int gameWarning = scanner.nextInt();
break;
case 8: System.out.println("""

Set Vibration alert...

Back-> (10)""");
int vibration = scanner.nextInt();
break;

case 9: System.out.println("""

Set Screen Saver...

Back-> (10)""");
int screenSaver = scanner.nextInt();
break;

case 10: System.out.println("");
break;
}
}
break;
                              case 6: int settings1 = 0; 
                                      while (settings1 != 5) {
String settings = """
                   SETTINGS
Enter-->

       1--> Call settings 
       2--> Phone settings 
       3--> Security settings
       4--> Restore factory settings

Back-> (5)
""";
System.out.println(settings);
 settings1 = scanner.nextInt();

switch(settings1){

case 5: System.out.println("");
break;

                           case 1 :int callSetting1 = 0;
                       while (callSetting1 != 7) { 

 String callSettings = """
     1-> Automatic redial 
     2-> Speed dialing 
     3-> Call waiting options 
     4-> Own number sending
     5-> Phone line in use
     6-> Automatic answer 

Back-> (7)
""";
System.out.println(callSettings);
 callSetting1 = scanner.nextInt();

switch(callSetting1){
case 1: System.out.println("""

Set Automatic redial...

Back-> (7)""");
int automaticRedial = scanner.nextInt();
break;

case 2: System.out.println("""

Set Speed dialing...

Back-> (7)""");
int speedDial = scanner.nextInt();
break;

case 3: System.out.println("""

Set Call waiting options

Back-> (7)""");
int callWaiting = scanner.nextInt();
break;

case 4: System.out.println("""

Set Own number sending

Back-> (7)""");
int ownNumber = scanner.nextInt();
break;

case 5: System.out.println("""

Phone line in use

Back-> (7)""");
int phoneLine = scanner.nextInt();
break;

case 6: System.out.println("""

Set Automatic answer...

Back-> (7)""");
int autoAnswer = scanner.nextInt();
break;

case 7: System.out.println("");
break;

default: System.out.println("invalid");
}
}
break;

                            case 2: int phoneSettings1 = 0;

                            while (phoneSettings1 != 7){

 String phoneSettings = """
     PHONE SETTINGS
Enter-->
   
   1--> Language
   2--> Cell info display
   3--> Welcome note
   4--> Network selection
   5--> Lights
   6--> Comfirm SIM services actions

Back-> (7)
""";
System.out.println(phoneSettings);
 phoneSettings1 = scanner.nextInt();

switch(phoneSettings1){
case 1: System.out.println("""

English..
Hausa..
Yooruba..
Igbo..

Back-> (7)""");
int language = scanner.nextInt();
break;

case 2: System.out.println("""

Set Cell info display...

Back-> (7)""");
int cellDisplay = scanner.nextInt();
break;

case 3: System.out.println("""

Set Welcome note...

Back-> (7)""");
int welcomeNote = scanner.nextInt();
break;

case 4: System.out.println("""

Network selection...

Back-> (7)""");
int networkSelection = scanner.nextInt();
break;

case 5: System.out.println("""

Set Lights...

Back-> (7)""");
int lights = scanner.nextInt();
break;

case 6: System.out.println("""

Comfirm SIM services actions

Back-> (7)""");
int simComfirmation = scanner.nextInt();
break;

case 7: System.out.println("");
break;
default : System.out.println("invalid");
}
}
break;

                         case 3: int security = 0;
while (security != 7) { 

String securitySettings = """
      SECURITY SETTINGS
Enter-->
    1--> PIN code request
    2--> Call barring services
    3--> Fixed dialling
    4--> Closed user group
    5--> Phone security
    6--> Change access codes

Back-> (7) 
""";
System.out.println(securitySettings);
 security = scanner.nextInt();

switch(security){
case 1: System.out.println("""

Set PIN code...

Back-> (7)""");
int pinCode = scanner.nextInt();
break;

case 2: System.out.println("""

Set Call barring services...

Back-> (7)""");
int callBarring = scanner.nextInt();
break;

case 3: System.out.println("""

Fixed dialing

Back-> (7)""");
int fixedDialing = scanner.nextInt();
break;

case 4: System.out.println("""

Closed user group

Back-> (7)""");
int userGroup = scanner.nextInt();
break;

case 5: System.out.println("""

Set Phone security..

Back-> (7)""");
int phoneSecu = scanner.nextInt();
break;

case 6: System.out.println("""

Change access codes..

Back-> (7)""");
int accessCode = scanner.nextInt();
break;

case 7: System.out.println("");
break;
default : System.out.println("invalid");
}
}
break;

case 4: System.out.println("""

Restore Factory Settings

Back-> (5)""");
int factorySetting = scanner.nextInt();
break;
}
}
break;
               




                      case 7: System.out.println("""
Diverting...

press (14) for main menu""");
int divert = scanner.nextInt();
break;
                 case 8: System.out.println("""
No games installed...

presss (14) for main menu""");
int games = scanner.nextInt();
break;
                 case 9: System.out.println("""
Install calculator...

press (14) for main menu""");
int calculator = scanner.nextInt();
break;
                 case 10: System.out.println("""
No Reminder yet...

press (14) for main menu""");
int reminder = scanner.nextInt();
break;
                 case 11: int clocks = 0;
while (clocks != 11) {

 String clock = """
      CLOCK
Enter-->

     1--> Alarm clock
     2--> Clock settings
     3--> Date settings
     4--> Stopwatch
     5--> Countdown timer
     6--> Auto update of date and time

Back-> (11)
""";
System.out.println(clock);
 clocks = scanner.nextInt();

switch(clocks){
case 1: System.out.println("""

Set Alarm clock...

Back-> (11)""");
int alarmClock = scanner.nextInt();
break;
case 2: System.out.println("""

Set Clock settings 

Back-> (11)""");
int clockSettings = scanner.nextInt();
break;

case 3: System.out.println("""

 Date settings...

Back-> (11)""");
int dateSettings = scanner.nextInt();
break;

case 4: System.out.println("""

Set Stopwatch

Back-> (11)""");
int stopWatch = scanner.nextInt();
break;

case 5: System.out.println("""

Counting down...

Back-> (11)""");
int countDown = scanner.nextInt();
break;

case 6 : System.out.println("""

 Auto update of date and time...

Back-> (11)""");
int autoDateTime = scanner.nextInt();
break;
case 11: System.out.println("");
break;
default: System.out.println("invalid");break;
}
}

break; 
                case 12 : System.out.println("""

No profile yet...

press (14) for main menu""");
int profile = scanner.nextInt();
break;
                case 13 : System.out.println("""
Insert SIM card...

press (14) for main menu""");
int sim = scanner.nextInt();

break;
                case 14: System.out.print("Good bye fam");
break;
default: System.out.println("invalid");


}
}


}


}
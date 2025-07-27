import java.util.Scanner;
public class PhoneBook{
public static void main(String[] args){




}
public static int search(int x){
Scanner scanner = new Scanner(System.in);
int back = 0;
String options = """
1-> Apple 
2-> news
3-> Games
4-> Football
5->  To main menu
6-> To phoneBook
""";
System.out.println(options);
x = scanner.nextInt();
switch (x){

case  1 :  System.out.println("Apple is a wonderful fruit and its good for health\npress 1 for phoneBook\npress 2 to go back");
 back = scanner.nextInt();
switch(back){
case 1:Menu.PhoneBook(back);
break;
case 2: search(back);
break;
}
break;

case 2 : System.out.println("Today's news is that buhari don die... chaii omoh!!\npress 1 for phoneBook\npress 2 to go back");
 back = scanner.nextInt();
switch(back){
case 1:Menu.PhoneBook(back);
break;
case 2: search(back);
break;
}
break;

case 3 : System.out.println("Free fire is better than call of duty\n press 1 for phonBook\npress 0 to go back ");
 back = scanner.nextInt();
switch(back){
case 1:Menu.PhoneBook(back);
break;
case 2: search(back);
}
break;

case 4:  System.out.println("Messi is better than Ronaldo\n press 1 for phoneBook\npress 2 to go back");
 back = scanner.nextInt();
switch(back){
case 1:Menu.PhoneBook(back);
break;
case 2: search(back);
}
break;

case 5: Nokia3.mainMenu(x); //exit
break;
case 6: Menu.PhoneBook(back);
break; 
default : System.out.println("We dont have that for now");
 back = scanner.nextInt();
switch(back){
case 1:Menu.PhoneBook(back);
break;
}
}
return x;
}



public static void ServiceNos1(){
Scanner scanner = new Scanner(System.in);
System.out.println("""
180 - Customer care
 
  *556# - Check balance

  *131# - Buy data

1-> back 
""");
int back = scanner.nextInt();
switch(back){
case 1:Menu.PhoneBook(back);
break;
}


}

public static void Addname(){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Your name");
String Name = scanner.nextLine();
String first = Name.toUpperCase();
System.out.printf("%s Added successfully\n-Press 1 to go back\n", first);
int back = scanner.nextInt();
switch(back){
case 1:Menu.PhoneBook(back);
break;
}

 
}






public static int Eraser(int x){
Scanner scanner = new Scanner(System.in);
String erase = """
WHAT DO U WANT TO ERASE??

1 -> MEMORY
2 -> DATA
""";
System.out.println(erase);
 x = scanner.nextInt();
switch(x){

case 1 : System.out.println("Your Memory Erasing...");
break;
case 2 : System.out.println("Your Data Erasing");
break;
default : System.out.println("invalid"); 
}
return x;
}


public static int Option(int number){
Scanner scanner = new Scanner(System.in);
 String numEight = """
   OPTIONS

Enter-->>

   1-> Type of view
   2-> Memory status 

press 10 to go back 0 to mainMenu
""";
System.out.println(numEight);

System.out.println("");
 number = scanner.nextInt();
switch(number){
case 1: String view = """
WHAT TYPE OF VIEW DO U WANT >>>

  press 0 for PhoneBook 0 for MainMenu 2 for Options
 """;
System.out.println(view);
int back = scanner.nextInt();
switch(back){
case 0:Menu.PhoneBook(back);
break;
case 1:Nokia3.mainMenu(back);
break;
case 2:Option(back); 
}
break;


case 2: String memory = """

Total memory = 128 gb

Used = 32 gb

Unused = 96 gb

press 0 for PhoneBook 1 for mainMenu 2 for options 
""";
System.out.println(memory);
 back = scanner.nextInt();
switch(back){
case 0:Menu.PhoneBook(back);
break;
case 1:Nokia3.mainMenu(back);     //for going back
break;
case 2:Option(back); 
}
break;

case 0 : Nokia3.mainMenu(number);     // for going back
break; 
case 10 : Menu.PhoneBook(number); 
default: System.out.println("invalid");
number = scanner.nextInt();
break;
}
return number; 

}


public static int Edit(int number){
Scanner scanner = new Scanner(System.in);
String option = """


Editing ...

Press 0 to go back / 1 for main menu
 """;
System.out.println(option);
int back = scanner.nextInt();
switch(back){
case 0:Menu.PhoneBook(back);
break;
case 1:Nokia3.mainMenu(back);
break; 
} 
 return number;
}
public static int assignTone(int number){
Scanner scanner = new Scanner(System.in);
String option = """

 Assign a tone...


Press 0 to go back / 1 for main menu
 """;
System.out.println(option);
int back = scanner.nextInt();
switch(back){
case 0:Menu.PhoneBook(back);
break;
case 1:Nokia3.mainMenu(back);
break; 
} 
 return number;

}


public static int sendBard(int number){
Scanner scanner = new Scanner(System.in);
String prompt = """

 Sending b'card...

press 0 to go back 1 for mainMenu
""";
System.out.println(prompt);
int back = scanner.nextInt();
switch(back){
case 0:Menu.PhoneBook(back);
break;
case 1:Nokia3.mainMenu(back);
break; 
}
return number;
} 

public static int speedDial(int number){
Scanner scanner = new Scanner(System.in);
String dial = """

Dialing...

press 0 for phoneBook or 1 for mainMenu
""";
System.out.println(dial);
int back = scanner.nextInt();
switch(back){
case 0:Menu.PhoneBook(back);
break;
case 1:Nokia3.mainMenu(back);
break; 
}

return number;
}

public static int voiceTag(int number){
Scanner scanner = new Scanner(System.in);
String tags = """

Voice Tagging...


press 0 for phoneBook or 1 for mainMenu 
""";
System.out.println(tags);
int back = scanner.nextInt();
switch(back){
case 0:Menu.PhoneBook(back);
break;
case 1:Nokia3.mainMenu(back);
break; 
}
return number;
}



























}
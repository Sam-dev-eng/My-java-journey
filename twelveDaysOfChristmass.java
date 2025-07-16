
import java.util.Scanner;
public class twelveDaysOfChristmass{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String menu = """
             MENU

Enter-->

   1-> First day of Christmass
   2-> Second day of Christmass
   3-> Third day of Christmass
   4-> Fourth day of Christmass
   5-> Fifth day of Christmass
   6-> Sixth day of Christmass
   7-> Seventh day of Christmass
   8-> Eighth day of Christmass
   9-> Nineth day of Christmass
   10-> Tenth day of Christmass
   11-> Eleventh day of Christmass
   12-> Twelveth day of Christmass 
""";
System.out.println(menu);
int menuOption = scanner.nextInt();

switch(menuOption){
   case 1: String verseOne = """

         [Verse 1]

On the first day of Christmas, 
my true love sent to me
A partridge in a pear tree.
""";
System.out.println(verseOne);
break;

   case 2: String verseTwo = """

         [Verse 2]
On the second day of Christmas, 
my true love sent to me
Two turtle doves and
A partridge in a pear tree.
""";
System.out.println(verseTwo);
break;

   case 3: String verseThree = """

         [Verse 3]
On the third day of Christmas,
my true love sent to me
Three french hens
Two turtle doves and
A partridge in a pear tree.

""";
System.out.println(verseThree);
break;
case 4: String verseFour = """

         [Verse 4]
On the fourth day of Christmas, 
my true love sent to me
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
""";
System.out.println(verseFour);
break;

case 5: String verseFive = """


       [Verse 5]
On the fifth day of Christmas, 
my true love sent to me
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
""";
System.out.println(verseFive);
break;

case 6: String verseSix = """

      [Verse 6]
On the sixth day of Christmas, 
my true love sent to me
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

""";
System.out.println(verseSix);
break;

case 7: String verseSeven = """

        [Verse 7]
On the seventh day of Christmas,
my true love sent to me
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
""";
System.out.println(verseSeven);
break;

case 8: String verseEight = """

      [Verse 8]
On the eighth day of Christmas, 
my true love sent to me
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
""";
System.out.println(verseEight);
break;

case 9: String verseNine = """

       [Verse 9]
On the ninth day of Christmas, 
my true love sent to me
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
""";
System.out.println(verseNine);
break;

case 10: String verseTen = """

 
     [Verse 10]
On the tenth day of Christmas,
my true love sent to me
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
""";
System.out.println(verseTen);
break;

case 11: String verseEleven = """

      [Verse 11]
On the eleventh day of Christmas, 
my true love sent to me
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
""";
System.out.print(verseEleven);
break;

case 12: String verseTwelve = """

     [Verse 12]
On the twelfth day of Christmas, 
my true love sent to me
Twelve drummers drumming
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
""";
System.out.println(verseTwelve);
break;

default: System.out.println("Invalid input");

}
}
}
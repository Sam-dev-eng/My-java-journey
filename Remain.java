public class Remain{
public static void main(String[] args){
String method = remainder("february" , 20 , 2000);
System.out.println(method);
}



public static String remainder(String x ,int y, int z){
String month = x.toLowerCase();
int days;


switch (month){
case "january" : days = 30;
break;

case "february" : if(z % 4 == 0 && z % 100 != 0 || (z % 400 == 0)){
                  days = 29;}else { days = 28;}
break;

case "march" : days = 31;
break;

case "april" : days = 30;
break;

case "may" : days = 31;
break;

case "june" : days = 30;
break;

case "july" : days = 31;
break;

case "august" : days = 31;
break;

case "september": days = 30;
break;

case "october": days = 31;
break;

case "november" : days = 30;
break;

case "december" : days = 31;
break;

default : return "Incorrect Spelling";
}

int sum = days - y;
return month + " is remaining " + sum   +"days to end in  "+ z;
}
}  


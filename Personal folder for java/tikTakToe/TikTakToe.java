import Choices;
public class TikTakToe{
    public static Choices[] listOfChoice = new Choices[9];

    public void setChoices() {
        for(int count = 0;  count < 9; count++){
            listOfChoice[count] = new listOfChoice();
        }
    }

    public String getChoice(){
        return Array.toString(listOfChoice);
    }

    public Choices [] setListOfChoice(){
        return listOfChoice
    }



}
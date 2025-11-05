public class Choices{
    String name;
    String choice;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }   

    public void setChoice(String choice){
        this.choice = choice;
    }
    public void getChoice(){
        return this.choice
    }
    @override
    public String toString(){
        return "" + choice;

    }
}
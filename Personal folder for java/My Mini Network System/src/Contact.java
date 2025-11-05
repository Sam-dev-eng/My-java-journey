import java.util.ArrayList;

public class Contact {
   private String defaultName;
   private String number;
   private String saveAs;
   private boolean isRegistered;

    public Contact(String defaultName, String number) {
        this.defaultName = defaultName;
        this.number = number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return this.number;
    }
    public void setDefaultName(String defaultName){
        this.defaultName = defaultName;
    }
    public String getDefaultName(){
        return this.defaultName;
    }
    public void setSaveAs(String saveAs){
        this.saveAs = saveAs;
    }
    public String getSaveAs(){
        return this.saveAs;
    }
    public void setIsRegistered(boolean choice){
        this.isRegistered = choice;
    }
    public boolean getIsRegistered(){
        return this.isRegistered;
    }
    public String toString(){
        return this.defaultName+" "+this.number+" "+this.saveAs+" "+this.isRegistered;
    }

}

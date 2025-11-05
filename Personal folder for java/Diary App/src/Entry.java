import java.time.LocalDate;

public class Entry {
    private final int IdNumber;
    private  String title;
    private String body;
    private final LocalDate dateCreated;

    public Entry(int iDNumber, String title, String body) {
        this.IdNumber = iDNumber;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDate.now();
    }

    public int getIdNumber() {
        return this.IdNumber;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void setBody(String newBody){
        this.body = newBody;
    }
    public String getBody(){
        return this.body;
    }
    @Override
    public String toString(){
        return this.title+"\n"+this.body+"\nCreated On "+this.dateCreated;
    }
}

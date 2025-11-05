public class Problem {

    private String name;
    private String problemType;
    private String status = "unsolved";

    public String getName() {
        return name;
    }
    public String getProblemType() {
        return problemType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

}

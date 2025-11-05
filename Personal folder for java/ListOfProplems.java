
import MyHashMap.MyHashMap;

import java.util.ArrayList;

public class ListOfProplems{
    public static MyHashMap problems  = new MyHashMap();


     public Problem createProblem(String name, String problemType){
         Problem problem = new Problem();
         problem.setName(name);
         problem.setProblemType(problemType);


         return problem;
     }
     public void addToProblem(Problem problemType, String nameDescription){
         problems.put(problemType,new ArrayList<String>());
         ArrayList<String> list = (ArrayList<String>)problems.get(problemType);
         list.add(nameDescription);
     }

     public Object getList(Problem problemType){
         return problems.get(problemType);
     }

     public String getStatus(Problem problem){
         return problem.getStatus();
     }

        void main(){
            Problem problem = createProblem("no money", "Finalcila");
            addToProblem(problem, "no money");
            addToProblem(problem, "no strength");
            System.out.println(getList(problem));
            System.out.println(getStatus(problem));
        }
}

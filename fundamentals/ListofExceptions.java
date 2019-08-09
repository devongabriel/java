import java.util.*;

public class ListofExceptions{
    public void workHomework(){
        ArrayList<Object> workProject = new ArrayList<Object>();
        workProject.add("216");
        workProject.add("I am ready for a vacation");
        workProject.add(82);
        workProject.add("Woohhoo almost done!!");

        try {
            for(int i = 0; i < workProject.size(); i++) {
                Integer castedValue = (Integer) workProject.get(i);
            }
        } catch(ClassCastException e){
            System.out.println("exception caught");
        }
    }
}
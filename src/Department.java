import java.util.ArrayList;


public class Department {
    String deptName;
    ArrayList<Person> personInDept = new ArrayList<>();

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
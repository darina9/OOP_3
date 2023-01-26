public class Group extends Department {

    public Group(String GropName){
        setDeptName(GropName);
    }

    public void addPeople(Person person){
        personInDept.add(person);
    }

}
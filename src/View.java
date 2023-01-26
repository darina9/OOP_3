public class View {
    public static void depView(Group root){
        System.out.println("Название отдела" +" "+ root.deptName);
        for (var a: root.personInDept) {
            System.out.println(a.pFIO + " " + a.pSex+ " " + a.pAge);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main run = new Main();

        Scanner in = new Scanner(System.in);
        String FIO;
        String Sex;
        int Age;
        System.out.println("-".repeat(25));
        System.out.println("Сортировка по параметру:");
        System.out.println("ФИО работника: ");
        FIO = in.nextLine();
        System.out.println("ПОЛ работника: ");
        Sex = in.nextLine();
        System.out.println("Возраст работника: ");
        Age = in.nextInt();
        Person p = new Person(FIO, Sex, Age);
        p.Display();
        Group depAcc = new Group("Бухгалтерия");
        run.addPersonToDepartment(p, depAcc);
        View.depView(depAcc);
        Group depAcc1 = new Group(run.UpdateDepint());
        run.addPersonToDepartment(p, depAcc1);
        View.depView(depAcc1);
    }

    public void addPersonToDepartment(Person person, Group group){
        boolean check = person.checkAddGroup(group);
        if (check) {
            group.addPeople(person);
        } else {
            System.out.println("Отказ");
        }
    }

    public String UpdateDepint()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Хотите перейти в другой отдел?:");
        System.out.println("0 - НЕТ\n1 - ДА");
        int answer = in.nextInt();

        if (answer==0 ){
            System.out.println("Отмечено");}
        if(answer==1){
            System.out.println("Выбор отдела");
            System.out.println("IT\nЛогистика\nБухгалтерия");
        }
        String answer1 = in.next();
        return answer1;
    }

}
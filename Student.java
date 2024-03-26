

public class Student implements Observer{

    private String name;
    private int salary;
    private String prof;

    public Student(String name){
        this.name = name;
        prof ="jun";
        salary = 5000;
    }




    
    @Override
    public void receiveOffer(Vacancy vacancy) {
        // if (this.salary <= salary){
        //     System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
        //             name, nameCompany, salary);
        //     this.salary = salary;
        // }
        // else {
        //     System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
        //             name, nameCompany, salary);
        // }
    }





    public String getName() {
        return name;
    }





    public int getSalary() {
        return salary;
    }





    public String getProf() {
        return prof;
    }
}

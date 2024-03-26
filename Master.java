

public class Master implements Observer{

    private String name;
    private int salary;
    private String prof;

    public Master(String name){
        this.name = name;
        salary = 80000;
        prof = "sen";
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        // if (this.salary <= salary){
        //     System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
        //             name, nameCompany, salary);
        //     this.salary = salary;
        // }
        // else {
        //     System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
        //             name, nameCompany, salary);
        // }
    }
}

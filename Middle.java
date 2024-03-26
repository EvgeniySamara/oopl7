public class Middle implements Observer{

    
    private String name;
    private int salary;
    private String prof;

    public Middle(String name){
        this.name = name;
       salary = 50000;
       prof = "mid";
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        // if (this.salary <= salary){
        //     System.out.printf("Мидл %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
        //             name, nameCompany, salary);
        //     this.salary = salary;
        // }
        // else {
        //     System.out.printf("Мидл %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
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

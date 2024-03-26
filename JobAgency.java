

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();
    private Collection<Vacancy>  vacancies = new ArrayList<>();
    
    public void addVacancy(Vacancy vacancy) {
        this.vacancies.add(vacancy);
    }

    public void sendOffer(String companyName, int salary){
        for (Observer observer : observers){

            observer.receiveOffer(vacancies);
        }
    }



    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}

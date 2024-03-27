

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();
    private Collection<Vacancy>  vacancies = new ArrayList<>();
    
    public Collection<Vacancy> getVacancies() {
        return vacancies;
    }



    public void addVacancy(Vacancy vacancy) {
        this.vacancies.add(vacancy);
    }

    public void listVacancies ()
    {
     
        for (Vacancy vacancy : vacancies) {
            System.out.println(vacancy);
        }
    }

    
    public void sendOffer(String companyName){
        
        for (Vacancy vacancy : vacancies) {
            
        
        for (Observer observer : observers){
            
            if (observer.getProf().equals(vacancy.getProf())) {
            observer.receiveOffer(vacancy, this);
            }
        }
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

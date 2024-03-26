

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

    
    public void sendOffer(String companyName, int salary){
        
        for (Vacancy vacancy : vacancies) {
            
        
        for (Observer observer : observers){
            
            observer.getProf().equals(vacancy.getProf());
            observer.receiveOffer(vacancy);
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

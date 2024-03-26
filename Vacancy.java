public class Vacancy {
    private int id;
    private String prof;
    private String txt;
    private int salary;
    private String companyName;
    

    public Vacancy(int id, String prof, String txt, int salary, String companyName) {
        this.id = id;
        this.prof = prof;
        this.txt = txt;
        this.salary = salary;
        this.companyName = companyName;
    }


    public int getId() {
        return id;
    }


    public String getProf() {
        return prof;
    }


    public String getTxt() {
        return txt;
    }


    public int getSalary() {
        return salary;
    }


    public String getCompanyName() {
        return companyName;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setProf(String prof) {
        this.prof = prof;
    }


    public void setTxt(String txt) {
        this.txt = txt;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    

}

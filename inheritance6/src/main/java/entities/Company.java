package entities;

public class Company extends TaxPayers{

    private Integer employeeNumber;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, Integer employeeNumber) {
        super(name, anualIncome);
        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    @Override
    public double Tax() {
        double total = 0;
        if (employeeNumber > 10){
            total = getAnualIncome() * 0.14;
        }
        else{
            total = getAnualIncome() * 0.16;
        }
        return total;
    }
}

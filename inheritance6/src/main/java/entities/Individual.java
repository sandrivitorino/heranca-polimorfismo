package entities;

public class Individual extends TaxPayers{

    private Double helthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double helthExpenditures) {
        super(name, anualIncome);
        this.helthExpenditures = helthExpenditures;
    }

    public Double getHelthExpenditures() {
        return helthExpenditures;
    }

    public void setHelthExpenditures(Double helthExpenditures) {
        this.helthExpenditures = helthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualIncome() < 2000.00){
            return getAnualIncome() * 0.15  - helthExpenditures * 0.50;
        }
        else{
            return getAnualIncome() * 0.25  - helthExpenditures * 0.50;
        }

    }
}

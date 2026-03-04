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
    public double Tax() {
        double total = 0;

        if (getAnualIncome() < 2000.00){
            total = (getAnualIncome() * 0.15 ) - (helthExpenditures * 0.50);
        }
        else{
            total = (getAnualIncome() * 0.25 ) - (helthExpenditures * 0.50);
        }

        return total;
    }
}

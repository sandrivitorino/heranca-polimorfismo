package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureData;

    public UsedProduct (){

    }
    public UsedProduct(String name, Double price, Date manufactureData) {
        super(name, price);
        this.manufactureData = manufactureData;
    }

    public Date getManufactureData() {
        return manufactureData;
    }

    public void setManufactureData(Date manufactureData) {
        this.manufactureData = manufactureData;
    }

    @Override
    public String priceTag(){
        return getName()
                + " $ "
                + String.format("%.2f ", getPrice())
                + "(Manufacture date: "
                + sdf.format(getManufactureData())
                + ")";
    }
}

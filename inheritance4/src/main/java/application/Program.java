package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    void main() throws ParseException {

        SimpleDateFormat sdf0 = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf0.parse("21/12/2001");

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        Product product = new UsedProduct("Tablet", 260.00, date);

        System.out.println(product.priceTag());

        sc.close();

    }


}

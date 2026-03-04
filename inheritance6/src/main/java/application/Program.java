package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    void main(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayers> list = new ArrayList<>();

        System.out.print("Enter the number of taxes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++ ){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double heathExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualIncome, heathExpenditures));
            }

            else{
                System.out.print("Number of employees: ");
                int numberEmployee = sc.nextInt();

                list.add(new Company(name, anualIncome, numberEmployee));
            }

        }


        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(TaxPayers tax : list){
            double tx = tax.tax();
            System.out.println(tax.tag());
            sum += tx;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
    }
}

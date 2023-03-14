import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Sales {
    public static void main(String[] args) {

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        ArrayList<Float> gross = new ArrayList<>(Arrays.asList());
        ArrayList<Float> expense = new ArrayList<>(Arrays.asList());
        ArrayList<Float> net = new ArrayList<>(Arrays.asList());

        for (int i = 0; i < month.length; i++) {
            gross.add(Float.parseFloat(JOptionPane.showInputDialog(null, "Gross income for " + month[i] + ":")));
        }

        for (int i = 0; i < month.length; i++) {
            expense.add(Float.parseFloat(JOptionPane.showInputDialog(null, "Total expenses for " + month[i] + ":")));
        }

        for (int i = 0; i < month.length; i++) {
            net.add(gross.get(i)-expense.get(i));
        }

        float grossTotal = 0f;
        float expenseTotal = 0f;

        for (int i = 0; i < month.length; i++) {
            grossTotal += gross.get(i);
        }

        for (int i = 0; i < month.length; i++) {
            expenseTotal += expense.get(i);
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Sales.txt"));

            String salesTxt = "*********Baste Marketing – We provide BAD Programs, but it works very fine. ***********\n";
            salesTxt += "Year\t\t:\t\t2023\n";
            salesTxt += "***************************************************************************************\n";
            salesTxt += "Month\t\tGross Income\tTotal Expenses\tNet Income\n";

            for (int i = 0; i < month.length; i++) {
                salesTxt += month[i] + "\t\t\t" + gross.get(i) + "\t\t\t" + expense.get(i) + "\t\t\t" + net.get(i) + "\n";
            }

            salesTxt += "TOTAL\t\t" + grossTotal + "\t\t\t" + expenseTotal + "\t\t\t" + (grossTotal-expenseTotal) + "\n";
            salesTxt += "************************************Nothing follows************************************";

            writer.write(salesTxt);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

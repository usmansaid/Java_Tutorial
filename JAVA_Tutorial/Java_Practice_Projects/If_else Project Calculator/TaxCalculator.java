import java.util.Scanner;

public class TaxCalculator {
    // Function for calculating taxes
    public static void calculateTax(Scanner scanner, double annualIncome, double tax) {

        while (annualIncome != -1) {

            System.out.print("Enter your annual income here (PKR), Enter -1 to exit: ");
            annualIncome = scanner.nextDouble();

            if (annualIncome == -1) {
                return;
            }

            // Conditions for checking income's validity for tax and calculating tax

            else if ((annualIncome <= 600000)) {
                tax = 0;
                System.out.println("Tax on 600,000 is: " + tax);

            } else if (annualIncome <= 1200000) {
                // 15% of tax
                tax = annualIncome * 0.15;
                System.out.println("Tax on 600,000 is 0.0 and above 600,000 is: " + tax);

            } else if (annualIncome <= 1600000) {
                // 90000 is base(upto 1200000) and ((annualIncome - 1200000) * 0.20) is 20% of
                // the exceeding amount
                tax = ((annualIncome - 1200000) * 0.20);
                System.out.println("Tax on your income from 600,000 to 1,200,000 is 90000 and above 1200000 is: " + tax);

            } else if (annualIncome <= 3200000) {
                // 170000 upto 1600000 and ((annualIncome - 1600000) * 0.30) is 30% of the
                // exceeding amount
                tax = ((annualIncome - 1600000) * 0.30);
                System.out.println("Tax on your income from 600,000 to 1,600,000 is 170000 and above 1600000 is: " + tax);

            } else if (annualIncome <= 5600000) {
                // 650000 upto 3200000 and ((annualIncome - 3200000) * 0.40) is 40% of the
                // exceeding amount
                tax = ((annualIncome - 3200000) * 0.40);
                System.out.println("Tax on your income from 600,000 to 3,200,000 is 6,500,00 and above 3,200,000 is: " + tax);

            } else {
                // 1610000 upto 6500000 and ((annualIncome - 6500000) * 0.45) is 45% of the
                // exceeding amount
                tax = ((annualIncome - 6500000) * 0.45);
                System.out.println("Tax on your income from 600,000 to 6,500,000 is 1,610,000 and above 1,610,000 is: " + tax);

            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculateTax(scanner, 0, 0);
        
    }
}

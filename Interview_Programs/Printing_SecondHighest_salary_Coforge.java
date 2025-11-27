package Interview_Programs;

public class Printing_SecondHighest_salary_Coforge {

	public static void main(String[] args) 
	{		
		int[] salaries = {10000, 30000, 20000, 50000, 30000};

        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int salary : salaries) {
            // check if salary is higher than firstHighest
            if (salary > firstHighest) {
                // move firstHighest to secondHighest before replacing
                secondHighest = firstHighest;
                firstHighest = salary;
            } 
            // check if salary is distinct and greater than current secondHighest
            else if (salary > secondHighest && salary != firstHighest) {
                secondHighest = salary;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second distinct highest salary found");
        } else {
            System.out.println("Second highest distinct salary is: " + secondHighest);
        }

	}

}

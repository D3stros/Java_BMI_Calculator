import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter height in m (e.g. 1,75 or 1,80)");
		double height = sc.nextDouble(); // Read weight
		
		System.out.println("Enter weight in kgs");
		double weight = sc.nextDouble(); // Read weight
		
		// Calculating BMI
		double bmi = weight/(height*height);
		
		System.out.println("Your BMI is " + bmi);
	}

}

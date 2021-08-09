import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {

		LocalDate current = LocalDate.now();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.err.println("   Calculate Your Age Here -->");
		System.out.println("----------------------------------");
		
		System.out.println();
		
		System.out.print("Enter Year : ");
		int year = scanner.nextInt();
		System.out.print("Enter Month : ");
		int month = scanner.nextInt();
		System.out.print("Enter Date : ");
		int date = scanner.nextInt();

		LocalDate birthDate = LocalDate.of(year, month, date);
		
		int age = Period.between(birthDate, current).getYears();
		
		System.out.println("__________________________");
		System.out.println();
		System.out.println("  Your Age is : " + age + " years");
		System.out.println("__________________________");
	}

}

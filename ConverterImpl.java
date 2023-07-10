package convertor;

import java.util.Scanner;

public class ConverterImpl implements ConvertorInterface {

	@Override
	public  int celToFah(int a) {
		// TODO Auto-generated method stub
		int result= a*(9/5)+32;
		return result ;
	}

	@Override
	public double fahToCel(int a) {
		// TODO Auto-generated method stu
		double result = ((0.55)*(a-32));
		return result;
	}
	public static void main(String[] args) {
		ConverterImpl converter = new ConverterImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:System.out.println("Enter the celsius temperature to be converted in Fahrenheit");
		
			System.out.println("The result is "+converter.celToFah(sc.nextInt()));
			break;
		case 2:System.out.println("Enter the Fahrenheit temperature to be converted in Celsius");
		System.out.println("The result is "+converter.fahToCel(sc.nextInt()));

		
			
		}
	}
}

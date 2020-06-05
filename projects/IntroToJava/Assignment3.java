import java.util.Scanner;
public class Assignment3
{
	public static void main(String[] args)
	{
		Scanner Calculator = new Scanner(System.in);
		float fahrenheitTemp;
		double kelvinTemp;
		System.out.print("Enter a temperature in degrees Fahrenheit: ");
		fahrenheitTemp = Calculator.nextFloat();
		kelvinTemp = ((fahrenheitTemp - 32) / 1.8 ) + 273;
		System.out.println("Kelvin tmeperature = " + kelvinTemp);
	}
}

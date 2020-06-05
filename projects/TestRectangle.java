import java.util.Scanner;
public class TestRectangle
{
        public static void main(String [] args)
        {
		int length = 0;
		int width = 0;
		char rect_char;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please type a character to make the rectangle, an integer in between 1-30 for the length, and one for the width");
                rect_char = input.next().charAt(0);
		length = input.nextInt();
		width = input.nextInt();
		//creates rectangle object
                Rectangle rectOne = new Rectangle(length, width, rect_char);
		//displays the area, perimeter, and the rectangle
		rectOne.printRect();
		System.out.println("The area is " + rectOne.area() + " and the perimeter is " + rectOne.perimeter());
	}
}
		

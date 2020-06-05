import java.util.Scanner;
public class Rectangle
{	
	//initializes the vriables and creates the scanner
        private int length;
        private int width;
        private char rect_char;
	//constructor for rectangle
	public Rectangle()
	{
		this(0,0,' ');
	}
	public Rectangle(int length, int width, char rect_char)
	{
		this.length = length;
		this.width = width;
		this.rect_char = rect_char;
	}
	//setter methods set values
	public void setLength( int s )	
        {
		length = s;
        }

	public void setWidth(int a)
        {       
                width = a;
        }

	public void setRect_Char(char c)
        {       
                rect_char = c;
        }
	
	//getter methods return the variables
        public int getLength()
        {
                return length;
        }
	public int getWidth()
        {
                return width;
        }
	
	public char getRect_Char()
        {
                return rect_char;
        }
	
	//printRec prints the Rectangle
	public void printRect()
	{
		//prints first line of rect with loop
		for(int i = 0; i < width; i++) {
			System.out.print(rect_char);
		}
		System.out.println();
		//prints the middle lines with a nested loop that prints the spaces
		for( int j = 0; j < length; j++)
		{
			System.out.print(rect_char);
			for (int k = 0; k < (width - 2); k++)
			{
				System.out.print(" ");
			}
			System.out.print(rect_char);
			System.out.println();
		}
		//prints the last line
		for(int l = 0; l < width; l++) {
                        System.out.print(rect_char);
                }
		System.out.println();
	}
	
	//returns the area by multiplying length and width
	public int area()
	{
		return length * width;
	}
	
	//returns the perimeter by adding 2 times the length and 2 times the width
	public int perimeter()
	{
		return 2 * length + 2 * width;
	}

}
			

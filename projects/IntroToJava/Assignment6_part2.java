public class Assignment6_part2
{
	public static void main(String[] args)
	{
		char asterick = '*';
		int row_num = 1;
		int asterick_num = 10;
		int space_num = 0;
		while (row_num <= 10)
		{
			while (space_num >= 1)
           		{   
           			System.out.print(" ");
           			space_num--;
           		}
			while (asterick_num >=1)
			{
				System.out.print(asterick);
				asterick_num--;
			}
			System.out.println();
			asterick_num = 10 - row_num;
			space_num = 0 + row_num;
			row_num++;
		}
	}
}


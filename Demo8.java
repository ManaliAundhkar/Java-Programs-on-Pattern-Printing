//Write Java program which accept number of rows and number of columns from user and display below pattern.
//Input : iRow = 3 iCol = 4
//Output : * # * #
//	   * # * #
//	   * # * #

import java.util.*;

class Pattern
{
	public void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if((j%2)==0)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("#\t");
				}
				
			}
			System.out.println();
		}
	}
}
class Demo8
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the no. of Rows");
		int iRow=sobj.nextInt();
		
		System.out.println("Enter the no. of Columns");
		int iCol=sobj.nextInt();
		
		Pattern pobj=new Pattern();
		
		pobj.Display(iRow,iCol);
		
	}
}








//Write a java program which accept number of rows and number of columns from user and display below pattern.
//Input : iRow = 6 iCol = 6
//Output : * * * * * *
//		   * # # # * *
//		   * # # * $ *
//		   * # * $ $ *
//		   * * $ $ $ *
//		   * * * * * *

import java.util.*;

class Pattern
{
	public void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		
		for(i=iRow;i>0;i--)
		{
			for(j=1;j<=iCol;j++)
			{
				if((i==1)||(i==iRow)||(i==j)||(j==1)||(j==iCol))
				{
					System.out.print("*\t");
				}
				else if(i>j)
				{
					System.out.print("#\t");
				}
				else 
				{
					System.out.print("$\t");
				}
			}
			System.out.println();
		}
	}
}
class Demo13
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








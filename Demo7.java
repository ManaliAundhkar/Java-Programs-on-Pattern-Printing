//Write Java program which accept number of rows and number of columns from user and display below pattern.
//Input : iRow = 3 iCol = 5
//Output : 5 4 3 2 1
//	   5 4 3 2 1
//	   5 4 3 2 1

import java.util.*;

class Pattern
{
	public void Display(int iRow,int iCol)
	{
		int i=0,j=0,k=iCol;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0,k=iCol;j<iCol;j++,k--)
			{
				System.out.print(k+"\t");
			}
			System.out.println();
		}
	}
}
class Demo7
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








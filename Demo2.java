//Write Java program which accept number of rows and number of columns from user and display below pattern.
//Input : iRow = 3 iCol = 5
//Output : A A A A A
//         B B B B B
//         C C C C C

import java.util.*;

class Pattern
{
	public void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch='A';
		
		for(i=0;i<iRow;i++,ch++)
		{
			for(j=0;j<iCol;j++)
			{
					System.out.print(ch+"\t");
			}
			
			System.out.println();
		}
	}
}
class Demo2
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








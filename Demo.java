//Write Java program which accept number of rows and number of columns from user and display below pattern.
//Input : iRow = 4 iCol = 4

//Output : A B C D
//		   A B C D
//         A B C D
//         A B C D

import java.util.*;

class Pattern
{
	public void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0,ch='A';j<iCol;j++,ch++)
			{
				System.out.print(ch+"\t");
			}
			System.out.println();
		}
	}
}
class Demo
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








//5. Write a java program which accept number of rows and number of columns from user and display below pattern.
//Input : iRow = 4 iCol = 4
//Output : 1 2 3 4 5
//	   1 2 	   5
//	   1   3   5
//	   1     4 5
//	   1 2 3 4 5

import java.util.*;

class Pattern
{
	public void Display(int iRow,int iCol)
	{
		int i=0,j=0,k=0;
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1,k=1;j<=iCol;j++,k++)
			{
				if((i==1)||(i==iRow)||(i==j)||(j==1)||(j==iCol))
				{
					System.out.print(k+"\t");
				}
				else
				{
					System.out.print("\t");
				}
			
			}
			System.out.println();
		}
	}
}
class Demo14
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








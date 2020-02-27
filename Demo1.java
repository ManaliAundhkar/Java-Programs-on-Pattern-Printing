//Write Java program which accept number of rows and number of columns from user and display below pattern.
//Input : iRow = 4 iCol = 4

//Output : A B C D
//		   a b c d
//		   A B C D
//         a b c d

import java.util.*;

class Pattern
{
	public void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch1;
		char ch2;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0,ch1='A',ch2='a';j<iCol;j++)
			{
				if((i%2)==0)
				{
					System.out.print(ch1+"\t");
					ch1++;
				}
				else
				{
					System.out.print(ch2+"\t");
					ch2++;
				}
			}
			System.out.println();
		}
	}
}
class Demo1
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








//prgm to find the armstrong num between m and n
//import java.util.*;
class  VenkatInPattern
{
	public static void main(String[] args) 
	{
		
		//for V------------------------------------------------
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
				System.out.print("* ");
				}
				else
				{                         //this is for V
					System.out.print(" ");
				}
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int v=1;v<=i;v++)
			{
				if(v==1){
				System.out.print("* ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
		//for E--------------------------------------------
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==1||i==5||i==3)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
		// for N------------------------------------------------------
		for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==j||j==1||j==5)
                {
                System.out.print(" * ");  //for N
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
		System.out.println("\n");
		//for K------------------------------------------------------------------
			for(int i=1;i<5;i++)
			{
				for(int j=1;j<5;j++)
				{
					if(i+j==5||j==1)
					{
						System.out.print("* ");          //for k
					}                     
					else{
						System.out.print("  ");
					}
					
				}
				System.out.println();
			}
			for(int i=1;i<5;i++)
			{
				for(int j=1;j<5;j++)
				{
					if(i==j||j==1)
					{
						System.out.print("* ");  //for k
					}
					else{
					System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("\n");
          //for A------------------------------------------------------------
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(j==1||j==5||i==1||i==3){   //for A
					System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("\n");

		//for T-----------------------------------
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==3)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

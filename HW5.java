import java.util.*;

public class HW0 {

public static void main(String[] args) {
	
	int N = 0;
	int j = 0;
	int intgr = 0;
	double dbl = 0.;
	int alreadyInpInt = 0;
	int alreadyInpDbl = 0;
	int more15 = 0;
	int even = 0;
	
	@SuppressWarnings("resource")
	Scanner cin  = new Scanner(System.in);
	System.out.println("Введите количество чисел>>");
	while (cin.hasNext())
	{
		if (cin.hasNextInt())
		{				
			N = cin.nextInt();
			System.out.println("Вы долны ввести  "+N+" чисел");
			System.out.println("Введите "+ (alreadyInpInt+1)+"-е количественное число>>");	
			break;
		}
		else
		{
			cin.nextLine();
			if (j == 0) System.out.println("Введите число!");
			else 
				System.out.println("Нажмите на клавиатуре кнопки 1,2,3,4,5,6,7,8,9 или 0!");
			j++;
		}	
	}
	
	int arrInt[ ] = new int[N];
	double arrDbl[ ] = new double[N];
	
	j = 0;
	while (cin.hasNext())
	{
		if (alreadyInpInt < N)
		{
			if (cin.hasNextInt())
			{
				intgr = cin.nextInt();
				System.out.println((alreadyInpInt+1)+"-е = "+intgr);
				
				arrInt[ alreadyInpInt ] = intgr; 
				alreadyInpInt++;
				if (alreadyInpInt < N) System.out.println("Введите "+ (alreadyInpInt+1)+"-е количественное число>>");
				else
					System.out.println("Введите "+ (alreadyInpDbl+1)+"-е вещественное число>>");
			} else {	
					cin.nextLine();
					if (j == 0) System.out.println("Введите число!");
					else 
						System.out.println("Нажмите на клавиатуре кнопки 1,2,3,4,5,6,7,8,9 или 0!");
					j++;
				 	}
					
		}
		else if (alreadyInpDbl < N)
			{
				if (cin.hasNextDouble())
				{
					dbl = cin.nextDouble();
					System.out.println((alreadyInpDbl+1)+"-е = "+dbl);
					
					arrDbl[ alreadyInpDbl ] = dbl;
					alreadyInpDbl++;
					System.out.println("Введите "+ (alreadyInpDbl+1)+"-е вещественное число>>");
				} else {	
					cin.nextLine();
					if (j == 0) System.out.println("Введите число!");
					else 
						System.out.println("Нажмите на клавиатуре кнопки 1,2,3,4,5,6,7,8,9 или 0!");
					j++;
				 	}
			}
			else
				{
					for (double x : arrDbl)
					{
						intgr = (int) x;
						if (intgr > 15) more15++;
						if (intgr %2 == 0) even++;
					}
				
					System.out.println("Количество четных чисел "+even);
					System.out.println("Количество чисел, больше 15 "+more15);
					break;
				}		
	}
 }
}
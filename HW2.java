import java.util.*;

public class HW0 {

public static void main(String[] args) {

	int j = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	
	@SuppressWarnings("resource")
	Scanner cin  = new Scanner(System.in);
	System.out.println("Введите параметр a>>");
	while (cin.hasNext())
	{
		if (cin.hasNextInt())
		{				
			a = cin.nextInt();
			System.out.println("a = "+a);
			System.out.println("Введите параметр b>>");	
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
	
	j = 0;
	while (cin.hasNext())
	{
		if (cin.hasNextInt())
		{
				b = cin.nextInt();
				System.out.println("b = "+b);
				
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
	 
	if (a > b) 
		{
			System.out.println("Введите параметр c>>");	
			j = 0;
			while (cin.hasNext())
			{
				if (cin.hasNextInt())
				{
							c = cin.nextInt();
							System.out.println("c = "+c);
							System.out.println(b+c);
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
		}
	else
		if (a == b) System.out.println("Конец");	
	else
	{
		System.out.println("Введите параметр c>>");	
		j = 0;
		while (cin.hasNext())
		{
			if (cin.hasNextInt())
			{
						c = cin.nextInt();
						System.out.println("c = "+c);
						System.out.println("Новый Год!  "+(a+b+c));
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
	}
	
 }
}
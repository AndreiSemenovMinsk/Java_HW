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
	System.out.println("������� ���������� �����>>");
	while (cin.hasNext())
	{
		if (cin.hasNextInt())
		{				
			N = cin.nextInt();
			System.out.println("�� ����� ������  "+N+" �����");
			System.out.println("������� "+ (alreadyInpInt+1)+"-� �������������� �����>>");	
			break;
		}
		else
		{
			cin.nextLine();
			if (j == 0) System.out.println("������� �����!");
			else 
				System.out.println("������� �� ���������� ������ 1,2,3,4,5,6,7,8,9 ��� 0!");
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
				System.out.println((alreadyInpInt+1)+"-� = "+intgr);
				
				arrInt[ alreadyInpInt ] = intgr; 
				alreadyInpInt++;
				if (alreadyInpInt < N) System.out.println("������� "+ (alreadyInpInt+1)+"-� �������������� �����>>");
				else
					System.out.println("������� "+ (alreadyInpDbl+1)+"-� ������������ �����>>");
			} else {	
					cin.nextLine();
					if (j == 0) System.out.println("������� �����!");
					else 
						System.out.println("������� �� ���������� ������ 1,2,3,4,5,6,7,8,9 ��� 0!");
					j++;
				 	}
					
		}
		else if (alreadyInpDbl < N)
			{
				if (cin.hasNextDouble())
				{
					dbl = cin.nextDouble();
					System.out.println((alreadyInpDbl+1)+"-� = "+dbl);
					
					arrDbl[ alreadyInpDbl ] = dbl;
					alreadyInpDbl++;
					System.out.println("������� "+ (alreadyInpDbl+1)+"-� ������������ �����>>");
				} else {	
					cin.nextLine();
					if (j == 0) System.out.println("������� �����!");
					else 
						System.out.println("������� �� ���������� ������ 1,2,3,4,5,6,7,8,9 ��� 0!");
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
				
					System.out.println("���������� ������ ����� "+even);
					System.out.println("���������� �����, ������ 15 "+more15);
					break;
				}		
	}
 }
}
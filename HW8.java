import java.util.*;

import static java.lang.Math.tan;

@SuppressWarnings("unused")
public class HW0 {

public static void main(String[] args) {
	
	int j = 0;
	int nomParametr = 0;
	double dbl = 0;
	double a = 0;
	double b = 0;
	double h = 0;
	double res = 0;
	
	@SuppressWarnings("resource")
	Scanner cin  = new Scanner(System.in);
	System.out.println("������� ������ ���������>>");
	
	while (cin.hasNext())
	{
		if (cin.hasNextDouble())
		{				
			dbl = cin.nextDouble();
			if (nomParametr == 0) { 
				a = dbl;
				System.out.println("������� ����� ���������>>");
			}	else if (nomParametr == 1) { 
						if (dbl < a) {
							System.out.println("����� ��������� ������ ���� ������ �������!");
							nomParametr--;
						} else {
							System.out.println("������� ��� ���������>>");
							b = dbl;
						}
			}	else if (nomParametr == 2) { 
						if (b - a < dbl) {
							System.out.println("��� ����� ������� �������!");
							nomParametr--;
						} else {
							
							h = dbl;
							System.out.println("������� ��������!");
							
							for (int i = 0; a + h*i < b; i++)
							{
								System.out.println("F("+ (a + h*i)+ ") = " +(2* tan((a + h*i)/2)+1));
							}
				
							break;
						}
			}	
			nomParametr++;
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
}
}
package jack0707;

import java.util.*;

public class MultiIFTest2 {

	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		int count = stdin.nextInt();
		
		if (count<0)
		{
			System.out.println("�Էµ� �� " + count);
			System.out.println("��(��)�� �����Դϴ�.");
		}
		
		else if (count == 0)
			System.out.println("�Էµ� ���� 0 �Դϴ�");
		
		else 
		 {System.out.println("�Էµ� �� " + count);
		  System.out.println("��(��)�� ����Դϴ�.");
		 
		 }
		
	}

}
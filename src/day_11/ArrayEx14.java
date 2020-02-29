/*
 * # �����̵�[1�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 */

package day_11;

import java.util.Scanner;

public class ArrayEx14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] game = {0, 2, 0, 0, 0, 0, 0};
		int count = 0;		
		while(true)
		{
			
			int player = 0;     //�ε��� ��ȣ
			for(int i=0; i<7; i++) 
			{
				if(game[i] == 2) 
				{
					player = i;
					count = i;
				}
			}
			
			System.out.print("[");
			for(int i=0; i<7; i++) 
			{
				if(game[i] == 2)
				{
					System.out.print("C ");
				}
				else
				{
					System.out.print(game[i]+" ");
				}
			}
			System.out.println("]");
			
			System.out.println("[1] �������� �̵�");
			System.out.println("[2] ���������� �̵�");
			int num = sc.nextInt();
			
			if(num == 1)
			{
				game[player-1] =game[player];
				game[player] = 0;
				count--;
				if(count == 0)
				{
					System.out.println("�� �̻� �������� �����ϼ�  �����ϴ�.");
				}
			}
			else if(num == 2)
			{
				game[player+1] =game[player];
				game[player] = 0;
				count++;
				if(count == 6)
				{
					System.out.println("�� �̻� ���������� �����ϼ�  �����ϴ�.");
				}
			}
			
		}

	}
}

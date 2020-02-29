/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
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
			
			int player = 0;     //인덱스 번호
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
			
			System.out.println("[1] 왼쪽으로 이동");
			System.out.println("[2] 오른쪽으로 이동");
			int num = sc.nextInt();
			
			if(num == 1)
			{
				game[player-1] =game[player];
				game[player] = 0;
				count--;
				if(count == 0)
				{
					System.out.println("더 이상 왼쪽으로 움직일수  없습니다.");
				}
			}
			else if(num == 2)
			{
				game[player+1] =game[player];
				game[player] = 0;
				count++;
				if(count == 6)
				{
					System.out.println("더 이상 오른쪽으로 움직일수  없습니다.");
				}
			}
			
		}

	}
}

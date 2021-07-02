package ex18.omok;

import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] position = new int [10][10];
		int count = 0;
		int width, height;
		
		for (int y = 1; y<=10;y++) {
			for (int x = 1; x<=10; x++) {
				position[x-1][y-1] = 0;
			}
		} 
		
		while(true) {
			for (int y = 1; y<=10;y++) {
				for (int x = 1; x<=10; x++) 
					if(position[x-1][9 -(y-1)] == 1) 
						System.out.printf("%c",'●');
					else if (position[x-1][9 -(y-1)] == 2)
						System.out.printf("%c",'○');
					else  // 기본 오목판 세팅.
						if (x == 1) {
							if (y == 10) {
								System.out.printf("%c", '└');
							} else if (y == 1) {
								System.out.printf("%c", '┌');
							} else {
								System.out.printf("%c", '├');							}
								
						}
						else if (x == 10) {
							if (y == 10) {
								System.out.printf("%c", '┘');
							} else if (y == 1) {
								System.out.printf("%c", '┐');
							} else {
								System.out.printf("%c", '┤');
							}
						} 
						else if (y == 10) {
							System.out.printf("%c", '┴');
						} 
						else if (y == 1) {
							System.out.printf("%c", '┬');
						}
						else
						System.out.printf("%c", '┼');
					
				System.out.println();
			}
			System.out.println("돌을 둘 위치를 입력하세요 가로 세로(1~10)");
			width = scan.nextInt();
			if (width == 0) {
				System.out.print("게임을 종료합니다.");
				break;
			}
			height = scan.nextInt();
			
				
			count++;
			if (count % 2 == 0) 
				position[width-1][height-1] = 1;
			else
				position[width-1][height-1] = 2;
			
			// ─ │ ┌ ┐ ┘ └ ├ ┬ ┤ ┴ ┼ ━ ┃
			
		}
		
		
		}
	}

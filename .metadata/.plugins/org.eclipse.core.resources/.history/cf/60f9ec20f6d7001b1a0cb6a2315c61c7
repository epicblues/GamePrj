 package ex12.array;

 import java.util.Scanner; // 매번 java.util.Scanner라 입력하는 것을 피하기 위해 사

 public class Program {
 	public static void main(String[] args) {

 		int[] kors = new int[3]; // 배열 객체 생성. 객체 생성은 무조건 new?
 		for (int i = 0; i < 3; i++) {
 			kors[i] = 0;
 		}
 		
 		int total = 0;
 		
 		float avg;

 		Scanner scan =  new Scanner(System.in);  
 		
 		종료:
 		while (true) {
 			System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	
 			System.out.println("⎪    \"메인 메뉴\"    ⎪");  
 			System.out.println("⎪                 ⎪");
 			System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");
 			System.out.println(" 1. 성적 입력");
 			System.out.println(" 2. 성적 출력");
 			System.out.println(" 3. 종료");
 			System.out.print(" 선택 > ");
 			int menu = scan.nextInt();
 			
 			switch(menu) {
 			
 			case 1: 
	 			//------------------ 성적 입력 구분 ---------------------
	 			System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	
	 			System.out.println("⎪    \"성적 입력\"    ⎪");  
	 			System.out.println("⎪                 ⎪");
	 			System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");
	 			
	 			for (int i=0; i < 3; i++) {
		 			do {
		 				System.out.printf("국어%d : ",i+1);
		 				kors[i] = scan.nextInt(); 
		 				
		 				if (kors[i] < 0 || 100 < kors[i]) {
		 					System.out.println("성적 범위(0~100)를 벗어났습니다.");
		 				}
		 			} while (kors[i] < 0 || 100 < kors[i] ); // 괄호 안이 true 면 다시 do로 넘어감.
	 			}
	 			
	 			break;
	 			
 			case 2: 
	 	
	 				//------------------ 성적 출력 구분 ---------------------
	 			
 				for (int i = 0; i < 3; i++) {
 		 			total += kors[i];
 		 		}
	 			avg =(float)(total / 3.0); 
	 			
	 			System.out.println("⎧⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎫");	
	 			System.out.println("⎪    \"성적 출력\"    ⎪");  
	 			System.out.println("⎪                 ⎪");
	 			System.out.println("⎩⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎭");
	 			
	 			for (int i = 0 ; i < 3 ; i++) {  // 최대한 이 서식을 유지하라 일종의 룰?
	 				System.out.printf("국어%d : %3d\n",i+1,kors[i]);
	 				
	 			}
	 			System.out.printf("총점 : %3d\n", total);
	 			System.out.printf("평균 : %6.2f\n", avg);
	 			System.out.println("⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽");
	 			break; //switch만 탈출 즉 while루프는 계속. 메인메뉴로 돌아간다.
 			
 			case 3:
 				System.out.println("프로그램을 종료합니다.");
 				
 				break 종료; //switch뿐만 아니라 while 루프까지 탈출
 			
 			default:
 				System.out.println("잘못된 입력입니다. 1~3만 입력 가능.");
 			}
 		}
 	}
 }
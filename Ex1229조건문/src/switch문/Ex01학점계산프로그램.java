package switch문;

import java.util.Scanner;

public class Ex01학점계산프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //1. 입력도구 꺼내오기
		System.out.print("점수를 입력하세세요>> "); //2. 입력받기
		int totalScore = sc.nextInt();
		//3. 학점 계산하기 ---> switch문으로
		//char grade = 'A';
		switch(totalScore/10) {
		case 10:
//			System.out.println("A학점입니다!");
//			break;
//		
		case 9:
			//grade = 'A'
			System.out.println("A학점입니다!");
			break;	
		case 8:
			//grade = 'B'
			System.out.println("B학점입니다!");
			break;
		case 7:
			//grade = 'C'
			System.out.println("C학점입니다.");
			break;
		default:
			//grade = 'D'
			System.out.println("D학점입니다.");
			break;
		}
		
		//System.out.println(grade + "학점입니다.");
		
		
		//자동완성 ctrl + spacebar
		
		
		
		
		
		
		
		
		
		
	}

}

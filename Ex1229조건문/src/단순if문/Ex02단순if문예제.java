package 단순if문;

import java.util.Scanner;

public class Ex02단순if문예제 {

	public static void main(String[] args) {
		//1.정수 입력받기
		//2.출력하기
		//3. if문 만들기
		//4. 결과 출력
		
		Scanner sc = new Scanner(System.in); //1. 입력도구 꺼내오기
		System.out.print("정수를 입력하세요"); //2. 정수입력 출력
		int num1 = sc.nextInt(); //3. 숫자 입력받기
		if(num1 %3 ==0 && num1 % 5 ==0) { 
			System.out.println("3과 5의 배수입니다.");
		
			//단축키 : 문장 뒤에 커서를 놓고 Alt + 방향키
		}
		
		//다른 풀이
		if(num1 % 3 ==0) {
			// 3의 배수이다
			if(num1 % 5 == 0) {
				// 3의 배수이면서 5의 배수일 때 
				System.out.println("3과 5의 배수입니다. ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 

}

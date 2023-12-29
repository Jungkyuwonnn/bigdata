package 삼항연산자;

import java.util.Scanner;

public class Ex03농구공예제 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in); //1. 입력도구 꺼내오기
		System.out.print("농구공의 개수를 입력하시오: "); //2. 농구공 개수 출력하기
		int num1 = sc.nextInt(); //3. 농구공의 개수 데이터 입력 int ball = sc.nextInt();
//		int num2 = num1 % 5 == 0; //4. 필요한 상자의 수 구하기
//		int num3 = num1 % 5 == 1; // int result = ball % 5 == 0? ball/5 : ball/5+1;
		int result = num1 % 5 == 0? num1/5 : num1/5 +1;
		System.out.print("필요한 상자의 개수: " + result);//5. 결과출력 
		
		//1.입력도구 꺼내오기
		//2. 농구공의 개수 출력
		
		
		
		
		
		
		
		
		
	}

}

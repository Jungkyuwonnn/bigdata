/package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //1. 입력받는 도구 꺼내오기
		System.out.print("정수입력: "); //2. 정수입력 출력하기
		int num3 = sc.nextInt(); //3. 정수 입력받기
		byte num4 = (byte) 100; //4. 백의 자리 이하를 버리기 
		// int result = num1 - num1 % 100
		// 두 번째 방법 int result2 = num2 / 100 * 100;
		System.out.println("결과 값: "+(num3/num4) *100); //5. 결과값 출력하기
		// System.out.println("결과값 : " + result);
		
		
		

	}

}

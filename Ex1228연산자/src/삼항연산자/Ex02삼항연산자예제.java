package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {

		//1. 정수 입력받기
		//2. 정수입력 추출
		//3. 판별하기
		//4. 결과추출
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int num1 = sc.nextInt();
		String result = num1%2 ==0 ? num1+"은(는)짝수입니다" : num1+"은(는)홀수입니다.";
		System.out.println(result); //마지막 결과문 출력
		
		
		//선생님 풀이
		//4. String result = num%2 ==1 : 홀수 : 짝수;
		//5. System.out.println(num + "(은)는" + result + "입니다.");
		
		
		
		
		
		
		
		
		
		
	}

}

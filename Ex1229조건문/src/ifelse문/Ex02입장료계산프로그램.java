package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //1. 입력도구 꺼내오기
		System.out.println("====에버렌드에 오신 걸 환영합니다!====");
		System.out.print("나이를 입력하세요: "); //2. 나이 입력받기 
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요: "); //3. 인원수 입력받기
		int people = sc.nextInt();
		
		//*****지역변수(local variable)*****
		//: {} 영역 안에서 선언된 변수는 {}영역 안쪽에서만 사용이 가능하다.
		// ---> scope 
		int ticket = 5000; //4. 입장료 계산하기 int ticket = 0: >> 지역변수 설정
		if(age > 20) {
			System.out.println("총" + people * ticket +"원 입니다."); //4-1.20세 이상일 경우 입장료 계산 
		} else {
			System.out.println("총"+ people*ticket/2 +"원 입니다. "); //4-2. 20세 미만일 경우 입장료 50% 할인 ticket = (int) (5000*people*0.5)
		}
	}

}

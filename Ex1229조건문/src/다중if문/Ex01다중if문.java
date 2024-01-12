package 다중if문;

import java.util.Scanner;

public class Ex01다중if문 {

	public static void main(String[] args) {

		// 사용자로부터 점수를 입력받아서 해당하는 숫자가 
		// 홀수인지, 짝수인지, 0인지 판단하는 프로그램
		
		Scanner sc = new Scanner(System.in); //1. 입력받는 도구 꺼내오기
		System.out.print("숫자를 입력하세요: "); //2. 숫자를 입력하세요. 출력문 작성
		int score = sc.nextInt(); //3. 숫자 입력받기 
		
		if(score==0) {
			System.out.println("0입니다.");
		} else if(score%2==1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다. ");
		} //4. 조건식을 판단해서 홀수, 짝수, 0인지 판단
		
		
		
		
		
		
		
		
	}

}

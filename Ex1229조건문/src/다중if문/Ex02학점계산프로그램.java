package 다중if문;

import java.util.Scanner;

public class Ex02학점계산프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //1. 입력도구 꺼내오기
		System.out.print("점수 입력: "); //2. 점수 입력받기
		int totalScore = sc.nextInt(); 
		//3. 점수에 따른 학점 계산하기
		if(totalScore >=90) {
			System.out.println("A학점입니다!");
		} else if(totalScore >= 80) {
			System.out.println("B학점입니다!");
		} else if(totalScore >=70) {
			System.out.println("C학점입니다!");
		} else {
			System.out.println("D학점입니다!");
		} 
		
		
		
		
		
		
		
	}

}

package switch문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //1. 입력도구 꺼내오기
		System.out.println("금액을 입력하세요 "); //2. 금액을 입력하세요. 출력하기
		int money = sc.nextInt(); //3. 입력금액 저장할 변수 선언하기
		System.out.println("메뉴를 고르세요."); //4. 메뉴판 출력하기
		System.out.print("1. 아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원) >>");
		int choose = sc.nextInt(); //5. 사용자가 선택한 메뉴 입력받기
		
		int change = money;
		if(choose==1) {
		
			if(money>=700) {
				change = money - 700;
				System.out.print("잔돈: " +change);
			}
			
			else {
			//change = money;
				System.out.println("돈이 부족해요ㅠㅠ");
				//System.out.println("잔돈: " +money);
			}
				
				}
			
			
		
		else if (choose==2) {
			if(money>=1000) {
				change = money-1000;
				System.out.print("잔돈: " +change);
			}
			
			else {
				change = money;
				System.out.println("돈이 부족해요ㅠㅠ");
				System.out.println(money);
			}
		}		
		 else if(choose==3){
			if(money>=500) {
				change = money-500;
				System.out.println("잔돈: " +change);
			}
			
			else{
				System.out.println("돈이 부족해요ㅠㅠ");
				//System.out.println(money);
			}
			
		} else {
			System.out.println("다시 선택해주세요");
		}
		
		
		
		System.out.println("잔돈은" + change+ "원 입니다.");
	
		System.out.print("천원: " + change/1000 + "개, ");
		System.out.print("오백원: " + change%1000/500 + "개", ");
		System.out.println("백원 : " + change%1000%500/100 + "개");
		
		
		
		
		
		
		
		
		
		//ㅎㅎㅎ기빨려 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

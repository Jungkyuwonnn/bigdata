package ifelse문;

import java.util.Scanner;

public class Ex03마트계산대프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 1. 입력도구
		System.out.print("상품의 개수를 입력하세요: "); //2. 입력받기 
		int num1 = sc.nextInt();
		int present = 10000;
		int prise = present * num1;
		if(num1 >= 11) {
			System.out.println("가격은" +(int)(prise*0.9) +"원입니다." ); //(int)(수식) 강제 형변환해서 소수점 제거하기 
		} else {
			System.out.println("가격은" + (int)(num1*10000) + "원입니다. ");
		}
		//3. 선물세트 구입 시 지불할 금액 계산하기 gift = num1
		// int money =  0;
		// if(gift >= 11) {
		// money =(int)(10000 * gift * 0.9);
		//} else {
		// money = 10000 * gift;
		//}
		//4. 가격 출력하기
		//System.out.println("가격은' + money + "원입니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}

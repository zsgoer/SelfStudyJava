package chap02.sec05;

import java.util.Scanner;

public class Finish {

	public static void main(String[] args) {
		// 확인문제 1번.
		System.out.println("==========확인문제 1번===========");
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름: " + name);
		System.out.print("나이: " + 25 + "\n");
		System.out.printf("전화: %s-%s-%s\n", tel1, tel2, tel3);
		System.out.println("=================================");
		
		//확인문제 2번
		System.out.println("==========확인문제 2번===========");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		String strNum1 = sc.nextLine();
		
		System.out.print("두번째 수 : ");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		System.out.println("=================================");
		
		System.out.println("==========확인문제 3번===========");
		System.out.print("1. 이름 : ");
		String strName = sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리 : ");
		String strBirthDate = sc.nextLine();
		System.out.print("3. 전화번호 : ");
		String strHpNo = sc.nextLine();
		System.out.println("[입력한 내용]");
		System.out.println(strName);
		System.out.println(strBirthDate);
		System.out.println(strHpNo);
		
		
		System.out.println("=================================");
		
	}

}

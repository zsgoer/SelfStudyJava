package chap02.sec05;

import java.util.Scanner;

public class Finish {

	public static void main(String[] args) {
		// Ȯ�ι��� 1��.
		System.out.println("==========Ȯ�ι��� 1��===========");
		String name = "���ڹ�";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("�̸�: " + name);
		System.out.print("����: " + 25 + "\n");
		System.out.printf("��ȭ: %s-%s-%s\n", tel1, tel2, tel3);
		System.out.println("=================================");
		
		//Ȯ�ι��� 2��
		System.out.println("==========Ȯ�ι��� 2��===========");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		String strNum1 = sc.nextLine();
		
		System.out.print("�ι�° �� : ");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("���� ��� : " + result);
		System.out.println("=================================");
		
		System.out.println("==========Ȯ�ι��� 3��===========");
		System.out.print("1. �̸� : ");
		String strName = sc.nextLine();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ� : ");
		String strBirthDate = sc.nextLine();
		System.out.print("3. ��ȭ��ȣ : ");
		String strHpNo = sc.nextLine();
		System.out.println("[�Է��� ����]");
		System.out.println(strName);
		System.out.println(strBirthDate);
		System.out.println(strHpNo);
		
		
		System.out.println("=================================");
		
	}

}

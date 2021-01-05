package chap02.sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;  // 자바 컴파일러는 10 + 20을 먼저 연산 해 30을 만들고 30을 저장하도록 한다.
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		
		int result2 = x + y;
		System.out.println(result2);
	}

}

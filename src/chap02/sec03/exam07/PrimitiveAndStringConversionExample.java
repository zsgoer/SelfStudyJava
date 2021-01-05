package chap02.sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1;
		double value2;
		boolean value3;
		
		value1 = Integer.parseInt("10");
		value2 = Double.parseDouble("3.14");
		value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		String str1,str2,str3;
		str1 = String.valueOf(value1);
		str2 = String.valueOf(value2);
		str3 = String.valueOf(value3);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
	}

}

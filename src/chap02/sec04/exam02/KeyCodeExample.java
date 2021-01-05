package chap02.sec04.exam02;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);
		System.out.println("keyCodeChar : "+(char) keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);
		System.out.println("keyCodeChar : "+(char) keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);
		System.out.println("keyCodeChar : "+(char) keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);
		System.out.println("keyCodeChar : "+(char) keyCode);
		
	}

}

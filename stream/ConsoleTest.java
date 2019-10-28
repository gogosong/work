package stream;

import java.io.Console;
//System.in을 사용하지 않고 콘솔에서 표준 입출력 가능
public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("name:");
		String name = console.readLine();
		System.out.println("password:");
		char[]password=console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
		
		
	}
	//.. 상위디렉토리에서 패키지풀네이임 입력한다.ㅡ java package.classname
//d:\JAVA_LAB\fast\bin\java stream.inputstream.class
}

package stream;

import java.io.Console;
//System.in�� ������� �ʰ� �ֿܼ��� ǥ�� ����� ����
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
	//.. �������丮���� ��Ű��Ǯ������ �Է��Ѵ�.�� java package.classname
//d:\JAVA_LAB\fast\bin\java stream.inputstream.class
}

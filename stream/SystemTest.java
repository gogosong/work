package stream;

import java.io.IOException;

public class SystemTest {

	public static void main(String[] args) {
		// ���ĺ� �Է� ����
		System.out.println("�Է�:");
//		System.in.read()�ѹ���Ʈ �о� int �����Ѵ�. ���ϳ��� Ȥ�� �������� �����Ť� -1 ����, �ѹ���Ʈ ������ 4����Ʈ ó��.ǥ��io�� close()���� �ʴ´�.
		
		try {
			int i=System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

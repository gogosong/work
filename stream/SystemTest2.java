package stream;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {
		// ���ĺ� �Է� ����
		System.out.println("�Է�:");
//		System.in.read()�ѹ���Ʈ �о� int �����Ѵ�. ���ϳ��� Ȥ�� �������� �����Ť� -1 ����, �ѹ���Ʈ ������ 4����Ʈ ó��.ǥ��io�� close()���� �ʴ´�.
		
		try {
			int i;
			while((i=System.in.read()) != '\n') {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

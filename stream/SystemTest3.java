package stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemTest3 {

	public static void main(String[] args) {
		// ���ĺ� �Է� ����
		System.out.println("�Է�:");
//		System.in.read()�ѹ���Ʈ �о� int �����Ѵ�. ���ϳ��� Ȥ�� �������� �����Ť� -1 ����, �ѹ���Ʈ ������ 4����Ʈ ó��.ǥ��io�� close()���� �ʴ´�.
		
		try {
			int i;
//			in�� �� ����Ʈ�� �д´� ��Ƽ����Ʈ�� �������Ÿ� ������Ʈ���� ����Ѵ�
			InputStreamReader isr=new InputStreamReader(System.in);
			while((i=isr.read()) != '��') {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

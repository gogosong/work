package stream;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {
		// 알파벳 입력 엔터
		System.out.println("입력:");
//		System.in.read()한바이트 읽어 int 리턴한다. 파일끝에 혹은 읽을것이 없으ㅕㄴ -1 리턴, 한바이트 읽지만 4바이트 처리.표준io는 close()하지 않는다.
		
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

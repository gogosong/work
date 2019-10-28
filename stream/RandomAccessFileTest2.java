package stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*File Class : 파일개념을 추상화한 클래스, 입출력 기능은 없고 파일의 속성, 경로, 이름 등을 알 수 잇음
RandomAccessFile:입출력 클래스중 유일하게 파일 입출력을 동시에 수행하는 클래스, 파일 포인터가 있어 읽고 쓰는 위치 이동이 가능*/

public class RandomAccessFileTest2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf=new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14);
		rf.writeUTF("헬로우");
		
		rf.seek(0);
		int i = rf.readInt();
		double d=rf.readDouble();
		String str=rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		rf.close();
	}

}

package serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*Serializable �������̽�
 * ����ȭ : �ν��Ͻ��� ���¸� �״�� �����ϰų� ��Ʈ��ũ�� �����ϰ� �̸� �ٽ� �����ϴ� ���
 * ObjectInpputStream�� ObjectOutputStream ���
����ȭ�� �ν��Ͻ��� ������ ���Ͽ� �����ϰų� ��Ʈ���� ���� �����ϹǷ� ��ü�� ����ȭ�ϰڴٰ� ǥ���Ѵ�.
���� �ڵ尡 ���� mark interface*/

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3181850442356629423L;
	String name;
	transient String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job=job;
	}
	public String toString() {
		return name+","+job;
	}
}
public class SerializationTest {

	public static void main(String[] args) {
		Person personLee=new Person("��", "���α׷���");
		Person personHong=new Person("ȫ","�ý��� ������");
		
		try(FileOutputStream fos=new FileOutputStream("serial.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(personLee);
			oos.writeObject(personHong);
		}catch(IOException e) {
			System.out.println(e);
		}
		try(FileInputStream fis =new FileInputStream("serial.dat");
				ObjectInputStream ois=new ObjectInputStream(fis)){
			Person p1=(Person)ois.readObject();
			Person p2=(Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}

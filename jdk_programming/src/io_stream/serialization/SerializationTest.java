package io_stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Externalizble implements 
// Serializable=구현코드가 없는 maker interface (마커 인터페이스)
// 메서드 2개 구현해야 함 (serializable이랑 다르게) 
class Person implements Serializable {
	
	// 객체가 많이 수정된 경우에는 번호를 바꿀 수가 있음
	// serialversionid
	// cmd 쪽에서 java 명령어를 통해서 generate할 수 있음 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String title;
	
	public Person() {}
	public Person(String name, String title) {
		this.name = name;
		
		// transient: 직렬화할 때 얘는 저장하지 않겠다 (null)로 복원됨
		// 소켓은 직렬화안됨 
		// 그런 직렬화 안되는 클래스들 있으면 그 앞에 transient keyword
		this.title = title;
	}
	
	public String toString() {
		return name + "," + title;
	}
	
	// Externalizble 
	/*
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		// 어떻게 write할 건지?
		// writeobject할 때 이게 불리고 read할땐 밑에
		// 쓰는 순서 읽는 순서 동일해야 함 
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	*/
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Person lee = new Person("Lee", "Manager");
		// fileoutputstream에는 저장하는 방법이 없음 함수가
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
	
			oos.writeObject(lee);
		} catch (IOException e) {
			System.out.println(e);
			// 객체의 정보를 저장하겠다 -> 정보 유출임
			// 따라서 저장하고자 하는 객체가 implements serializable
		}
		
		
		// 복원! 
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
		
			// 그냥 throws로 처리했음
			// classnotfoundexception or 우리가 원하는 클래스가 아닐 수도 있음
			// 여러 클래스를 저장했을 경우에 
			Object obj = ois.readObject();
			
			
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p); // toString() 재정의
			}
			
		} catch (IOException e) {
			System.out.println(e);


	}
	}
}

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
// Serializable=�����ڵ尡 ���� maker interface (��Ŀ �������̽�)
// �޼��� 2�� �����ؾ� �� (serializable�̶� �ٸ���) 
class Person implements Serializable {
	
	// ��ü�� ���� ������ ��쿡�� ��ȣ�� �ٲ� ���� ����
	// serialversionid
	// cmd �ʿ��� java ��ɾ ���ؼ� generate�� �� ���� 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String title;
	
	public Person() {}
	public Person(String name, String title) {
		this.name = name;
		
		// transient: ����ȭ�� �� ��� �������� �ʰڴ� (null)�� ������
		// ������ ����ȭ�ȵ� 
		// �׷� ����ȭ �ȵǴ� Ŭ������ ������ �� �տ� transient keyword
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
		// ��� write�� ����?
		// writeobject�� �� �̰� �Ҹ��� read�Ҷ� �ؿ�
		// ���� ���� �д� ���� �����ؾ� �� 
		
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
		// fileoutputstream���� �����ϴ� ����� ���� �Լ���
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
	
			oos.writeObject(lee);
		} catch (IOException e) {
			System.out.println(e);
			// ��ü�� ������ �����ϰڴ� -> ���� ������
			// ���� �����ϰ��� �ϴ� ��ü�� implements serializable
		}
		
		
		// ����! 
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
		
			// �׳� throws�� ó������
			// classnotfoundexception or �츮�� ���ϴ� Ŭ������ �ƴ� ���� ����
			// ���� Ŭ������ �������� ��쿡 
			Object obj = ois.readObject();
			
			
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p); // toString() ������
			}
			
		} catch (IOException e) {
			System.out.println(e);


	}
	}
}

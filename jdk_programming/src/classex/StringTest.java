package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c: cons) {
			System.out.println(c);
		}
		
		// ������ ����Ʈ ��µ�
		// �̷��� �����ͼ� �� ���� �����ؼ� �װɷ� ��ü ���� 
		// �̰� reflection programming
		
		// java.lang.reflect ��Ű�� ���� Field import
		Field[] fields = strClass.getFields();

		for(Field f: fields) {
			System.out.println(f);
		}
		
		Method[] methods = strClass.getMethods();
		
		for(Method m: methods) {
			System.out.println(m);
		}
		
		
		
	}

}

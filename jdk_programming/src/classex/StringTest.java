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
		
		// 생성자 리스트 출력됨
		// 이렇게 가져와서 뭘 쓸지 결정해서 그걸로 객체 생성 
		// 이게 reflection programming
		
		// java.lang.reflect 패키지 밑의 Field import
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

package interfaceex;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		// TODO Auto-generated method stub
		System.out.println("x()");
	}

	@Override
	public void y() {
		// TODO Auto-generated method stub
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("mymethod()");
	}
	
	public static void main(String args[]) {
		MyClass myc = new MyClass();
		
		X xClass = myc;
		xClass.x(); // � type�� ���Եƴ��Ŀ� ���� ����� �� �ִ� �޼��� ������
		
	}

}

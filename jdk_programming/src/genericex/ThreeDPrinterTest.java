package genericex;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 제네릭 프로그래밍 
		ThreeDPrinter<Powder> printer = new ThreeDPrinter();
		
		printer.setMaterial(new Powder());
		
		Powder powder = printer.getMaterial();
		
		// toString() 재정의
		System.out.println(printer);
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter();
		
		printer2.setMaterial(new Plastic());
		
		Plastic plastic = printer2.getMaterial();
		
		// toString() 재정의
		System.out.println(printer2);
		
		// Water는 Material을 상속받지 않기 때문에 쓸 수 없다 
//		ThreeDPrinter<Water> printer3 = new ThreeDPrinter();
//		printer3.setMaterial(new Water());
//		System.out.println(printer3);
		
		printer2.printing();
		printer.printing();
		
		// <> 안 쓸 수도 있기는 함 근데 Object로 간주함 
		ArrayList list = new ArrayList();


	}

}

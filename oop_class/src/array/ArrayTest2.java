package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int size = 0;
		double[] num = new double[5];
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		
		// 여기까지만 초기화하면 3, 4 index에는 0.0으로 초기화되어 있음 
		num[2] = 30.0; size++; 
		
		double total_sum = 0.0;
		double total_mul = 1;
		
		// num.length 아니고 size만큼
		for(int i = 0; i < size; i++) {
			System.out.println(num[i]);
			total_sum += num[i];
			total_mul *= num[i];
			
			// 그런데 곱하기를 하게 되면 0.0이 있어서 0.0으로 나오게 됨
			// 유요한 값들만 곱하기 하고 싶다면? 
			// length만큼은 for를 도는 게 아님 -> 유효한 size값 만들기 
		}
		
		System.out.println("total: "+total_mul);

	}

}

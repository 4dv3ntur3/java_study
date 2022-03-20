package witharraylist;

public class VIPCustomer extends Customer {
	
	// �����ؼ� ����� ���� Customer�� �� ��ħ (�Ϻ� ������ ������ ����)
	// �׷��� extends
	
//	protected int customerID;
//	protected String customerName;
//	protected String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	private double saleRatio;
	private int agentID; // ��� ����. �ٲٴ� �� �������� �ʰڴ� 
	
	// super�� �⺻ �����ڰ� ���ٸ�?
	// super(0, null); �� �ִ� ����� ������
	// �׳� ���� Ŭ���� �����ڶ� �Ȱ��� ���� 
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		// ����� ���⼭ �����Ϸ���
		// super(); �� �־� �� (precompile �ܰ迡��)
		// Customer class ���� �����ڿ� super(); ��!
		// ��� �ڹ� Ŭ������ �ֻ��� Ŭ������ Object class�� ��ӹޱ� ������ �� �����ڸ� ȣ����
		// �ڱ� �ڽ��� �ٷ� �� ����Ŭ������ ����Ű�� �����ڸ� ���� Ű����
		// �ڱ� �ڽ� ����Ű�� �� this
		// �̷��� �ϸ� ����Ŭ���� �⺻ ������ ȣ���
		
		// �ϴ� ��������� super�� �ҷ��� ��
		super(customerID, customerName);
				
		customerGrade = "VIP"; // private�� ������ ���¸� �� ����. �����ŵ� ���� �Ұ�
		// ���� �� �� ����. �׷��� �ܺ� Ŭ�������Դ� private������ ��Ӱ��迡���� public���� ���̰� �ϴ� Ű����
		// protected.
		//super.setBonusPoint(10000); // �̷��Ե� ��� ����
		// �׳� setBonusPoint(10000); �ص� ��
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		this.agentID = agentID;
		
		// �̷��� �Ǹ� ���� ����������� ������ �⺻�����ڿ��� ���� �� �ʱ�ȭ ��
		// �� ������ �ٽ� overwrite �� ��
		
//		System.out.println("VIPCustomer() ȣ��");
		System.out.println("VIPCustomer(int, String) ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	
	// ���� Ŭ������ �޼���� ���� �̸�, ���� ��ȯ��, ���� �Ű������� ���� �޼��带 ������
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // ������ ��������� �ʰ� ����Ʈ�� ����
		return price - (int)(price*saleRatio);
	}
//	
//	public String showCustomerInfo() {
//		return customerName + "���� �����" + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
//	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�."; 
		// ���࿡ ���⼭ super ���� �� �Լ��� �θ��� ������ �׳� ���ȣ�� ����ϰ� ��
		
	}
	
	

}

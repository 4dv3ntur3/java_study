package witharraylist;

public class Customer {
	
	// �̰� protected�� �����ϸ� ��ӹ޴� class(�ٸ� ��Ű���� �־ ������) ������ ���� ����, ������ �ܺ� Ŭ������ ���� �Ұ�
	// private �ϸ� ��ӹ޴� class�� ���� �Ұ�
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint; 
	// ���� �����ڰ� �ƹ��͵� ������ default�� ��Ű���� �޶����� ���ü��� ������ (��ӹ޾Ƶ� �� �� ����)
	// �׷��� ���� �Ұ����� ������ ����ϰ� ������ getter setter 
	protected double bonusRatio;
	
	// ���ü�
	// private -> default -> protected (��Ű���� �޶� ����/����Ŭ���������� �� �� ����)
	
	// �ܰ� �� ��� �߰��� ���� �̷� ������ �ϰ� �Ǹ� 
	// calcPrice���� if�� �־ �� ��޿� ���� ���� �� ����Ʈ ���� ����� ��� ��
	// �� customer class�ȿ� ���� �� ��޺��� if���� �þ��...
	// �����ϰ� ���������� ������� ���� 
	//	private int saleRatio;
	//	private int agentID;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() ȣ��");
	}
	
	// default ������ �� ���� ������ �̰ɷ� ���ڴ�
	// ȸ�������� �� id, �̸� ���� �� �̷� ������ ���� DB�� �ְ� �ϸ� �ǰ���
	// �׷��� �⺻ ������ ���� �̷��� �ϸ�? ������ ��
	// ��ӹ޴� Ŭ������ �����ڿ��� super(); �� �θ��µ� �̰� �⺻ �����ڸ� ȣ����
	// �ƹ� �����ڰ� ���� �� �⺻�����ڰ� �����Ǳ� ������...
	// �ϳ��� �����ڸ� ��������ϱ� �����Ϸ��� �⺻ �����ڸ� �� ��.
	// �׷��� �� �� �� �Ÿ� ���� �ڵ��ϴ� �Ű� 
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) ȣ��");
		
	}
	
	
	// �� �޼���� vipcustomer������ ���� ����! 
	// vip customer���� calcprice�� �Ȱ��� ������ ���� 
	// ���� �Ű�����, ���� �̸�. ��ɸ� �ٸ� (�������̵�)
	// �����ε�: �̸��� �Ȱ��� (�Ű������� �ٸ���) �� ���� ��.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // ������ ��������� �ʰ� ����Ʈ�� ����
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� �����" + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
	

}

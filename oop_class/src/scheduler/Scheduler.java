package scheduler;

public interface Scheduler {
	// ��⿭(Queue)�� ������ ��ȭ�� ���̰� �̰� ��� ������ ��?
	
	// ���� 5������ �ϳ��� ����? = round robin
	// ����� ���� ó���ؾ� �ϴϱ� �ǵ����̸� ��⿭�� ª�� �������� �켱 ���? = least job
	// �������� ��ų���̳� ���õ��� �ٸ��ϱ� �켱������ �ּ� ���? = priority
	
	// ��å(strategy)�� ���� ���� �����Ƿ� �� ��å���� �� �� ���� ����(implement)�ϸ� �ȴ�
	void getNextCall();
	void SendCallToAgent();
	
	// client�� �׳� scheduler��� type�� ������ � class���� �ִ���
	// �� scheduler interface�� ���� ������ �� (spec, ��༭)
	

}

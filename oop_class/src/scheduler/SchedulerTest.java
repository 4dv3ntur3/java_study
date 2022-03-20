package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//DB ����
		// ��ü�� ���� �������̽��� ��� �����ͺ��̽��� �����ؼ� ���� 
		// JDBC: Java DataBase Connectivity
		// DB�� �ڹٶ� ����Ƿ��� �̷� �͵��� �����Ǿ�� �Ѵٴ� ���� �Ǿ� ����
		// Connection, Statement ���� ����
		// �� �������̽���. ������ ����? 
		// �̰ſ� ���� ������ Oracle, MS-SQL, MYSQL���� �� 
		// �� �������̽��� ���� ������ �ؼ� .jar������ �ְ� �츰 �̰� ������ ��
		// �츮�� �� .jar������ ��� ������? �ƴ�.. don't care��
		// jar import�ϰ� ���� ����ؼ� ��� 
		// ���� �ڵ�� ������ �����ϴ� ���� ��. 
		// �̷� �͵��� ������ �Ǿ�� �Ѵ� �� �� ���� ��.
		// �پ��� ��å���� ������ �� �ִ�. 
		// Dao: Data Access Object ����� ����ϴ� DB�� �� �ٲ��� �ϴ� ��
		// �츮 ȸ��� ����Ŭ �� ���! 
		// property �о �׶��׶� �´� Dao ��� ���ε� ���Ѽ� ��Ƽ DB ����Ʈ
		// Connection
		
		
		
		// R->RR, L -> LJ, P -> PA
		System.out.println("��ȭ ��� ��й���� �����ϼ���. R, L, P");
		
		// �Է¹ޱ�
		int ch = System.in.read(); // ���� ó�� ���� ���� throw IOException����
		Scheduler scheduler = null;
		
		
		// RR, LJ, PA�� ���� � ����� �ϴ� ���������(class)������ �ȴ�
		// �׷��� �� ���� �� �鿩�ٺ��� �ʰ� �׳� �� �߿� �ϳ��� ���� �ȴ� 
		
		
		// ������
		// �ȵ���̵��� ��ư�� ����, ���������� radio �ϼ���...
		// ������ �ϰ� �Ǹ� �� �������̽��� ������ �ν��Ͻ��� �Ҵ� -> �޼��尡 ȣ��ȴ�
		// ���� �Ȱ��� �޼��带 �ҷ����� �ν��Ͻ��� ���Ŀ� ���� ����ü�� �޶����� 
		if(ch=='R' || ch=='r') {
			scheduler = new RoundRobin();
		}
		
		else if (ch=='L' || ch=='l') {
			scheduler = new LeastJob();
		}
		
		else if (ch=='P' || ch=='p') {
			scheduler = new PriorityAllocation();
		}
		
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		// �׷��� ���� �޼��带 �׳� ȣ���� �ָ� �� 
		scheduler.getNextCall();
		scheduler.SendCallToAgent();
	}

}

package �Ĵ�;

import java.util.ArrayList;

import java.util.List;

public interface Administrator {
	final String ID="admin";
	final String pass="admin"; // ������ ���̵�, ��й�ȣ
	
	String[] menu=new String[100]; // ���� ���� �̸�
	List<MenuSelect> menulist=new ArrayList<>(); // �ֹ� ������ �� �ڸ�
	
	public void Logon(); // ������ �α׿�
	public void Logout(); // ������ �α׾ƿ�
	
	public void menuInput(); // ���� �Է�
	public void menuDelete(); // ���� ����
	
	public String Suggestions=""; // ���ǻ���
	
}

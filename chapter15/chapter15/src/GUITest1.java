import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.*;

// 1. ó���� �̺�Ʈ ���� ����. - ��ư
// 2. �̺�Ʈ�� ������ �̺�Ʈ ������ �������̽��� ����Ͽ� Ŭ���� �ۼ�.
class GUI1 extends JFrame implements ActionListener{
	// �Ӽ����� �ؽ�Ʈ ������ �ؽ�Ʈ �ʵ带 ����.
	private JTextArea contents;
	private JTextField f_name;
	
	// ������
	public GUI1() {
		// ������ �ؽ�Ʈ ��ü ���� - �� ���� �Է�
		contents = new JTextArea("������ ������ �Է��ϼ���.", 10, 20);
		// ���� �ؽ�Ʈ ��ü ����. - ���� ����� �Է�
		f_name = new JTextField("���� �̸��� �Է��ϼ���", 20);
		// ��ư ��ü ���� - ���� ��ư
		JButton jb = new JButton("���Ϸ� ����");
		
		// �����̳� ����
		Container ct = getContentPane();
		// FlowLayout ��ġ ������ ����.
		ct.setLayout(new FlowLayout());
		// �ǳ� ����
		JPanel pl = new JPanel();
		
		// �ǳڿ� �ؽ�Ʈ �ʵ� �߰�
		pl.add(f_name);
		// �ǳڿ� ��ư �߰�
		pl.add(jb);
		
		// �����̳ʿ� �ؽ�Ʈ ����� �߰�
		ct.add(contents);
		// �����̳ʿ� �ǳ��߰�
		ct.add(pl);
		
		// 3. �̺�Ʈ �޾Ƶ��� ��ư�� ������ ���
		jb.addActionListener(this);
		
		// ȭ�� ũ��, ���̱�, Ÿ��Ʋ...
		setTitle("GUI Test");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}

	// 4. ������ �������̽��� ����� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�.
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			// ������� ���� ����ó��
			// ���� �̸����� ��� ��ü ����.
			String s = f_name.getText();
			FileOutputStream fos = new FileOutputStream(s);
			DataOutputStream dos = new DataOutputStream(fos);
			
			// �ؽ�Ʈ ������� ������ ���Ϸ� ���
			dos.writeUTF(contents.getText());
			// ���� �ݱ�
			fos.close();
			System.out.print(s + "������ �����Ǿ����ϴ�.");
		}
		catch(Exception e) {
			
		}
		
	}
	
}

public class GUITest1 {
	public static void main(String[] args) {
		new GUI1();
	}

}

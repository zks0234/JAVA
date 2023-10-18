import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1. ó���� �̺�Ʈ ���� ����. - ��ư
//2. �̺�Ʈ�� ������ �̺�Ʈ ������ �������̽��� ����Ͽ� Ŭ���� �ۼ�.
class GUI2 extends JFrame implements ActionListener{
	// �Ӽ����� �ؽ�Ʈ ������ �ؽ�Ʈ �ʵ带 ����.
	private JTextArea contents;
	private JTextField f_name;
	
	// ������
	public GUI2() {
		// ������ �ؽ�Ʈ ��ü ���� - �� ���� ���
		contents = new JTextArea(10, 20);
		// ���� �ؽ�Ʈ ��ü ����. - ���� ����� �Է�
		f_name = new JTextField("���� �̸��� �Է��ϼ���", 20);
		// ��ư ��ü ���� - ���� ��ư
		JButton jb = new JButton("���� �ҷ�����");
		// �ؽ�Ʈ ����� ���� �Ұ�.
		contents.setEditable(false);
		
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
		
		// �����̳ʿ� �ǳ��߰�
		ct.add(pl);
		// �����̳ʿ� �ؽ�Ʈ ����� �߰�
		ct.add(contents);
		
		// 3. �̺�Ʈ �޾Ƶ��� ��ư�� ������ ���
		jb.addActionListener(this);
		
		// ȭ�� ũ��, ���̱�, Ÿ��Ʋ...
		setTitle("GUI Test");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			// ���� �̸����� �Է� ��ü ����.
			String s = f_name.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			
			// ������ ������ �о�ͼ� �ؽ�Ʈ ������� �������� ����.
			contents.setText(dis.readUTF());
			// ���� �ݱ�
			fis.close();
			System.out.println(s+"������ �о� �Խ��ϴ�.");
		}
		catch(Exception e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
	}
	
}
public class GUITest2 {
	public static void main(String[] args) {
		new GUI2();
	}

}

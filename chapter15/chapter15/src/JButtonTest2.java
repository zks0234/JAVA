
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JButton2 extends JFrame implements ActionListener{
	JTextField jtf;
	public JButton2() {
		jtf = new JTextField(10);
		// 이미지 아이콘 객체 생성
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear = new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		
		JButton jb1 = new JButton("사과", apple);
		JButton jb2 = new JButton("바나나", banana);
		JButton jb3 = new JButton("감", persimmom);
		JButton jb4 = new JButton("배", pear);
		JButton jb5 = new JButton("포도", grape);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		// FlowLayou 배치 관리자 생성
		ct.setLayout(new GridLayout(3, 2));
		
		// 컨테이너에 버튼 추가
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		ct.add(jtf);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		// 화면에 보이기 사이즈는 500, 400
		setTitle("JButton2 테스트");
		setSize(250, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
		
	}
}

public class JButtonTest2 {
	public static void main(String[] args) {		
		new JButton2();
	}
}
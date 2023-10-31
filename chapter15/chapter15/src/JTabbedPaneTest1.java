package chap151027;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

// 1. 성별 판넬 클래스 만들기
class RadioPanel extends JPanel implements ActionListener{
	// 성별을 나타내는 라디오 버튼 그룹 만들기
	ButtonGroup gb = new ButtonGroup();
	// 레이블 생성
	JLabel jl1 = new JLabel(" 당신의 성별은? ");
	JLabel jl2 = new JLabel("");
	
	// 라디오 버튼 생성
	JRadioButton[] jr = new JRadioButton[5];
	String[] gender = {"남자", "여자"};
	
	// 생성자 
	public RadioPanel() {
		// 성별을 라디오버튼 객체로 배열 생성
		for (int i = 0; i < 2; i++) {
			jr[i] = new JRadioButton(gender[i]);
			add(jr[i]);  // 성별 판넬에 객체 추가		
		
			// 버튼 그룹에 추가
			gb.add(jr[i]);
			// 리스너 등록
			jr[i].addActionListener(this);
		}
		add(jl1);
		add(jl2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		jl2.setText(s);
		
	}
}

// 1. 혈액형 판넬 클래스 만들기
class ComboxPanel extends JPanel implements ItemListener{
	// 레이블 생성
	JLabel jl1 = new JLabel(" 당신의 혈액형은? ");
	JLabel jl2 = new JLabel("");
	
	// 생성자
	public ComboxPanel() {
		// 콤보 박스 생성		
		JComboBox<String> jcb = new JComboBox<String>();
		
		jcb.addItem("A형");
		jcb.addItem("B형");
		jcb.addItem("AB형");
		jcb.addItem("O형");
		
		add(jl1);
		add(jl2);
		add(jcb);
		
		// 리스너 등록
		jcb.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object s = e.getItem();
		jl2.setText(s.toString());
		
	}
}

// GUI
class JTabPane extends JFrame {
	public JTabPane() {
		Container ct = getContentPane();
		
		// 2. JTabPane() 객체 생성
		JTabbedPane jtp = new JTabbedPane();
		
		// 라디오 판넬, 콤보 판넬 객체 생성
		RadioPanel rp = new RadioPanel();
		ComboxPanel cp = new ComboxPanel();
		
		// 3. JTabbedPane() 에 판넬 추가
		jtp.addTab("성별", rp);
		jtp.addTab("혈액형", cp);
		
		// 4. 컨테이너에 추가
		ct.add(jtp);
		
		// 출력
		setTitle("JTabbedPane Test1");
		setSize(400, 150);
		setVisible(true);
	}
}

public class JTabbedPaneTest1 {
	public static void main(String[] args) {
		new JTabPane();

	}

}

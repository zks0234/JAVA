package chap151027;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


class JRadioButton1 extends JFrame implements ActionListener{
	JLabel jl;
	JCheckBox[] jc = new JCheckBox[5];
	String[] hobby = {"걷기", "등산", "골프", "스킨스쿠버", "페러글라이딩"};
	
	JRadioButton[] jr = new JRadioButton[5];
	String[] age = {"20대", "30대", "40대", "50대", "60대"};
	
	public JRadioButton1() {
		jl = new JLabel();
		JLabel jl1 = new JLabel("당신의 취미는?");
		JLabel jl2 = new JLabel("당신의 나이는?");
		
		JPanel hobbypanel = new JPanel();
		JPanel agepanel = new JPanel();
		
		ButtonGroup gb = new ButtonGroup();
		
		for (int i = 0; i < 5; i++) {
			jc[i] = new JCheckBox(hobby[i]);
			jr[i] = new JRadioButton(age[i]);
			
			hobbypanel.add(jc[i]);
			agepanel.add(jr[i]);
			
			jr[i].addActionListener(this);
			gb.add(jr[i]);
		}
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3, 1));
		
		JPanel jp1 = new JPanel();
		jp1.add(jl1);
		jp1.add(hobbypanel);
		
		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(agepanel);
		
		JPanel jp3 = new JPanel();
		jp3.add(jl);
		
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		setTitle("JRadioButton Test1");
		setSize(380, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String s = "당신의 취미 : ";
		for (int i = 0; i < 5; i++) {
			if(jc[i].isSelected() == true)
				s = s + hobby[i] + " ";
		}
		s = s + "당신의 나이 : ";
		jl.setText(s + ae.getActionCommand());
	}
}

public class JRadioButtonTest1 {
	public static void main(String[] args) {		
		new JRadioButton1();
		
	}
}
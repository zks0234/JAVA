

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class JTFJTA1 extends JFrame implements ActionListener{
	// 텍스트 필드 객체 선언
	private JTextField input;
	
	// 텍스트 에어리어 객체 선언
	private JTextArea output;
	
	// 라벨 객체 선언
	private JLabel jl = new JLabel("텍스트를 입력하세요.");
	
	// 생성자
	public JTFJTA1() {
		// 20자 입력 가능한 텍스트 필드 객체 생성
		input = new JTextField(20);
		// 10줄 20칸 텍스트 에어리어 객체 생성
		output = new JTextArea(10, 20);
		// 텍스트 에어리어는 수정 불가 설정
		output.setEditable(false);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// FlowLayout 설정
		ct.setLayout(new FlowLayout());
		
		// 패널 생성
		JPanel jp1 = new JPanel();
		
		// 패널에 input, output 추가
		jp1.add(input);		
		jp1.add(output);
		
		// 패널과 레이블을 컨테이너에 추가		
		ct.add(jp1);
		ct.add(jl);
		
		// 컴포넌트에 리스너 등록
		input.addActionListener(this);
		
		// 화면에 보이도록 사이즈는 500,300
		setTitle("JTextField 와 JTextArea");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	// 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if (output.getLineCount() <= output.getRows()) { // 텍스트 에어리어 크기보다 작을때 추가
			output.append(e.getActionCommand() + "\n");  // output에 글 내용 추가 
			input.setText(""); // 글 내용 삭제(빈칸으로)
		}
		else { // 줄을 넘으면
			jl.setText("입력이 종료되었습니다.");
			input.setEditable(false);
		}		
	}
}

public class JTFJTATest1 {

	public static void main(String[] args) {
		new JTFJTA1();
	}

}



import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//GUI 클래스
class JButton1 extends JFrame {
	public JButton1() {
		// 이미지 아이콘 객체 생성
		ImageIcon korea = new ImageIcon("image/Korea1.gif");
		ImageIcon usa = new ImageIcon("image/usa.gif");
		ImageIcon germany = new ImageIcon("image/germany.gif");
		
		// 버튼 객체 생성
		JButton nat = new JButton(korea); // 기본 버튼 이미지는 태극기
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// FlowLayou 배치 관리자 생성
		ct.setLayout(new FlowLayout());

		// 컨테이너에 버튼 추가
		ct.add(nat);
		
		// 화면에 보이기 사이즈는 500, 400
		setTitle("JButton 테스트");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

// 메인 클래스
public class JButtonTest1 {

	public static void main(String[] args) {
		new JButton1();{
			
		}
	}
}

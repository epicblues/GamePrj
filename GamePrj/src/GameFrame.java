import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;



public class GameFrame extends Frame implements WindowListener{
	
	public GameFrame() {
		addWindowListener(this);
		setVisible(true);
	} // 생성될 때 자기 자신에 있는 WindowListener 기능을 탑재시킨다? 굳이 새로운 클래스를 만들 필요가 없이?
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawRect(100, 200, 500, 400);
		
	}
	

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
	// 윈도우가 닫히기 전에 마무리할 것이 있으면.
		
		JOptionPane.showMessageDialog(this, "GoodBye"); // 창 구현 기준이 frame 가운데. null일 경우 바탕화면 가운데.
		System.exit(0); // 정상종료 시킨 것. 다른 값을 넣으면 이 종료가 에러라는 신호.
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
} 

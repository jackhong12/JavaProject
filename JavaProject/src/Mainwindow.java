import javax.swing.*;


public class Mainwindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int width= 1200, height= 800;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainwindow mainwindow= new Mainwindow();
		mainwindow.setVisible(true);
	}
	
	public Mainwindow() {		
		setTitle("Game");
		setSize(width, height);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawPicture.panel= new JPanel(null);
		DrawPicture.panel.setBounds(0, 0, width, height);
		add(DrawPicture.panel);
		//上面不用動
		
		//在下面new 新的物件
		DrawPicture obj2= new DrawPicture("red.jpg", 100, 100, 100, 100);
		DrawPicture obj3= new DrawPicture("red.jpg", 500, 500, 100, 100);
		
		
		obj3.setImgSize(500, 500);	//調大小
		obj2.setImgPosition(600, 0);	//調位置
	}
}

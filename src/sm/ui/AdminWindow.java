package sm.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class AdminWindow extends JFrame {
	LoginWindow loginWindow;
	public AdminWindow(String name,LoginWindow loginWindow) {
		this.loginWindow = loginWindow;
		Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
		// System.out.println(dm.getHeight());
		// System.out.println(dm.width);
		this.setSize(450, 450);// 尺寸
		this.setTitle("欢迎"+name);// 标题栏
		// win.setLocation(200, 100);//位置
		this.setLocationRelativeTo(null);// 窗体居于屏幕中央
		// win.setBounds(200, 100, 600, 400);
		this.setResizable(false);// 尺寸不可改变
		// 点击关闭时退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 标题部分
		
		//添加菜单条
		JMenuBar menubar = new JMenuBar();
		//添加菜单
		JMenu menu1 = new JMenu("首页");
		JMenu menu2 = new JMenu("信息查询");
		JMenu menu3 = new JMenu("信息修改");
		JMenu menu4 = new JMenu("添加用户");
		JMenu menu5 = new JMenu("帮助");
		//添加菜单项
		JMenuItem item11 = new JMenuItem("回到首页");
		JMenuItem item12 = new JMenuItem("注销");
		JMenuItem item21 = new JMenuItem("查询学生");
		JMenuItem item22 = new JMenuItem("查询教师");
		JMenuItem item31 = new JMenuItem("修改学生");
		JMenuItem item32 = new JMenuItem("修改教师");
		JMenuItem item41 = new JMenuItem("增加学生");
		JMenuItem item42 = new JMenuItem("增加教师");
		JMenuItem item51 = new JMenuItem("关于");
		
		menu1.add(item11);
		menu1.add(item12);
		menu2.add(item21);
		menu2.add(item22);
		menu3.add(item31);
		menu3.add(item32);
		menu4.add(item41);
		menu4.add(item42);
		menu5.add(item51);
		
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		menubar.add(menu4);
		menubar.add(menu5);
		//事件处理
		final AdminMenu11 adminMenu11 = new AdminMenu11();
		final AdminMenu21 adminMenu21 = new AdminMenu21();
		final AdminMenu22 adminMenu22 = new AdminMenu22();
		final AdminMenu31 adminMenu31 = new AdminMenu31();
		final AdminMenu32 adminMenu32 = new AdminMenu32(); 
		final AdminMenu41 adminMenu41 = new AdminMenu41();
		final AdminMenu42 adminMenu42 = new AdminMenu42();
		final AdminMenu51 adminMenu51 = new AdminMenu51();

		item11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AdminWindow.this.getContentPane().removeAll();
				AdminWindow.this.getContentPane().add(adminMenu11);
				AdminWindow.this.repaint();
				AdminWindow.this.setVisible(true);
			}
		});
		item12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AdminWindow.this.setVisible(false);
				loginWindow.passwordField.setText("");
				loginWindow.setVisible(true);
			}
			
		});
		item21.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AdminWindow.this.getContentPane().removeAll();
				AdminWindow.this.getContentPane().add(adminMenu21);
				AdminWindow.this.repaint();
				AdminWindow.this.setVisible(true);
			}
			
		});
		item22.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AdminWindow.this.getContentPane().removeAll();
				AdminWindow.this.getContentPane().add(adminMenu22);
				AdminWindow.this.repaint();
				AdminWindow.this.setVisible(true);
			}
			
		});
		
		item31.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AdminWindow.this.getContentPane().removeAll();
				AdminWindow.this.getContentPane().add(adminMenu31);
				AdminWindow.this.repaint();
				AdminWindow.this.setVisible(true);
			}
			
		});
		
		item32.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AdminWindow.this.getContentPane().removeAll();
				AdminWindow.this.getContentPane().add(adminMenu32);
				AdminWindow.this.repaint();
				AdminWindow.this.setVisible(true);
			}
			
		});
		
		item41.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AdminWindow.this.getContentPane().removeAll();
				AdminWindow.this.getContentPane().add(adminMenu41);
				AdminWindow.this.repaint();
				AdminWindow.this.setVisible(true);
			}
			
		});
		
		item42.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AdminWindow.this.getContentPane().removeAll();
				AdminWindow.this.getContentPane().add(adminMenu42);
				AdminWindow.this.repaint();
				AdminWindow.this.setVisible(true);
			}
			
		});
		
		item51.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AdminWindow.this.getContentPane().removeAll();
				AdminWindow.this.getContentPane().add(adminMenu51);
				AdminWindow.this.repaint();
				AdminWindow.this.setVisible(true);
			}
			
		});
		
		this.setJMenuBar(menubar);
		// 显示窗体
		this.setVisible(true);
		
		((JComponent) this.getContentPane()).setOpaque(false);   
		ImageIcon img = new ImageIcon  
		("D:\\1120.jpg");   
		JLabel background = new JLabel(img);  
		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));   
		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
	}
}

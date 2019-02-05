package sm.ui;

import java.awt.Dimension;
import java.awt.Font;
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

public class TeacherWindows extends JFrame {

	public TeacherWindows(String name,LoginWindow loginWindow) {
		Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
		// System.out.println(dm.getHeight());
		// System.out.println(dm.width);
		this.setSize(450, 450);// 尺寸
		this.setTitle("欢迎" + name);// 标题栏
		// win.setLocation(200, 100);//位置
		this.setLocationRelativeTo(null);// 窗体居于屏幕中央
		// win.setBounds(200, 100, 600, 400);
		this.setResizable(false);// 尺寸不可改变
		// 点击关闭时退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(null);// 空布局
		// 标题部分
		JLabel title = new JLabel();// 标签用于显示标题
		title.setText("欢迎使用老师管理系统");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(60, 30, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title);// 添加到窗体中

		// 显示窗体
		this.setVisible(true);
		
		
		JMenuBar menubar = new JMenuBar();
		//添加菜单
		JMenu menu1 = new JMenu("首页");
		JMenu menu2 = new JMenu("个人账户管理");
		JMenu menu3 = new JMenu("学生管理");
//		JMenu menu4 = new JMenu("添加用户");
		JMenu menu5 = new JMenu("帮助");
		//添加菜单项
		JMenuItem item11 = new JMenuItem("回到首页");
		JMenuItem item12 = new JMenuItem("注销");
		JMenuItem item21 = new JMenuItem("个人信息");
//		JMenuItem item22 = new JMenuItem("修改密码");
		JMenuItem item31 = new JMenuItem("修改学生");
		JMenuItem item32 = new JMenuItem("查询学生");
		JMenuItem item33 = new JMenuItem("增加学生");
//		JMenuItem item42 = new JMenuItem("增加教师");
		JMenuItem item51 = new JMenuItem("关于");
		
		menu1.add(item11);
		menu1.add(item12);
		menu2.add(item21);
//		menu2.add(item22);
		menu3.add(item31);
		menu3.add(item32);
//		menu4.add(item41);
//		menu4.add(item42);
		menu5.add(item51);
		
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
//		menubar.add(menu4);
		menubar.add(menu5);
		//事件处理
		final TeacherMenu11 teacherMenu11 = new TeacherMenu11();
		final TeacherMenu21 teacherMenu21 = new TeacherMenu21(name);
		final TeacherMenu22 teacherMenu22 = new TeacherMenu22();
		final TeacherMenu31 teacherMenu31 = new TeacherMenu31();
		final TeacherMenu32 teacherMenu32 = new TeacherMenu32();
		final TeacherMenu33 teacherMenu33 =  new TeacherMenu33();
		final TeacherMenu51 teacherMenu51 = new TeacherMenu51();

		item11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				TeacherWindows.this.getContentPane().removeAll();
				TeacherWindows.this.getContentPane().add(teacherMenu11);
				TeacherWindows.this.repaint();
				TeacherWindows.this.setVisible(true);
			}
		});
		item12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TeacherWindows.this.setVisible(false);
				loginWindow.passwordField.setText("");
				loginWindow.setVisible(true);
			}
			
		});
		item21.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TeacherWindows.this.getContentPane().removeAll();
				TeacherWindows.this.getContentPane().add(teacherMenu21);
				TeacherWindows.this.repaint();
				TeacherWindows.this.setVisible(true);
			}

		

			
		});
//		item22.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				TeacherWindows.this.getContentPane().removeAll();
//				TeacherWindows.this.getContentPane().add(teacherMenu22);
//				TeacherWindows.this.repaint();
//				TeacherWindows.this.setVisible(true);
//			}
//			
//		});
		
		item31.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TeacherWindows.this.getContentPane().removeAll();
				TeacherWindows.this.getContentPane().add(teacherMenu31);
				TeacherWindows.this.repaint();
				TeacherWindows.this.setVisible(true);
			}
			
		});
		
		item32.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TeacherWindows.this.getContentPane().removeAll();
				TeacherWindows.this.getContentPane().add(teacherMenu32);
				TeacherWindows.this.repaint();
				TeacherWindows.this.setVisible(true);
			}
			
		});
		
		item33.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TeacherWindows.this.getContentPane().removeAll();
				TeacherWindows.this.getContentPane().add(teacherMenu33);
				TeacherWindows.this.repaint();
				TeacherWindows.this.setVisible(true);
			}
			
		});
		
//		item42.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				TeacherWindows.this.getContentPane().removeAll();
//				TeacherWindows.this.getContentPane().add(teacherMenu42);
//				TeacherWindows.this.repaint();
//				TeacherWindows.this.setVisible(true);
//			}
//			
//		});
		
		item51.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TeacherWindows.this.getContentPane().removeAll();
				TeacherWindows.this.getContentPane().add(teacherMenu51);
				TeacherWindows.this.repaint();
				TeacherWindows.this.setVisible(true);
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

package sm.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import sm.dao.AdminDao;
import sm.dao.StudentDao;
import sm.dao.TeacherDao;

public class LoginWindow extends JFrame {
	JPasswordField passwordField;
	public LoginWindow() {
		Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
		// System.out.println(dm.getHeight());
		// System.out.println(dm.width);
		this.setSize(450, 450);// 尺寸
		this.setTitle("学生管理系统");// 标题栏
		// win.setLocation(200, 100);//位置
		this.setLocationRelativeTo(null);// 窗体居于屏幕中央
		// win.setBounds(200, 100, 600, 400);
		this.setResizable(false);// 尺寸不可改变
		// 点击关闭时退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);// 空布局
		this.setBackground(Color.green);
		// 标题部分
		JLabel title = new JLabel();// 标签用于显示标题
		title.setText("欢迎使用学生管理系统");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(60, 30, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title);// 添加到窗体中
		// 姓名标签
		JLabel nameLab = new JLabel();
		nameLab.setText("姓名");
		nameLab.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		nameLab.setBounds(120, 120, 50, 30);
		this.add(nameLab);
		// 姓名输入框
		JTextField nameField = new JTextField(10);
		nameField.setBounds(170, 120, 150, 30);
		this.add(nameField);
		// 密码标签
		JLabel passwordLab = new JLabel();
		passwordLab.setText("密码");
		passwordLab.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		passwordLab.setBounds(120, 160, 50, 30);
		this.add(passwordLab);
		
		
		
		// 用户类型下拉列表
		JComboBox<String> typeBox = new JComboBox<String>(new String[] { "学生", "教师", "管理员" });
		typeBox.setBounds(210, 200, 100, 30);
		this.add(typeBox);
		
		
		
		// 密码输入框
		passwordField = new JPasswordField(10);
		passwordField.setBounds(170, 160, 150, 30);
		passwordField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyChar() == KeyEvent.VK_ENTER )  
                {  
                    //可以写你的登入程序了  
                	String name = nameField.getText();
    				String password = passwordField.getText();
    				// null "" " "
    				if (null == name || null == password || name.equals("") || password.equals("")) {
    					JOptionPane.showMessageDialog(LoginWindow.this, "用户名或密码为空");
    				} else {
    					// 查询name password
    					Object ret = null;
    					switch (typeBox.getSelectedIndex()) {
    						case 0:
    							ret = StudentDao.selectByUserAndPassword(name, password);
    							break;
    						case 1:
    							ret = TeacherDao.selectByUserAndPassword(name, password);
    							break;
    						case 2:
    							ret = AdminDao.selectByUserAndPassword(name, password);
    							break;
    					}

    					// 根据需要使用返回值
    					if (null == ret) {
    						JOptionPane.showMessageDialog(LoginWindow.this, "用户名或密码错误");
    					} 
    					else {
    						LoginWindow.this.setVisible(false);
    						switch (typeBox.getSelectedIndex()) {
    							case 0:
    								new StudentWindow(name,LoginWindow.this);
    								break;
    							case 1:
    								new TeacherWindows(name,LoginWindow.this);
    								break;
    							case 2:	
    						    	new AdminWindow(name,LoginWindow.this);
    							    break;	
    						}
    					}
    				}
                }
			}
		}
		);
		this.add(passwordField);
		// 用户类型标签
		JLabel typeLab = new JLabel();
		typeLab.setText("用户类型");
		typeLab.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		typeLab.setBounds(140, 200, 80, 30);
		this.add(typeLab);

		// 登录按钮
		JButton loginButton = new JButton("登录");
		loginButton.setBounds(140, 250, 80, 30);
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String password = passwordField.getText();
				// null "" " "
				if (null == name || null == password || name.equals("") || password.equals("")) {
					JOptionPane.showMessageDialog(LoginWindow.this, "用户名或密码为空");
				} else {
					// 查询name password
					Object ret = null;
					switch (typeBox.getSelectedIndex()) {
						case 0:
							ret = StudentDao.selectByUserAndPassword(name, password);
							break;
						case 1:
							ret = TeacherDao.selectByUserAndPassword(name, password);
							break;
						case 2:
							ret = AdminDao.selectByUserAndPassword(name, password);
							break;
					}

					// 根据需要使用返回值
					if (null == ret) {
						JOptionPane.showMessageDialog(LoginWindow.this, "用户名或密码错误");
					} 
					else {
						LoginWindow.this.setVisible(false);
						switch (typeBox.getSelectedIndex()) {
							case 0:
								new StudentWindow(name,LoginWindow.this);
								break;
							case 1:
								new TeacherWindows(name, LoginWindow.this);
								break;
							case 2:	
						    	new AdminWindow(name,LoginWindow.this);
							    break;	
						}
					}
				}
			}
		});
		
		
/*		KeyListener key_Listener = new KeyListener()  
        {  
            public void keyTyped(KeyEvent e) {}  
            public void keyReleased(KeyEvent e){}  
            public void keyPressed(KeyEvent e){  
                if(e.getKeyChar() == KeyEvent.VK_ENTER )  
                {  
                    //可以写你的登入程序了  
                	String name = nameField.getText();
    				String password = passwordField.getText();
    				// null "" " "
    				if (null == name || null == password || name.equals("") || password.equals("")) {
    					JOptionPane.showMessageDialog(LoginWindow.this, "用户名或密码为空");
    				} else {
    					// 查询name password
    					Object ret = null;
    					switch (typeBox.getSelectedIndex()) {
    						case 0:
    							ret = StudentDao.selectByUserAndPassword(name, password);
    							break;
    						case 1:
    							ret = TeacherDao.selectByUserAndPassword(name, password);
    							break;
    						case 2:
    							ret = AdminDao.selectByUserAndPassword(name, password);
    							break;
    					}

    					// 根据需要使用返回值
    					if (null == ret) {
    						JOptionPane.showMessageDialog(LoginWindow.this, "用户名或密码错误");
    					} 
    					else {
    						LoginWindow.this.setVisible(false);
    						switch (typeBox.getSelectedIndex()) {
    							case 0:
    								new StudentWindow(name);
    								break;
    							case 1:
    								new TeacherWindows(name);
    								break;
    							case 2:	
    						    	new AdminWindow(name,LoginWindow.this);
    							    break;	
    						}
    					}
    				}
                }  
            }
			public void keyPressed1(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			public void keyReleased1(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			public void keyTyped1(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}  
        };  
          
        JTextField f1 = new JTextField(18);  
        JPasswordField f2 = new JPasswordField(18);  
          
        f1.addKeyListener(key_Listener);  
        f2.addKeyListener(key_Listener);  */
		
		((JComponent) this.getContentPane()).setOpaque(false);   
		ImageIcon img = new ImageIcon  
		("D:\\1120.jpg");   
		JLabel background = new JLabel(img);  
		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));   
		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());

        
        
        
		this.add(loginButton);
		// 取消按钮
		JButton cancelButton = new JButton("取消");
		cancelButton.setBounds(230, 250, 80, 30);
		this.add(cancelButton);
		// 显示窗体
		this.setVisible(true);
	}
}

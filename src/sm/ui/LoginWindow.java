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
		this.setSize(450, 450);// �ߴ�
		this.setTitle("ѧ������ϵͳ");// ������
		// win.setLocation(200, 100);//λ��
		this.setLocationRelativeTo(null);// ���������Ļ����
		// win.setBounds(200, 100, 600, 400);
		this.setResizable(false);// �ߴ粻�ɸı�
		// ����ر�ʱ�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);// �ղ���
		this.setBackground(Color.green);
		// ���ⲿ��
		JLabel title = new JLabel();// ��ǩ������ʾ����
		title.setText("��ӭʹ��ѧ������ϵͳ");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(60, 30, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title);// ��ӵ�������
		// ������ǩ
		JLabel nameLab = new JLabel();
		nameLab.setText("����");
		nameLab.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		nameLab.setBounds(120, 120, 50, 30);
		this.add(nameLab);
		// ���������
		JTextField nameField = new JTextField(10);
		nameField.setBounds(170, 120, 150, 30);
		this.add(nameField);
		// �����ǩ
		JLabel passwordLab = new JLabel();
		passwordLab.setText("����");
		passwordLab.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		passwordLab.setBounds(120, 160, 50, 30);
		this.add(passwordLab);
		
		
		
		// �û����������б�
		JComboBox<String> typeBox = new JComboBox<String>(new String[] { "ѧ��", "��ʦ", "����Ա" });
		typeBox.setBounds(210, 200, 100, 30);
		this.add(typeBox);
		
		
		
		// ���������
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
                    //����д��ĵ��������  
                	String name = nameField.getText();
    				String password = passwordField.getText();
    				// null "" " "
    				if (null == name || null == password || name.equals("") || password.equals("")) {
    					JOptionPane.showMessageDialog(LoginWindow.this, "�û���������Ϊ��");
    				} else {
    					// ��ѯname password
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

    					// ������Ҫʹ�÷���ֵ
    					if (null == ret) {
    						JOptionPane.showMessageDialog(LoginWindow.this, "�û������������");
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
		// �û����ͱ�ǩ
		JLabel typeLab = new JLabel();
		typeLab.setText("�û�����");
		typeLab.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		typeLab.setBounds(140, 200, 80, 30);
		this.add(typeLab);

		// ��¼��ť
		JButton loginButton = new JButton("��¼");
		loginButton.setBounds(140, 250, 80, 30);
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String password = passwordField.getText();
				// null "" " "
				if (null == name || null == password || name.equals("") || password.equals("")) {
					JOptionPane.showMessageDialog(LoginWindow.this, "�û���������Ϊ��");
				} else {
					// ��ѯname password
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

					// ������Ҫʹ�÷���ֵ
					if (null == ret) {
						JOptionPane.showMessageDialog(LoginWindow.this, "�û������������");
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
                    //����д��ĵ��������  
                	String name = nameField.getText();
    				String password = passwordField.getText();
    				// null "" " "
    				if (null == name || null == password || name.equals("") || password.equals("")) {
    					JOptionPane.showMessageDialog(LoginWindow.this, "�û���������Ϊ��");
    				} else {
    					// ��ѯname password
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

    					// ������Ҫʹ�÷���ֵ
    					if (null == ret) {
    						JOptionPane.showMessageDialog(LoginWindow.this, "�û������������");
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
		// ȡ����ť
		JButton cancelButton = new JButton("ȡ��");
		cancelButton.setBounds(230, 250, 80, 30);
		this.add(cancelButton);
		// ��ʾ����
		this.setVisible(true);
	}
}

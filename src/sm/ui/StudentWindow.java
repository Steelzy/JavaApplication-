package sm.ui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import sm.dao.AdminDao;
import sm.dao.StudentDao;
import sm.dao.TeacherDao;

public class StudentWindow extends JFrame {
	LoginWindow loginWindow;
	public StudentWindow(String name,LoginWindow loginWindow) {
		this.loginWindow=loginWindow;
		Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
		// System.out.println(dm.getHeight());
		// System.out.println(dm.width);
		this.setSize(450, 450);// �ߴ�
		this.setTitle("��ӭ"+name);// ������
		// win.setLocation(200, 100);//λ��
		this.setLocationRelativeTo(null);// ���������Ļ����
		// win.setBounds(200, 100, 600, 400);
		this.setResizable(false);// �ߴ粻�ɸı�
		// ����ر�ʱ�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(null);// �ղ���
		// ���ⲿ��
		JLabel title = new JLabel();// ��ǩ������ʾ����
		title.setText("��ӭʹ��ѧ������ϵͳ");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(60, 30, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title);// ��ӵ�������
		
		// ��ʾ����
		this.setVisible(true);
		
		
		//��Ӳ˵���
				JMenuBar menubar = new JMenuBar();
				//��Ӳ˵�
				JMenu menu1 = new JMenu("��ҳ");
				JMenu menu2 = new JMenu("������Ϣ");
				JMenu menu3 = new JMenu("�ɼ���ѯ");

				//��Ӳ˵���
				JMenuItem item11 = new JMenuItem("ע��");
				JMenuItem item12 = new JMenuItem("�ص���ҳ");
				JMenuItem item21 = new JMenuItem("������Ϣ");
				JMenuItem item22 = new JMenuItem("�޸�����");
				JMenuItem item31 = new JMenuItem("�ɼ���ѯ");
				
				menu1.add(item12);
				menu1.add(item11);
				menu2.add(item21);
				menu2.add(item22);
				menu3.add(item31);

				
				menubar.add(menu1);
				menubar.add(menu2);
				menubar.add(menu3);
				
				final AdminMenuS12 adminMenuS12 = new AdminMenuS12();
				final AdminMenuS21 adminMenuS21 = new AdminMenuS21(name);
				final AdminMenuS22 adminMenuS22 = new AdminMenuS22(name);
				final AdminMenuS31 adminMenuS31 = new AdminMenuS31(name);
				item12.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						StudentWindow.this.getContentPane().removeAll();
						StudentWindow.this.getContentPane().add(adminMenuS12);
						
						StudentWindow.this.repaint();
						StudentWindow.this.setVisible(true);
					}
				});
				
				item11.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						StudentWindow.this.setVisible(false);
						loginWindow.passwordField.setText("");
						loginWindow.setVisible(true);
					}
				});

				item21.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						StudentWindow.this.getContentPane().removeAll();
						StudentWindow.this.getContentPane().add(adminMenuS21);
						StudentWindow.this.repaint();
						StudentWindow.this.setVisible(true);
					}
				});
				item22.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						StudentWindow.this.getContentPane().removeAll();
						StudentWindow.this.getContentPane().add(adminMenuS22);
						StudentWindow.this.repaint();
						StudentWindow.this.setVisible(true);
					}
					
				});
				
				item31.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						StudentWindow.this.getContentPane().removeAll();
						StudentWindow.this.getContentPane().add(adminMenuS31);
						StudentWindow.this.repaint();
						StudentWindow.this.setVisible(true);
					}
				});
				
				this.setJMenuBar(menubar);
				this.setVisible(true);
				
				((JComponent) this.getContentPane()).setOpaque(false);   
				ImageIcon img = new ImageIcon  
				("D:\\1120.jpg");   
				JLabel background = new JLabel(img);  
				this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));   
				background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
			}
	}

	

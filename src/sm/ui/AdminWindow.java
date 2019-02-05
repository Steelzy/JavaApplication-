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
		this.setSize(450, 450);// �ߴ�
		this.setTitle("��ӭ"+name);// ������
		// win.setLocation(200, 100);//λ��
		this.setLocationRelativeTo(null);// ���������Ļ����
		// win.setBounds(200, 100, 600, 400);
		this.setResizable(false);// �ߴ粻�ɸı�
		// ����ر�ʱ�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ⲿ��
		
		//��Ӳ˵���
		JMenuBar menubar = new JMenuBar();
		//��Ӳ˵�
		JMenu menu1 = new JMenu("��ҳ");
		JMenu menu2 = new JMenu("��Ϣ��ѯ");
		JMenu menu3 = new JMenu("��Ϣ�޸�");
		JMenu menu4 = new JMenu("����û�");
		JMenu menu5 = new JMenu("����");
		//��Ӳ˵���
		JMenuItem item11 = new JMenuItem("�ص���ҳ");
		JMenuItem item12 = new JMenuItem("ע��");
		JMenuItem item21 = new JMenuItem("��ѯѧ��");
		JMenuItem item22 = new JMenuItem("��ѯ��ʦ");
		JMenuItem item31 = new JMenuItem("�޸�ѧ��");
		JMenuItem item32 = new JMenuItem("�޸Ľ�ʦ");
		JMenuItem item41 = new JMenuItem("����ѧ��");
		JMenuItem item42 = new JMenuItem("���ӽ�ʦ");
		JMenuItem item51 = new JMenuItem("����");
		
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
		//�¼�����
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
		// ��ʾ����
		this.setVisible(true);
		
		((JComponent) this.getContentPane()).setOpaque(false);   
		ImageIcon img = new ImageIcon  
		("D:\\1120.jpg");   
		JLabel background = new JLabel(img);  
		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));   
		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
	}
}

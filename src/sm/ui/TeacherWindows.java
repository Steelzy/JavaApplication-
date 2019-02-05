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
		this.setSize(450, 450);// �ߴ�
		this.setTitle("��ӭ" + name);// ������
		// win.setLocation(200, 100);//λ��
		this.setLocationRelativeTo(null);// ���������Ļ����
		// win.setBounds(200, 100, 600, 400);
		this.setResizable(false);// �ߴ粻�ɸı�
		// ����ر�ʱ�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(null);// �ղ���
		// ���ⲿ��
		JLabel title = new JLabel();// ��ǩ������ʾ����
		title.setText("��ӭʹ����ʦ����ϵͳ");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(60, 30, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title);// ��ӵ�������

		// ��ʾ����
		this.setVisible(true);
		
		
		JMenuBar menubar = new JMenuBar();
		//��Ӳ˵�
		JMenu menu1 = new JMenu("��ҳ");
		JMenu menu2 = new JMenu("�����˻�����");
		JMenu menu3 = new JMenu("ѧ������");
//		JMenu menu4 = new JMenu("����û�");
		JMenu menu5 = new JMenu("����");
		//��Ӳ˵���
		JMenuItem item11 = new JMenuItem("�ص���ҳ");
		JMenuItem item12 = new JMenuItem("ע��");
		JMenuItem item21 = new JMenuItem("������Ϣ");
//		JMenuItem item22 = new JMenuItem("�޸�����");
		JMenuItem item31 = new JMenuItem("�޸�ѧ��");
		JMenuItem item32 = new JMenuItem("��ѯѧ��");
		JMenuItem item33 = new JMenuItem("����ѧ��");
//		JMenuItem item42 = new JMenuItem("���ӽ�ʦ");
		JMenuItem item51 = new JMenuItem("����");
		
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
		//�¼�����
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

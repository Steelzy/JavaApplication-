package sm.ui;

import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sm.dao.StudentDao;
import sm.po.Student;

public class AdminMenuS21 extends JPanel{
	public AdminMenuS21(String name) {	
		this.setLayout(null);
		Student stu = StudentDao.selectByName(name);

		JLabel title = new JLabel();// ��ǩ������ʾ����
		title.setText("������Ϣ��");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(150, 30, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title);// ��ӵ�������
		
		JLabel title2 = new JLabel();// ��ǩ������ʾ����
		title2.setText("������");
		title2.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title2.setBounds(90, 100, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title2);// ��ӵ�������
		
		JLabel title3 = new JLabel();// ��ǩ������ʾ����
		title3.setText("ѧ�ţ�");
		title3.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title3.setBounds(90, 150, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title3);// ��ӵ�������
		
		JLabel title4 = new JLabel();// ��ǩ������ʾ����
		title4.setText("רҵ��");
		title4.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title4.setBounds(90, 200, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title4);// ��ӵ�������
		
		JLabel title5 = new JLabel();// ��ǩ������ʾ����
		title5.setText("�༶��");
		title5.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title5.setBounds(90, 250, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title5);// ��ӵ�������
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(150, 105, 180, 30);
		tf1.setEditable(false);
		tf1.setText(name);
		this.add(tf1);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(150, 155, 180, 30);
		tf2.setText(stu.getNo());
		tf2.setEditable(false);
		this.add(tf2);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(150, 205, 180, 30);
		tf3.setText(stu.getMajor());
		tf3.setEditable(false);
		this.add(tf3);
		
		JTextField tf4 = new JTextField();
		tf4.setBounds(150, 255, 180, 30);
		tf4.setText(stu.getClazz());
		tf4.setEditable(false);
		this.add(tf4);
		
		
	}
}

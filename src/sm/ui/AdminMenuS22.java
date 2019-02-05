package sm.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import sm.dao.AdminDao;
import sm.dao.StudentDao;
import sm.dao.TeacherDao;
import sm.po.Student;

public class AdminMenuS22 extends JPanel{
	public AdminMenuS22(String name) {
		this.setLayout(null);
		JLabel title = new JLabel();// ��ǩ������ʾ����
		title.setText("�޸�����");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(150, 30, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title);// ��ӵ�������
		
		JLabel title2 = new JLabel();// ��ǩ������ʾ����
		title2.setText("ԭ���룺");
		title2.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title2.setBounds(90, 100, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title2);// ��ӵ�������
		
		JLabel title3 = new JLabel();// ��ǩ������ʾ����
		title3.setText("�����룺");
		title3.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title3.setBounds(90, 150, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title3);// ��ӵ�������
		
		JLabel title4 = new JLabel();// ��ǩ������ʾ����
		title4.setText("ȷ�����룺");
		title4.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title4.setBounds(90, 200, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title4);// ��ӵ�������
		
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(170, 105, 160, 30);
		this.add(tf1);
		
		JPasswordField  tf2 = new JPasswordField();
		tf2.setBounds(170, 155, 160, 30);
		this.add(tf2);
		
		JPasswordField  tf3 = new JPasswordField();
		tf3.setBounds(170, 205, 160, 30);
		this.add(tf3);
		
		JButton jb=new JButton();
		jb.setText("ȷ��");
		jb.setBounds(100, 280, 100, 35);
		this.add(jb);
		
		JButton jb1=new JButton();
		jb1.setText("ȡ��");
		jb1.setBounds(245, 280, 100, 35);
		this.add(jb1);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String oldpassword = tf1.getText();
				String newpassword1 = tf2.getText();
				String newpassword2 = tf3.getText();
				if (null == tf1 || null == tf2 || null==tf3 || tf1.equals("") || tf2.equals("") || tf3.equals("")) {
					//JOptionPane.showMessageDialog(StudentWindow.this, "�û���������Ϊ��");
					JOptionPane.showMessageDialog(null, "����Ϊ��");
				} else {
					// ��ѯname password
					Student stu = StudentDao.selectByName(name);
					if(!newpassword1.equals(newpassword2)) {
						JOptionPane.showMessageDialog(null, "�������벻һ��");
						tf3.setText("");
					}else if(!stu.getPassword().equals(oldpassword)){
						JOptionPane.showMessageDialog(null, "ԭ�������");
						tf1.setText("");
					}else {
						StudentDao.updatepassword(stu,newpassword2);
						JOptionPane.showMessageDialog(null, "�޸ĳɹ�");
					}
				}
			}			
		});
	}
}

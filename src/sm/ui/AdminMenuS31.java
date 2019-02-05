package sm.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import sm.dao.StudentDao;
import sm.dao.TeacherDao;
import sm.po.Student;
import sm.po.Teacher;

public class AdminMenuS31 extends JPanel{
	public AdminMenuS31(String name) {
		
		this.setLayout(null);
		JLabel title = new JLabel();// ��ǩ������ʾ����
		title.setText("�ɼ���Ϣ");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(150, 30, 350, 50);// ���óߴ���ڴ����е�λ��
		this.add(title);// ��ӵ�������

		JLabel title1 = new JLabel();// ��ǩ������ʾ����
		title1.setText("��ѯ���ͣ�");
		title1.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title1.setBounds(40, 300, 100, 50);// ���óߴ���ڴ����е�λ��
		this.add(title1);// ��ӵ�������

		JRadioButton rb1 = new JRadioButton("����");
		rb1.setBounds(130, 300, 60, 50);
		this.add(rb1);

		JRadioButton rb2 = new JRadioButton("��ѧ");
		rb2.setBounds(190, 300, 60, 50);
		this.add(rb2);

		JRadioButton rb3 = new JRadioButton("Ӣ��");
		rb3.setBounds(250, 300, 60, 50);
		this.add(rb3);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		rb1.setSelected(true);

		JButton jb=new JButton();
		jb.setText("��ѯ");
		jb.setBounds(320, 305, 60, 35);
		this.add(jb);
		
		JLabel title2 = new JLabel();// ��ǩ������ʾ����
		title2.setText("�γ̳ɼ���");
		title2.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title2.setBounds(80, 100, 100, 50);// ���óߴ���ڴ����е�λ��
		this.add(title2);// ��ӵ�������
		
		JLabel title3 = new JLabel();// ��ǩ������ʾ����
		title3.setText("�༶������");
		title3.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title3.setBounds(80, 150, 100, 50);// ���óߴ���ڴ����е�λ��
		this.add(title3);// ��ӵ�������
		
		JLabel title4 = new JLabel();// ��ǩ������ʾ����
		title4.setText("�꼶������");
		title4.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title4.setBounds(80, 200, 100, 50);// ���óߴ���ڴ����е�λ��
		this.add(title4);// ��ӵ�������
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(180, 105, 180, 30);
		this.add(tf1);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(180, 155, 180, 30);
		this.add(tf2);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(180, 205, 180, 30);
		this.add(tf3);
		
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//String text = tf.getText();
				if (rb1.isSelected()) {
					// ���ݱ�Ų�ѯ��ʦ��Ϣ
					Student stu1 = StudentDao.selectByName(name);
					// ����jtable�е�����Ϊ��ѯ������ʦ��Ϣ					
					if (null != stu1) {
						tf1.setText(stu1.getChinese()+"");
						tf2.setText(1+"");
						tf3.setText(1+"");
					}else{
						//
					}

				}
				if (rb2.isSelected()) {
					// ����������ѯѧ����Ϣ
					Student stu2 = StudentDao.selectByName(name);
					// ����jtable�е�����Ϊ��ѯ������ʦ��Ϣ					
					if (null != stu2) {
						tf1.setText(stu2.getMath()+"");
						tf2.setText(3+"");
						tf3.setText(5+"");
					}else{
						//
					}
				}
				if (rb3.isSelected()) {
					// ���ݰ༶��ѯ��ʦ��Ϣ
					Student stu3 = StudentDao.selectByName(name);
					// ����jtable�е�����Ϊ��ѯ������ʦ��Ϣ					
					if (null != stu3) {
						tf1.setText(stu3.getEnglish()+"");
						tf2.setText(2+"");
						tf3.setText(3+"");
					}else{
						//
					}
				}
			}
		});
	}
}

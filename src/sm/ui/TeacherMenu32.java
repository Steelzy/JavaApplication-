package sm.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import sm.dao.StudentDao;
import sm.po.Student;

public class TeacherMenu32 extends JPanel {

	public TeacherMenu32() {
		this.setLayout(null);
		List<Student> list = StudentDao.selectAll();
		Object[] col = new Object[] { "ѧ��", "����", "�༶", "רҵ", "����", "��ѧ", "Ӣ��" };
		Object[][] data = new Object[list.size()][col.length];
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			data[i][0] = stu.getNo();
			data[i][1] = stu.getName();
			data[i][2] = stu.getClazz();
			data[i][3] = stu.getMajor();
			data[i][4] = stu.getChinese();
			data[i][5] = stu.getMath();
			data[i][6] = stu.getEnglish();
		}
		DefaultTableModel dtm = new DefaultTableModel(data, col);
		JTable jt = new JTable(dtm);
		jt.setBounds(0, 0, 450, 100);
		JScrollPane js = new JScrollPane(jt);
		js.setBounds(0, 0, 450, 100);
		this.add(js);
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 120, 200, 30);
		this.add(tf);

		JButton jb = new JButton("��ѯ");
		jb.setBounds(270, 120, 100, 30);
		this.add(jb);

		JRadioButton rb1 = new JRadioButton("ѧ��");
		rb1.setBounds(70, 170, 80, 50);
		this.add(rb1);

		JRadioButton rb2 = new JRadioButton("����");
		rb2.setBounds(150, 170, 80, 50);
		this.add(rb2);

		JRadioButton rb3 = new JRadioButton("�༶");
		rb3.setBounds(230, 170, 80, 50);
		this.add(rb3);

		JRadioButton rb4 = new JRadioButton("����");
		rb4.setBounds(310, 170, 80, 50);
		this.add(rb4);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);

		rb1.setSelected(true);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = tf.getText();
				if (rb1.isSelected()) {
					// ����ѧ�Ų�ѯѧ����Ϣ
					Student stu = StudentDao.selectByNo(text);
					// ����jtable�е�����Ϊ��ѯ����ѧ����Ϣ
					DefaultTableModel dtm = null;
					if (null != stu) {
						Object[][] data = new Object[1][col.length];
						data[0][0] = stu.getNo();
						data[0][1] = stu.getName();
						data[0][2] = stu.getClazz();
						data[0][3] = stu.getMajor();
						data[0][4] = stu.getChinese();
						data[0][5] = stu.getMath();
						data[0][6] = stu.getEnglish();
						dtm = new DefaultTableModel(data, col);
					}else{
						dtm = new DefaultTableModel(null, col);
					}
					jt.setModel(dtm);
				}
				if (rb2.isSelected()) {
					// ����������ѯѧ����Ϣ
					Student stu = StudentDao.selectByName(text);
					// ����jtable�е�����Ϊ��ѯ����ѧ����Ϣ
					DefaultTableModel dtm = null;
					if (null != stu) {
						Object[][] data = new Object[1][col.length];
						data[0][0] = stu.getNo();
						data[0][1] = stu.getName();
						data[0][2] = stu.getClazz();
						data[0][3] = stu.getMajor();
						data[0][4] = stu.getChinese();
						data[0][5] = stu.getMath();
						data[0][6] = stu.getEnglish();
						dtm = new DefaultTableModel(data, col);
					}else{
						dtm = new DefaultTableModel(null, col);
					}
					jt.setModel(dtm);
				}
				if (rb3.isSelected()) {
					// ���ݰ༶��ѯѧ����Ϣ
					List<Student> list = StudentDao.selectByClass(text);
					// ����jtable�е�����Ϊ��ѯ����ѧ����Ϣ
					Object[][] data = new Object[list.size()][col.length];
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						data[i][0] = stu.getNo();
						data[i][1] = stu.getName();
						data[i][2] = stu.getClazz();
						data[i][3] = stu.getMajor();
						data[i][4] = stu.getChinese();
						data[i][5] = stu.getMath();
						data[i][6] = stu.getEnglish();
					}
					DefaultTableModel dtm = new DefaultTableModel(data, col);
					jt.setModel(dtm);
				}
				if (rb4.isSelected()) {
					// ��ѯ����ѧ����Ϣ
					List<Student> list = StudentDao.selectAll();
					// ����jtable�е�����Ϊ��ѯ����ѧ����Ϣ
					Object[][] data = new Object[list.size()][col.length];
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						data[i][0] = stu.getNo();
						data[i][1] = stu.getName();
						data[i][2] = stu.getClazz();
						data[i][3] = stu.getMajor();
						data[i][4] = stu.getChinese();
						data[i][5] = stu.getMath();
						data[i][6] = stu.getEnglish();
					}
					DefaultTableModel dtm = new DefaultTableModel(data, col);
					jt.setModel(dtm);
				}
				
			}
		});
	}
}

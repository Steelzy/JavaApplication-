package sm.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import sm.dao.StudentDao;
import sm.po.Student;

public class TeacherMenu31 extends JPanel {

	public TeacherMenu31() {
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
		

		JTextField tf1 = new JTextField();
		tf1.setEditable(false);
		tf1.setBounds(0, 120, 60, 30);
		this.add(tf1);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(63, 120, 60, 30);
		this.add(tf2);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(126, 120, 60, 30);
		this.add(tf3);
		
		JTextField tf4 = new JTextField();
		tf4.setBounds(188, 120, 60, 30);
		this.add(tf4);
		
		JTextField tf5 = new JTextField();
		tf5.setBounds(250, 120, 60, 30);
		this.add(tf5);
		
		JTextField tf6 = new JTextField();
		tf6.setBounds(312, 120, 60, 30);
		this.add(tf6);
		
		JTextField tf7 = new JTextField();
		tf7.setBounds(373, 120, 60, 30);
		this.add(tf7);
		
		jt.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				int row = jt.getSelectedRow();
				TableModel tm = jt.getModel();
				
				tf1.setText(tm.getValueAt(row, 0).toString());
				tf2.setText(tm.getValueAt(row, 1).toString());
				tf3.setText(tm.getValueAt(row, 2).toString());
				tf4.setText(tm.getValueAt(row, 3).toString());
				tf5.setText(tm.getValueAt(row, 4).toString());
				tf6.setText(tm.getValueAt(row, 5).toString());
				tf7.setText(tm.getValueAt(row, 6).toString());
			}
		});

		JButton jb = new JButton("����");
		jb.setBounds(180, 160, 100, 30);
		this.add(jb);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String no = tf1.getText();
				String name = tf2.getText();
				String clazz = tf3.getText();
				String major = tf4.getText();
				String chinese = tf5.getText();
				String math = tf6.getText();
				String english = tf7.getText();
				
				//���µ����ݿ�
				Student stu=new Student();
				stu.setNo(no);
				stu.setName(name);
				stu.setClazz(clazz);
				stu.setMajor(major);
				stu.setMath(Integer.parseInt(math));
				stu.setChinese(Integer.parseInt(chinese));
				stu.setEnglish(Integer.parseInt(english));
				StudentDao.updateByNo(stu);
				//ˢ�½���
				
				
				// ��ѯ����ѧ����Ϣ
				List<Student> list = StudentDao.selectAll();
				// ����jtable�е�����Ϊ��ѯ����ѧ����Ϣ
				Object[][] data = new Object[list.size()][col.length];
				for (int i = 0; i < list.size(); i++) {
					Student s = list.get(i);
					data[i][0] = s.getNo();
					data[i][1] = s.getName();
					data[i][2] = s.getClazz();
					data[i][3] = s.getMajor();
					data[i][4] = s.getChinese();
					data[i][5] = s.getMath();
					data[i][6] = s.getEnglish();
				}
				DefaultTableModel dtm = new DefaultTableModel(data, col);
				jt.setModel(dtm);
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf7.setText("");
			}
		});
		
		
		
		
	}
}

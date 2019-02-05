package sm.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import sm.dao.StudentDao;
import sm.dao.TeacherDao;
import sm.po.Student;
import sm.po.Teacher;

public class AdminMenu32 extends JPanel {
	public AdminMenu32() {
		this.setLayout(null);
		List<Teacher> list = TeacherDao.selectAll();
		Object[] col = new Object[] { "教师编号", "用户名", "密码","所教学科" , "班级"};
		Object[][] data = new Object[list.size()][col.length];
		for (int i = 0; i < list.size(); i++) {
			Teacher stu = list.get(i);
			data[i][0] = stu.getTec_no();
			data[i][1] = stu.getTec_name();
			data[i][2] = stu.getTec_password();
			data[i][3] = stu.getTec_course();
			data[i][4] = stu.getTec_class();
			
		}
		DefaultTableModel dtm = new DefaultTableModel(data, col);
		JTable jt = new JTable(dtm);
		jt.setBounds(0, 0, 450, 100);
		JScrollPane js = new JScrollPane(jt);
		js.setBounds(0, 0, 450, 100);
		this.add(js);
		

		JTextField tf1 = new JTextField();
		tf1.setEditable(false);
		tf1.setBounds(0, 110, 85, 30);
		this.add(tf1);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(86, 110,92, 30);
		this.add(tf2);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(178, 110, 90, 30);
		this.add(tf3);
		
		JTextField tf4 = new JTextField();
		tf4.setBounds(268, 110, 93, 30);
		this.add(tf4);
		
		JTextField tf5 = new JTextField();
		tf5.setBounds(361, 110, 80, 30);
		this.add(tf5);
		
//		JTextField tf6 = new JTextField();
//		tf6.setBounds(312, 120, 60, 30);
//		this.add(tf6);
//		
//		JTextField tf7 = new JTextField();
//		tf7.setBounds(373, 120, 60, 30);
//		this.add(tf7);
		
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
			}
		});

		JButton jb = new JButton("保存");
		jb.setBounds(180, 160, 100, 30);
		this.add(jb);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String no = tf1.getText();
				String name = tf2.getText();
				String password = tf3.getText();
				String clazz = tf4.getText();
				String major = tf5.getText();
				
				//更新到数据库
				Teacher tea=new Teacher(no, name, password, major, clazz);
				tea.setTec_no(no);
				tea.setTec_name(name);
				tea.setTec_password(password);
				tea.setTec_course(major);
				tea.setTec_class(clazz);
				TeacherDao.updateByNo(tea);
				//刷新界面
				
				
				// 查询所有学生信息
				List<Teacher> list = TeacherDao.selectAll();
				// 更新jtable中的内容为查询到的学生信息
				Object[][] data = new Object[list.size()][col.length];
				for (int i = 0; i < list.size(); i++) {
					Teacher t = list.get(i);
					data[i][0] = t.getTec_no();
					data[i][1] = t.getTec_name();
					data[i][2] = t.getTec_password();
					data[i][3] = t.getTec_course();
					data[i][4] = t.getTec_class();

				}
				DefaultTableModel dtm = new DefaultTableModel(data, col);
				jt.setModel(dtm);
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
			}
		});
		

		

		
	}
}

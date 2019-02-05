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
import sm.po.Student;

public class AdminMenu41 extends JPanel{
	public AdminMenu41() {
		this.setLayout(null);
		List<Student> list = StudentDao.selectAll();
		Object[] col = new Object[] { "学号", "姓名", "密码","班级", "专业", "语文", "数学", "英语" };
		Object[][] data = new Object[list.size()][col.length];
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			data[i][0] = stu.getNo();
			data[i][1] = stu.getName();
			data[i][2] = stu.getPassword();
			data[i][3] = stu.getClazz();
			data[i][4] = stu.getMajor();
			data[i][5] = stu.getChinese();
			data[i][6] = stu.getMath();
			data[i][7] = stu.getEnglish();
		}
		DefaultTableModel dtm = new DefaultTableModel(data, col);
		JTable jt = new JTable(dtm);
		jt.setBounds(0, 0, 450, 100);
		JScrollPane js = new JScrollPane(jt);
		js.setBounds(0, 0, 450, 100);
		this.add(js);
		

		JTextField tf1 = new JTextField();
//		tf1.setEditable(false);
		tf1.setBounds(0, 120, 55, 30);
		this.add(tf1);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(56, 120, 50, 30);
		this.add(tf2);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(106, 120, 60, 30);
		this.add(tf3);
		
		JTextField tf4 = new JTextField();
		tf4.setBounds(166, 120, 50, 30);
		this.add(tf4);
		
		JTextField tf5 = new JTextField();
		tf5.setBounds(216, 120, 50, 30);
		this.add(tf5);
		
		JTextField tf6 = new JTextField();
		tf6.setBounds(266, 120, 60, 30);
		this.add(tf6);
		
		JTextField tf7 = new JTextField();
		tf7.setBounds(326, 120, 50, 30);
		this.add(tf7);
		
		JTextField tf8 = new JTextField();
		tf8.setBounds(376, 120, 50, 30);
		this.add(tf8);
		
//		jt.addMouseListener(new MouseListener() {
//			public void mouseReleased(MouseEvent e) {}
//			public void mousePressed(MouseEvent e) {}
//			public void mouseExited(MouseEvent e) {}
//			public void mouseEntered(MouseEvent e) {}
//			public void mouseClicked(MouseEvent e) {
//				int row = jt.getSelectedRow();
//				TableModel tm = jt.getModel();
//				
//				tf1.setText(tm.getValueAt(row, 0).toString());
//				tf2.setText(tm.getValueAt(row, 1).toString());
//				tf3.setText(tm.getValueAt(row, 2).toString());
//				tf4.setText(tm.getValueAt(row, 3).toString());
//				tf5.setText(tm.getValueAt(row, 4).toString());
//				tf6.setText(tm.getValueAt(row, 5).toString());
//				tf7.setText(tm.getValueAt(row, 6).toString());
//			}
//		});

		JButton jb = new JButton("保存");
		jb.setBounds(180, 160, 100, 30);
		this.add(jb);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String no = tf1.getText();
				String name = tf2.getText();
				String pass=tf3.getText();
				String clazz = tf4.getText();
				String major = tf5.getText();
				String chinese = tf6.getText();
				String math = tf7.getText();
				String english = tf8.getText();
				
				//更新到数据库
				Student stu=new Student();
				stu.setNo(no);
				stu.setName(name);
				stu.setPassword(pass);
				stu.setClazz(clazz);
				stu.setMajor(major);
				stu.setMath(Integer.parseInt(math));
				stu.setChinese(Integer.parseInt(chinese));
				stu.setEnglish(Integer.parseInt(english));
				StudentDao.saveStu(stu);
				//刷新界面
				
				
				// 查询所有学生信息
				List<Student> list = StudentDao.selectAll();
				// 更新jtable中的内容为查询到的学生信息
				Object[][] data = new Object[list.size()][col.length];
				for (int i = 0; i < list.size(); i++) {
					Student s = list.get(i);
					data[i][0] = s.getNo();
					data[i][1] = s.getName();
					data[i][2] = s.getPassword();
					data[i][3] = s.getClazz();
					data[i][4] = s.getMajor();
					data[i][5] = s.getChinese();
					data[i][6] = s.getMath();
					data[i][7] = s.getEnglish();
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
				tf8.setText("");
			}
		});
		

		

		
	}
}

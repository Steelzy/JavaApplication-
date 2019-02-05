package sm.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import sm.dao.StudentDao;
import sm.dao.TeacherDao;
import sm.po.Student;
import sm.po.Teacher;

public class TeacherMenu21  extends JPanel{

	TeacherWindows teacherWindows;
	public TeacherMenu21(String name) {
		
		this.setLayout(null);
		JLabel jl = new JLabel();
		jl.setBounds(150,10,106,106);
		jl.setText("个人信息");
		jl.setFont(new Font("华文行楷", 1, 25));
		jl.setForeground(Color.BLUE);
		this.add(jl);
		
		
		
		
		JLabel jl1 = new JLabel();
		jl1.setBounds(90, 45, 100, 100);
		jl1.setText("工号");
		this.add(jl1);
		JTextField jt1=new JTextField();
		jt1.setBounds(195, 80, 100, 30);
		jt1.setEditable(false);
		this.add(jt1);
		
		
		JLabel jl2 = new JLabel();
		jl2.setBounds(90, 100, 100, 100);
		jl2.setText("姓名");
		this.add(jl2);
		JTextField jt2=new JTextField();
//		jt2.setText(name);
		jt2.setBounds(195, 130, 100, 30);
		this.add(jt2);
		
		JLabel jl3 = new JLabel();
		jl3.setBounds(90, 150, 100, 100);
		jl3.setText("密码");
		this.add(jl3);
		JTextField jt3=new JTextField();
		jt3.setBounds(195, 180, 100, 30);
		this.add(jt3);
		
		JLabel jl4 = new JLabel();
		jl4.setBounds(90, 200, 100, 100);
		jl4.setText("学科");
		this.add(jl4);
		JTextField jt4=new JTextField();
		jt4.setBounds(195, 230, 100, 30);
		jt4.setEditable(false);
		this.add(jt4);
		
		JLabel jl5 = new JLabel();
		jl5.setBounds(90, 250, 100, 100);
		jl5.setText("班级");
		this.add(jl5);
		JTextField jt5=new JTextField();
		jt5.setBounds(195, 280, 100, 30);
		jt5.setEditable(false);
		this.add(jt5);
		
		List<Teacher> list = TeacherDao.selectTeacher(name);
		Teacher tea=list.get(0);
		jt1.setText(tea.getTec_no());
		jt2.setText(tea.getTec_name());
		jt3.setText(tea.getTec_password());
		jt4.setText(tea.getTec_course());
		jt5.setText(tea.getTec_class());
		
		JButton jb1=new JButton();
		jb1.setText("保存修改");
		jb1.setBounds(156, 330, 100, 30);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Teacher tea1=new Teacher();
				tea1.setTec_no(jt1.getText());
				tea1.setTec_name(jt2.getText());
				tea1.setTec_password(jt3.getText());
				tea1.setTec_course(jt4.getText());
				tea1.setTec_class(jt5.getText());
				TeacherDao.updateTeacher(tea1);
				JOptionPane.showMessageDialog(teacherWindows,"修改成功！！");
			}

		});
		this.add(jb1);
//		List<Teacher> list = TeacherDao.selectAll();
//		Object[] col = new Object[] { "学号", "姓名", "班级", "专业", "语文", "数学", "英语" };
//		Object[][] data = new Object[list.size()][col.length];
//		for (int i = 0; i < list.size(); i++) {
//			Student stu = list.get(i);
//			data[i][0] = stu.getNo();
//			data[i][1] = stu.getName();
//			data[i][2] = stu.getClazz();
//			data[i][3] = stu.getMajor();
//			data[i][4] = stu.getChinese();
//			data[i][5] = stu.getMath();
//			data[i][6] = stu.getEnglish();
//		}
//		DefaultTableModel dtm = new DefaultTableModel(data, col);
//		JTable jt = new JTable(dtm);
//		jt.setBounds(0, 0, 450, 100);
//		JScrollPane js = new JScrollPane(jt);
//		js.setBounds(0, 0, 450, 100);
//		this.add(js);
//		
//		JTextField tf = new JTextField();
//		tf.setBounds(50, 120, 200, 30);
//		this.add(tf);
//
//		JButton jb = new JButton("查询");
//		jb.setBounds(270, 120, 100, 30);
//		this.add(jb);
//
//		JRadioButton rb1 = new JRadioButton("学号");
//		rb1.setBounds(70, 170, 80, 50);
//		this.add(rb1);
//
//		JRadioButton rb2 = new JRadioButton("姓名");
//		rb2.setBounds(150, 170, 80, 50);
//		this.add(rb2);
//
//		JRadioButton rb3 = new JRadioButton("班级");
//		rb3.setBounds(230, 170, 80, 50);
//		this.add(rb3);
//
//		JRadioButton rb4 = new JRadioButton("所有");
//		rb4.setBounds(310, 170, 80, 50);
//		this.add(rb4);
//
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(rb1);
//		bg.add(rb2);
//		bg.add(rb3);
//		bg.add(rb4);
//
//		rb1.setSelected(true);
//
//		jb.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				String text = tf.getText();
//				if (rb1.isSelected()) {
//					// 根据学号查询学生信息
//					Student stu = StudentDao.selectByNo(text);
//					// 更新jtable中的内容为查询到的学生信息
//					DefaultTableModel dtm = null;
//					if (null != stu) {
//						Object[][] data = new Object[1][col.length];
//						data[0][0] = stu.getNo();
//						data[0][1] = stu.getName();
//						data[0][2] = stu.getClazz();
//						data[0][3] = stu.getMajor();
//						data[0][4] = stu.getChinese();
//						data[0][5] = stu.getMath();
//						data[0][6] = stu.getEnglish();
//						dtm = new DefaultTableModel(data, col);
//					}else{
//						dtm = new DefaultTableModel(null, col);
//					}
//					jt.setModel(dtm);
//				}
//				if (rb2.isSelected()) {
//					// 根据姓名查询学生信息
//					Student stu = StudentDao.selectByName(text);
//					// 更新jtable中的内容为查询到的学生信息
//					DefaultTableModel dtm = null;
//					if (null != stu) {
//						Object[][] data = new Object[1][col.length];
//						data[0][0] = stu.getNo();
//						data[0][1] = stu.getName();
//						data[0][2] = stu.getClazz();
//						data[0][3] = stu.getMajor();
//						data[0][4] = stu.getChinese();
//						data[0][5] = stu.getMath();
//						data[0][6] = stu.getEnglish();
//						dtm = new DefaultTableModel(data, col);
//					}else{
//						dtm = new DefaultTableModel(null, col);
//					}
//					jt.setModel(dtm);
//				}
//				if (rb3.isSelected()) {
//					// 根据班级查询学生信息
//					List<Student> list = StudentDao.selectByClass(text);
//					// 更新jtable中的内容为查询到的学生信息
//					Object[][] data = new Object[list.size()][col.length];
//					for (int i = 0; i < list.size(); i++) {
//						Student stu = list.get(i);
//						data[i][0] = stu.getNo();
//						data[i][1] = stu.getName();
//						data[i][2] = stu.getClazz();
//						data[i][3] = stu.getMajor();
//						data[i][4] = stu.getChinese();
//						data[i][5] = stu.getMath();
//						data[i][6] = stu.getEnglish();
//					}
//					DefaultTableModel dtm = new DefaultTableModel(data, col);
//					jt.setModel(dtm);
//				}
//				if (rb4.isSelected()) {
//					// 查询所有学生信息
//					List<Student> list = StudentDao.selectAll();
//					// 更新jtable中的内容为查询到的学生信息
//					Object[][] data = new Object[list.size()][col.length];
//					for (int i = 0; i < list.size(); i++) {
//						Student stu = list.get(i);
//						data[i][0] = stu.getNo();
//						data[i][1] = stu.getName();
//						data[i][2] = stu.getClazz();
//						data[i][3] = stu.getMajor();
//						data[i][4] = stu.getChinese();
//						data[i][5] = stu.getMath();
//						data[i][6] = stu.getEnglish();
//					}
//					DefaultTableModel dtm = new DefaultTableModel(data, col);
//					jt.setModel(dtm);
//				}
//				
//			}
//		});
	}
}

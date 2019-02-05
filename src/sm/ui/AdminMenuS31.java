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
		JLabel title = new JLabel();// 标签用于显示标题
		title.setText("成绩信息");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(150, 30, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title);// 添加到窗体中

		JLabel title1 = new JLabel();// 标签用于显示标题
		title1.setText("查询类型：");
		title1.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title1.setBounds(40, 300, 100, 50);// 设置尺寸和在窗体中的位置
		this.add(title1);// 添加到窗体中

		JRadioButton rb1 = new JRadioButton("语文");
		rb1.setBounds(130, 300, 60, 50);
		this.add(rb1);

		JRadioButton rb2 = new JRadioButton("数学");
		rb2.setBounds(190, 300, 60, 50);
		this.add(rb2);

		JRadioButton rb3 = new JRadioButton("英语");
		rb3.setBounds(250, 300, 60, 50);
		this.add(rb3);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		rb1.setSelected(true);

		JButton jb=new JButton();
		jb.setText("查询");
		jb.setBounds(320, 305, 60, 35);
		this.add(jb);
		
		JLabel title2 = new JLabel();// 标签用于显示标题
		title2.setText("课程成绩：");
		title2.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title2.setBounds(80, 100, 100, 50);// 设置尺寸和在窗体中的位置
		this.add(title2);// 添加到窗体中
		
		JLabel title3 = new JLabel();// 标签用于显示标题
		title3.setText("班级排名：");
		title3.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title3.setBounds(80, 150, 100, 50);// 设置尺寸和在窗体中的位置
		this.add(title3);// 添加到窗体中
		
		JLabel title4 = new JLabel();// 标签用于显示标题
		title4.setText("年级排名：");
		title4.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title4.setBounds(80, 200, 100, 50);// 设置尺寸和在窗体中的位置
		this.add(title4);// 添加到窗体中
		
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
					// 根据编号查询老师信息
					Student stu1 = StudentDao.selectByName(name);
					// 更新jtable中的内容为查询到的老师信息					
					if (null != stu1) {
						tf1.setText(stu1.getChinese()+"");
						tf2.setText(1+"");
						tf3.setText(1+"");
					}else{
						//
					}

				}
				if (rb2.isSelected()) {
					// 根据姓名查询学生信息
					Student stu2 = StudentDao.selectByName(name);
					// 更新jtable中的内容为查询到的老师信息					
					if (null != stu2) {
						tf1.setText(stu2.getMath()+"");
						tf2.setText(3+"");
						tf3.setText(5+"");
					}else{
						//
					}
				}
				if (rb3.isSelected()) {
					// 根据班级查询老师信息
					Student stu3 = StudentDao.selectByName(name);
					// 更新jtable中的内容为查询到的老师信息					
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

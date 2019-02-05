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

		JLabel title = new JLabel();// 标签用于显示标题
		title.setText("个人信息：");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(150, 30, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title);// 添加到窗体中
		
		JLabel title2 = new JLabel();// 标签用于显示标题
		title2.setText("姓名：");
		title2.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title2.setBounds(90, 100, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title2);// 添加到窗体中
		
		JLabel title3 = new JLabel();// 标签用于显示标题
		title3.setText("学号：");
		title3.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title3.setBounds(90, 150, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title3);// 添加到窗体中
		
		JLabel title4 = new JLabel();// 标签用于显示标题
		title4.setText("专业：");
		title4.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title4.setBounds(90, 200, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title4);// 添加到窗体中
		
		JLabel title5 = new JLabel();// 标签用于显示标题
		title5.setText("班级：");
		title5.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title5.setBounds(90, 250, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title5);// 添加到窗体中
		
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

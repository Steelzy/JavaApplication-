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
		JLabel title = new JLabel();// 标签用于显示标题
		title.setText("修改密码");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		title.setBounds(150, 30, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title);// 添加到窗体中
		
		JLabel title2 = new JLabel();// 标签用于显示标题
		title2.setText("原密码：");
		title2.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title2.setBounds(90, 100, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title2);// 添加到窗体中
		
		JLabel title3 = new JLabel();// 标签用于显示标题
		title3.setText("新密码：");
		title3.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title3.setBounds(90, 150, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title3);// 添加到窗体中
		
		JLabel title4 = new JLabel();// 标签用于显示标题
		title4.setText("确认密码：");
		title4.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		title4.setBounds(90, 200, 350, 50);// 设置尺寸和在窗体中的位置
		this.add(title4);// 添加到窗体中
		
		
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
		jb.setText("确认");
		jb.setBounds(100, 280, 100, 35);
		this.add(jb);
		
		JButton jb1=new JButton();
		jb1.setText("取消");
		jb1.setBounds(245, 280, 100, 35);
		this.add(jb1);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String oldpassword = tf1.getText();
				String newpassword1 = tf2.getText();
				String newpassword2 = tf3.getText();
				if (null == tf1 || null == tf2 || null==tf3 || tf1.equals("") || tf2.equals("") || tf3.equals("")) {
					//JOptionPane.showMessageDialog(StudentWindow.this, "用户名或密码为空");
					JOptionPane.showMessageDialog(null, "密码为空");
				} else {
					// 查询name password
					Student stu = StudentDao.selectByName(name);
					if(!newpassword1.equals(newpassword2)) {
						JOptionPane.showMessageDialog(null, "两次密码不一致");
						tf3.setText("");
					}else if(!stu.getPassword().equals(oldpassword)){
						JOptionPane.showMessageDialog(null, "原密码错误");
						tf1.setText("");
					}else {
						StudentDao.updatepassword(stu,newpassword2);
						JOptionPane.showMessageDialog(null, "修改成功");
					}
				}
			}			
		});
	}
}

package sm.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TeacherMenu22 extends JPanel {
	public TeacherMenu22() {
		String strMsg1 = "欢迎使用!";
		String strMsg2 = " 请根据需要选择对应的菜单项";
		String strMsg = "<html><body>" + strMsg1 + "<br>" + strMsg2 + "<body></html>";
		JLabel jte = new JLabel(strMsg);
		jte.setBounds(100, 100, 100, 100);
		jte.setFont(new Font("华文行楷", 1, 35));
		jte.setForeground(Color.red);
		this.add(jte);
	}
}

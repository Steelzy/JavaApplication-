package sm.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TeacherMenu22 extends JPanel {
	public TeacherMenu22() {
		String strMsg1 = "��ӭʹ��!";
		String strMsg2 = " �������Ҫѡ���Ӧ�Ĳ˵���";
		String strMsg = "<html><body>" + strMsg1 + "<br>" + strMsg2 + "<body></html>";
		JLabel jte = new JLabel(strMsg);
		jte.setBounds(100, 100, 100, 100);
		jte.setFont(new Font("�����п�", 1, 35));
		jte.setForeground(Color.red);
		this.add(jte);
	}
}

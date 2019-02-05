package sm.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TeacherMenu51 extends JPanel {

	public TeacherMenu51() {
//		this.setLayout(null);
		JLabel jl = new JLabel();
		jl.setBounds(280,280,100,100);
		jl.setText("谢谢使用");
		jl.setFont(new Font("华文行楷", 1, 66));
		jl.setForeground(Color.CYAN);
		this.add(jl);
	}
}

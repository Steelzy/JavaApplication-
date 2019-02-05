package sm.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TeacherMenu33 extends JPanel  {

	public TeacherMenu33() {
		JLabel jl = new JLabel();
		jl.setBounds(100,100,100,100);
		jl.setText("谢谢使用");
		jl.setFont(new Font("华文行楷", 1, 45));
		jl.setForeground(Color.CYAN);
		this.add(jl);
	}
}

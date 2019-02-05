package sm.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminMenu51 extends JPanel {
	public AdminMenu51() {
		JLabel jl = new JLabel();
		jl.setBounds(100, 100, 100, 100);
		jl.setText("谢谢您的使用");
		jl.setFont(new Font("华文行楷", 1, 35));
		jl.setForeground(Color.BLUE);
		this.add(jl);
	}
}

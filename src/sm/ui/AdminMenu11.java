package sm.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminMenu11 extends JPanel {
	public AdminMenu11(){
//		JLabel jl = new JLabel();
//		jl.setBounds(100,100,100,100);
//		jl.setText("��ӭʹ��! ������Ҫѡ���Ӧ�Ĳ˵���");
//		jl.setFont(new Font("�����п�", 1, 25));
//		jl.setForeground(Color.red);
//		this.add(jl);
		
		String   strMsg1   =   "��ӭʹ��!";     
		String   strMsg2   =   " �������Ҫѡ���Ӧ�Ĳ˵���";     
		String   strMsg = "<html><body>"+strMsg1+"<br>"+strMsg2+"<body></html>";    
		JLabel   jl   =   new   JLabel(strMsg);  
		jl.setBounds(100,100,100,100);
		jl.setFont(new Font("�����п�", 1, 35));
		jl.setForeground(Color.red);
		this.add(jl);
//		JLabel jl1=new JLabel();
//		jl.setBounds(400, 400, 100, 100);
//		jl.setText("������Ҫѡ���Ӧ�Ĳ˵���");
//		jl.setFont(new Font("�����п�", 1, 40));
//		jl.setForeground(Color.red);
//		
//		this.add(jl1);
//		
	}

}

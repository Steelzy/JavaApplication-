package sm.ui;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sm.dao.StudentDao;
import sm.dao.TeacherDao;
import sm.po.Student;
import sm.po.Teacher;

public class AdminMenu22 extends JPanel{
	public AdminMenu22(){
		List<Teacher> list=TeacherDao.selectAll();
		Object[] col=new Object[]{"±àºÅ","ÐÕÃû","¿Î³Ì","°à¼¶"};
		Object[][] data= new Object[list.size()][col.length]; 
		for(int i=0;i<list.size();i++){
			Teacher tea=list.get(i);
			data[i][0]=tea.getTec_no();
			data[i][1]=tea.getTec_name();
			data[i][2]=tea.getTec_course();
			data[i][3]=tea.getTec_class();
		}
		DefaultTableModel dtm=new DefaultTableModel(data, col);
		JTable jt=new JTable(dtm);
		jt.setBounds(0, 0, 450,450 );
		JScrollPane js=new JScrollPane(jt);
		js.setBounds(0, 0, 450, 450);
		this.add(js);
	}
}


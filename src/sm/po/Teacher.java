package sm.po;

public class Teacher {

	private String tec_no;
	private String tec_name;
	private String tec_password;
	private String tec_course;
	private String tec_class;
	public String getTec_no() {
		return tec_no;
	}
	public void setTec_no(String tec_no) {
		this.tec_no = tec_no;
	}
	public String getTec_name() {
		return tec_name;
	}
	public void setTec_name(String tec_name) {
		this.tec_name = tec_name;
	}
	public String getTec_password() {
		return tec_password;
	}
	public void setTec_password(String tec_password) {
		this.tec_password = tec_password;
	}
	public String getTec_course() {
		return tec_course;
	}
	public void setTec_course(String tec_course) {
		this.tec_course = tec_course;
	}
	public String getTec_class() {
		return tec_class;
	}
	public void setTec_class(String tec_class) {
		this.tec_class = tec_class;
	}
	public Teacher(String tec_no, String tec_name, String tec_password, String tec_course, String tec_class) {
		super();
		this.tec_no = tec_no;
		this.tec_name = tec_name;
		this.tec_password = tec_password;
		this.tec_course = tec_course;
		this.tec_class = tec_class;
	}
	
	public Teacher() {
		
	}
	
	
	@Override
	public String toString() {
		return "Teacher [tec_no=" + tec_no + ", tec_name=" + tec_name + ", tec_password=" + tec_password
				+ ", tec_course=" + tec_course + ", tec_class=" + tec_class + "]";
	}
	
}

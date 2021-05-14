
public class Course {
	public Course() {
		
	}
	
	public Course(int courseid, String coursename,String courseteacherName, double courseunitPrice) {
	
		this();
		this.courseid = courseid;
		this.coursename = coursename;
	    this.courseteachername = courseteacherName;
	    this.courseunitPrice = courseunitPrice;
	}
	//Constructor bloðu
	int courseid;
	String coursename;
	String courseteachername;
	double courseunitPrice;
}

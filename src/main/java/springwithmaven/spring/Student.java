package springwithmaven.spring;

public class Student {
	//POJO CLASS
	
	// Bean Class 
	//it holds the data
	// first we used  setter injection in student1 name in Student xml
	//in setter Injection we use property tag in XML <Property></Property> in that <value>VALUEEEE</value> to set value
	private int studentId;
	private String studentName;
	private String studentAddress;
	public Student(int studentId, String studentName, String studentAddress) {
		// user Define para
		this.studentId=studentId;
		this.studentName= studentName;
		this.studentAddress= studentAddress;
	}	
	
	public Student() {
		//user Define Default
		
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		// to check setter injection
		System.out.println("Student id Injection");
		this.studentId = studentId;
	}
	public String getStudentName() {
		
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	

}

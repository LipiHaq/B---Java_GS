package L1_HW_ConnectingMultipleClasses_Obj_SchoolManagement;

public class L11_Main_TeacherStudentStaff {

	public static void main(String[] args) {
		L12_Teacher teacher = new L12_Teacher();
		teacher.NumberOfTeachers = 154;
		teacher.NumberOfSeniors = 100;
		teacher.NumberOfJuniours = 54;
		teacher.TeacherInfo();
		
		L13_Student student = new L13_Student();
		student.TotalStudents = 2000;
		student.StudentInfo1();
		student.MaleStudents = 1200;
		student.FemailStudents = 800;
		student.StudentInfo2();
		
		L14_Staff staff = new L14_Staff();
		staff.TotalStaff = 57;
		staff.StaffInfo1();
		staff.Male = 25;
		staff.StaffInfo2();
		staff.Female = 32;
		staff.StaffInfo3();
	}
}

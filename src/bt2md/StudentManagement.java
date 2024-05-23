package bt2md;

import java.util.*;

public class StudentManagement {
	ArrayList<StudentInfo> info = new ArrayList<>();
	private StudentInfo Studentinfo;
	
	public StudentManagement() {
		StudentInfo info1 = new StudentInfo("001","duong",20,8.5);
		StudentInfo info2 = new StudentInfo("002","quanh",21,9.5);
		StudentInfo info3 = new StudentInfo("003","hiep",22,7.5);
		StudentInfo info4 = new StudentInfo("004","dat",23,6.5);
		StudentInfo info5 = new StudentInfo("005","tung",24,5.5);
		info.add(info1);
		info.add(info2);
		info.add(info3);
		info.add(info4);
		info.add(info5);
	}
	
	public StudentInfo check(String studentId) {
		for(StudentInfo studentinfo: info) {
			if(studentinfo.getStudentId().equals(studentId)) {
				Studentinfo = studentinfo;
				return studentinfo;
			}
		}
		return null;
	}
	
	 public static ArrayList<Object> getMinMark(ArrayList<StudentInfo> info) {
        info.sort(Comparator.comparingDouble(StudentInfo::getMark));
        StudentInfo minStudent = info.get(0);

        ArrayList<Object> minMarkInfo = new ArrayList<>();
        minMarkInfo.add(minStudent.getStudentId());
        minMarkInfo.add(minStudent.getStudentName());
        minMarkInfo.add(minStudent.getStudentAge());
        minMarkInfo.add(minStudent.getMark());

        return minMarkInfo;
    }
	 
	public static ArrayList<Object> getMaxMark(ArrayList<StudentInfo> info) {
		info.sort(Comparator.comparingDouble(StudentInfo::getMark));
		StudentInfo maxStudent = info.get(info.size()-1);
	
		ArrayList<Object> maxMarkInfo = new ArrayList<>();
		maxMarkInfo.add(maxStudent.getStudentId());
		maxMarkInfo.add(maxStudent.getStudentName());
		maxMarkInfo.add(maxStudent.getStudentAge());
		maxMarkInfo.add(maxStudent.getMark());
		return maxMarkInfo;
	}
	
	public static ArrayList<Object> getYoungest(ArrayList<StudentInfo> info) {
		info.sort(Comparator.comparingDouble(StudentInfo::getStudentAge));
		StudentInfo youngestStudent = info.get(0);
	
		ArrayList<Object> youngestStuInfo = new ArrayList<>();
		youngestStuInfo.add(youngestStudent.getStudentId());
		youngestStuInfo.add(youngestStudent.getStudentName());
		youngestStuInfo.add(youngestStudent.getStudentAge());
		youngestStuInfo.add(youngestStudent.getMark());
		return youngestStuInfo;
	}
	
	public static ArrayList<Object> getOldest(ArrayList<StudentInfo> info) {
		info.sort(Comparator.comparingDouble(StudentInfo::getStudentAge));
		StudentInfo oldestStudent = info.get(info.size()-1);
	
		ArrayList<Object> oldestStuInfo = new ArrayList<>();
		oldestStuInfo.add(oldestStudent.getStudentId());
		oldestStuInfo.add(oldestStudent.getStudentName());
		oldestStuInfo.add(oldestStudent.getStudentAge());
		oldestStuInfo.add(oldestStudent.getMark());
		return oldestStuInfo;
	}
	
	public StudentInfo getStudentinfo() {
		return Studentinfo;
	}
	
}

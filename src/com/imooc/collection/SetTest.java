package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	public List<Course> coursesToSelect;
	public SetTest () {
		coursesToSelect = new ArrayList<Course>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();
		Student student = new Student("1","小明");
		System.out.println("欢迎学生：" + student.name + "选课");
		Scanner console = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入课程ID");
			String courseId = console.next();
			for (Course cr:st.coursesToSelect) {
				if(cr.id.equals(courseId)) {
					student.courses.add(cr);
				}
			}
		}
		console.close();
		System.out.println(1);
		// 打印输出学生所选的课程
		for(Course cr:student.courses) {
			System.out.println("选择了课程： " + cr.id + ":" + cr.name);
		}
	}
	/**
	 * 用于往coursesToSelect 添加备选课程
	 * */
	public void testAdd() {
		// 创建一个课程对象 通过add方法 添加到备选list中
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		System.out.println("添加了课程：");
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println(temp.id + "---" + temp.name);
		Course cr2  = new Course("2","c语言");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println(temp2.id + "=====" + temp2.name);
//		下面的方法会报错java.lang.IndexOutOfBoundsException
//		Course cr3 = new Course("3","test");
//		coursesToSelect.add(4,cr3);
		Course[] course = {new Course("3","离散数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println(temp3.id + "=====" + temp3.name);
		System.out.println(temp4.id + "=====" + temp4.name);
		Course[] course2 = {new Course("5","高等数学"),new Course("6","大学英语")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
		System.out.println(temp5.id + "=====" + temp5.name);
		System.out.println(temp6.id + "=====" + temp6.name);
//		重复添加重复数据
	}
	/**
	 * 通过foreach方法
	 * 就是迭代器的简便方法
	 * 
	 * */
	public void testForEach() {
		System.out.println("通过foreach访问------------------通过foreach访问");

		for(Object obj:coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("课程:" + cr.id + ":" +cr.name);
		}
	}
}

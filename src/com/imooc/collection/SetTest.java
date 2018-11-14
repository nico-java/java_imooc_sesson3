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
		Student student = new Student("1","С��");
		System.out.println("��ӭѧ����" + student.name + "ѡ��");
		Scanner console = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("������γ�ID");
			String courseId = console.next();
			for (Course cr:st.coursesToSelect) {
				if(cr.id.equals(courseId)) {
					student.courses.add(cr);
				}
			}
		}
		console.close();
		System.out.println(1);
		// ��ӡ���ѧ����ѡ�Ŀγ�
		for(Course cr:student.courses) {
			System.out.println("ѡ���˿γ̣� " + cr.id + ":" + cr.name);
		}
	}
	/**
	 * ������coursesToSelect ��ӱ�ѡ�γ�
	 * */
	public void testAdd() {
		// ����һ���γ̶��� ͨ��add���� ��ӵ���ѡlist��
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		System.out.println("����˿γ̣�");
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println(temp.id + "---" + temp.name);
		Course cr2  = new Course("2","c����");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println(temp2.id + "=====" + temp2.name);
//		����ķ����ᱨ��java.lang.IndexOutOfBoundsException
//		Course cr3 = new Course("3","test");
//		coursesToSelect.add(4,cr3);
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println(temp3.id + "=====" + temp3.name);
		System.out.println(temp4.id + "=====" + temp4.name);
		Course[] course2 = {new Course("5","�ߵ���ѧ"),new Course("6","��ѧӢ��")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
		System.out.println(temp5.id + "=====" + temp5.name);
		System.out.println(temp6.id + "=====" + temp6.name);
//		�ظ�����ظ�����
	}
	/**
	 * ͨ��foreach����
	 * ���ǵ������ļ�㷽��
	 * 
	 * */
	public void testForEach() {
		System.out.println("ͨ��foreach����------------------ͨ��foreach����");

		for(Object obj:coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("�γ�:" + cr.id + ":" +cr.name);
		}
	}
}

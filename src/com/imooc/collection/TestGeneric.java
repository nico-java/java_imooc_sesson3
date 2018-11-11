package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	/**
	 * ���з��� ---- Course ��list���͵�����
	 * */
	public List<Course> courses;
	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}
	/**
	 * �������
	 * */
	public void testAdd() {
		Course cr1 = new Course("1","��ѧ���");
		courses.add(cr1);
//		���ͼ����в������ �涨����������Ķ��󣬷��򱨴�
//		courses.add("2","dsfsdf");
		Course cr2 = new Course("2","���������");
		courses.add(cr2);
	}
	public void testForEach() {
		/**
		 * �����Ѿ���ǰ�涨������
		 * */
		for(Course cr:courses) {
			System.out.println(cr.id + ": " + cr.name);
		}
	}
	public static void main(String[] args) {
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
	}
}

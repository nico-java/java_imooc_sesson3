package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	/**
	 * 带有泛型 ---- Course 的list类型的属性
	 * */
	public List<Course> courses;
	public TestGeneric() {
		this.courses = new ArrayList<Course>();// 实例化带有泛型的courses 
	}
	/**
	 * 测试添加
	 * */
	public void testAdd() {
		Course cr1 = new Course("1","大学鱼粉");
		courses.add(cr1);
//		泛型集合中不能添加 规定的类型及其子类型以外的对象，否则报错
//		courses.add("2","dsfsdf");
		Course cr2 = new Course("2","计算机基础");
		courses.add(cr2);
	}
	/**
	 * 泛型可以添加泛型子类型的实例
	 * */
	public void testChild() {
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "我是子类型的课程对象的实例";
		courses.add(ccr);
	}
	/**
	 * 泛型不能添加基本类型
	 * */
	public void testBasicType() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		System.out.println(list.get(0));
	}
	public void testForEach() {
		/**
		 * 这里已经提前规定了类型
		 * */
		for(Course cr:courses) {
			System.out.println(cr.id + ": " + cr.name);
		}
	}
	public static void main(String[] args) {
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	}
}

package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 备选课程类
 * */
public class ListTest {
	public List coursesToSelect;
	public ListTest() {
		this.coursesToSelect = new ArrayList();
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
		coursesToSelect.add(cr1);
		Course temp0 = (Course)coursesToSelect.get(0);
		System.out.println(temp0.id + "=====" + temp0.name);
	}
	/**
	 * 取得list中的元素的方法
	 * */
	public void testGet() {
		int size = coursesToSelect.size();
		System.out.println("这里测试循环==============================");
		for(int i = 0;i<size;i++) {
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("课程:" + cr.id + ":" +cr.name);
		}
		
		
	}
	/**
	 * 通过迭代器便利list
	 * 
	 * */
	public void testIterator() {
		System.out.println("通过迭代器访问------------------通过迭代器访问");
		Iterator it = coursesToSelect.iterator();
		while(it.hasNext()) {
			Course cr = (Course)it.next();
			System.out.println("课程:" + cr.id + ":" +cr.name);
		}
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
	/**
	 * test set
	 * */
	public void testModify() {
		coursesToSelect.set(0, new Course("7","毛事"));
	}
	/**
	 * 删除 一个 和删除全部
	 * */
	public void testRemove() {
		Course cr  = (Course)coursesToSelect.get(0);
		System.out.println("课程:" + cr.id + ":" +cr.name + "我即将被删除");
//		coursesToSelect.remove(cr);
		Course[] courses = {(Course)coursesToSelect.get(4),(Course)coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("成功删除课程");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		// 修改后的list
		lt.testForEach();
		// 删除课程
		lt.testRemove();
		lt.testForEach();

	}
}

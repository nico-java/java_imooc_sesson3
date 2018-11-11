package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ��ѡ�γ���
 * */
public class ListTest {
	public List coursesToSelect;
	public ListTest() {
		this.coursesToSelect = new ArrayList();
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
		coursesToSelect.add(cr1);
		Course temp0 = (Course)coursesToSelect.get(0);
		System.out.println(temp0.id + "=====" + temp0.name);
	}
	/**
	 * ȡ��list�е�Ԫ�صķ���
	 * */
	public void testGet() {
		int size = coursesToSelect.size();
		System.out.println("�������ѭ��==============================");
		for(int i = 0;i<size;i++) {
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("�γ�:" + cr.id + ":" +cr.name);
		}
		
		
	}
	/**
	 * ͨ������������list
	 * 
	 * */
	public void testIterator() {
		System.out.println("ͨ������������------------------ͨ������������");
		Iterator it = coursesToSelect.iterator();
		while(it.hasNext()) {
			Course cr = (Course)it.next();
			System.out.println("�γ�:" + cr.id + ":" +cr.name);
		}
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
	/**
	 * test set
	 * */
	public void testModify() {
		coursesToSelect.set(0, new Course("7","ë��"));
	}
	/**
	 * ɾ�� һ�� ��ɾ��ȫ��
	 * */
	public void testRemove() {
		Course cr  = (Course)coursesToSelect.get(0);
		System.out.println("�γ�:" + cr.id + ":" +cr.name + "�Ҽ�����ɾ��");
//		coursesToSelect.remove(cr);
		Course[] courses = {(Course)coursesToSelect.get(4),(Course)coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("�ɹ�ɾ���γ�");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		// �޸ĺ��list
		lt.testForEach();
		// ɾ���γ�
		lt.testRemove();
		lt.testForEach();

	}
}

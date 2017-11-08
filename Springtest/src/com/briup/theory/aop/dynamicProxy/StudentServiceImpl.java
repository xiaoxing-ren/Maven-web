package com.briup.theory.aop.dynamicProxy;

public class StudentServiceImpl implements IStudentService {
	
	
	@Override
	public void save(Student s) {
		System.out.println("添加一个学生");
		
	}

	@Override
	public void delete(long id) {
		System.out.println("删除一个学生");
	}

	@Override
	public Student find(long id) {
		System.out.println("查找成功");
		
		return new Student("tom",12,"北京");
	}

	
}

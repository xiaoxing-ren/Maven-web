package com.briup.theory.aop.Cglib;

public class CglibTest {

	public static void main(String[] args) {
		CglibBookService cglibBookService = new CglibBookService();
		BookService book = (BookService) cglibBookService.getInstance(new BookService().getClass());
		book.addBook();
		System.out.println(book.getClass());
	}
}

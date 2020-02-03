package com.yedam.jhi.classes.extendPkg;

public class ExtendExample {
	   public static void main(String[] args) {
	      Parent p1 = new Parent();
	      p1.field1 = "parent";
	      p1.method1();
	      
	      Child c1 = new Child();
	      c1.field1 = "parent";
	      c1.field2 = "child";
	      c1.method1();
	      c1.method2();

	   }
	}

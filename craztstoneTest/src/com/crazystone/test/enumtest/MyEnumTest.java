package com.crazystone.test.enumtest;

import java.util.EnumSet;

public class MyEnumTest {

	public static void main(String[] args) {
		
		MyType[] types=MyType.values();
		for(MyType type: types){
			System.out.println("enum name:"+type.name());
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
		int testNumber=5;
		boolean isF=(testNumber==MyType.THIRD.number)?true:false;
		System.out.println(isF);
		System.out.println("enum third values:"+MyType.FIRST.number);
		MyType.test();
		System.out.println("acquire first value:"+MyType.FIRST.getMyNumber(5423));
		
		EnumSet<MyType> sets=EnumSet.allOf(MyType.class);
		for(MyType type: sets){
			System.out.println("type name:"+type+",number:"+type.number+",value:"+type.name());
		}
	}
	
	
}

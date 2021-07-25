package com.jizhong.demo;

public class Demo05Sum {
	//找出所有1-100之间能够被2，3，5同时整除的整数，并计算其总和。
	public static void main(String[] args) {
		int result = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0){//同时被2 3 5整除的数字
				System.out.println("1-100之间能够被2，3，5同时整除的整数为：" + i);
				result += i;
			}else{
				continue;
			}
		}
		System.out.println("计算结果为：" + result);
	}
}

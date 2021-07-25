package com.jizhong.demo;

import java.util.Scanner;

/**
 * break语句：
 * 	常用与打断操作，在循环中为打断循环，在switch中为停止继续向下执行。
 *
 */
public class Demo04ShaSeng {
	/**
	 * 赛程共5圈
	 * 循环在执行的过程中判断悟净的状态，当悟净无法支持的时候，需要随时停止循环。
	 * 这个时候，可以使用break终止循环。
	 */
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String answer;//悟净回答
//		for(int i = 1;i <= 5;i++){
//			System.out.println("悟净，你还坚持得住吗？？？");
//			answer = sc.next();//悟净回答
//			if (answer.equals("能")) {
//				System.out.println("悟净坚持得住，继续跑步~~");
//			}else{
//				System.out.println("悟净坚持不住了，停止比赛！！！");
//				break;//停止操作，在循环内为停止循环
//			}
//		}
//		System.out.println("悟净退出比赛场地！！！");
		
		
		
		//------------------------------------------------------
		//当悟净无法坚持的时候，悟空就带他超近道直接开始下一圈
		Scanner sc = new Scanner(System.in);
		String answer;//悟净回答
		for(int i = 1;i <= 5;i++){
			System.out.println("悟净，你还坚持得住吗？？？");
			answer = sc.next();//悟净回答
			if (answer.equals("能")) {
				System.out.println("悟净坚持得住，继续跑步。当前跑到第" + i + "圈！！");
			}else{
				System.out.println("悟净坚持不住了，悟空帮悟净作弊，跳过一圈。"
						+ "作弊跳过第" + i + "圈！！");
				continue;//跳过本次循环，继续执行下一次循环
			}
		}
	}
	
	
	
}

package com.jizhong.demo;

import java.util.Scanner;

public class Demo02BiSai {
	/**
	 * 比赛时间5小时，比赛地图为五个场地，
	 * 	分别为：沙漠，沼泽，山坡，平原、戈壁。
	 * 	每小时均须更换不同场地，五小时后累计每个场地的个人成绩即跑步里程，
	 * 	总里程超过40公里者获取2000元奖金。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int total = 0;//记录唐僧跑步公里数
		for(int time = 1;time <= 5;time++){//time：当前时间
			//沙漠，沼泽，山坡，平原、戈壁
			if(time == 1){
				System.out.println("唐僧正在跑沙漠地图~~~");
				total += sc.nextInt();
			}else if (time == 2) {
				System.out.println("唐僧正在跑沼泽地图~~~");
				total += sc.nextInt(); 
			}else if (time == 3) {
				System.out.println("唐僧正在跑山坡地图~~~");
				total += sc.nextInt();
			}else if (time == 4) {
				System.out.println("唐僧正在跑平原地图~~~");
				total += sc.nextInt();
			}else if(time == 5){
				System.out.println("唐僧正在跑戈壁地图~~~");
				total += sc.nextInt();
			}
		}
		System.out.println("唐僧跑了" + total + "公里！！！");
		if (total >= 40) {
			System.out.println("奖励唐僧两千元！！！");
		}else{
			System.out.println("很遗憾，唐僧没有任何奖励！！");
		}
		sc.close();
		
	}
}

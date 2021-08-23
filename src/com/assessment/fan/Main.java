package com.assessment.fan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Fan fan = new Fan('+', 0);
		System.out.println(
				"Please enter the code number to be pulled : "
						+ "\n1 for changing the speed setting\n2 for reversing the direction ");
		while (true) {
			int input = s.nextInt();
			if (input == 1) {
				System.out.println("Initial fan speed setting is "+fan.getCurrentSetting()+" "
						+ "and Initial fan direction is set to "+(fan.getOperator() == '-' ? "decrease" : "increase"));
				int setting = fan.getCurrentSetting();
				if (fan.getOperator() == '+') {
					if (setting < 3)
						setting++;
					else
						setting = 0;
					fan.setCurrentSetting(setting);
				} else {
					if (setting == 0) {
						setting = 3;
					} else
						setting--;
					fan.setCurrentSetting(setting);
				}
				System.out.println("Fan setting changed to "+fan.getCurrentSetting());
			} else if (input == 2) {
				if (fan.getOperator() == '-') {
					fan.setOperator('+');
				} else
					fan.setOperator('-');
				System.out.println("The direction of the fan is reversed to "
						+ (fan.getOperator() == '-' ? "decrease" : "increase"));
			} else {
				System.out.println("Program is terminated....");
				return;
			}
		}
	}

}

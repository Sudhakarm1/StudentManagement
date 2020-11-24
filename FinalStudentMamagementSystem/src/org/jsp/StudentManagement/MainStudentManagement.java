package org.jsp.StudentManagement;

import java.util.Scanner;

public class MainStudentManagement {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		StudentManagement SM = new StudentManagement();
		System.out.println("<<<<<<<<<<<<<<<<STUDENT MANAGEMENT SYSTEM>>>>>>>>>>>>>>>");
		System.out.println("------------------------------");
		while (true) {
			System.out.println("Please Choose from Given Options");
			System.out.println("1.Insert Rows");
			System.out.println("2.Display Table");
			System.out.println("3.Update Rows");
			System.out.println("4.Detete Rows");
			System.out.println("5.Exit");
			System.out.println("6.Search");
			int Num = Sc.nextInt();
			try {
				switch (Num) {
				case 1:
					SM.DispalyTable();
					break;
				case 2:
					SM.Display();
					break;
				case 3:
					SM.UpdateTable();
					break;
				case 4:
					SM.Deteteable();
					break;
				case 5:
					System.exit(0);
					break;
				case 6:
					SM.Search();
					break;
				default:
					System.out.println("Please Enter Valid Data");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

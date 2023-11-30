package com.bms;
import java.util.Scanner;
public class MainFile {
	public static void main(String[] args) {
		int a=1;
		while (true) {
			Scanner s=new Scanner(System.in);
			menu();
			System.out.println("select your choise:");
			int c=s.nextInt();
			if(c==1) {
				System.out.println("open account");
				open_acc();
				
			}
			else if(c==2) {
				System.out.println("Deposite money");
				deposie();
			}
			else if(c==3) {
				System.out.println("withdraw money");
				withdraw();
		}
			else if(c==4) {
				System.out.println("balance enqury");
				bal_enq();
			}                           
			else if(c==5) {
				System.out.println("close accout");
				close_acc();
			}
			else if(c==6) {
				System.out.println("view all profile");
			}
			else if(c==7) {
				System.out.println("program stopped");
				break;
		}	else {
			System.out.println("enter the valid number");
		}}
		
	}

	private static void close_acc() {
		// TODO Auto-generated method stub
		
	}

	private static void bal_enq() {
		// TODO Auto-generated method stub
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private static void deposie() {
		// TODO Auto-generated method stub
		
	}

	private static void open_acc() {
		// TODO Auto-generated method stub
		
	}

	public static void menu() {
		System.out.println("**************************");
		System.out.println("1.indian overseas bank");
		System.out.println("2.open new account");
		System.out.println("3. deposite");
		System.out.println("4.balance");
		System.out.println("5.close account");
		System.out.println("6.view all profiles");
		System.out.println("7.stop program");
		System.out.println("---------------------------");
	}

}

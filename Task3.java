import java.util.*;
class Task3{
public static void main(String args[]){
		int balance=5000,withdraw=0,deposit=0;
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("welcome to atm center");
		System.out.println("click 1 for withdraw");
		System.out.println("click 2 for deposit");
		System.out.println("click 3 for balance");
		System.out.println("click 4 for exit");
		int s = sc.nextInt();
		switch(s){
			case 1:
				System.out.print("enter withdraw amount : ");
				withdraw = sc.nextInt();
				if(balance>=withdraw){
					balance = balance - withdraw;
					System.out.println("collect your amount");
				}else{
					System.out.println("insufficient balance");
				}
				System.out.println("");
				break;
			case 2:
				System.out.print("enter deposit amount : ");
				deposit = sc.nextInt();
				balance = balance - withdraw;
				System.out.println("amount sucessfully deposit");
				break;
			case 3:
				System.out.print("balance: "+balance);
				break;
			case 4:
				System.out.print("thanks for visiting");
				System.exit(0);
		}break;
		}
}
}
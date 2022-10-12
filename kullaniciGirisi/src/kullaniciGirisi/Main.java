package kullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password, newPassword;
		boolean select;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Kullanýcý Adýnýz: ");
		userName=scan.nextLine();
		System.out.print("Þifreniz: ");
		password=scan.nextLine();
		
		if(userName.equals("patika")&&password.equals("java123")) {
			System.out.println("Giriþ Yaptýnýz !");
		}
		else {
			System.out.println("Bilgileriniz Yanlýþ !\nÞifrenizi Sýfýrlamak Ýster Misiniz? (1(Event), 0(Hayýr)):");
			select=scan.nextBoolean();
			if(select) {
				System.out.println("Yeni Þifrenizi Griniz");
				newPassword=scan.nextLine();
				if(newPassword.equals(password)) {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz");
				}
				else {
					System.out.println("Þifre oluþturuldu");
				}
			}
			
		}
	}

}

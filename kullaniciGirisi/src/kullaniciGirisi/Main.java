package kullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password, newPassword;
		byte select;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Kullan?c? Ad?n?z: ");
		userName=scan.nextLine();
		System.out.print("?ifreniz: ");
		password=scan.nextLine();
		
		if(userName.equals("patika")&&password.equals("java123")) {
			System.out.println("Giri? Yapt?n?z !");
		}
		else {
			System.out.println("Bilgileriniz Yanl?? !\n?ifrenizi S?f?rlamak ?ster Misiniz? (1(Event), 0(Hay?r)):");
			select=scan.nextByte();
			if(select==1) {
				System.out.print("Yeni ?ifrenizi Griniz");
				newPassword=scan.next();
				if(newPassword.equals(password)) {
					System.out.println("?ifre olu?turulamad?, l?tfen ba?ka ?ifre giriniz");
				}
				else {
					System.out.println("?ifre olu?turuldu");
				}
			}
			
		}
	}

}

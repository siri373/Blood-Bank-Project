import java.util.*;

interface Colorcode {
	static String bgred = "\u001B[41m";
	static String bgblue = "\u001B[44m";
	static String bgmegenta = "\u001B[45";
	static String bggreen = "\u001B[42m";
	static String bgyellow = "\u001B[43m";
	static String SET_BOLD_TEXT = "\033[0;1m";
	static String REDBRI = "\033[1;91m";
	static String increaseFontSize = "\033[1;31m";
	static String resetFormatting = "\033[0m";
	static String BOLD = "\u001B[1m";
	static String BLINK = "\u001B[5m";
	static String whitebg = "\u001B[47m";
	static String black = "\u001B[30m";
	String skblue = "\u001B[36m";
	static String magent = "\u001B[95m";
	static final String ital = "\u001B[3m";
	static String ul = "\u001B[4m";
	static String RESET = "\u001B[0m";
	static String RED = "\u001B[31m";
	static String GREEN = "\u001B[32m";
	static String YELLOW = "\u001B[33m";
	static String BLUE = "\u001B[34m";
	static String PURPLE = "\u001B[35m";
	static String WHITE = "\u001B[37m";
	static String CYAN = "\u001B[36m";
	static String ANSI_RED_BACKGROUND = "\u001B[41m";
	// PURPLE \u001B[35m
	static String PURPLE_BACKGROUND = "\u001B[45m";

}

class Reg {
	static Scanner cs = new Scanner(System.in);

	private String mob;
	private String password;

	void setter1(String mob) {
		this.mob = mob;
	}

	void setter2(String password) {
		this.password = password;
	}

	String getter1() {
		return mob;
	}

	String getter2() {
		return password;
	}
}

class Login implements Colorcode {
	static Scanner cs = new Scanner(System.in);
	Reg ob3 = new Reg();

	void registration() {
		while (true) {
			System.out.print("> Enter Mobile Number: ");
			String a = cs.next();
			if (a.matches("[6789]\\d{9}")) {
				ob3.setter1(a);
				passwordreg();
				break;
			} else {
				System.out.println(RED
						+ "* * * Invalid Input please enter a 10-digit mobile number starting with 8,9,7 or 6 * * * "
						+ RESET);
			}
		}
		/*
		 * System.out.println("> Enter Mobile Number:");
		 * long a=cs.nextLong();
		 * if(a>=6000000000L && a<=9999999999L)
		 * {
		 * ob2.setter1(a);
		 * passwordreg();
		 * }
		 * else
		 * { System.out.println(
		 * RED+"* * * Invalid Input please enter a 10-digit mobile number starting with 8,9 or 7 * * * "
		 * +RESET);
		 * 
		 * //System.out.println(RED+"Please Enter a Valid Mobile Number:"+RESET);
		 * registration();
		 * }
		 */
	}

	void passwordreg() {
		System.out.print("> Enter password:");
		String pswrd = cs.next();
		if (pswrd.length() < 6) {
			System.out.println(RED + "Password should be atleast 6 charcters:" + RESET);
			pswrd = cs.next();
		} else {
			ob3.setter2(pswrd);
		}
		System.out.println();
		System.out.println(GREEN + "***Registration Successful.***" + RESET);
		System.out.println("-----------------------------------------");
		// System.out.println("-----------------------------------------");
	}

	void login() {
		System.out.println(YELLOW + "> select login option: " + RESET + "\n" + PURPLE
				+ "	1.Login with OTP\n	2.Login with password" + RESET);
		char k = cs.next().charAt(0);
		if (k == '1' || k == '2') {
			if (k == '1') {
				otplogin();
			} else if (k == '2') {
				passwordlogin();
			}
		} else {
			System.out.println(RED + "Entered Invalid option please Enter valid option" + RESET);
			login();
		}
	}

	String phn;
	String a;
	String pas;

	void otplogin() {

		System.out.println(BLUE + "> Enter Valid Mobile Number and otp for Login: " + RESET);
		phn = cs.next();
		a = ob3.getter1();

		if (phn.equals(a)) {
			// phn=a;
			Random random = new Random();
			int randomNum = random.nextInt(10000);
			String otp = String.format("%04d", randomNum);
			System.out.println();
			System.out.println("OTP sent to " + phn + " --" + "[" + otp + "]");
			System.out.println(RED + "Enter OTP: " + RESET);
			String OTP = cs.next();
			while (!otp.equals(OTP)) {
				System.out.println(RED + "You entered wrong OTP. Please enter valid OTP: " + RESET);
				OTP = cs.next();
			}
			if (otp.equals(OTP)) {
				System.out.println(GREEN + "Login Success" + RESET);
				System.out.println("-----------------------------------------");
			} else {

			}
		} else {
			System.out.println(RED + "You entered Wrong mobile number." + RESET);
			otplogin();
		}

	}

	void passwordlogin() {
		System.out.println("Enter Valid Mobile Number and Password for Login: ");
		phn = cs.next();
		pas = cs.next();

		String a = ob3.getter1();
		String b = ob3.getter2();

		if ((phn.equals(a)) && (pas.equals(b))) {
			phn = a;
			pas = b;
			System.out.println(GREEN + "Login Successful." + RESET);
			System.out.println("------------------------------------------");

		} else {
			System.out.println(RED + "Login Unsuccessful. You have Entered Incorrect Credentials." + RESET);

			passwordlogin();
		}
	}

	static void hdetails() {
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println();
		System.out.println("Other sources you can also reffer: ");
		System.out.println();
		System.out.println(GREEN + "Blood Bank Name:          Location:       Contact:");
		System.out.println("1.Care Blood Bank ,        Hi Techcity,    9963474040");
		System.out.println("2.Maxcure Blood Bank,      Hi Techcity,    8008831486");
		System.out.println("3.Sunshine Blood Bank,     Gachibowli,     040-44550000");
		System.out.println("4.Red cross Blood Bank,    Vidyanagar,     040-27633087");
		System.out.println("5.Arohi Blood Bank,        Banjara hills,  040-23384212");
		System.out.println("6.KIMS Blood Bank,         Kondapur,       040-67505050" + RESET);
	}

	static void wdetails() {
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println();
		System.out.println("Other sources you can also reffer: ");
		System.out.println();
		System.out.println(GREEN + "Blood Bank Name:                  Location:         Contact:");
		System.out.println("1.MGM Blood Bank ,                 M G road,Warangal,     9963474040");
		System.out.println("2.KMC Blood Bank,                     Warangal,           8008831486");
		System.out.println("3.RedCross Blood Bank,                Warangal,          040-44550000");
	}

	static void kdetails() {
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println();
		System.out.println("Other sources you can also reffer: ");
		System.out.println();
		System.out.println(GREEN + "Blood Bank Name:            Location:       Contact:");
		System.out.println("1.Arogya Blood Bank ,       Karimnagar,    9963474040");
		System.out.println("2.RedCross Blood Bank,      Karimnagar,    8008831486");
		System.out.println("3.Mythri Blood Bank,        Karimnagar,     040-44550000");
	}

	static void mdetails() {
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println();
		System.out.println("Other sources you can also reffer: ");
		System.out.println();
		System.out.println(GREEN + "Blood Bank Name:               Location:       Contact:");
		System.out.println("1.Palamooru Blood Bank ,             Mahabubnagar,    9963474040");
		System.out.println("2.Navodaya hospital Blood Bank,      Mahabubnagar,    8008831486");
		System.out.println("3.RedCross Blood Bank,               Mahabubnagar,     040-44550000");

	}

	static void kmmdetails() {
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println();
		System.out.println("Other sources you can also reffer: ");
		System.out.println();
		System.out.println(GREEN + "Blood Bank Name:                     Location:          Contact:");
		System.out.println("1.shiva Blood Bank ,                 church compound,    9963474040");
		System.out.println("2.Doctors Blood Bank,                prakash nagar  ,    8008831486");
		System.out.println("3.vidura Blood Bank,                 khammam,            040-44550000");
	}
}

interface City extends Colorcode {
	static void hapov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Hyderabad A+:");
		System.out.println("Name: Seetha,   contact: 9948997052");
		System.out.println("Name: Siri,     contact: 9940997052");
		System.out.println("Name: Ram,      contact: 9948997052");
		System.out.println("Name: Sri,      contact: 9950997052");
		System.out.println("Name: Mani,     contact: 9947997052");
		System.out.println("Name: Arun,     contact: 9942997052");
		// if(city=="Hyd" || city=="Hyderabad" || city=="hyderabad" || city=="hyd")

	}

	static void haneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println(" Hyderbad A-:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: vani,   contact: 9992997052");
	}

	static void hbpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Hyderbad B+:");
		System.out.println("Name: Heetha,   contact: 9878997052");
		System.out.println("Name: Harini,   contact: 9288997052");
		System.out.println("Name: Ramu,     contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha,  contact: 9247997052");
		System.out.println("Name: Shivamani ,contact: 9999997052");

	}

	static void hbneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println(" Hyderbad B-:");
		System.out.println("Name: Sandhya,  contact: 9948957052");
		System.out.println("Name: Vennela,  contact: 9908997052");
		System.out.println("Name: Ramu,     contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha,  contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");

	}

	static void hopov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Hyderabad O+:");
		System.out.println("Name: Geetha,   contact: 9948977052");
		System.out.println("Name: Sruthi,   contact: 9666944104");
		System.out.println("Name: Ramu,     contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha,  contact: 9247997052");
		System.out.println("Name: Shivamani,contact: 9999997052");

	}

	static void honeg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println(" Hyderabad O-:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void habpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Hyderbad Ab+:");
		System.out.println("Name: Seetha,   contact: 9948997052");
		System.out.println("Name: Seetha,   contact: 9948997052");
		System.out.println("Name: Ramu,     contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha,  contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");

	}

	static void habneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Hyderbad Ab-:");
		System.out.println("Name: Seetha,   contact: 9948997052");
		System.out.println("Name: Seetha,   contact: 9948997052");
		System.out.println("Name: Ramu,     contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha,  contact: 9247997052");
		System.out.println("Name: Shivamani,contact: 9999997052");
	}

	static void kapov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Karimnagar  A+:");
		System.out.println("Name: Seetha,  contact: 9948997052");
		System.out.println("Name: Seetha,  contact: 9948997052");
		System.out.println("Name: Ramu,    contact: 9348997052");
		System.out.println("Name: lathasri,contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani,contact: 9999997052");

	}

	static void kaneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println(" Karimnagar A-:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void kbpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Karimnagar B+:");
		System.out.println("Name: Seetha,  contact: 9948997052");
		System.out.println("Name: Seetha,  contact: 9948997052");
		System.out.println("Name: Ramu,    contact: 9348997052");
		System.out.println("Name: lathasri,contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani,contact: 9999997052");

	}

	static void kbneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println("----------------------------------------------------");
		System.out.println("Karimnagar B-:");
		System.out.println("Name: Seetha,   contact: 9948997052");
		System.out.println("Name: Siri,     contact: 9940997052");
		System.out.println("Name: Ram,      contact: 9948997052");
		System.out.println("Name: Sri,      contact: 9950997052");
		System.out.println("Name: Mani,     contact: 9947997052");
		System.out.println("Name: Arun,     contact: 9942997052");
	}

	static void kopov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println("Karimnagar O+:");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void koneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Karimnagar O-:");
		System.out.println("Name: Seetha,    contact: 9948997052");
		System.out.println("Name: Seetha,    contact: 9948997052");
		System.out.println("Name: Ramu,      contact: 9348997052");
		System.out.println("Name: lathasri,  contact: 9130997052");
		System.out.println("Name: Manisha,   contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");

	}

	static void kabpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Karimnagar Ab+:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void kabneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("karimnagar Ab-:");
		System.out.println("Name: Seetha,   contact: 9948997052");
		System.out.println("Name: Siri,     contact: 9940997052");
		System.out.println("Name: Ram,      contact: 9948997052");
		System.out.println("Name: Sri,      contact: 9950997052");
		System.out.println("Name: Mani,     contact: 9947997052");
		System.out.println("Name: Arun,     contact: 9942997052");
	}

	static void khapov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Khammam A+:");
		System.out.println("Name: Sandhya, contact: 9948957052");
		System.out.println("Name: Vennela, contact: 9908997052");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");
	}

	static void khaneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Khammam A-:");
		System.out.println("Name: Heetha, contact: 9878997052");
		System.out.println("Name: Harini, contact: 9288997052");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");

	}

	static void khbpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Khammam B+:");
		System.out.println("Name: Sandhya, contact: 9948957052");
		System.out.println("Name: Vennela, contact: 9908997052");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");

	}

	static void khbneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Khammam B-:");
		System.out.println("Name: Sandhya, contact: 9948957052");
		System.out.println("Name: Vennela, contact: 9908997052");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");

	}

	static void khabpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Khammam Ab+:");
		System.out.println("Name: Geetha, contact: 9948977052");
		System.out.println("Name: Sruthi, contact: 9666944104");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");
	}

	static void khabneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Khammam Ab-:");
		System.out.println("Name: Sandhya, contact: 9948957052");
		System.out.println("Name: Vennela, contact: 9908997052");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");

	}

	static void khopov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Name: Geetha, contact: 9948977052");
		System.out.println("Name: Sruthi, contact: 9666944104");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");
	}

	static void khoneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Khammam O-:");
		System.out.println("Name: Seetha, contact: 9948997052");
		System.out.println("Name: Siri,     contact: 9940997052");
		System.out.println("Name: Ram,   contact: 9948997052");
		System.out.println("Name: Sri,      contact: 9950997052");
		System.out.println("Name: Mani,  contact: 9947997052");
		System.out.println("Name: Arun,  contact: 9942997052");
	}

	static void wapov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Warangal A+:");
		System.out.println("Name: Geetha, contact: 9978997952");
		System.out.println("Name: Vani, contact: 9942997092");
		System.out.println("Name: Siri, contact: 9944997052");
		System.out.println("Name: Ram, contact: 9349997052");
		System.out.println("Name: Srilatha, contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva, contact: 9992997052");
	}

	static void waneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Warangal A-:");
		System.out.println("Name: Heetha, contact: 9878997052");
		System.out.println("Name: Harini, contact: 9288997052");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");

	}

	static void wbpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Warangal B+:");
		System.out.println("Name: Sandhya, contact: 9948957052");
		System.out.println("Name: Vennela, contact: 9908997052");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");
	}

	static void wbneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Warangal B-:");
		System.out.println("Name: Sandhya, contact: 9948957052");
		System.out.println("Name: Vennela, contact: 9908997052");
		System.out.println("Name: Ramu, contact: 9348997052");
		System.out.println("Name: lathasri, contact: 9130997052");
		System.out.println("Name: Manisha, contact: 9247997052");
		System.out.println("Name: Shivamani, contact: 9999997052");

	}

	static void wabpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Warangal Ab+:");
		System.out.println("Name: Seetha, contact: 9948997052");
		System.out.println("Name: Siri,     contact: 9940997052");
		System.out.println("Name: Ram,   contact: 9948997052");
		System.out.println("Name: Sri,      contact: 9950997052");
		System.out.println("Name: Mani,  contact: 9947997052");
		System.out.println("Name: Arun,  contact: 9942997052");
	}

	static void wabneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Warangal Ab-:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void wopov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Warangal O+:");
		System.out.println("Name: Seetha, contact: 9948997052");
		System.out.println("Name: Siri,     contact: 9940997052");
		System.out.println("Name: Ram,   contact: 9948997052");
		System.out.println("Name: Sri,      contact: 9950997052");
		System.out.println("Name: Mani,  contact: 9947997052");
		System.out.println("Name: Arun,  contact: 9942997052");

	}

	static void woneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Warangal O-");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void mapov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Mahabubnagar A+:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void maneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Mahabubnagar A-:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void mbpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Mahabubnagar B+:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void mbneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Mahabubnagar B-:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void mabpov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Mahabubnagar Ab+:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void mabneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Mahabubnagar Ab-:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void mopov() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Mahabubnagar O+:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

	static void moneg() {
		System.out.println(
				"Currently available Donor details are here, You can contact them directly by contact number.");
		System.out.println(YELLOW + "----------------------------------------------------" + RESET);
		System.out.println("Mahabubnagar O-:");
		System.out.println("Name: Geetha,  contact: 9978997952");
		System.out.println("Name: Vani,    contact: 9942997092");
		System.out.println("Name: Siri,    contact: 9944997052");
		System.out.println("Name: Ram,     contact: 9349997052");
		System.out.println("Name: Srilatha,contact: 9150997052");
		System.out.println("Name: Manisha, contact: 9347997052");
		System.out.println("Name: Shiva,   contact: 9992997052");
	}

}

class A extends Login implements City, Colorcode {
	static Scanner cs = new Scanner(System.in);
	static A obA = new A();

	static void option() {
		System.out.println(CYAN + "1.Do you want to Donate");
		System.out.println("2.Do you need a Donor");
		System.out.println("3.Exit");
		System.out.println("4.Logout" + RESET);
		char c = cs.next().charAt(0);

		if (c == '1') {
			System.out.println("1.Do you want to continue");
			System.out.println("2.Back");
			char cnf = cs.next().charAt(0);
			if (cnf == '1') {
				Donor();
			} else if (cnf == '2') {
				option();
			} else {
				System.out.println(RED + "Entered Invalid option please enter valid option" + RED);
				option();
			}
		} else if (c == '2') {
			Acceptor();
		} else if (c == '3') {
			System.exit(0);
		} else if (c == '4') {
			// obA.login();
			// System.out.println(RED+"Entered Invalid option please enter valid
			// option"+RESET);
			// option();
		} else if (c != '1' && c != '2' && c != '3' && c != '4') {
			System.out.println("You selected invalid option. Please select a valid option.");
			option();
		}
	}

	static char dbg;
	static String dname;
	static char abg;
	static char bg;
	static String phn;
	static String dphn;
	static char dct;
	static char act;
	static char ct;
	static char tod;
	static char atod;
	static int c = 0;

	static void Donor() {
		System.out.println(YELLOW + "You want to donate :" + RESET + "\n" + "	1.Blood\n	2.Plasma\n	3.Platelets");
		char bpp = cs.next().charAt(0);
		tod = bpp;
		// int c=cs.nextInt();
		if (tod == '1') {
			System.out.println("1.Do you want to continue");
			System.out.println("2.Back");
			char cnf = cs.next().charAt(0);
			if (cnf == '2') {
				Donor();
			} else if (cnf == '1') {
				donordata();
			} else if (cnf == '$') {
				option();
			}
		} else if (tod == '2') {
			System.out.println("1.Do you want to continue");
			System.out.println("2.Back");
			char cnf = cs.next().charAt(0);
			if (cnf == '2') {
				Donor();
			} else if (cnf == '1') {
				donordata();
			} else if (cnf == '$') {
				option();
			}
		} else if (tod == '3') {
			System.out.println("1.Do you want to continue");
			System.out.println("2.Back");
			int cnf = cs.next().charAt(0);
			if (cnf == '2') {
				Donor();
			} else if (cnf == '1') {
				donordata();
			} else if (cnf == '$') {
				option();
			}
		} else if (tod == '$') {
			option();
		} else if (tod != '1' || tod != '2' || tod != '3' || tod != '$') {
			System.out.println("You selected invalid option. Please select a valid option.");
			Donor();
		}
	}

	static void donordata() {
		System.out.println(YELLOW + "Enter your Name :" + RESET);
		String name = cs.next();
		if (name.equals("$")) {
			option();
		} else if (name.equals("#")) {
			donordata();
		}
		dname = name;
		System.out.println(YELLOW + "Select Your Blood Group" + RESET);
		System.out.println(GREEN + "1.A+");
		System.out.println("2.A-");
		System.out.println("3.B+");
		System.out.println("4.B-");
		System.out.println("5.AB+");
		System.out.println("6.AB-");
		System.out.println("7.O+");
		System.out.println("8.O-" + RESET);
		char bg = cs.next().charAt(0);
		while (c < 5) {
			c++;
			if (c == 5) {
				System.out.println("You entered invalid details many times.");
				option();
			}
			if (bg == '1' || bg == '2' || bg == '3' || bg == '4' || bg == '5' || bg == '6' || bg == '7' || bg == '8') {
				break;
			} else if (bg == '$') {
				option();
			} else if (bg == '#') {
				donordata();
			} else {
				System.out.println(RED + "Please enter the valid option: " + RESET);
				bg = cs.next().charAt(0);
			}
		}
		dbg = bg;

		System.out.println(YELLOW + "Enter Your Contact Number:" + RESET);

		while (true) {
			// System.out.print("> Enter Mobile Number: ");
			phn = cs.next();
			if (phn.matches("[6789]\\d{9}")) {
				break;
			} else if (phn.equals("#")) {
				donordata();
			} else {
				System.out.println(RED
						+ "* * * Invalid Input please enter a 10-digit mobile number starting with 8,9,7 or 6 * * * "
						+ RESET);
			}
		}
		dphn = phn;
		System.out.println(YELLOW + "Which City You are From:" + RESET);
		System.out.println(skblue + "1.Hyderabad" + RESET);
		System.out.println(skblue + "2.Karimnagar" + RESET);
		System.out.println(skblue + "3.Khammam" + RESET);
		System.out.println(skblue + "4.Warangal" + RESET);
		System.out.println(skblue + "5.Mahabubnagar" + RESET);
		char ct = cs.next().charAt(0);
		while (c < 5) {
			c++;
			if (c == 5) {
				System.out.println("You selected invalid option many times.");
				option();
			}
			if (ct == '1' || ct == '2' || ct == '3' || ct == '4' || ct == '5') {
				break;
			} else if (ct == '$') {
				option();
			} else if (ct == '#') {
				donordata();
			} else {
				System.out.println("You selected invalid option. Please select a valid option.");
				ct = cs.next().charAt(0);
			}
		}
		c = 0;
		dct = ct;
		// option();

		System.out.println(YELLOW + "Enter you weight in Kgs: " + RESET);
		String weight = cs.next();
		int weight2 = 0;
		int val = conversion(weight);
		while (c < 5) {
			c++;
			if (c == 5) {
				System.out.println("You entered invalid details many times.");
				option();
			}
			if (val == 0) {
				System.out.println("Please enter valid weight: ");
				weight = cs.next();
				val = conversion(weight);
			} else {
				weight2 = val;
				break;
			}
		}
		c = 0;
		val = 0;
		if (weight2 < 45) {
			System.out.println(RED + "Not eligible" + RED);
		} else {
			int k = 0;
			System.out.println(YELLOW + "Enter your age: " + RESET);
			String age = cs.next();
			System.out.println();
			int age2 = 0;
			val = conversion(age);
			while (c < 5) {
				c++;
				if (c == 5) {
					System.out.println("You entered invalid details many times.");
					option();
				}
				if (val == 0) {
					System.out.println("Please enter valid age: ");
					age = cs.next();
					val = conversion(age);
				} else {
					age2 = val;
					break;
				}
			}
			c = 0;
			val = 0;
			if (age2 < 18 || age2 > 59) {
				System.out.println("Thankyou for your kindness. But you can't be a donor rightnow.");
			} else {
				System.out.println(YELLOW + "Were you effected to covid in the past: " + RESET + "\n"
						+ " if Yes enter 1, else enter 2.");
				System.out.println();
				char cov = cs.next().charAt(0);
				while (c < 5) {
					c++;
					if (c == 5) {
						System.out.println("You entered invalid details many times.");
						option();
					}
					if (cov == '1' || cov == '2') {
						break;
					} else if (cov == '$') {
						option();
					} else if (cov == '#') {
						donordata();
					} else {
						System.out.println("Please enter the valid option: ");
						cov = cs.next().charAt(0);
					}
				}
				c = 0;

				if (cov == '1') {
					System.out.println(RED + "Thankyou for your kindness. But you can't be a donor rightnow." + RESET);
				} else if (cov == '2') {
					System.out.println(YELLOW + "Have you ever donated Blood/Plasma/Platelets? (Enter Yes/No)" + RESET);
					String srn = cs.next();
					System.out.println();
					srn = srn.toLowerCase();
					while (c < 5) {
						c++;
						if (c == 5) {
							System.out.println("You entered invalid details many times.");
							option();
						}
						if (srn.equals("yes") || srn.equals("no")) {
							break;
						} else if (srn.equals("$")) {
							option();
						} else if (srn.equals("#")) {
							donordata();
						} else {
							System.out.println("Please enter the valid option: ");
							srn = cs.next();
						}
					}
					c = 0;
					if (srn.equals("yes")) {
						// System.out.println("Aindhi");
						System.out.println(YELLOW + "When did you donate the blood last time(Enter days): " + RESET);
						String day = cs.next();
						System.out.println();
						int day2 = 0;

						val = conversion(day);
						while (c < 5) {
							c++;
							if (c == 5) {
								System.out.println("You entered invalid details many times.");
								option();
							}
							if (val == 0) {
								System.out.println("Please enter valid days: ");
								day = cs.next();
								val = conversion(day);
							} else {
								day2 = val;
								break;
							}
						}
						c = 0;
						val = 0;

						if (day2 < 90 && tod == '1') {
							System.out.println(RED + "Your Not eligible Now. You can donate the blood after "
									+ (90 - day2) + " days ");
							k = k + 1;
						} else if (day2 < 45 && tod == '2') {
							System.out.println(
									"Your Not eligible Now. You can donate the Plasma after " + (45 - day2) + " days ");
							k = k + 1;
						} else if (day2 < 45 && tod == '3') {
							System.out.println("Your Not eligible Now. You can donate the Platelets after "
									+ (45 - day2) + " days " + RESET);
							k = k + 1;
						}
					} else if (srn.equals("no")) {
						// System.out.println("Kaale");

					}
					if (k == 0) {
						System.out.println(YELLOW + "Are you working in Chemical factories or Coal mines." + RESET
								+ "\n" + "If yes enter 1" + "\n" + "If not enter 2.");
						System.out.println();
						char wp = cs.next().charAt(0);
						while (c < 5) {
							c++;
							if (c == 5) {
								System.out.println("You entered invalid details many times.");
								option();
							}
							if (wp == '1' || wp == '2') {
								break;
							} else if (wp == '$') {
								option();
							} else if (wp == '#') {
								donordata();
							} else {
								System.out.println(RED + "Please enter the valid option: " + RESET);
								wp = cs.next().charAt(0);
							}
						}
						c = 0;
						if (wp == '1') {
							System.out.println(
									RED + "Thankyou for your kindness. But you can't be a donor rightnow." + RESET);
						} else {
							System.out.println(YELLOW + "Have You had any tatoos in last 12 months: " + RESET + "\n"
									+ "If yes enter 1" + "\n" + "If no enter 2");
							System.out.println();
							char tatt = cs.next().charAt(0);
							while (c < 5) {
								c++;
								if (c == 5) {
									System.out.println("You entered invalid details many times.");
									option();
								}
								if (tatt == '1' || tatt == '2') {
									break;
								} else if (tatt == '$') {
									option();
								} else if (tatt == '#') {
									donordata();
								} else {
									System.out.println(RED + "Please enter the valid option: " + RESET);
									tatt = cs.next().charAt(0);
								}
							}
							c = 0;
							if (tatt == '1') {
								System.out.println(
										RED + "Thankyou for your kindness. But you can't be a donor rightnow." + RESET);
							} else {
								System.out.println(REDBRI
										+ "Your data has been saved. You might get a call from the person who needs you. Thank you."
										+ RESET);
								System.out.println();
								System.out.println(
										CYAN + "If You Want To Donate today, You can donate at bloodbanks in your city."
												+ RESET);
								// int opt=cs.nextInt();
								if (ct == '1') {
									hdetails();
								} else if (ct == '2') {
									kdetails();
								} else if (ct == '3') {
									kmmdetails();
								} else if (ct == '4') {
									wdetails();
								} else if (ct == '5') {
									mdetails();
								}
							}
						}
					}
				}
			}

			System.out.println();
			System.out.println(RED + "          *** THANK YOU.. ***" + RESET);
			System.out.println();
			System.out.println("1.Back" + "\n" + "\n" + "2.Exit");
			char opt = cs.next().charAt(0);
			if (opt == '1') {
				option();
			} else if (opt == '2') {
				System.exit(0);
			}
		}
	}

	// *************************************************************************************
	static int conversion(String s) {
		int m = 0, sum = 0;
		int len = s.length();

		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				m = (int) (ch - 48);
				sum = sum * 10 + m;
			} else {
				m = 1;
				break;
			}
		}
		if (m == 1) {
			return 0;
		} else {
			return sum;
		}
	}

	// ******************************************************************************************
	static void Acceptor() {
		System.out.println(YELLOW + "You want to donate :" + RESET + "\n" + "	1.Blood\n	2.Plasma\n	3.Platelets");
		char abpp = cs.next().charAt(0);
		atod = abpp;
		while (c < 5) {
			c++;
			if (c == 5) {
				System.out.println("You entered invalid details many times.");
				option();
			}
			if (abpp == '1' || abpp == '2' || abpp == '3') {
				break;
			} else if (abpp == '$') {
				option();
			} else if (abpp == '#') {
				Acceptor();
			} else {
				System.out.println(RED + "Please enter the valid option: " + RESET);
				abpp = cs.next().charAt(0);
			}
		}
		c = 0;

		System.out.println(YELLOW + "Which Blood Group You Need:" + RESET);
		System.out.println();
		System.out.println(PURPLE + "1.A+");
		System.out.println("2.A-");
		System.out.println("3.B+");
		System.out.println("4.B-");
		System.out.println("5.AB+");
		System.out.println("6.AB-");
		System.out.println("7.O+");
		System.out.println("8.O-" + RESET);
		bg = cs.next().charAt(0);
		while (c < 5) {
			c++;
			if (c == 5) {
				System.out.println("You entered invalid details many times.");
				option();
			}
			if (bg == '1' || bg == '2' || bg == '3' || bg == '4' || bg == '5' || bg == '6' || bg == '7' || bg == '8') {
				break;
			} else if (bg == '$') {
				option();
			} else if (bg == '#') {
				Acceptor();
			} else {
				System.out.println(RED + "Please enter the valid option: " + RESET);
				bg = cs.next().charAt(0);
			}
		}
		abg = bg;

		System.out.println(RED + "Which City You are From:" + RESET);
		System.out.println();
		System.out.println(skblue + "1.Hyderabad" + RESET);
		System.out.println(skblue + "2.Karimnagar" + RESET);
		System.out.println(skblue + "3.Khammam" + RESET);
		System.out.println(skblue + "4.Warangal" + RESET);
		System.out.println(skblue + "5.Mahabubnagar" + RESET);
		ct = cs.next().charAt(0);
		while (c < 5) {
			c++;
			if (c == 5) {
				System.out.println("You entered invalid details many times.");
				option();
			}
			if (ct == '1' || ct == '2' || ct == '3' || ct == '4' || ct == '5') {
				break;
			} else if (ct == '$') {
				option();
			} else if (ct == '#') {
				donordata();
			} else {
				System.out.println("Please enter the valid option: ");
				ct = cs.next().charAt(0);
			}
		}
		c = 0;
		act = ct;

		// **************************************************************

		if (tod == atod) {
			acdata();
		} else {
			acdata2();
		}

		System.out.println();
		System.out.println(RED + "1. Back " + "\n" + "2.Exit" + RED);
		char op = cs.next().charAt(0);
		if (op == '1') {
			option();
		} else if (op == '2') {
			System.exit(0);
		}
	}

	static void acdata2() {
		if (bg == '1' && ct == '1') {
			City.hapov();
			// data();
			hdetails();
		} else if (bg == '2' && ct == '1') {
			City.haneg();
			// data();
			hdetails();
		} else if (bg == '3' && ct == '1') {
			City.hbpov();
			// data();
			hdetails();
		} else if (bg == '4' && ct == '1') {
			City.hbneg();
			// data();
			hdetails();
		} else if (bg == '5' && ct == '1') {
			City.habpov();
			// data();
			hdetails();
		} else if (bg == '6' && ct == '1') {
			City.habneg();
			// data();
			hdetails();
		} else if (bg == '7' && ct == '1') {
			City.hopov();
			// data();
			hdetails();
		} else if (bg == '8' && ct == '1') {
			City.honeg();
			// data();
			hdetails();
		}
		if (bg == '1' && ct == '2') {
			City.kapov();
			// data();
			kdetails();
		} else if (bg == '2' && ct == '2') {
			City.kaneg();
			// data();
			kdetails();
		} else if (bg == '3' && ct == '2') {
			City.kbpov();
			// data();
			kdetails();
		} else if (bg == '4' && ct == '2') {
			City.kbneg();
			// data();
			kdetails();
		} else if (bg == '5' && ct == '2') {
			City.kabpov();
			// data();
			kdetails();
		} else if (bg == '6' && ct == '2') {
			City.kabneg();
			// data();
			kdetails();
		} else if (bg == '7' && ct == '2') {
			City.kopov();
			// data();
			kdetails();
		} else if (bg == '8' && ct == '2') {
			City.koneg();
			// data();
			kdetails();
		}
		if (bg == '1' && ct == '3') {
			City.khapov();
			// data();
			kmmdetails();
		} else if (bg == '2' && ct == '3') {
			City.khaneg();
			// data();
			kmmdetails();
		} else if (bg == '3' && ct == '3') {
			City.khbpov();
			// data();
			kmmdetails();
		} else if (bg == '4' && ct == '3') {
			City.khbneg();
			// data();
			kmmdetails();
		} else if (bg == '5' && ct == '3') {
			City.khabpov();
			// data();
			kmmdetails();
		} else if (bg == '6' && ct == '3') {
			City.khabneg();
			// data();
			kmmdetails();
		} else if (bg == '7' && ct == '3') {
			City.khopov();
			// data();
			kmmdetails();
		} else if (bg == '8' && ct == '3') {
			City.khoneg();
			// data();
			kmmdetails();
		}
		if (bg == '1' && ct == '4') {
			City.wapov();
			// data();
			wdetails();
		} else if (bg == '2' && ct == '4') {
			City.waneg();
			// data();
			wdetails();
		} else if (bg == '3' && ct == '4') {
			City.wbpov();
			// data();
			wdetails();
		} else if (bg == '4' && ct == '4') {
			City.wbneg();
			// data();
			wdetails();
		} else if (bg == '5' && ct == '4') {
			City.wabpov();
			// data();
			wdetails();
		} else if (bg == '6' && ct == '4') {
			City.wabneg();
			// data();
			wdetails();
		} else if (bg == '7' && ct == '4') {
			City.wopov();
			// data();
			wdetails();
		} else if (bg == '8' && ct == '4') {
			City.woneg();
			// data();
			wdetails();
		}
		if (bg == '1' && ct == '5') {
			City.mapov();
			// data();
			mdetails();
		} else if (bg == '2' && ct == '5') {
			City.maneg();
			// data();
			mdetails();
		} else if (bg == '3' && ct == '5') {
			City.mbpov();
			// data();
			mdetails();
		} else if (bg == '4' && ct == '5') {
			City.mbneg();
			// data();
			mdetails();
		} else if (bg == '5' && ct == '5') {
			City.mabpov();
			// data();
			mdetails();
		} else if (bg == '6' && ct == '5') {
			City.mabneg();
			// data();
			mdetails();
		} else if (bg == '7' && ct == '5') {
			City.mopov();
			// data();
			mdetails();
		} else if (bg == '8' && ct == '5') {
			City.moneg();
			// data();
			mdetails();
		}
	}

	static void acdata() {
		if (bg == '1' && ct == '1') {
			City.hapov();
			data();
			hdetails();
		} else if (bg == '2' && ct == '1') {
			City.haneg();
			data();
			hdetails();
		} else if (bg == '3' && ct == '1') {
			City.hbpov();
			data();
			hdetails();
		} else if (bg == '4' && ct == '1') {
			City.hbneg();
			data();
			hdetails();
		} else if (bg == '5' && ct == '1') {
			City.habpov();
			data();
			hdetails();
		} else if (bg == '6' && ct == '1') {
			City.habneg();
			data();
			hdetails();
		} else if (bg == '7' && ct == '1') {
			City.hopov();
			data();
			hdetails();
		} else if (bg == '8' && ct == '1') {
			City.honeg();
			data();
			hdetails();
		}
		if (bg == '1' && ct == '2') {
			City.kapov();
			data();
			kdetails();
		} else if (bg == '2' && ct == '2') {
			City.kaneg();
			data();
			kdetails();
		} else if (bg == '3' && ct == '2') {
			City.kbpov();
			data();
			kdetails();
		} else if (bg == '4' && ct == '2') {
			City.kbneg();
			data();
			kdetails();
		} else if (bg == '5' && ct == '2') {
			City.kabpov();
			data();
			kdetails();
		} else if (bg == '6' && ct == '2') {
			City.kabneg();
			data();
			kdetails();
		} else if (bg == '7' && ct == '2') {
			City.kopov();
			data();
			kdetails();
		} else if (bg == '8' && ct == '2') {
			City.koneg();
			data();
			kdetails();
		}
		if (bg == '1' && ct == '3') {
			City.khapov();
			data();
			kmmdetails();
		} else if (bg == '2' && ct == '3') {
			City.khaneg();
			data();
			kmmdetails();
		} else if (bg == '3' && ct == '3') {
			City.khbpov();
			data();
			kmmdetails();
		} else if (bg == '4' && ct == '3') {
			City.khbneg();
			data();
			kmmdetails();
		} else if (bg == '5' && ct == '3') {
			City.khabpov();
			data();
			kmmdetails();
		} else if (bg == '6' && ct == '3') {
			City.khabneg();
			data();
			kmmdetails();
		} else if (bg == '7' && ct == '3') {
			City.khopov();
			data();
			kmmdetails();
		} else if (bg == '8' && ct == '3') {
			City.khoneg();
			data();
			kmmdetails();
		}
		if (bg == '1' && ct == '4') {
			City.wapov();
			data();
			wdetails();
		} else if (bg == '2' && ct == '4') {
			City.waneg();
			data();
			wdetails();
		} else if (bg == '3' && ct == '4') {
			City.wbpov();
			data();
			wdetails();
		} else if (bg == '4' && ct == '4') {
			City.wbneg();
			data();
			wdetails();
		} else if (bg == '5' && ct == '4') {
			City.wabpov();
			data();
			wdetails();
		} else if (bg == '6' && ct == '4') {
			City.wabneg();
			data();
			wdetails();
		} else if (bg == '7' && ct == '4') {
			City.wopov();
			data();
			wdetails();
		} else if (bg == '8' && ct == '4') {
			City.woneg();
			data();
			wdetails();
		}
		if (bg == '1' && ct == '5') {
			City.mapov();
			data();
			mdetails();
		} else if (bg == '2' && ct == '5') {
			City.maneg();
			data();
			mdetails();
		} else if (bg == '3' && ct == '5') {
			City.mbpov();
			data();
			mdetails();
		} else if (bg == '4' && ct == '5') {
			City.mbneg();
			data();
			mdetails();
		} else if (bg == '5' && ct == '5') {
			City.mabpov();
			data();
			mdetails();
		} else if (bg == '6' && ct == '5') {
			City.mabneg();
			data();
			mdetails();
		} else if (bg == '7' && ct == '5') {
			City.mopov();
			data();
			mdetails();
		} else if (bg == '8' && ct == '5') {
			City.moneg();
			data();
			mdetails();
		}
	}

	static void data() {
		if (abg == dbg && act == dct) {
			System.out.println("Name: " + dname + ",    Contact: " + dphn);
		}
	}
}

class reg2 extends A implements Colorcode {
	static Scanner cs = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(BLINK + YELLOW
				+ "	*     * ****** *      ***** ****  *     *  *****    ***** ****      ****   *     *    *  ****   ****    *    *   ***    ****   *       * "
				+ RESET);
		System.out.println(BLINK + YELLOW
				+ "	*     * *      *      *     *  *  **   **  *          *   *  *      *   *  *     *    *  *   *  *   *   *    *   *   *  *   *   *     *   "
				+ RESET);
		System.out.println(BLINK + YELLOW
				+ "	*     * *      *      *     *  *  * * * *  *          *   *  *      *   *  *     *    *  *   *  *   *   *    *   *   *  *   *    *   *"
				+ RESET);
		System.out.println(BLINK + YELLOW
				+ "	*  *  * *****  *      *     *  *  *  *  *  *****      *   *  *      ****   *     *    *  *    * ****    *    *   *    * *    *     *"
				+ RESET);
		System.out.println(BLINK + YELLOW
				+ "	* * * * *      *      *     *  *  *     *  *          *   *  *      *   *  *     *    *  *   *  *   *   *    *   *   *  *   *     *"
				+ RESET);
		System.out.println(BLINK + YELLOW
				+ "	**   ** *      *      *     *  *  *     *  *          *   *  *      *   *  *     *    *  *  *   *   *   *    *   *  *   *  *     *"
				+ RESET);
		System.out.println(BLINK + YELLOW
				+ "	*     * ****** ****** ***** ****  *     *  *****      *   ****      ****   *****  ****   ***    ****     ****    ***    ***     *"
				+ RESET);

		Reg ob = new Reg();
		reg2 ob2 = new reg2();

		System.out.println();
		System.out.println(SET_BOLD_TEXT + BLUE + "> Enter Mobile Number and Password for Registration:  " + RESET);
		// System.out.println();
		// System.out.println("Password should be atleast 6 characters. "+RESET);
		ob2.registration();
		while (true) {
			ob2.login();
			option();

			System.out.println("Press 1 to continue: " + RESET);
			System.out.println("Press 0 to exit " + RESET);
			if (cs.nextInt() == 0) {
				break;
			}
		}
	}
}

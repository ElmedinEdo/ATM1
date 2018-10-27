import java.util.Scanner;

public class BankomatTest {

	public static void main(String[] args) {

	//	System.out.println("Unesite password:   a   za korisnika1: ");
	//	System.out.println("Unesite password:   d   za korisnika2: ");
		
		
		Scanner input = new Scanner(System.in);

		Bankomat korisnik1 = new Bankomat(222, "John ", "Stone", "a");
		Bankomat korisnik2 = new Bankomat(999, "Mark ", "Douglas ", "d");

		System.out.println("Unesite password: ");
		String password = input.nextLine();

		if (password.equals(korisnik1.getPassword())) {

			System.out.println("\nIme: " + korisnik1.getIme()

					+ "\nPrezime: " + korisnik1.getPrezime()

					+ "\nBrojKorisnika: " + korisnik1.getBrojKorisnika()

					+ "\nDatum: " + korisnik1.getKorisnikDate());
			Racun.ShowMenu();
		}

		if (password.equals(korisnik2.getPassword())) {

			System.out.println("\nIme: " + korisnik2.getIme()

					+ "\nPrezime: " + korisnik2.getPrezime()

					+ "\nBroj korisnika: " + korisnik2.getBrojKorisnika()

					+ "\nDatum: " + korisnik2.getKorisnikDate());
			Racun2.ShowMenu();

		}
		input.close();
	}
}

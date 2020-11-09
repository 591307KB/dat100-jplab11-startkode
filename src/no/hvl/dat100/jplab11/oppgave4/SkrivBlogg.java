package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		boolean sattInn = false;
		PrintWriter skriver = null;
		try {
			skriver = new PrintWriter(mappe+filnavn);
			sattInn = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return sattInn;
		}
		skriver.print(samling.getAntall() + "\n");
		for(int i = 0; i < samling.getAntall(); i++) {
		skriver.print(samling.getSamling()[i].toString());
		}
		skriver.close();
		return sattInn;
	}
}

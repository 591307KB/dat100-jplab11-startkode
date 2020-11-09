package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Integer.*;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {

		Scanner les = null;
		try {
			les = new Scanner(new File(mappe + filnavn));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int antall = Integer.parseInt(les.nextLine());
		Blogg blogg = new Blogg(antall);
		
		while (les.hasNext()) {
			String x = les.nextLine();
			if (x.equals(TEKST)) {

				String id = les.nextLine();
				String bruker = les.nextLine();
				String dato = les.nextLine();
				String likes = les.nextLine();
				String tekst = les.nextLine();

				int idInt = Integer.parseInt(id);

				Innlegg innlegg = new Tekst(idInt, bruker, dato, tekst);
				blogg.leggTil(innlegg);

			} else if (x.equals(BILDE)) {

				String id = les.nextLine();
				String bruker = les.nextLine();
				String dato = les.nextLine();
				String likes = les.nextLine();
				String tekst = les.nextLine();
				String url = les.nextLine();

				int idInt = Integer.parseInt(id);

				Innlegg innlegg = new Bilde(idInt, bruker, dato, tekst, url);
				blogg.leggTil(innlegg);

			}
		}

		les.close();

		return blogg;
	}
}

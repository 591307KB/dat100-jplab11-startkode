package no.hvl.dat100.jplab11.oppgave2;

public class Bilde extends Tekst {

	String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String s = "BILDE\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\net bilde\n" + url + "\n";
		return s;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		
		String s = super.toHTML() + "<iframe src=" + url + "height=600 width=800></iframe><hr>\n";
		return s;
				
	}
}

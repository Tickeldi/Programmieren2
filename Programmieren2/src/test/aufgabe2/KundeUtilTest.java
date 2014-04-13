package test.aufgabe2;

import static org.junit.Assert.*;

import org.junit.Test;

import programmieren.aufgabe2.Kunde;
import programmieren.aufgabe2.KundeUtil;

public class KundeUtilTest {

	@Test(timeout=300)
	public void testGetDuplikate() {
		assertEquals("Wieviele sind ==?", 5, KundeUtil.getDuplikate(Kunde.getKunden()).size());
	}

	@Test(timeout=300)
	public void testGetEqualsKunden() {
		assertEquals("Wieviele sind equals?", 10, KundeUtil.getEqualsKunden(Kunde.getKunden()).size());
	}

	@Test(timeout=300)
	public void testMitGeburtstagAm() {
		assertEquals("Am gleichen Tag Geburtstag", 4, KundeUtil.mitGeburtstagAm(Kunde.getKunden().get(0).getGeburtstag(), Kunde.getKunden()).size());
	}

	@Test(timeout=300)
	public void testAlleVerschieden() {
		assertEquals("Anzahl der verschiedenen Kunden", 990, KundeUtil.alleVerschieden(Kunde.getKunden()).size());
	}

	@Test(timeout=500)
	public void testNachGeburtstagSortiert() {
		assertEquals("Johanna Simon 26.02.1937", "Johanna Simon 26.02.1937", KundeUtil.nachGeburtstagSortiert(Kunde.getKunden()).get(0).toString());
		assertEquals("Emily Graf 18.05.2007", "Emily Graf 18.05.2007", KundeUtil.nachGeburtstagSortiert(Kunde.getKunden()).get(Kunde.getKunden().size()-1).toString());
	}

}

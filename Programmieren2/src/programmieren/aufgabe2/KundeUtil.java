package programmieren.aufgabe2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class KundeUtil {
	
	
	
	/**
	 * Liste von Duplikaten , d.h. Kunden mit 'k1 == k2 ' ist true
	 */
	public static List <List <Kunde>> getDuplikate (List <Kunde> kunden ) {
		List <List <Kunde>> duplikatenListe = new ArrayList<>();		
		
		for(int aktuellerKunde = 0; aktuellerKunde < kunden.size(); aktuellerKunde++) {
			
			List <Kunde> subDuplikatenListe = new ArrayList<>();
			subDuplikatenListe.add(kunden.get(aktuellerKunde));
			
			for(int vergleichKunde = aktuellerKunde; vergleichKunde < kunden.size(); vergleichKunde++) {
				
				if (aktuellerKunde == vergleichKunde) {
				}
				else {				
					if (kunden.get(aktuellerKunde) == kunden.get(vergleichKunde)) {
						subDuplikatenListe.add(kunden.get(vergleichKunde));
					}
				}
			}
			
			if(subDuplikatenListe.size() > 1) {
				duplikatenListe.add(subDuplikatenListe);
			}
		}
		return duplikatenListe;
	}

	/**
	 * Liste von gleichen Kunden , d.h. Kunden mit 'k1. equals (k2)' ist true
	 */
	public static List <List <Kunde>> getEqualsKunden (List <Kunde> kunden ) {
		List <List <Kunde>> equalKundeListe = new ArrayList<>();		
		
		for(int aktuellerKunde = 0; aktuellerKunde < kunden.size(); aktuellerKunde++) {
			
			List <Kunde> subEqualListe = new ArrayList<>();
			subEqualListe.add(kunden.get(aktuellerKunde));
			
			for(int vergleichKunde = aktuellerKunde; vergleichKunde < kunden.size(); vergleichKunde++) {
				
				if (aktuellerKunde == vergleichKunde) {
					continue;
				}
								
				if (kunden.get(aktuellerKunde).equals(kunden.get(vergleichKunde))) {
					subEqualListe.add(kunden.get(vergleichKunde));
				}
			}
			
			if(subEqualListe.size() > 1) {
				equalKundeListe.add(subEqualListe);
			}
		}
		return equalKundeListe;
	}

	/**
	 * Findet alle Kunden mit bestimmten Geburtstag .
	 */
	public static List <Kunde> mitGeburtstagAm ( Date gebu , List <Kunde> kunden ) {
	
		List <Kunde> geburtstagsListe = new ArrayList<Kunde>();
		
		for(int aktuellerKunde = 0; aktuellerKunde < kunden.size(); aktuellerKunde++) {
							
			if (kunden.get(aktuellerKunde).getGeburtstag().equals(gebu)) {
				geburtstagsListe.add(kunden.get(aktuellerKunde));
			}
		}
		return geburtstagsListe;
	}

	/**
	 * Überprüft, ob ein Kunde in einer zweidimensionalen Liste zu finden ist.
	 * @param nadel gesuchter Kunde
	 * @param heuhaufen die zu durchsuchende Liste
	 * @return true, wenn enthalten, false wenn nicht enthalten
	 */
	private static boolean inListe ( Kunde nadel, List <List <Kunde>> heuhaufen) {
		
		for (int i = 0; i < heuhaufen.size(); i++) {
			for (int j = 0; j < heuhaufen.get(i).size(); j++) {
				if (heuhaufen.get(i).get(j).equals(nadel)) {
					return true;
				}
			}
		}
	return false;
	}
	

	
	/**
	 * Es gibt also jeweils nur ein Exemplar , Duplikate wurden entfernt . Liste
	 * von Kunden , die weder '==' noch 'equals ' sind .
	 */
	public static List <Kunde> alleVerschieden (List <Kunde> kunden ) {
		
		List <Kunde> alleVerschiedenen = new ArrayList<> ();
		List <List <Kunde>> equalsKunden = getEqualsKunden(kunden);
		List <Kunde> equals= new ArrayList<>();
		
		for (int i = 0; i < kunden.size(); i++) {
			
			if (!inListe(kunden.get(i), equalsKunden)) {
				alleVerschiedenen.add(kunden.get(i));
			} else {
				if(!equals.contains(kunden.get(i))) {
					equals.add(kunden.get(i));
					alleVerschiedenen.add(kunden.get(i));
				}
				
			}
		}
		return alleVerschiedenen;
	}
	

	/**
	 * Gibt neue nach Geburtstagen aufsteigend sortierte Liste zurueck .
	 */
	public static List <Kunde> nachGeburtstagSortiert (List <Kunde> kunden) {

		Collections.sort(kunden, new Comparator <Kunde>() {

			public int compare(Kunde o1, Kunde o2) {
				return o1.getGeburtstag().compareTo(o2.getGeburtstag());
			}
			
		}); 
		
		return kunden;
	}
}
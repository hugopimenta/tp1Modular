package com.modular.olimpiadas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.modular.olimpiadas.athlete.ArtisticGymnasticsAthlete;
import com.modular.olimpiadas.athlete.Athlete;
import com.modular.olimpiadas.athlete.HighJumpAthlete;
import com.modular.olimpiadas.athlete.LiftweightAthlete;
import com.modular.olimpiadas.athlete.RacingAthlete;
import com.modular.olimpiadas.athlete.SwimmingAthlete;
import com.modular.olimpiadas.country.Country;
import com.modular.olimpiadas.sports.Sport;

/**
 * Olimpiada.
 * 
 * @author Hugo Pimenta
 */
public class Olimpiada {
	public static void main(String[] args) throws Exception {
		Scanner sportsScan = new Scanner(new File("esportes.txt"));
		List<Sport> sports = new ArrayList<>();
		do {
			Sport sport = new Sport();
			StringTokenizer st = new StringTokenizer(sportsScan.nextLine(), ";");
			sport.setId(nextInt(st));
			sport.setName((String) st.nextElement());
			sports.add(sport);
		} while (sportsScan.hasNextLine());
		sportsScan.close();
		Scanner countriesScan = new Scanner(new File("paises.txt"));
		List<Country> countries = new ArrayList<>();
		do {
			Country country = new Country();
			StringTokenizer st = new StringTokenizer(countriesScan.nextLine(), ";");
			country.setId(nextInt(st));
			country.setName((String) st.nextElement());
			countries.add(country);
		} while (countriesScan.hasNextLine());
		countriesScan.close();

		Scanner athletesScan = new Scanner(new File("atletas.txt"));
		List<Athlete> atletas = new ArrayList<>();
		do {
			StringTokenizer st = new StringTokenizer(athletesScan.nextLine(), ";|");
			Athlete atleta = getAthlete(st, sports);
			atletas.add(atleta);
		} while (countriesScan.hasNextLine());
		athletesScan.close();

		for (Sport esporte : sports) {
			System.out.println(esporte.getId() + " " + esporte.getName());
		}
		for (Country co : countries) {
			System.out.println(co.getId() + " " + co.getName());
		}
		for (Athlete at : atletas) {
			System.out.println(at.getId() + " " + at.getCountry() + " " + at.getSport()+ " " + at.getName());
		}

	}

	private static Athlete getAthlete(StringTokenizer st, List<Sport> sports) {
		int id, idSport, idCountry;
		id = nextInt(st);
		idCountry = nextInt(st);
		idSport = nextInt(st);
		Athlete atleta = getSport(idSport, sports);
		atleta.setId(id);
		atleta.setCountry(idCountry);
		atleta.setSport(idSport);
		atleta.setName((String) st.nextElement());
		atleta.addAllResults(getResults(st));
		return atleta;
	}

	private static List<Double> getResults(StringTokenizer st) {
		List<Double> results = new ArrayList<>();
		while(st.hasMoreTokens()) {
			results.add(Double.valueOf(st.nextToken()));
		}
		return results;
	}

	private static Athlete getSport(int idSport, List<Sport> sports) {
		for (Sport sp : sports) {
			if (idSport == sp.getId()) {
				if (sp.getName().equals("Corrida"))
					return new RacingAthlete();
				else if (sp.getName().equals("Natação"))
					return new SwimmingAthlete();
				else if (sp.getName().equals("Levantamento de peso"))
					return new LiftweightAthlete();
				else if (sp.getName().equals("Salto em altura"))
					return new HighJumpAthlete();
				else if (sp.getName().equals("Ginástica Artística"))
					return new ArtisticGymnasticsAthlete();
			}
		}
		return null;

	}

	private static int nextInt(StringTokenizer st) {
		return Integer.parseInt((String) st.nextElement());
	}
}

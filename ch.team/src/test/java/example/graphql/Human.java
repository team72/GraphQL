package example.graphql;

import java.util.Set;

public class Human extends BaseCharacter {

	private String homePlanet;

	public Human(String id, String name, Set<String> friends, Set<Episode> appearsIn, String homePlanet) {
		super(id, name, friends, appearsIn);
		this.homePlanet = homePlanet;
	}

	public String getHomePlanet() {
		return homePlanet;
	}
}

package example.graphql;

import java.util.Set;

public class Human implements Character {

	private String id;
	private String name;
	private Set<String> friends;
	private Set<Episode> appearsIn;
	private String homePlanet;

	public Human(String id, String name, Set<String> friends, Set<Episode> appearsIn, String homePlanet) {
		this.id = id;
		this.name = name;
		this.friends = friends;
		this.appearsIn = appearsIn;
		this.homePlanet = homePlanet;
	}

	@Override
	public String id() {
		return id;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Set<String> friends() {
		return friends;
	}

	@Override
	public Set<Episode> appearsIn() {
		return appearsIn;
	}

	public String getHomePlanet() {
		return homePlanet;
	}
}

package example.graphql;

import java.util.Set;

abstract class BaseCharacter implements Character {

	private String id;
	private String name;
	private Set<String> friends;
	private Set<Episode> appearsIn;

	public BaseCharacter(String id, String name, Set<String> friends, Set<Episode> appearsIn) {
		this.id = id;
		this.name = name;
		this.friends = friends;
		this.appearsIn = appearsIn;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Set<String> getFriends() {
		return friends;
	}

	@Override
	public Set<Episode> getAppearsIn() {
		return appearsIn;
	}

}

package example.graphql;

import java.util.Set;

public class Droid extends BaseCharacter {

	private String primaryFunction;

	public Droid(String id, String name, Set<String> friends, Set<Episode> appearsIn, String primaryFunction) {
		super(id, name, friends, appearsIn);
		this.primaryFunction = primaryFunction;
	}

	public String getPrimaryFunction() {
		return primaryFunction;
	}

}

package example.graphql;

import java.util.Set;

public interface Character {

	String id();

	String name();

	/**
	 * @return Set of Ids.
	 */
	Set<String> friends();

	Set<Episode> appearsIn();
}

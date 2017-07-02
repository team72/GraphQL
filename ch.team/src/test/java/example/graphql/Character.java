package example.graphql;

import java.util.Set;

public interface Character {

	String getId();

	String getName();

	/**
	 * @return Set of Ids.
	 */
	Set<String> getFriends();

	Set<Episode> getAppearsIn();
}

package example.graphql;

import static example.graphql.Episode.EMPIRE;
import static example.graphql.Episode.JEDI;
import static example.graphql.Episode.NEWHOPE;
import static java.util.Arrays.asList;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import graphql.TypeResolutionEnvironment;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.GraphQLObjectType;
import graphql.schema.TypeResolver;
import graphql.schema.idl.EnumValuesProvider;
import graphql.schema.idl.NaturalEnumValuesProvider;

public class StarWarsData {

	private static final Logger log = LoggerFactory.getLogger(StarWarsData.class);

	private static final Human LUKE = new Human(//
			"1000", //
			"luke", //
			new HashSet<>(asList("1002", "1003", "2000", "2001")), //
			EnumSet.of(NEWHOPE, EMPIRE, JEDI), //
			"Tatooine" //
	);

	private static final Human VADER = new Human(//
			"1001", //
			"Darth Vader", //
			new HashSet<>(asList("1004")), //
			EnumSet.of(NEWHOPE, EMPIRE, JEDI), //
			"Tatooine" //
	);

	private static final Human HAN = new Human(//
			"1002", //
			"Han Solo", //
			new HashSet<>(asList("1000", "1003", "2001")), //
			EnumSet.of(NEWHOPE, EMPIRE, JEDI), //
			null //
	);

	private static final Human LEIA = new Human(//
			"1003", //
			"Leia Organa", //
			new HashSet<>(asList("1000", "1002", "2000", "2001")), //
			EnumSet.of(NEWHOPE, EMPIRE, JEDI), //
			"Alderaan" //
	);

	private static final Human TARKIN = new Human(//
			"1004", //
			"Wilhuff Tarkin", //
			new HashSet<>(asList("1001")), //
			EnumSet.of(NEWHOPE), //
			null //
	);

	private static final Droid THREEPIO = new Droid(//
			"2000", //
			"C-3PO", //
			new HashSet<>(asList("1000", "1002", "1003", "2001")), //
			EnumSet.of(NEWHOPE, EMPIRE, JEDI), //
			"Protocol" //
	);

	private static final Droid ARTOO = new Droid(//
			"2001", //
			"R2-D2", //
			new HashSet<>(asList("1000", "1002", "1003")), //
			EnumSet.of(NEWHOPE, EMPIRE, JEDI), //
			"Astromech" //
	);

	/**
	 * key: id
	 */
	private static final Map<String, Human> humanData = initHumanData();

	private static Map<String, Human> initHumanData() {
		Map<String, Human> humanData = new HashMap<>();
		humanData.put("1000", LUKE);
		humanData.put("1001", VADER);
		humanData.put("1002", HAN);
		humanData.put("1003", LEIA);
		humanData.put("1004", TARKIN);
		return humanData;
	}

	/**
	 * key: id
	 */
	private static final Map<String, Droid> droidData = initDroidData();

	private static Map<String, Droid> initDroidData() {
		Map<String, Droid> droidData = new HashMap<>();
		droidData.put("2000", THREEPIO);
		droidData.put("2001", ARTOO);
		return droidData;
	}

	public static DataFetcher<Set<Character>> getFriendsDataFetcher() {
		DataFetcher<Set<Character>> friendsFetcher = new DataFetcher<Set<Character>>() {
			@Override
			public Set<Character> get(DataFetchingEnvironment environment) {
				Character character = environment.getSource();
				return character.getFriends().stream() //
						.map(id -> getCharacter(id)) //
						.collect(Collectors.toSet());
			}
		};

		return friendsFetcher;
	}

	private static Character getCharacter(String id) {
		if (humanData.containsKey(id)) {
			return humanData.get(id);
		}
		if (droidData.containsKey(id)) {
			return droidData.get(id);
		}
		return null;
	}

	public static TypeResolver getCharacterTypeResolver() {
		TypeResolver tr = new TypeResolver() {
			@Override
			public GraphQLObjectType getType(TypeResolutionEnvironment env) {
				if (env.getObject() instanceof Human) {
					return StarWarsSchema.humanType;
				}
				if (env.getObject() instanceof Droid) {
					return StarWarsSchema.droidType;
				}
				return null;
			}
		};

		return tr;
	}

	public static Object getArtoo() {
		// TODO Auto-generated method stub
		return null;
	}

	public static DataFetcher<Human> getHumanDataFetcher() {

		DataFetcher<Human> humanDataFetcher = new DataFetcher<Human>() {
			@Override
			public Human get(DataFetchingEnvironment environment) {
				String id = environment.getArgument("id");
				return humanData.get(id);
			}
		};

		return humanDataFetcher;
	}

	public static DataFetcher<Droid> getDroidDataFetcher() {

		DataFetcher<Droid> droidDataFetcher = new DataFetcher<Droid>() {
			@Override
			public Droid get(DataFetchingEnvironment environment) {
				String id = environment.getArgument("id");
				return droidData.get(id);
			}
		};

		return droidDataFetcher;
	}

	public static EnumValuesProvider getEpisodeResolver() {
		return new NaturalEnumValuesProvider<>(Episode.class);
	}

	public static DataFetcher getHeroDataFetcher() {
		// TODO Auto-generated method stub
		return null;
	}

	// static def luke = [
	// id : '1000',
	// name : 'Luke Skywalker',
	// friends : ['1002', '1003', '2000', '2001'],
	// appearsIn : [4, 5, 6],
	// homePlanet: 'Tatooine'
	// ];
	//
	// static def vader = [
	// id : '1001',
	// name : 'Darth Vader',
	// friends : ['1004'],
	// appearsIn : [4, 5, 6],
	// homePlanet: 'Tatooine',
	// ];
	//
	// static def han = [
	// id : '1002',
	// name : 'Han Solo',
	// friends : ['1000', '1003', '2001'],
	// appearsIn: [4, 5, 6],
	// ];
	//
	// static def leia = [
	// id : '1003',
	// name : 'Leia Organa',
	// friends : ['1000', '1002', '2000', '2001'],
	// appearsIn : [4, 5, 6],
	// homePlanet: 'Alderaan',
	// ];
	//
	// static def tarkin = [
	// id : '1004',
	// name : 'Wilhuff Tarkin',
	// friends : ['1001'],
	// appearsIn: [4],
	// ];
	//
	// static def humanData = [
	// '1000': luke,
	// '1001': vader,
	// '1002': han,
	// '1003': leia,
	// '1004': tarkin,
	// ];
	//
	// static def threepio = [
	// id : '2000',
	// name : 'C-3PO',
	// friends : ['1000', '1002', '1003', '2001'],
	// appearsIn : [4, 5, 6],
	// primaryFunction: 'Protocol',
	// ];
	//
	// static def artoo = [
	// id : '2001',
	// name : 'R2-D2',
	// friends : ['1000', '1002', '1003'],
	// appearsIn : [4, 5, 6],
	// primaryFunction: 'Astromech',
	// ];
	//
	// static def droidData = [
	// "2000": threepio,
	// "2001": artoo,
	// ]
	//
	// static def getCharacter(String id) {
	// if (humanData[id] != null) return humanData[id]
	// if (droidData[id] != null) return droidData[id]
	// return null
	// }
	//
	// static DataFetcher humanDataFetcher = new DataFetcher() {
	// @Override
	// Object get(DataFetchingEnvironment environment) {
	// def id = environment.arguments.id
	// humanData[id]
	// }
	// }
	//
	//
	// static DataFetcher droidDataFetcher = new DataFetcher() {
	// @Override
	// Object get(DataFetchingEnvironment environment) {
	// def id = environment.arguments.id
	// droidData[id]
	// }
	// }
	//
	// static TypeResolver characterTypeResolver = new TypeResolver() {
	// @Override
	// GraphQLObjectType getType(TypeResolutionEnvironment env) {
	// def id = env.getObject().id
	// if (humanData[id] != null)
	// return StarWarsSchema.humanType
	// if (droidData[id] != null)
	// return StarWarsSchema.droidType
	// return null;
	// }
	// }
	//
	// static DataFetcher friendsDataFetcher = new DataFetcher() {
	// @Override
	// Object get(DataFetchingEnvironment environment) {
	// List<Object> result = []
	// for (String id : environment.source.friends) {
	// result.add(getCharacter(id))
	// }
	// result
	// }
	// }
	//
	// static DataFetcher heroDataFetcher = new DataFetcher() {
	// @Override
	// public Object get(DataFetchingEnvironment environment) {
	// if (environment.containsArgument("episode")
	// && 5 == environment.getArgument("episode")) return luke;
	// return artoo;
	// }
	// };

}

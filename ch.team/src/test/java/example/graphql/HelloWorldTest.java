package example.graphql;

import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;

import java.util.Map;

import graphql.GraphQL;
import graphql.schema.DataFetcher;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;

/**
 * 
 * @author rhei
 *
 */
public class HelloWorldTest {
	
	public static class Foo {
		String id;
		String bar;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBar() {
			return bar;
		}

		public void setBar(String bar) {
			this.bar = bar;
		}

	}
	
	public static void main(String[] args) {
		HelloWorldTest inst = new HelloWorldTest();
		GraphQLObjectType queryType = inst.creatingSchema();
		
		GraphQLSchema schema = GraphQLSchema.newSchema()
                .query(queryType)
                .build();
		
		GraphQL graphQL = GraphQL.newGraphQL(schema).build();
		Map<String, Object> result = graphQL.execute("{bar}").getData();
        System.out.println(result);
        Map<String, Object> resultId = graphQL.execute("{id}").getData();
        System.out.println(resultId);

	}

	/**
	 * IDL example:
	 * type Foo {
	 * 	bar: String
	 * 	id: String
	 * }
	 * 
	 * @return
	 */
	public GraphQLObjectType creatingSchema() {
		GraphQLObjectType fooType = newObject()
				.name("Foo")
				.field(newFieldDefinition()
						.name("bar")
						.type(GraphQLString)
						.staticValue("world"))
				.field(newFieldDefinition()
						.name("id")
						.type(GraphQLString)
						.staticValue("id world"))
				.build();
		return fooType;
	}

	public DataFetcher<Foo> createDataFetcher() {
		DataFetcher<Foo> fooDataFetcher = environment -> {
			// environment.getSource() is the value of the surrounding
			// object. In this case described by objectType
			Foo value = perhapsFromDatabase(); // Perhaps getting from a DB or
												// whatever
			return value;
		};
		return fooDataFetcher;
	}

	private Foo perhapsFromDatabase() {
		Foo instance = new Foo();
		instance.setId("1010");
		instance.setBar("bar input");
		
		return instance;
	}
	

}

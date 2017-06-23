package graphql;

import static graphql.Scalars.GraphQLString;
import static graphql.Scalars.GraphQLBoolean;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;

import java.util.Map;

import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;

public class MyHelloWorld {

	public static void main(String[] args) {
		MyHelloWorld instance = new MyHelloWorld();
		instance.helloWorld();
		instance.simpson();
	}
	
	private void simpson() {
		GraphQLObjectType simpsonCharacter = newObject()
			    .name("SimpsonCharacter")
			    .description("A Simpson character")
			    .field(newFieldDefinition()
			            .name("name")
			            .description("The name of the character.")
			            .type(GraphQLString))
			    .field(newFieldDefinition()
			            .name("mainCharacter")
			            .description("One of the main Simpson characters?")
			            .type(GraphQLBoolean))
			.build();
		
		GraphQLSchema schema = GraphQLSchema.newSchema().query(simpsonCharacter).build();

		GraphQL graphQL = GraphQL.newGraphQL(schema).build();

		Map<String, Object> result = graphQL.execute("{SimpsonCharacter}").getData();
		System.out.println(result);
		// Prints: {helloReto=world}
	}

	private void helloWorld() {
		GraphQLObjectType queryType = newObject()//
				.name("helloWorldQuery")//
				.field(newFieldDefinition()//
						.type(GraphQLString)//
						.name("helloReto")//
						.staticValue("world")).build();

		GraphQLSchema schema = GraphQLSchema.newSchema().query(queryType).build();

		GraphQL graphQL = GraphQL.newGraphQL(schema).build();

		Map<String, Object> result = graphQL.execute("{helloReto}").getData();
		System.out.println(result);
		// Prints: {helloReto=world}
	}
}

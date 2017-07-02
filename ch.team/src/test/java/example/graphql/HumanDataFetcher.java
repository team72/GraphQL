package example.graphql;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

public class HumanDataFetcher implements DataFetcher {

	@Override
	public Object get(DataFetchingEnvironment environment) {
		// TODO Auto-generated method stub
		String id = environment.getArgument("id");
		String mockData = "Luke" + id;
		System.out.println("--- Test "+mockData);
		
		return mockData;
	}

}

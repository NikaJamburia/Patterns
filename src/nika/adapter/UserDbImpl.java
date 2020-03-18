package nika.adapter;

import java.util.Collections;
import java.util.List;

public class UserDbImpl implements UserDb {

	@Override
	public User select(String query) {
		System.out.println("Running query -> " + query);
		// Some db operations
		return new User(1L, "Nika");
	}

	@Override
	public List<User> selectAll(String query) {
		System.out.println("Running query -> " + query);
		// Some db operations
		return Collections.emptyList();
	}

	@Override
	public void runQuery(String query) {
		System.out.println("Running query -> " + query);
		// Some db operations
	}
}

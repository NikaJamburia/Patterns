package nika.adapter;

import java.util.List;

public interface UserDb {
	User select(String query);

	List<User> selectAll(String query);

	void runQuery(String query);
}

package nika.adapter;

import java.util.Optional;

public class UserRepositoryDbAdapter implements UserRepository { // Adapts my repository to work with db

	private UserDb userDb;

	public UserRepositoryDbAdapter(UserDb userDb) {
		this.userDb = userDb;
	}

	@Override
	public Optional<User> get(Long id) {
		String query = "Select from users where id = " + id + ";";
		return Optional.ofNullable(userDb.select(query));
	}

	@Override
	public void save(User user) {
		String query = String.format("Insert into users(id, name) values (%s, %s)", user.getId(), user.getName());
		userDb.runQuery(query);
	}

	@Override
	public void delete(User user) {
		String query = String.format("Delete from users where id = %s)", user.getId());
		userDb.runQuery(query);
	}
}

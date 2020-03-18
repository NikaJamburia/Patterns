package nika.adapter;

import java.util.List;
import java.util.Optional;

public class UserRepositoryListAdapter implements UserRepository { // Adapts my custom repository to java collections APi
	private List<User> users;

	public UserRepositoryListAdapter(List<User> users) {
		this.users = users;
	}

	@Override
	public Optional<User> get(Long id) {
		return users.stream().filter(user -> user.getId().equals(id)).findFirst();
	}

	@Override
	public void save(User user) {
		users.add(user);
	}

	@Override
	public void delete(User user) {
		users.remove(user);
	}
}

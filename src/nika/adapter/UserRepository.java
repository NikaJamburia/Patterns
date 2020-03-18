package nika.adapter;

import java.util.Optional;

public interface UserRepository {
	Optional<User> get(Long id);
	void save(User user);
	void delete(User user);
}

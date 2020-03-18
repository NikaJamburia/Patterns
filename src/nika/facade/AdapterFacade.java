package nika.facade;

import nika.adapter.*;

import java.util.ArrayList;
import java.util.List;

public class AdapterFacade implements Facade {
	@Override
	public void compose() {
		List<User> users = new ArrayList<>();
		users.add(new User(1L, "Nika"));
		users.add(new User(2L, "Beqa"));
		users.add(new User(3L, "Nino"));
		users.add(new User(5L, "Vano"));
		users.add(new User(7L, "Gio"));
		users.add(new User(10L, "Eka"));

		UserDb dataBase = new UserDbImpl();

		UserRepository listRepository = new UserRepositoryListAdapter(users);
		UserRepository dbRepository = new UserRepositoryDbAdapter(dataBase);

		System.out.println("Select using list");
		System.out.println(listRepository.get(2L).get());
		System.out.println();

		System.out.println("Select using db");
		System.out.println(dbRepository.get(1L).get());
		System.out.println();

		System.out.println("insert using list");
		listRepository.save(new User(11L, "Nikusha"));
		System.out.println(listRepository.get(11L).get());
		System.out.println();

		System.out.println("insert using db");
		dbRepository.save(new User(12L, "Jora"));
		System.out.println();
	}
}

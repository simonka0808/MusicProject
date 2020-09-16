package app.repository.people;

import java.util.ArrayList;
import java.util.List;

import app.model.Person;
import app.model.Song;

public class PeopleRepository implements People {

	List<Person> listPeople = new ArrayList<Person>();

	public PeopleRepository() {
		this.listPeople = listPeople;
	}

	@Override
	public Person addPerson(Person person) {
		listPeople.add(person);
		return person;
	}

	@Override
	public List<Person> getPerson() {

		return listPeople;
	}

	@Override
	public void updatePerson(Person person, Song song) {
		Person p = listPeople.stream().filter(e -> e.equals(person)).findFirst().orElse(null);
		p.getPlaylist().add(song);
	}

	@Override
	public boolean deletePerson(Person person) {
		return listPeople.remove(person);
	}

}

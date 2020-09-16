package app.repository.people;

import java.util.List;

import app.model.Person;
import app.model.Song;

public interface People {
	
	public Person addPerson(Person person);
	public List<Person> getPerson();
	public void updatePerson(Person person, Song song);
	public boolean deletePerson(Person person);
	
}

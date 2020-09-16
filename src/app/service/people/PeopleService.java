package app.service.people;

import java.util.List;

import app.model.Person;
import app.model.Song;
import app.model.Subscription;

public interface PeopleService {

	public Person addPerson(Person person);
	public List<Person> getPerson();
	public void updatePerson(Person person, Song song);
	public boolean deletePerson(Person person);
	public void payment(double money, String name);
	public void addMoney(double money, String name);
	public double checkAmount(String name);
	public void paySubscription(String type, String name);
}

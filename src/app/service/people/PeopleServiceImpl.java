package app.service.people;

import java.util.List;

import app.model.Person;
import app.model.Song;
import app.model.Subscription;
import app.repository.people.People;
import app.repository.people.PeopleRepository;

public class PeopleServiceImpl implements PeopleService {

	private People peopleRepository;

	public PeopleServiceImpl() {
		this.peopleRepository = new PeopleRepository();
	}

	@Override
	public Person addPerson(Person person) {
		peopleRepository.addPerson(person);
		return person;
	}

	@Override
	public List<Person> getPerson() {
		return peopleRepository.getPerson();
	}

	@Override
	public void updatePerson(Person person, Song song) {

		if (checkParam(person, song)) {
			peopleRepository.updatePerson(person, song);

		}else {
			System.out.println("Please try again!");
		}

	}

	public boolean checkParam(Person person, Song song) {
		boolean isTrue;
		if (person == null || song == null) {
			isTrue = false;
		} else {
			isTrue = true;
		}
		return isTrue;
	}

	@Override
	public boolean deletePerson(Person person) {
		
		return peopleRepository.deletePerson(person);
	}

	@Override
	public void payment(double money, String name) {
		
		Person p1 = peopleRepository.getPerson().stream()
				 .filter( x-> x.getFirstName().equalsIgnoreCase(name)).findFirst().orElse(null);
		
		p1.getBank().setMoneyIn(p1.getBank().getMoneyIn() - money);
		
	}

	@Override
	public void addMoney(double money, String name) {
		Person p1 = peopleRepository.getPerson().stream()
				 .filter( x-> x.getFirstName().equalsIgnoreCase(name)).findFirst().orElse(null);
		
		p1.getBank().setMoneyIn(p1.getBank().getMoneyIn() + money);
		
	}

	@Override
	public double checkAmount(String name) {
		Person p1 = peopleRepository.getPerson().stream()
				 .filter( x-> x.getFirstName().equalsIgnoreCase(name)).findFirst().orElse(null);
		
		return p1.getBank().getMoneyIn();
	}

	@Override
	public void paySubscription(String type, String name) {
		Person p1 = peopleRepository.getPerson().stream()
			      .filter( x-> x.getFirstName().equalsIgnoreCase(name)).findFirst().orElse(null);
		
		Subscription s = new Subscription(type);
		
		if(p1.getBank() != null) {
			if(p1.getBank().getMoneyIn() >= s.getPrice()) {
				
				p1.getBank().setMoneyIn(p1.getBank().getMoneyIn() - s.getPrice());
				
				p1.setSubscription(s);
			}
		}
	
		
	}

}

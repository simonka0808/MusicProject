package app.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int age;
	private BankAcc bank;
	private List<Song> playlist;
	private Subscription subscription;

	public Person(String firstName, String lastName, String email, String password, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.age = age;
		this.playlist = new ArrayList<Song>();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Song> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Song> playlist) {
		this.playlist = playlist;
	}

	public BankAcc getBank() {
		return bank;
	}

	public void setBank(BankAcc bank) {
		this.bank = bank;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("First name: %s", this.getFirstName()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Last name: %s", this.getLastName()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Email: %s", this.getEmail()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Password: %s", this.getPassword()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Age: %d", this.getAge()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Playlist: %s", this.getPlaylist().toString()));
		return sb.toString();
	}

}

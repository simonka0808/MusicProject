package app;

import app.model.Author;
import app.model.BankAcc;
import app.model.Person;
import app.model.Song;
import app.service.author.AuthorService;
import app.service.author.AuthorServiceImpl;
import app.service.music.MusicService;
import app.service.music.MusicServiceImpl;
import app.service.people.PeopleService;
import app.service.people.PeopleServiceImpl;

public class MusicApp {
	
	public static void main(String[] args) {
		Person p1 = new Person("Simona", "Georgieva", "simonka@gmail.com", "0000", 20);
		Author a1 = new Author("Ariana Grande", "USA", 10);
		Song s1 = new Song("7 rings",3 , a1, "pop");
		
		BankAcc account = new BankAcc("15879523", "HSBC", 20, "Debit");
		p1.setBank(account);
		
		AuthorService authorService = new AuthorServiceImpl();
		authorService.addAuthor(a1);
		MusicService musicService = new MusicServiceImpl();
		musicService.addSong(s1);
		PeopleService peopleService = new PeopleServiceImpl();
		peopleService.addPerson(p1);
		peopleService.paySubscription("PREMIUM", "Simona");
		peopleService.updatePerson(p1, s1);

		peopleService.getPerson().stream().forEach(e -> System.out.println(e));
		
		
		
		String something = " vimsv46din7lv 4i7viln67v6in7i67dsnsin7v676vrdsvrd ";
		
		something.
		
		
	}

}

package app.repository.author;

import java.util.ArrayList;
import java.util.List;

import app.model.Author;

public class AuthorRepository implements Authors {

	private List<Author> authorList;

	public AuthorRepository() {
		this.authorList = new ArrayList<Author>();
	}

	@Override
	public Author addAuthor(Author author) {
		authorList.add(author);
		return author;
	}

	@Override
	public List<Author> getAuthor() {

		return authorList;
	}

	@Override
	public void updateRating(Author author, int rating) {
		Author a1 = authorList.stream().filter(e -> e.equals(author)).findFirst().orElse(null);
		a1.setRating(rating);
	}

	@Override
	public boolean deleteAuthor(Author author) {
		return authorList.remove(author);
	}

}

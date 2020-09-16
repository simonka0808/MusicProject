package app.repository.author;

import java.util.List;

import app.model.Author;

public interface Authors {

	public Author addAuthor(Author author);
	public List<Author> getAuthor();
	public void updateRating(Author author, int rating);
	public boolean deleteAuthor(Author author);
}

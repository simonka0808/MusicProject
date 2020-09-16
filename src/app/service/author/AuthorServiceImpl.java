package app.service.author;

import java.util.List;

import app.model.Author;
import app.repository.author.AuthorRepository;
import app.repository.author.Authors;

public class AuthorServiceImpl implements AuthorService {
	
	private Authors authorsRepository;
	
	public AuthorServiceImpl() {
		authorsRepository = new AuthorRepository();
	}

	@Override
	public Author addAuthor(Author author) {
		return authorsRepository.addAuthor(author);
	}

	@Override
	public List<Author> getAuthor() {
		return authorsRepository.getAuthor();
	}

	@Override
	public void updateRating(Author author, int rating) {
		
		if(checkRatingInRange(rating)) {
			authorsRepository.updateRating(author, rating);
		}else {
			System.out.println("This rating is not in the range, please try again!");
		}
	}
	
	private boolean checkRatingInRange(int rating) {
		boolean isTrue;
		if(rating >= 1 && rating <= 10) {
			isTrue = true;
		}else {
			isTrue = false;
		}
		return isTrue;
	}

	@Override
	public boolean deleteAuthor(Author author) {
		return authorsRepository.deleteAuthor(author);
	}

}

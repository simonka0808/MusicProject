package app.model;

import app.util.enums.Genre;

public class Song {

	private String name;
	private int duration;
	private Author author;
	private String genre;

	public Song(String name, int duration, Author author, String genre) {
		this.name = name;
		this.duration = duration;
		this.author = author;
		this.setGenre(genre);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		
		for (Genre g : Genre.values()) {
			if(genre.equalsIgnoreCase(g.name())) {
				this.genre = g.name();
				break;
			}
		}
		
		if(genre == null) {
			this.genre = genre;
		}
		
	}
 
 
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Name: %s ", this.getName()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Duration: %d ", this.getDuration()));
		sb.append(String.format("Author: %s ", this.getAuthor().getName()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Genre: %s ", this.getGenre()));
		sb.append(System.lineSeparator());
		
		return sb.toString();
	}
}

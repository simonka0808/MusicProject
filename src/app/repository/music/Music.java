package app.repository.music;

import java.util.List;

import app.model.Song;

public interface Music {

	public Song addSong(Song song);
	public List<Song> getSongs();
	public boolean deleteSong(Song song);
	
	
	
}

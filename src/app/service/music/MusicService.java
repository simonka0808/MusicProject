package app.service.music;

import java.util.List;

import app.model.Song;

public interface MusicService {

	public Song addSong(Song song);
	public List<Song> getSongs();
	public boolean deleteSong(Song song);
	
}

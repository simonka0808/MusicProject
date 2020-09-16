package app.repository.music;

import java.util.ArrayList;
import java.util.List;

import app.model.Song;

public class MusicRepository implements Music {

	private List<Song> allSongs;

	public MusicRepository() {
		this.allSongs = new ArrayList<Song>();
	}

	@Override
	public Song addSong(Song song) {
		allSongs.add(song);
		return song;
	}

	@Override
	public List<Song> getSongs() {
		return allSongs;
	}

	@Override
	public boolean deleteSong(Song song) {
		return allSongs.remove(song);
	}

}

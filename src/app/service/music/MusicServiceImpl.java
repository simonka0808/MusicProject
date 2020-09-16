package app.service.music;

import java.util.List;

import app.model.Song;
import app.repository.music.Music;
import app.repository.music.MusicRepository;

public class MusicServiceImpl implements MusicService {

	private Music musicRepository;

	public MusicServiceImpl() {
		this.musicRepository = new MusicRepository();
	}

	@Override
	public Song addSong(Song song) {
		musicRepository.addSong(song);
		return song;
	}

	@Override
	public List<Song> getSongs() {
		return musicRepository.getSongs();
	}

	@Override
	public boolean deleteSong(Song song) {
		return musicRepository.deleteSong(song);
	}

}

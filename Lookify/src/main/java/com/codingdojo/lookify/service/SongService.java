package com.codingdojo.lookify.service;

import java.util.List;
//import java.util.Optional;
//
//import javax.validation.Valid;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepository;

@Service
public class SongService {

	@Autowired
	SongRepository songRepository;
	
	public List<Song> getAllSongs() {
		return songRepository.findAll();
	}

	public void createSong(@Valid Song song) {
		songRepository.save(song);
	}

	public Song getOneSong(Long id) {
		Optional<Song> optionalSong = songRepository.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		} else {
		return null;
		}
	}
	
	public List<Song> findSongsByArtist(String artist) {
		System.out.println(songRepository.findByArtistContaining(artist));
		return songRepository.findByArtistContaining(artist);
	}
	
	public List<Song> findTopTen() {
		System.out.println(songRepository.findTop10ByOrderByRatingDesc());
		return songRepository.findTop10ByOrderByRatingDesc();
	}
	
	public void deleteSong(Long id) {
		songRepository.deleteById(id);
	}
	
}

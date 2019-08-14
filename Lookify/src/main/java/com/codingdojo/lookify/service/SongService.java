package com.codingdojo.lookify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepository;

@Service
public class SongService {

	@Autowired
	SongRepository songRepository;
	
	// lists all song
	public List<Song> getAllSongs(){
		return songRepository.findAll();
	}
	
//	//creates new song
//	public void createOrUpdateSong(@Valid Song song) {
//		songRepository.save(song);
//	}
//	
//	public Song getOneSong(Long id) {
//		Optional <Song> optionalSong = songRepository.findById(id);
//		if (optionalSong.isPresent()) {
//			return optionalSong.get();
//		} else {
//			return null;
//		}
//	public void deleteSong(Long id) {
//		songRepository.deleteById(id);
//		}
//	}
	
}

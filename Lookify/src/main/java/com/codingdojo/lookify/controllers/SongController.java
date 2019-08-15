package com.codingdojo.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.service.SongService;

@Controller
public class SongController {
	@Autowired
	SongService songService;
	
	//	Index Page
	@GetMapping("/")
	public String index(Model model) {
		return "lookify/index.jsp";
	}
	
	// dashboard page
	@GetMapping("/lookify/dashboard")
	public String home(Model model) {
		List<Song> allSongs = songService.getAllSongs();
		model.addAttribute("Songs", allSongs);
		return "lookify/dashboard.jsp";
	}
	
	@GetMapping("/lookify/new")
	public String newSong(Model model) {
		model.addAttribute("newSongObject", new Song());
		return "lookify/new.jsp";
	}
	@PostMapping("/lookify/process")
	public String createSong(@Valid @ModelAttribute("newSongObject") Song song, BindingResult results) {
		if(results.hasErrors()) {
			return "lookify/new.jsp";
		}
		songService.createSong(song);
		return "redirect:/lookify/dashboard";
	}
	@GetMapping("/lookify/{id}")
	public String show(@PathVariable("id")Long id, Model model) {
		Song song = songService.getOneSong(id);
		model.addAttribute("Song", song);
		return "lookify/show.jsp";
	}
	@GetMapping("/lookify/search")
	public String findByArtist(Model model, @RequestParam(value="search") String artist) {
		List<Song> songs = songService.findSongsByArtist(artist);
		model.addAttribute("songs", songs);
		return "/lookify/search.jsp";
	}
	@GetMapping("/lookify/topten")
	public String topTen(Model model) {
		List<Song> songs = songService.findTopTen();
		model.addAttribute("songs", songs);
		return "/lookify/topten.jsp";
	}
	@GetMapping("/lookify/{id}/delete")
	public String destroy(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/lookify/dashboard";
	}

}
	
	
	
	

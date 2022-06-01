package com.microservice.music.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.music.crud.model.Music;

@Service
public interface MusicService {
	List<Music> getAllMusic();
	Music getMusicById(long musicId);
	Music createMusic(Music music);
	Music updateMusic(Music music);
	List<Music> getMusicByUploader(String musicUploader);
	void deleteMusic(long id);
}
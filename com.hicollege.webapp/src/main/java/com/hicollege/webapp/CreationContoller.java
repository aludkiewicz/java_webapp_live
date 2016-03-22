package com.hicollege.webapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/add", method = RequestMethod.PUT)
public class CreationContoller {
    
    @Autowired
    private Dao dao;
    
    @RequestMapping(value = "/user")
    public void createAndSaveUser(
        @RequestParam(value = "username", required = true) String username,
        @RequestParam(value = "email", required = true) String email,
        @RequestParam(value = "age", required = true) String age,
        @RequestParam(value = "albums", required = false) List<Album> albums) {
        
        dao.createAndSaveObject(new User(username, email, age));
    }
    
    @RequestMapping(value = "/album")
    public void createAndSaveAlbum(
        @RequestParam(value = "title", required = true) String title,
        @RequestParam(value = "songs", required = true) List<String> songs,
        @RequestParam(value = "artists", required = true) List<String> artists) {
        
        Album album = new Album();
        album.setArtists(artists);
        album.setSongs(songs);
        album.setTitle(title);
        
        dao.createAndSaveObject(album);
        
    }

}

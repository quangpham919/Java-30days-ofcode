package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private ArrayList<Song> songs ;
    public Album (){
        songs = new ArrayList<Song>();
    }

    public boolean addSong( String title, double duration) {
        Song isExisted = findSong(title);
        if ( isExisted == null ) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addSongToPlaylist(String title, LinkedList<Song> playList){
        Song isExisted = findSong(title);
        if ( isExisted != null ) {
            playList.add(isExisted);
            return true;
        }
        System.out.println("Song is not existed in the album");
        return false;
    }

    public boolean removeSong(String title, LinkedList<Song> playList) {
        ListIterator<Song> iterator = playList.listIterator();
        Song isExisted = findSong(title);
        if(isExisted != null) {
            songs.remove(isExisted);
            while(iterator.hasNext()){
                Song toRemove = iterator.next();
                if(toRemove == isExisted){
                    iterator.remove();
                    break;
                }
            }
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean querySong(String title) {
        for (Song song : songs ) {
            if(song.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
}

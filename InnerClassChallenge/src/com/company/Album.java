package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private final SongList songs;
    public Album (){
        songs = new SongList();
    }

    private class SongList {
        private final List<Song> songs ;

        public SongList () {
            this.songs = new ArrayList<Song>();
        }

        public boolean addSongToList( String title, double duration){
            Song isExisted = findSong(title);
            if (isExisted == null) {
                songs.add(new Song(title, duration));
                return true;
            }
            return false;

        }


        public Song findSong(String title){
            for(Song song : songs){
                if(song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }
    }

    public void addSong(String title, double duration) {
        songs.addSongToList(title, duration);
    }

    public boolean addSongToPlaylist(String title, LinkedList<Song> playList){
        Song isExisted = this.songs.findSong(title);
        if ( isExisted != null ) {
            playList.add(isExisted);
            return true;
        }
        System.out.println("Song is not existed in the album");
        return false;
    }

//    public boolean removeSong(String title, LinkedList<Song> playList) {
//        ListIterator<Song> iterator = playList.listIterator();
//        Song isExisted = findSong(title);
//        if(isExisted != null) {
//            songs.remove(isExisted);
//            while(iterator.hasNext()){
//                Song toRemove = iterator.next();
//                if(toRemove == isExisted){
//                    iterator.remove();
//                    break;
//                }
//            }
//            return true;
//        }
//        return false;
//    }


    public boolean querySong(String title) {
        Song isExisted = songs.findSong(title);
        return isExisted != null;
    }
}

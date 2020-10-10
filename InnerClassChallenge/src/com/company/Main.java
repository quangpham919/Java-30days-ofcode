package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Album> albums = new ArrayList<Album>();
    private static final LinkedList<Song> playList = new LinkedList<Song>();

    public static void main(String[] args) {
        Album quang = new Album();
        Album summer = new Album();

        quang.addSong("Perfect", 3.25);
        quang.addSong("Dong", 3.22);
        quang.addSong("Vui", 3.21);

        summer.addSong("He",2.20);
        summer.addSong("DMM", 3.33);

        albums.add(quang);
        albums.add(summer);

        add("Perfect");
        add("He");
        add("DMM");
        add("Dong");
        add("Vui");
        play();

    }

    private static void menu(){
        System.out.println("**************");
        System.out.println("Welcome to music player...");
        System.out.println("Choose one of these options: \n" +
                "1. Quit \n" +
                "2. Play the next song \n" +
                "3. Play the previous song \n" +
                "4. Replay the current song \n" +
                "5. List the song in playlist \n" +
                "6. Remove current song from playlist \n");
    }

    private static void play(){
        ListIterator<Song> iterator = playList.listIterator();
        if(!iterator.hasNext()){
            System.out.println("The playlist is empty. Please add a song to play.");
        }
        else{
            Song playing = iterator.next();
            System.out.println("Now playing... --> " + playing.getTitle() + " in " + playing.getDuration() + " minutes"  );
            boolean quit = false;
            boolean forward = true;
            menu();
            while (!quit) {
                int choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        quit = true;
                        System.out.println("Closing music player ....");
                        break;
                    case 2 :
                        if(!forward){
                            if(iterator.hasNext())
                            {
                              playing = iterator.next();
                            }
                            forward = true;
                        }
                        if(iterator.hasNext())
                        {
                            playing = iterator.next();
                            System.out.println("Now playing... --> " + playing.getTitle() + " in " + playing.getDuration() + " minutes"  );
                        }
                        else{
                            System.out.println("You are at the end of playlist. Add more song to play");
                            forward=false;
                        }
                        break;
                    case 3 :
                        if(forward){
                           if(iterator.hasPrevious()) {
                                playing = iterator.previous();
                           }
                           forward = false;
                        }
                        if(iterator.hasPrevious()){
                            playing = iterator.previous();
                            System.out.println("Now playing... --> " + playing.getTitle() + " in " + playing.getDuration() + " minutes"  );
                        }
                        else{
                            System.out.println("You are at the start of playlist. Next to play the song");
                            forward = true;
                        }
                        break;
                    case 4 :
                        System.out.println("Replaying... --> " + playing.getTitle() + " in " + playing.getDuration() + " minutes"  );
                        break;
                    case 5 :
                        print();
                        break;
                    case 6 :
                        if (playList.size() == 0) {
                            System.out.println("You are not playing any song.");
                            break;
                        }
                        iterator.remove();
                        System.out.println(playing.getTitle() + " has been removed from playlist");
                        if(iterator.hasNext()){
                            playing=iterator.next();
                            System.out.println("Now playing... --> " + playing.getTitle() + " in " + playing.getDuration() + " minutes"  );
                        }
                        else if (iterator.hasPrevious()){
                            playing = iterator.previous();
                            System.out.println("Now playing... --> " + playing.getTitle() + " in " + playing.getDuration() + " minutes"  );
                        }
                        else {
                            System.out.println("The playlist is empty.");
                        }
                        break;
                }

            }
            scanner.close();

        }
    }


    private static void add (String title) {
        boolean res = false;
        for(Album album : albums){
            if(album.querySong(title)){
                res = album.addSongToPlaylist(title,playList);
                break;
            }
        }
        if(res) {
            System.out.println(title + " has been added successfully.");
        }
        else {
            System.out.println(title + " cannot be added. Please use valid song in the album");
        }
    }

    private static void print(){
        ListIterator<Song> iterator = playList.listIterator();
        System.out.println("Song in playlist: ");
        while(iterator.hasNext()){
            Song song = iterator.next();
            System.out.println("Title --> "+ song.getTitle());
            System.out.println("Duration --> "+ song.getDuration() + "\n");
        }
    }



}

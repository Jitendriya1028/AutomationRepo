package Pogram;

import java.util.LinkedList;
import java.util.Queue;

public class RecentSongs {
	private Queue<String> songs;
	private int capacity;
	
	public RecentSongs(int capacity) {
		this.songs = new LinkedList<>();
		this.capacity = capacity;
	}
	
	public void addSong(String song) {
		if(songs.size() == capacity) {
			songs.remove();//Remove the old song from the queue

		}
		songs.add(song);//add the new song to the end of the queue
		
	}
	public void printRecentSongs() {
		System.out.println("Recently played Song:");
		for(String song : songs) {
			System.out.println(song);
			
		}
	}

}

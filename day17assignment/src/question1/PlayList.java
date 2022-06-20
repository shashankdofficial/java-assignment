package question1;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	public List<Song> songs = new ArrayList<>();

	public void addSong(Song song)
	{
		if(songs.contains(song)||songs.contains(song))
		{		
			 System.out.println("Song is already added in the playlist");
			 System.out.println("========================");
		}
		else
		{
			 songs.add(song);
			 System.out.println("Song added to the playlist successfully.");
			 System.out.println("=======================");
		}	
	}
	public List <Song> getAllSongs()
	{
		return this.songs;
	}
}

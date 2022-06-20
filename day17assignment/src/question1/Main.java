package question1;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		PlayList list = new PlayList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Songs Details:");
		System.out.println("--------------------------");
		int count = 1;
		while(count<=4)
		{
			count++;
			System.out.println("Enter Song Name");
			String name = scan.next();
			
			System.out.println("Enter Movie Name");
			String MovieName = scan.next();
			
			Song song = new Song(MovieName,name);
			list.addSong(song);
		}
		
		for(int i=0;i<list.songs.size();i++)
		{
			Song song1 = list.songs.get(i);
			song1.play();
			
		}
		scan.close();
	}
}

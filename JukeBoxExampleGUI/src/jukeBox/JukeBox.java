package jukeBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

import javax.swing.JOptionPane;


public class JukeBox {
	
	private LinkedList<Song>thePlayList;
	private String FILE_NAME = "playList.data";

	public JukeBox() {

		String input = JOptionPane.showInputDialog("Would you like to load the previous playlist? \nPress 1 to reload \nPress any other number to start a new playlist");
		int choice = Integer.parseInt(input);

		if (choice == 1) {

			deserialize();

		} else {

			this.thePlayList =  new LinkedList<Song> ();
		}

	}

	public void addSong(Song song) {
		this.thePlayList.addLast(song);
		//serialize();
	}

	public void addS1() {
		this.thePlayList.add(new Song("Prowler "));
		//serialize();
	}

	public void addS2() {
		this.thePlayList.add(new Song("The Final Countdown "));
		//serialize();
	}

	public void addS3() {
		this.thePlayList.add(new Song("Thunderstruck "));
		//serialize();
	}

	public void addS4() {
		this.thePlayList.add(new Song("Tom Sawyer "));
		//serialize();
	}

	public void addS5() {
		this.thePlayList.add(new Song("Tai Shan "));
		//serialize();
	}

	public void addS6() {
		this.thePlayList.add(new Song("Red Barchetta "));
		//serialize();
	}

	public void addS7() {
		this.thePlayList.add(new Song("Smell the Glove  "));
		//serialize();
	}

	public void play(){
		this.thePlayList.removeFirst();
		serialize();
	}

	public int getSize() {
		int size;

		size = this.thePlayList.size();
		return size;
	}

	public void size() {
		String output;
		output = "The number of songs currently in the playlist is " + this.thePlayList.size();
		JOptionPane.showMessageDialog(null, output);
	}

	public String printPlayList(){
		String output = "";

		for(Song song : this.thePlayList)
			output += song.getTitle() + "\n";
		//JOptionPane.showMessageDialog(null, output);
		return output;
	}

	public void addSongs(List l){
		this.thePlayList.addAll(l);
	}

	private void serialize() {
		// create output stream
		try {
			FileOutputStream fos = new FileOutputStream(FILE_NAME);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(this.thePlayList);
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void deserialize() {
		// create input stream
		try {
			FileInputStream fis = new FileInputStream(FILE_NAME);
			ObjectInputStream ois = new ObjectInputStream(fis);

			this.thePlayList = (LinkedList<Song>) ois.readObject();
			ois.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}

	}

} //end class

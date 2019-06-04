package jukeBox;

import java.io.Serializable;

public class Song implements Serializable {
	
private String title;
	
	public Song (String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
	String output;
	
	output = this.title;
	
	return output;
	}


}

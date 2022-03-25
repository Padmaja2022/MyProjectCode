/*
 * Author Paadmaja
 * Date   3/24/2022
 * Description   Create a Song class with the following attributes
                 title
                 duration
 * 
 */

public class Song{

	private String title;
	private double duration;
	
	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(double duration) {
		this.duration = duration;
	}




}



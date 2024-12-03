/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    //How many times the track has been played
    private int timesPlayed = 0;
    private String genre;
    private boolean playing = false;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename)
    {
        setDetails(artist, title, filename, "unknown");
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename, "unknown");
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "(genre:" + genre +")" +"  (file: " + filename + ")";
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename, String genre)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.genre = genre;
    }
    
    public void addTimesPlayed()
    {
        timesPlayed++;
    }
    
    public int getTimesPlayed() 
    {
        return timesPlayed;
    }
    
    public void resetTimesPlayed()
    {
        timesPlayed = 0;
    }
    //método de acesso ao genero
    public String getGenre()
    {
        return genre;
    }
    //método modificador do genero
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
}
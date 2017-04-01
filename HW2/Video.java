/*
File: Video.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: Video class extending Media with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

public abstract class Video extends Media
{
   private String[] supportingActors;
   private String director;
   private String format;
   private String producer;
   private String movieRating;
   
   
   public Video(String theTitle, double theYourRating, String theMajorArtist, int thePlayingTime, 
                int theNumPlays, String theDistributor, double thePrice, String[] theSupportingActors, 
                String theDirector, String theFormat, String theProducer, String theMovieRating)
   {
      
        super(theTitle, theYourRating, theMajorArtist, thePlayingTime, 
                theNumPlays, theDistributor, thePrice);
                
        supportingActors = theSupportingActors;
        director = theDirector;
        format = theFormat;
        producer = theProducer;
        movieRating = theMovieRating;
    }
    
    public void setSupportingActors(String[] theSupportingActors)
    {
      supportingActors = theSupportingActors;
    }
    
    public String[] getSupportingActors()
    {
      return supportingActors;
    }
        
    public void setDirector(String theDirector)
    {
      director = theDirector;
    }
    
    public String getDirector()
    {
      return director;
    }
    
    public void setFormat(String theFormat)
    {
      format = theFormat;
    }
      
    public String getFormat()
    {
      return format;
    }
    
    public void setProducer(String theProducer)
    {
      producer = theProducer;
    }
    
    public String getProducer()
    {
      return producer;
    }
    
    public void setMovieRating(String theMovieRating)
    {
      movieRating = theMovieRating;
    }
    
    public String getMovieRating()
    {
      return movieRating;
    }
    
   
   
   
           }
 
   
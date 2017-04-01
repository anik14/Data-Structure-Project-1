/*
File: Audio.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: Public abstract Audio class extending Media with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

public abstract class Audio extends Media
{
   private String[] supportingMusicians;
   private String musicDirector;
   private String format;
   private String producer;
   private String soundRating;
   
   
   public Audio (String theTitle, double theYourRating, String theMajorArtist, int thePlayingTime, 
                int theNumPlays, String theDistributor, double thePrice, String[] theSupportingMusicians, 
                String theMusicDirector, String theFormat, String theProducer, String theSoundRating)
   {
      
        super(theTitle, theYourRating, theMajorArtist, thePlayingTime, 
                theNumPlays, theDistributor, thePrice);
                
        supportingMusicians = theSupportingMusicians;
        musicDirector = theMusicDirector;
        format = theFormat;
        producer = theProducer;
        soundRating = theSoundRating;
    }
    
    public void setSupportingMusicians(String[] theSupportingMusicians)
    {
      supportingMusicians = theSupportingMusicians;
    }
    
    public String[] getSupportingMusicians()
    {
      return supportingMusicians;
    }
        
    public void setMusicDirector(String theMusicDirector)
    {
      musicDirector = theMusicDirector;
    }
    
    public String getMusicDirector()
    {
      return musicDirector;
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
    
    public void setSoundRating(String theSoundRating)
    {
      soundRating = theSoundRating;
    }
    
    public String getSoundRating()
    {
      return soundRating;
    }
    
   
   
   
           }
 
   
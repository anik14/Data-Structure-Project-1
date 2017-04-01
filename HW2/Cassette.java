/*
File: Cassette.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: Cassette class extending Audio with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

import java.util.Arrays;
public class Cassette extends Audio
{
   private String[] soundTrailers;
   
     public Cassette (String theTitle, double theYourRating, String theMajorArtist, int thePlayingTime, 
                int theNumPlays, String theDistributor, double thePrice, String[] theSupportingMusicians, 
                String theMusicDirector, String theFormat, String theProducer, String theSoundRating, String[] theSoundTrailers)
    {
      super(theTitle, theYourRating, theMajorArtist, thePlayingTime, 
                theNumPlays, theDistributor, thePrice, theSupportingMusicians, 
                theMusicDirector, theFormat, theProducer, theSoundRating);
           
      soundTrailers = theSoundTrailers;
    }
    
   
   
  
   
   public String toString()
   {
      return ("Title " + getTitle() + "\nYour Rating:" + getYourRating() + "\nMajor Artist: " + getMajorArtist() 
                   + "\nPlaying Time: " + getPlayingTime() + "\nNum Plays: " + getNumPlays() + "\nDistributor: " + getDistributor()
                   + "\nPrice: " + getPrice() + "\nSupporting Musicians: " + Arrays.toString(getSupportingMusicians()) + "\nMusic Director: " + getMusicDirector() 
                   + "\nFormat: " + getFormat() + "\n Producer: " + getProducer() + "\nMovie Rating: " + getSoundRating() 
                   + "\nTrailers: " + Arrays.toString(soundTrailers));
                     
                   
   }

   
  
 }
 
   
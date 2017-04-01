/*
File: VHS.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: VHS class extending Video with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

import java.util.Arrays;
public class VHS extends Video
{
   private String[] trailers;
   
    public VHS(String theTitle, double theYourRating, String theMajorArtist, int thePlayingTime, 
                int theNumPlays, String theDistributor, double thePrice, String[] theSupportingActors, 
                String theDirector, String theFormat, String theProducer, String theMovieRating, String[] theTrailers)
    {
      super(theTitle, theYourRating, theMajorArtist, thePlayingTime, 
                theNumPlays, theDistributor, thePrice, theSupportingActors, 
                theDirector, theFormat, theProducer, theMovieRating);
           
      trailers = theTrailers;
    }
    
   
   
 
   public String toString()
   {
      return ("Title " + getTitle() + "\nYour Rating:" + getYourRating() + "\nMajor Artist: " + getMajorArtist() 
                   + "\nPlaying Time: " + getPlayingTime() + "\nNum Plays: " + getNumPlays() + "\nDistributor: " + getDistributor()
                   + "\nPrice: " + getPrice() + "\nSupporting Actors: " + Arrays.toString(getSupportingActors()) + "\nDirector: " + getDirector() 
                   + "\nFormat: " + getFormat() + "\n Producer: " + getProducer() + "\nMovie Rating: " + getMovieRating() 
                   + "\nTrailers: " + Arrays.toString(trailers));
                     
                   
   }

   
  
 }
 
   
/*
File: DVD.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: DVD class extending Video with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

import java.util.Arrays;
public class DVD extends Video
{
   String[] specialFeatures;
   boolean wideScreenFormat;
   boolean TVFormat;
   String[] soundOptions;
   
   public DVD(String theTitle, double theYourRating, String theMajorArtist, int thePlayingTime, 
                int theNumPlays, String theDistributor, double thePrice, String[] theSupportingActors, 
                String theDirector, String theFormat, String theProducer, String theMovieRating, String[] theSpecialFeatures, boolean theWideScreenFormat, 
                boolean theTVFormat, String[] theSoundOptions)
   {
   
       super(theTitle, theYourRating, theMajorArtist, thePlayingTime, 
                theNumPlays, theDistributor, thePrice, theSupportingActors, 
                theDirector, theFormat, theProducer, theMovieRating);
                
      specialFeatures = theSpecialFeatures;
      wideScreenFormat = theWideScreenFormat;
      TVFormat = theTVFormat;
      soundOptions = theSoundOptions;
   }
   
  

   
  
   public String toString()
   {
      return ("Title: " + getTitle() + "\nYour Rating: " + getYourRating() + "\nMajor Artist: " + getMajorArtist() 
                   + "\nPlaying Time: " + getPlayingTime() + "\nNum Plays: " + getNumPlays() + "\nDistributor: " + getDistributor()
                   + "\nPrice: " + getPrice() + "\nSupporting Actors: " + Arrays.toString(getSupportingActors()) + "\nDirector: " + getDirector() 
                   + "\nFormat: " + getFormat() + "\n Producer: " + getProducer() + "\nMovie Rating: " + getMovieRating() 
                   + "\nSpecial Features: " + Arrays.toString(specialFeatures) + "\nWide Screen Format: " + wideScreenFormat
                   + "\nTV Format: " + TVFormat + "\nSound Options: " + Arrays.toString(soundOptions));
   }

   
  
 }

   
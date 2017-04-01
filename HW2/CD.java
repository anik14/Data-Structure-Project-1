/*
File: CD.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: CD class extending Audio with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

import java.util.Arrays;
public class CD extends Audio
{
   String[] specialFeatures;
   boolean audioCD;
   boolean discCategory;
   String[] soundOptions;
   
   public CD (String theTitle, double theYourRating, String theMajorArtist, int thePlayingTime, 
                int theNumPlays, String theDistributor, double thePrice, String[] theSupportingMusicians, 
                String theMusicDirector, String theFormat, String theProducer, String theSoundRating, String[] theSpecialFeatures,
                boolean theAudioCD, boolean theDiscCategory, String[] theSoundOptions)
    {
      super(theTitle, theYourRating, theMajorArtist, thePlayingTime, 
                theNumPlays, theDistributor, thePrice, theSupportingMusicians, 
                theMusicDirector, theFormat, theProducer, theSoundRating);
                           
      specialFeatures = theSpecialFeatures;
      audioCD = theAudioCD;
      discCategory = theDiscCategory;
      soundOptions = theSoundOptions;
      
    }
    
 
   
  
   
  
   public String toString()
   {
      return ("Title: " + getTitle() + "\nYour Rating: " + getYourRating() + "\nMajor Artist: " + getMajorArtist() 
                   + "\nPlaying Time: " + getPlayingTime() + "\nNum Plays: " + getNumPlays() + "\nDistributor: " + getDistributor()
                   + "\nPrice: " + getPrice() + "\nSupporting Actors: " + Arrays.toString(getSupportingMusicians()) + "\nDirector: " + getMusicDirector() 
                   + "\nFormat: " + getFormat() + "\n Producer: " + getProducer() + "\nSound Rating: " + getSoundRating() 
                   + "\nSpecial Features: " + Arrays.toString(specialFeatures) + "\nAudio CD: " + audioCD
                   + "\nDisc Category: " + discCategory + "\nSound Options: " + Arrays.toString(soundOptions));
   }

   
  
 }

   
/*
File: Media.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: Media class with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

public abstract class Media
{
   private String title;
   private double yourRating;
   private String majorArtist;
   private int playingTime;
   private int numPlays;
   private String distributor;
   private double price;
   
   
   public Media(String theTitle, double theYourRating, String theMajorArtist, int thePlayingTime, 
                int theNumPlays, String theDistributor, double thePrice)
   {
      title = theTitle;
      yourRating = theYourRating;
      majorArtist = theMajorArtist;
      playingTime = thePlayingTime;
      numPlays = theNumPlays;
      distributor = theDistributor;
      price = thePrice;
   }
      
   
   
   public void playMedia()
   {
      System.out.println("Now playing " + title);
      this.incrementPlays();
   }
 
   
   
   public void incrementPlays()
   {
      numPlays++;
   } 
   public void setYourRating(double theYourRating)
   {
      yourRating = theYourRating;
   }
   
   public double getYourRating()
   {
      return yourRating;
   }
   
   public int getPlayingTime()
   {
      return playingTime;
   }
   
   public void setPlayingTime(int initialPlayingTime)
   {
      playingTime = initialPlayingTime;
   }
   
   public void setTitle(String theTitle)
   {
      title = theTitle;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void setMajorArtist(String theMajorArtist)
   {
      majorArtist = theMajorArtist;
   }
   
   public String getMajorArtist()
   {
      return majorArtist;
   }
   
   public void setNumPlays(int theNumPlays)
   {
      numPlays = theNumPlays;
   }
   public int getNumPlays()
   {
      return numPlays;
   }
   
   public void setDistributor(String theDistributor)
   {
      distributor = theDistributor;
   }
   
   public String getDistributor()
   {
      return distributor;
   }
   
   public void setPrice(double thePrice)
   {
      price = thePrice;
   }
   
   public double getPrice()
   {
      return price;
   } 
   
   
   }
   
      
   
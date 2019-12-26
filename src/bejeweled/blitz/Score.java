/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bejeweled.blitz;

/**
 *
 * @author Farhan
 */
public class Score {
    private int scoreRequired;
    private int scoreAchieved;
    public Score()
    {
        this.scoreAchieved=0;
        this.scoreRequired=0;
    }
    public int getScoreRequired()
    {
        return this.scoreRequired;
    }
    public int getScoreAchieved()
    {
        return this.scoreAchieved;
    }
    public void setScoreRequired(int score)
    {
        this.scoreRequired=score;
    }
    public void setScoreAchieved(int score)
    {
        this.scoreAchieved=score;
    }
}

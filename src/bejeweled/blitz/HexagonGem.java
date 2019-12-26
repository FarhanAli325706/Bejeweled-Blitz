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
public class HexagonGem extends Gem{
    public HexagonGem(int value)
    {
        super(value);
    }

    @Override
    public int blast(Score sc) {
        return (sc.getScoreAchieved()+5);
    }
}

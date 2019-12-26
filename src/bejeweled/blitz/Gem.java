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
abstract public class Gem {
    private int gemValue;
    public Gem(int value)
    {
        this.gemValue=value;
    }
    public void setValue(int value)
    {
        this.gemValue=value;
    }
    public int getValue()
    {
        return this.gemValue;
    }
    abstract public int blast(Score sc);
}

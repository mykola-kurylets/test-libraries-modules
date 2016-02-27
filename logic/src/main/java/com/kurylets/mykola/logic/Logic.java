package com.kurylets.mykola.logic;

/**
 * Created by Mykola on 20.02.2016.
 */
public class Logic {
    public Logic(double val){
        m_Val = val;
    }

    public double Calc(double val)
    {
        return m_Val + val;
    }

    private double m_Val;
}

package com.kurylets.mykola.holder;

/**
 * Created by Mykola on 20.02.2016.
 */
public class Holder {
    public Holder()
    {
        m_Val = 0.0;
    }

    public boolean Load()
    {
        m_Val = 50.0;
        return true;
    }

    public double GetVal()
    {
        return m_Val;
    }

    public void SetVal(double val)
    {
        m_Val = val;
    }

    private double m_Val;
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class ARelacionalTermoLogico extends PTermoLogico
{
    private PExpRelacional _expRelacional_;

    public ARelacionalTermoLogico()
    {
        // Constructor
    }

    public ARelacionalTermoLogico(
        @SuppressWarnings("hiding") PExpRelacional _expRelacional_)
    {
        // Constructor
        setExpRelacional(_expRelacional_);

    }

    @Override
    public Object clone()
    {
        return new ARelacionalTermoLogico(
            cloneNode(this._expRelacional_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelacionalTermoLogico(this);
    }

    public PExpRelacional getExpRelacional()
    {
        return this._expRelacional_;
    }

    public void setExpRelacional(PExpRelacional node)
    {
        if(this._expRelacional_ != null)
        {
            this._expRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expRelacional_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expRelacional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expRelacional_ == child)
        {
            this._expRelacional_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expRelacional_ == oldChild)
        {
            setExpRelacional((PExpRelacional) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

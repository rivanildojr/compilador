/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AMultTermoAritmetrico extends PTermoAritmetrico
{
    private PTermoAritmetrico _termoAritmetrico_;
    private TMult _mult_;
    private PFatorAritmetrico _fatorAritmetrico_;

    public AMultTermoAritmetrico()
    {
        // Constructor
    }

    public AMultTermoAritmetrico(
        @SuppressWarnings("hiding") PTermoAritmetrico _termoAritmetrico_,
        @SuppressWarnings("hiding") TMult _mult_,
        @SuppressWarnings("hiding") PFatorAritmetrico _fatorAritmetrico_)
    {
        // Constructor
        setTermoAritmetrico(_termoAritmetrico_);

        setMult(_mult_);

        setFatorAritmetrico(_fatorAritmetrico_);

    }

    @Override
    public Object clone()
    {
        return new AMultTermoAritmetrico(
            cloneNode(this._termoAritmetrico_),
            cloneNode(this._mult_),
            cloneNode(this._fatorAritmetrico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultTermoAritmetrico(this);
    }

    public PTermoAritmetrico getTermoAritmetrico()
    {
        return this._termoAritmetrico_;
    }

    public void setTermoAritmetrico(PTermoAritmetrico node)
    {
        if(this._termoAritmetrico_ != null)
        {
            this._termoAritmetrico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoAritmetrico_ = node;
    }

    public TMult getMult()
    {
        return this._mult_;
    }

    public void setMult(TMult node)
    {
        if(this._mult_ != null)
        {
            this._mult_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mult_ = node;
    }

    public PFatorAritmetrico getFatorAritmetrico()
    {
        return this._fatorAritmetrico_;
    }

    public void setFatorAritmetrico(PFatorAritmetrico node)
    {
        if(this._fatorAritmetrico_ != null)
        {
            this._fatorAritmetrico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorAritmetrico_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoAritmetrico_)
            + toString(this._mult_)
            + toString(this._fatorAritmetrico_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoAritmetrico_ == child)
        {
            this._termoAritmetrico_ = null;
            return;
        }

        if(this._mult_ == child)
        {
            this._mult_ = null;
            return;
        }

        if(this._fatorAritmetrico_ == child)
        {
            this._fatorAritmetrico_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoAritmetrico_ == oldChild)
        {
            setTermoAritmetrico((PTermoAritmetrico) newChild);
            return;
        }

        if(this._mult_ == oldChild)
        {
            setMult((TMult) newChild);
            return;
        }

        if(this._fatorAritmetrico_ == oldChild)
        {
            setFatorAritmetrico((PFatorAritmetrico) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
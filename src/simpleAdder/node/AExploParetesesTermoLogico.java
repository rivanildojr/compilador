/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AExploParetesesTermoLogico extends PTermoLogico
{
    private TEsqParentese _esqParentese_;
    private PExpLogica _expLogica_;
    private TDirParentese _dirParentese_;

    public AExploParetesesTermoLogico()
    {
        // Constructor
    }

    public AExploParetesesTermoLogico(
        @SuppressWarnings("hiding") TEsqParentese _esqParentese_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TDirParentese _dirParentese_)
    {
        // Constructor
        setEsqParentese(_esqParentese_);

        setExpLogica(_expLogica_);

        setDirParentese(_dirParentese_);

    }

    @Override
    public Object clone()
    {
        return new AExploParetesesTermoLogico(
            cloneNode(this._esqParentese_),
            cloneNode(this._expLogica_),
            cloneNode(this._dirParentese_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExploParetesesTermoLogico(this);
    }

    public TEsqParentese getEsqParentese()
    {
        return this._esqParentese_;
    }

    public void setEsqParentese(TEsqParentese node)
    {
        if(this._esqParentese_ != null)
        {
            this._esqParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esqParentese_ = node;
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    public TDirParentese getDirParentese()
    {
        return this._dirParentese_;
    }

    public void setDirParentese(TDirParentese node)
    {
        if(this._dirParentese_ != null)
        {
            this._dirParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dirParentese_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esqParentese_)
            + toString(this._expLogica_)
            + toString(this._dirParentese_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esqParentese_ == child)
        {
            this._esqParentese_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._dirParentese_ == child)
        {
            this._dirParentese_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esqParentese_ == oldChild)
        {
            setEsqParentese((TEsqParentese) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._dirParentese_ == oldChild)
        {
            setDirParentese((TDirParentese) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

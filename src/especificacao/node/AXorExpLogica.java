/* This file was generated by SableCC (http://www.sablecc.org/). */

package especificacao.node;

import especificacao.analysis.*;

@SuppressWarnings("nls")
public final class AXorExpLogica extends PExpLogica
{
    private PExpLogica _expLogica_;
    private TXor _xor_;
    private PTermoLogico _termoLogico_;

    public AXorExpLogica()
    {
        // Constructor
    }

    public AXorExpLogica(
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TXor _xor_,
        @SuppressWarnings("hiding") PTermoLogico _termoLogico_)
    {
        // Constructor
        setExpLogica(_expLogica_);

        setXor(_xor_);

        setTermoLogico(_termoLogico_);

    }

    @Override
    public Object clone()
    {
        return new AXorExpLogica(
            cloneNode(this._expLogica_),
            cloneNode(this._xor_),
            cloneNode(this._termoLogico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAXorExpLogica(this);
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

    public TXor getXor()
    {
        return this._xor_;
    }

    public void setXor(TXor node)
    {
        if(this._xor_ != null)
        {
            this._xor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._xor_ = node;
    }

    public PTermoLogico getTermoLogico()
    {
        return this._termoLogico_;
    }

    public void setTermoLogico(PTermoLogico node)
    {
        if(this._termoLogico_ != null)
        {
            this._termoLogico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoLogico_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica_)
            + toString(this._xor_)
            + toString(this._termoLogico_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._xor_ == child)
        {
            this._xor_ = null;
            return;
        }

        if(this._termoLogico_ == child)
        {
            this._termoLogico_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._xor_ == oldChild)
        {
            setXor((TXor) newChild);
            return;
        }

        if(this._termoLogico_ == oldChild)
        {
            setTermoLogico((PTermoLogico) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
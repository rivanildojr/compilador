/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class ADiferenteExpRelacional extends PExpRelacional
{
    private PExpAritmetrica _esquerda_;
    private TDiferente _diferente_;
    private PExpAritmetrica _direita_;

    public ADiferenteExpRelacional()
    {
        // Constructor
    }

    public ADiferenteExpRelacional(
        @SuppressWarnings("hiding") PExpAritmetrica _esquerda_,
        @SuppressWarnings("hiding") TDiferente _diferente_,
        @SuppressWarnings("hiding") PExpAritmetrica _direita_)
    {
        // Constructor
        setEsquerda(_esquerda_);

        setDiferente(_diferente_);

        setDireita(_direita_);

    }

    @Override
    public Object clone()
    {
        return new ADiferenteExpRelacional(
            cloneNode(this._esquerda_),
            cloneNode(this._diferente_),
            cloneNode(this._direita_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADiferenteExpRelacional(this);
    }

    public PExpAritmetrica getEsquerda()
    {
        return this._esquerda_;
    }

    public void setEsquerda(PExpAritmetrica node)
    {
        if(this._esquerda_ != null)
        {
            this._esquerda_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esquerda_ = node;
    }

    public TDiferente getDiferente()
    {
        return this._diferente_;
    }

    public void setDiferente(TDiferente node)
    {
        if(this._diferente_ != null)
        {
            this._diferente_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._diferente_ = node;
    }

    public PExpAritmetrica getDireita()
    {
        return this._direita_;
    }

    public void setDireita(PExpAritmetrica node)
    {
        if(this._direita_ != null)
        {
            this._direita_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._direita_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esquerda_)
            + toString(this._diferente_)
            + toString(this._direita_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esquerda_ == child)
        {
            this._esquerda_ = null;
            return;
        }

        if(this._diferente_ == child)
        {
            this._diferente_ = null;
            return;
        }

        if(this._direita_ == child)
        {
            this._direita_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esquerda_ == oldChild)
        {
            setEsquerda((PExpAritmetrica) newChild);
            return;
        }

        if(this._diferente_ == oldChild)
        {
            setDiferente((TDiferente) newChild);
            return;
        }

        if(this._direita_ == oldChild)
        {
            setDireita((PExpAritmetrica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
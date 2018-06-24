/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AIgualExpRelacional extends PExpRelacional
{
    private PExpAritmetrica _esquerda_;
    private TIgual _igual_;
    private PExpAritmetrica _direita_;

    public AIgualExpRelacional()
    {
        // Constructor
    }

    public AIgualExpRelacional(
        @SuppressWarnings("hiding") PExpAritmetrica _esquerda_,
        @SuppressWarnings("hiding") TIgual _igual_,
        @SuppressWarnings("hiding") PExpAritmetrica _direita_)
    {
        // Constructor
        setEsquerda(_esquerda_);

        setIgual(_igual_);

        setDireita(_direita_);

    }

    @Override
    public Object clone()
    {
        return new AIgualExpRelacional(
            cloneNode(this._esquerda_),
            cloneNode(this._igual_),
            cloneNode(this._direita_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIgualExpRelacional(this);
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

    public TIgual getIgual()
    {
        return this._igual_;
    }

    public void setIgual(TIgual node)
    {
        if(this._igual_ != null)
        {
            this._igual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._igual_ = node;
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
            + toString(this._igual_)
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

        if(this._igual_ == child)
        {
            this._igual_ = null;
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

        if(this._igual_ == oldChild)
        {
            setIgual((TIgual) newChild);
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

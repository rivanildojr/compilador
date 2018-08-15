/* This file was generated by SableCC (http://www.sablecc.org/). */

package especificacao.node;

import especificacao.analysis.*;

@SuppressWarnings("nls")
public final class AMultExpAritmetica extends PExpAritmetica
{
    private PExpAritmetica _esquerda_;
    private PExpAritmetica _direita_;

    public AMultExpAritmetica()
    {
        // Constructor
    }

    public AMultExpAritmetica(
        @SuppressWarnings("hiding") PExpAritmetica _esquerda_,
        @SuppressWarnings("hiding") PExpAritmetica _direita_)
    {
        // Constructor
        setEsquerda(_esquerda_);

        setDireita(_direita_);

    }

    @Override
    public Object clone()
    {
        return new AMultExpAritmetica(
            cloneNode(this._esquerda_),
            cloneNode(this._direita_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultExpAritmetica(this);
    }

    public PExpAritmetica getEsquerda()
    {
        return this._esquerda_;
    }

    public void setEsquerda(PExpAritmetica node)
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

    public PExpAritmetica getDireita()
    {
        return this._direita_;
    }

    public void setDireita(PExpAritmetica node)
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
            setEsquerda((PExpAritmetica) newChild);
            return;
        }

        if(this._direita_ == oldChild)
        {
            setDireita((PExpAritmetica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

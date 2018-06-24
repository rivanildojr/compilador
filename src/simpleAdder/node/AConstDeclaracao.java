/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AConstDeclaracao extends PDeclaracao
{
    private PDeclaracaoConstante _declaracaoConstante_;

    public AConstDeclaracao()
    {
        // Constructor
    }

    public AConstDeclaracao(
        @SuppressWarnings("hiding") PDeclaracaoConstante _declaracaoConstante_)
    {
        // Constructor
        setDeclaracaoConstante(_declaracaoConstante_);

    }

    @Override
    public Object clone()
    {
        return new AConstDeclaracao(
            cloneNode(this._declaracaoConstante_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstDeclaracao(this);
    }

    public PDeclaracaoConstante getDeclaracaoConstante()
    {
        return this._declaracaoConstante_;
    }

    public void setDeclaracaoConstante(PDeclaracaoConstante node)
    {
        if(this._declaracaoConstante_ != null)
        {
            this._declaracaoConstante_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracaoConstante_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaracaoConstante_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declaracaoConstante_ == child)
        {
            this._declaracaoConstante_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declaracaoConstante_ == oldChild)
        {
            setDeclaracaoConstante((PDeclaracaoConstante) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

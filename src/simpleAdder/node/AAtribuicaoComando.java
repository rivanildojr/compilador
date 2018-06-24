/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AAtribuicaoComando extends PComando
{
    private PVar _var_;
    private TAtribuicao _atribuicao_;
    private PExpAritmetrica _expAritmetrica_;
    private TPontoVirgula _pontoVirgula_;

    public AAtribuicaoComando()
    {
        // Constructor
    }

    public AAtribuicaoComando(
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TAtribuicao _atribuicao_,
        @SuppressWarnings("hiding") PExpAritmetrica _expAritmetrica_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setVar(_var_);

        setAtribuicao(_atribuicao_);

        setExpAritmetrica(_expAritmetrica_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AAtribuicaoComando(
            cloneNode(this._var_),
            cloneNode(this._atribuicao_),
            cloneNode(this._expAritmetrica_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtribuicaoComando(this);
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TAtribuicao getAtribuicao()
    {
        return this._atribuicao_;
    }

    public void setAtribuicao(TAtribuicao node)
    {
        if(this._atribuicao_ != null)
        {
            this._atribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atribuicao_ = node;
    }

    public PExpAritmetrica getExpAritmetrica()
    {
        return this._expAritmetrica_;
    }

    public void setExpAritmetrica(PExpAritmetrica node)
    {
        if(this._expAritmetrica_ != null)
        {
            this._expAritmetrica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expAritmetrica_ = node;
    }

    public TPontoVirgula getPontoVirgula()
    {
        return this._pontoVirgula_;
    }

    public void setPontoVirgula(TPontoVirgula node)
    {
        if(this._pontoVirgula_ != null)
        {
            this._pontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._var_)
            + toString(this._atribuicao_)
            + toString(this._expAritmetrica_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._atribuicao_ == child)
        {
            this._atribuicao_ = null;
            return;
        }

        if(this._expAritmetrica_ == child)
        {
            this._expAritmetrica_ = null;
            return;
        }

        if(this._pontoVirgula_ == child)
        {
            this._pontoVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._atribuicao_ == oldChild)
        {
            setAtribuicao((TAtribuicao) newChild);
            return;
        }

        if(this._expAritmetrica_ == oldChild)
        {
            setExpAritmetrica((PExpAritmetrica) newChild);
            return;
        }

        if(this._pontoVirgula_ == oldChild)
        {
            setPontoVirgula((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
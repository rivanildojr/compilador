/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class ASeComando extends PComando
{
    private TSe _se_;
    private TEsqParentese _esqParentese_;
    private PExpLogica _expLogica_;
    private TDirParentese _dirParentese_;
    private TEntao _entao_;
    private PCorpo _corpo_;
    private PSenaoSe _senaoSe_;
    private TFimSe _fimSe_;
    private TPontoVirgula _pontoVirgula_;

    public ASeComando()
    {
        // Constructor
    }

    public ASeComando(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TEsqParentese _esqParentese_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TDirParentese _dirParentese_,
        @SuppressWarnings("hiding") TEntao _entao_,
        @SuppressWarnings("hiding") PCorpo _corpo_,
        @SuppressWarnings("hiding") PSenaoSe _senaoSe_,
        @SuppressWarnings("hiding") TFimSe _fimSe_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setSe(_se_);

        setEsqParentese(_esqParentese_);

        setExpLogica(_expLogica_);

        setDirParentese(_dirParentese_);

        setEntao(_entao_);

        setCorpo(_corpo_);

        setSenaoSe(_senaoSe_);

        setFimSe(_fimSe_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new ASeComando(
            cloneNode(this._se_),
            cloneNode(this._esqParentese_),
            cloneNode(this._expLogica_),
            cloneNode(this._dirParentese_),
            cloneNode(this._entao_),
            cloneNode(this._corpo_),
            cloneNode(this._senaoSe_),
            cloneNode(this._fimSe_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeComando(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
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

    public TEntao getEntao()
    {
        return this._entao_;
    }

    public void setEntao(TEntao node)
    {
        if(this._entao_ != null)
        {
            this._entao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._entao_ = node;
    }

    public PCorpo getCorpo()
    {
        return this._corpo_;
    }

    public void setCorpo(PCorpo node)
    {
        if(this._corpo_ != null)
        {
            this._corpo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._corpo_ = node;
    }

    public PSenaoSe getSenaoSe()
    {
        return this._senaoSe_;
    }

    public void setSenaoSe(PSenaoSe node)
    {
        if(this._senaoSe_ != null)
        {
            this._senaoSe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._senaoSe_ = node;
    }

    public TFimSe getFimSe()
    {
        return this._fimSe_;
    }

    public void setFimSe(TFimSe node)
    {
        if(this._fimSe_ != null)
        {
            this._fimSe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimSe_ = node;
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
            + toString(this._se_)
            + toString(this._esqParentese_)
            + toString(this._expLogica_)
            + toString(this._dirParentese_)
            + toString(this._entao_)
            + toString(this._corpo_)
            + toString(this._senaoSe_)
            + toString(this._fimSe_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

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

        if(this._entao_ == child)
        {
            this._entao_ = null;
            return;
        }

        if(this._corpo_ == child)
        {
            this._corpo_ = null;
            return;
        }

        if(this._senaoSe_ == child)
        {
            this._senaoSe_ = null;
            return;
        }

        if(this._fimSe_ == child)
        {
            this._fimSe_ = null;
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
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

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

        if(this._entao_ == oldChild)
        {
            setEntao((TEntao) newChild);
            return;
        }

        if(this._corpo_ == oldChild)
        {
            setCorpo((PCorpo) newChild);
            return;
        }

        if(this._senaoSe_ == oldChild)
        {
            setSenaoSe((PSenaoSe) newChild);
            return;
        }

        if(this._fimSe_ == oldChild)
        {
            setFimSe((TFimSe) newChild);
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

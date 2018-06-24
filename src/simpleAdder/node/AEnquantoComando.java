/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoComando extends PComando
{
    private TEnquanto _enquanto_;
    private TEsqParentese _esqParentese_;
    private PExpLogica _expLogica_;
    private TDirParentese _dirParentese_;
    private TFaca _faca_;
    private PCorpo _corpo_;
    private TFimEnquanto _fimEnquanto_;
    private TPontoVirgula _pontoVirgula_;

    public AEnquantoComando()
    {
        // Constructor
    }

    public AEnquantoComando(
        @SuppressWarnings("hiding") TEnquanto _enquanto_,
        @SuppressWarnings("hiding") TEsqParentese _esqParentese_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TDirParentese _dirParentese_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PCorpo _corpo_,
        @SuppressWarnings("hiding") TFimEnquanto _fimEnquanto_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setEnquanto(_enquanto_);

        setEsqParentese(_esqParentese_);

        setExpLogica(_expLogica_);

        setDirParentese(_dirParentese_);

        setFaca(_faca_);

        setCorpo(_corpo_);

        setFimEnquanto(_fimEnquanto_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoComando(
            cloneNode(this._enquanto_),
            cloneNode(this._esqParentese_),
            cloneNode(this._expLogica_),
            cloneNode(this._dirParentese_),
            cloneNode(this._faca_),
            cloneNode(this._corpo_),
            cloneNode(this._fimEnquanto_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoComando(this);
    }

    public TEnquanto getEnquanto()
    {
        return this._enquanto_;
    }

    public void setEnquanto(TEnquanto node)
    {
        if(this._enquanto_ != null)
        {
            this._enquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquanto_ = node;
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

    public TFaca getFaca()
    {
        return this._faca_;
    }

    public void setFaca(TFaca node)
    {
        if(this._faca_ != null)
        {
            this._faca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._faca_ = node;
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

    public TFimEnquanto getFimEnquanto()
    {
        return this._fimEnquanto_;
    }

    public void setFimEnquanto(TFimEnquanto node)
    {
        if(this._fimEnquanto_ != null)
        {
            this._fimEnquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimEnquanto_ = node;
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
            + toString(this._enquanto_)
            + toString(this._esqParentese_)
            + toString(this._expLogica_)
            + toString(this._dirParentese_)
            + toString(this._faca_)
            + toString(this._corpo_)
            + toString(this._fimEnquanto_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquanto_ == child)
        {
            this._enquanto_ = null;
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

        if(this._faca_ == child)
        {
            this._faca_ = null;
            return;
        }

        if(this._corpo_ == child)
        {
            this._corpo_ = null;
            return;
        }

        if(this._fimEnquanto_ == child)
        {
            this._fimEnquanto_ = null;
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
        if(this._enquanto_ == oldChild)
        {
            setEnquanto((TEnquanto) newChild);
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

        if(this._faca_ == oldChild)
        {
            setFaca((TFaca) newChild);
            return;
        }

        if(this._corpo_ == oldChild)
        {
            setCorpo((PCorpo) newChild);
            return;
        }

        if(this._fimEnquanto_ == oldChild)
        {
            setFimEnquanto((TFimEnquanto) newChild);
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

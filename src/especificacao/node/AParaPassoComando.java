/* This file was generated by SableCC (http://www.sablecc.org/). */

package especificacao.node;

import especificacao.analysis.*;

@SuppressWarnings("nls")
public final class AParaPassoComando extends PComando
{
    private TPara _para_;
    private PVar _var_;
    private TDe _de_;
    private PNInteiroInicio _nInteiroInicio_;
    private TPasso _passo_;
    private PNInteiroPasso _nInteiroPasso_;
    private TAte _ate_;
    private PNInteiroFim _nInteiroFim_;
    private TFaca _faca_;
    private PCorpo _corpo_;
    private TFimPara _fimPara_;
    private TPontoVirgula _pontoVirgula_;

    public AParaPassoComando()
    {
        // Constructor
    }

    public AParaPassoComando(
        @SuppressWarnings("hiding") TPara _para_,
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TDe _de_,
        @SuppressWarnings("hiding") PNInteiroInicio _nInteiroInicio_,
        @SuppressWarnings("hiding") TPasso _passo_,
        @SuppressWarnings("hiding") PNInteiroPasso _nInteiroPasso_,
        @SuppressWarnings("hiding") TAte _ate_,
        @SuppressWarnings("hiding") PNInteiroFim _nInteiroFim_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PCorpo _corpo_,
        @SuppressWarnings("hiding") TFimPara _fimPara_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setPara(_para_);

        setVar(_var_);

        setDe(_de_);

        setNInteiroInicio(_nInteiroInicio_);

        setPasso(_passo_);

        setNInteiroPasso(_nInteiroPasso_);

        setAte(_ate_);

        setNInteiroFim(_nInteiroFim_);

        setFaca(_faca_);

        setCorpo(_corpo_);

        setFimPara(_fimPara_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AParaPassoComando(
            cloneNode(this._para_),
            cloneNode(this._var_),
            cloneNode(this._de_),
            cloneNode(this._nInteiroInicio_),
            cloneNode(this._passo_),
            cloneNode(this._nInteiroPasso_),
            cloneNode(this._ate_),
            cloneNode(this._nInteiroFim_),
            cloneNode(this._faca_),
            cloneNode(this._corpo_),
            cloneNode(this._fimPara_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaPassoComando(this);
    }

    public TPara getPara()
    {
        return this._para_;
    }

    public void setPara(TPara node)
    {
        if(this._para_ != null)
        {
            this._para_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._para_ = node;
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

    public TDe getDe()
    {
        return this._de_;
    }

    public void setDe(TDe node)
    {
        if(this._de_ != null)
        {
            this._de_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._de_ = node;
    }

    public PNInteiroInicio getNInteiroInicio()
    {
        return this._nInteiroInicio_;
    }

    public void setNInteiroInicio(PNInteiroInicio node)
    {
        if(this._nInteiroInicio_ != null)
        {
            this._nInteiroInicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nInteiroInicio_ = node;
    }

    public TPasso getPasso()
    {
        return this._passo_;
    }

    public void setPasso(TPasso node)
    {
        if(this._passo_ != null)
        {
            this._passo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._passo_ = node;
    }

    public PNInteiroPasso getNInteiroPasso()
    {
        return this._nInteiroPasso_;
    }

    public void setNInteiroPasso(PNInteiroPasso node)
    {
        if(this._nInteiroPasso_ != null)
        {
            this._nInteiroPasso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nInteiroPasso_ = node;
    }

    public TAte getAte()
    {
        return this._ate_;
    }

    public void setAte(TAte node)
    {
        if(this._ate_ != null)
        {
            this._ate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ate_ = node;
    }

    public PNInteiroFim getNInteiroFim()
    {
        return this._nInteiroFim_;
    }

    public void setNInteiroFim(PNInteiroFim node)
    {
        if(this._nInteiroFim_ != null)
        {
            this._nInteiroFim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nInteiroFim_ = node;
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

    public TFimPara getFimPara()
    {
        return this._fimPara_;
    }

    public void setFimPara(TFimPara node)
    {
        if(this._fimPara_ != null)
        {
            this._fimPara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimPara_ = node;
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
            + toString(this._para_)
            + toString(this._var_)
            + toString(this._de_)
            + toString(this._nInteiroInicio_)
            + toString(this._passo_)
            + toString(this._nInteiroPasso_)
            + toString(this._ate_)
            + toString(this._nInteiroFim_)
            + toString(this._faca_)
            + toString(this._corpo_)
            + toString(this._fimPara_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._para_ == child)
        {
            this._para_ = null;
            return;
        }

        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._de_ == child)
        {
            this._de_ = null;
            return;
        }

        if(this._nInteiroInicio_ == child)
        {
            this._nInteiroInicio_ = null;
            return;
        }

        if(this._passo_ == child)
        {
            this._passo_ = null;
            return;
        }

        if(this._nInteiroPasso_ == child)
        {
            this._nInteiroPasso_ = null;
            return;
        }

        if(this._ate_ == child)
        {
            this._ate_ = null;
            return;
        }

        if(this._nInteiroFim_ == child)
        {
            this._nInteiroFim_ = null;
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

        if(this._fimPara_ == child)
        {
            this._fimPara_ = null;
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
        if(this._para_ == oldChild)
        {
            setPara((TPara) newChild);
            return;
        }

        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._de_ == oldChild)
        {
            setDe((TDe) newChild);
            return;
        }

        if(this._nInteiroInicio_ == oldChild)
        {
            setNInteiroInicio((PNInteiroInicio) newChild);
            return;
        }

        if(this._passo_ == oldChild)
        {
            setPasso((TPasso) newChild);
            return;
        }

        if(this._nInteiroPasso_ == oldChild)
        {
            setNInteiroPasso((PNInteiroPasso) newChild);
            return;
        }

        if(this._ate_ == oldChild)
        {
            setAte((TAte) newChild);
            return;
        }

        if(this._nInteiroFim_ == oldChild)
        {
            setNInteiroFim((PNInteiroFim) newChild);
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

        if(this._fimPara_ == oldChild)
        {
            setFimPara((TFimPara) newChild);
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
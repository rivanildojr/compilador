/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AStart extends PStart
{
    private TPrograma _programa_;
    private TId _id_;
    private TInicio _inicio_;
    private PDeclaracaoList _declaracaoList_;
    private TFimPrograma _fimPrograma_;

    public AStart()
    {
        // Constructor
    }

    public AStart(
        @SuppressWarnings("hiding") TPrograma _programa_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TInicio _inicio_,
        @SuppressWarnings("hiding") PDeclaracaoList _declaracaoList_,
        @SuppressWarnings("hiding") TFimPrograma _fimPrograma_)
    {
        // Constructor
        setPrograma(_programa_);

        setId(_id_);

        setInicio(_inicio_);

        setDeclaracaoList(_declaracaoList_);

        setFimPrograma(_fimPrograma_);

    }

    @Override
    public Object clone()
    {
        return new AStart(
            cloneNode(this._programa_),
            cloneNode(this._id_),
            cloneNode(this._inicio_),
            cloneNode(this._declaracaoList_),
            cloneNode(this._fimPrograma_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStart(this);
    }

    public TPrograma getPrograma()
    {
        return this._programa_;
    }

    public void setPrograma(TPrograma node)
    {
        if(this._programa_ != null)
        {
            this._programa_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programa_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TInicio getInicio()
    {
        return this._inicio_;
    }

    public void setInicio(TInicio node)
    {
        if(this._inicio_ != null)
        {
            this._inicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inicio_ = node;
    }

    public PDeclaracaoList getDeclaracaoList()
    {
        return this._declaracaoList_;
    }

    public void setDeclaracaoList(PDeclaracaoList node)
    {
        if(this._declaracaoList_ != null)
        {
            this._declaracaoList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracaoList_ = node;
    }

    public TFimPrograma getFimPrograma()
    {
        return this._fimPrograma_;
    }

    public void setFimPrograma(TFimPrograma node)
    {
        if(this._fimPrograma_ != null)
        {
            this._fimPrograma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimPrograma_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._programa_)
            + toString(this._id_)
            + toString(this._inicio_)
            + toString(this._declaracaoList_)
            + toString(this._fimPrograma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._programa_ == child)
        {
            this._programa_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._inicio_ == child)
        {
            this._inicio_ = null;
            return;
        }

        if(this._declaracaoList_ == child)
        {
            this._declaracaoList_ = null;
            return;
        }

        if(this._fimPrograma_ == child)
        {
            this._fimPrograma_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._programa_ == oldChild)
        {
            setPrograma((TPrograma) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._inicio_ == oldChild)
        {
            setInicio((TInicio) newChild);
            return;
        }

        if(this._declaracaoList_ == oldChild)
        {
            setDeclaracaoList((PDeclaracaoList) newChild);
            return;
        }

        if(this._fimPrograma_ == oldChild)
        {
            setFimPrograma((TFimPrograma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

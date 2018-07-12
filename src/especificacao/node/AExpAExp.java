/* This file was generated by SableCC (http://www.sablecc.org/). */

package especificacao.node;

import especificacao.analysis.*;

@SuppressWarnings("nls")
public final class AExpAExp extends PExp
{
    private PExpAritmetica _expAritmetica_;

    public AExpAExp()
    {
        // Constructor
    }

    public AExpAExp(
        @SuppressWarnings("hiding") PExpAritmetica _expAritmetica_)
    {
        // Constructor
        setExpAritmetica(_expAritmetica_);

    }

    @Override
    public Object clone()
    {
        return new AExpAExp(
            cloneNode(this._expAritmetica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpAExp(this);
    }

    public PExpAritmetica getExpAritmetica()
    {
        return this._expAritmetica_;
    }

    public void setExpAritmetica(PExpAritmetica node)
    {
        if(this._expAritmetica_ != null)
        {
            this._expAritmetica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expAritmetica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expAritmetica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expAritmetica_ == child)
        {
            this._expAritmetica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expAritmetica_ == oldChild)
        {
            setExpAritmetica((PExpAritmetica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
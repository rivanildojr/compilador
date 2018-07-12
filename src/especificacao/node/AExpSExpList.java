/* This file was generated by SableCC (http://www.sablecc.org/). */

package especificacao.node;

import especificacao.analysis.*;

@SuppressWarnings("nls")
public final class AExpSExpList extends PExpList
{
    private PExpV _expV_;

    public AExpSExpList()
    {
        // Constructor
    }

    public AExpSExpList(
        @SuppressWarnings("hiding") PExpV _expV_)
    {
        // Constructor
        setExpV(_expV_);

    }

    @Override
    public Object clone()
    {
        return new AExpSExpList(
            cloneNode(this._expV_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpSExpList(this);
    }

    public PExpV getExpV()
    {
        return this._expV_;
    }

    public void setExpV(PExpV node)
    {
        if(this._expV_ != null)
        {
            this._expV_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expV_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expV_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expV_ == child)
        {
            this._expV_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expV_ == oldChild)
        {
            setExpV((PExpV) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
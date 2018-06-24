/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AExpMExpList extends PExpList
{
    private PExpList _expList_;
    private PExpV _expV_;

    public AExpMExpList()
    {
        // Constructor
    }

    public AExpMExpList(
        @SuppressWarnings("hiding") PExpList _expList_,
        @SuppressWarnings("hiding") PExpV _expV_)
    {
        // Constructor
        setExpList(_expList_);

        setExpV(_expV_);

    }

    @Override
    public Object clone()
    {
        return new AExpMExpList(
            cloneNode(this._expList_),
            cloneNode(this._expV_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpMExpList(this);
    }

    public PExpList getExpList()
    {
        return this._expList_;
    }

    public void setExpList(PExpList node)
    {
        if(this._expList_ != null)
        {
            this._expList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expList_ = node;
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
            + toString(this._expList_)
            + toString(this._expV_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expList_ == child)
        {
            this._expList_ = null;
            return;
        }

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
        if(this._expList_ == oldChild)
        {
            setExpList((PExpList) newChild);
            return;
        }

        if(this._expV_ == oldChild)
        {
            setExpV((PExpV) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

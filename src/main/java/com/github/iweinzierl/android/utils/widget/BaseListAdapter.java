package com.github.iweinzierl.android.utils.widget;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.List;

public abstract class BaseListAdapter<T> extends BaseAdapter {

    private final Context context;
    private final List<T> items;

    public BaseListAdapter(Context context, List<T> items) {
        if (items == null) {
            throw new NullPointerException("items may not be null");
        }

        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        if (position >= getCount()) {
            throw new IndexOutOfBoundsException("Position must be < " + getCount());
        } else if (position < 0) {
            throw new IndexOutOfBoundsException("Position must be >= 0 and < " + getCount());
        }
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public Context getContext() {
        return context;
    }

    public T getTypedItem(int position) {
        Object item = getItem(position);
        return item == null ? null : (T) item;
    }
}

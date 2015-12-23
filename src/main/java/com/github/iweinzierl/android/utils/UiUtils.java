package com.github.iweinzierl.android.utils;

import android.text.Spanned;

import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public final class UiUtils {

    public static <T> T getGeneric(final Class<T> type, final View parent, final int resId) {
        View child = getView(parent, resId);

        if (type.isInstance(child)) {
            return (T) child;
        }

        return null;
    }

    public static View getView(final View parent, final int resId) {
        if (parent != null && resId > 0) {
            return parent.findViewById(resId);
        }

        return null;
    }

    public static void hideElement(final View parent, final int resId) {
        View view = getView(parent, resId);
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = 0;
        }
    }

    public static void setSafeHtmlText(final View parent, final int textViewId, final Spanned spanned) {
        TextView textView = getGeneric(TextView.class, parent, textViewId);

        if (textView != null) {
            textView.setText(spanned);
        }
    }

    public static void setSafeText(final View parent, final int textViewId, final String text) {
        TextView textView = getGeneric(TextView.class, parent, textViewId);

        if (textView != null) {
            textView.setText(text);
        }
    }

    public static String getSafeTextOrNull(final View parent, final int textViewId) {
        TextView textView = getGeneric(TextView.class, parent, textViewId);

        if (textView != null) {
            CharSequence text = textView.getText();
            return text == null ? null : text.toString();
        }

        return null;
    }

    private UiUtils() { }
}

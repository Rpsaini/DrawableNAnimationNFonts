package fontpackageforEdittext;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

import fontspackageForTextView.DefineYourAppFont;

public class BoldItalic extends AppCompatEditText
{

    private static Typeface typefaceEdittext;


    public BoldItalic(Context context)
    {
        super(context);
        if (isInEditMode()) return; //Won't work in Eclipse graphical layout
        setTypeface();
    }

    public BoldItalic(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) return;
        setTypeface();
    }

    public BoldItalic(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) return;
        setTypeface();
    }

    private void setTypeface() {
        if (typefaceEdittext == null) {
            typefaceEdittext = Typeface.createFromAsset(getContext().getAssets(), DefineYourAppFont.fontNameBoldItalic);
        }
        setTypeface(typefaceEdittext);
    }
}
package fontpackageforEdittext;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

import fontspackageForTextView.DefineYourAppFont;


public class BoldTextView extends AppCompatEditText
{

    private static Typeface typefaceEdittext;


    public BoldTextView(Context context)
    {
        super(context);
        if (isInEditMode()) return; //Won't work in Eclipse graphical layout
        setTypeface();
    }

    public BoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) return;
        setTypeface();
    }

    public BoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) return;
        setTypeface();
    }

    private void setTypeface() {
        if (typefaceEdittext == null) {
            typefaceEdittext = Typeface.createFromAsset(getContext().getAssets(), DefineYourAppFont.fontNameBold);
        }
        setTypeface(typefaceEdittext);
    }
}
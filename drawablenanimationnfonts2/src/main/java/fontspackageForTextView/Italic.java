package fontspackageForTextView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;


public class Italic extends AppCompatTextView
{

    private static Typeface RobotoTextView;


    public Italic(Context context)
    {
        super(context);
        if (isInEditMode()) return; //Won't work in Eclipse graphical layout
        setTypeface();
    }

    public Italic(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) return;
        setTypeface();
    }

    public Italic(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) return;
        setTypeface();
    }

    private void setTypeface() {
        if (RobotoTextView == null) {
            RobotoTextView = Typeface.createFromAsset(getContext().getAssets(), DefineYourAppFont.fontNameItalic);
        }
        setTypeface(RobotoTextView);
    }
}
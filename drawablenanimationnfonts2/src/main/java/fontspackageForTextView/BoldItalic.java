package fontspackageForTextView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class BoldItalic extends AppCompatTextView
{

    private static Typeface RobotoTextView;


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
        if (RobotoTextView == null) {
            RobotoTextView = Typeface.createFromAsset(getContext().getAssets(), DefineYourAppFont.fontNameBoldItalic);
        }
        setTypeface(RobotoTextView);
    }
}
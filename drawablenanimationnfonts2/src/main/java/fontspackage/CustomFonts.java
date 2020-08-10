package fontspackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class CustomFonts extends AppCompatTextView {

    private  Typeface RobotoTextView;
    private String fontName="";
    public CustomFonts(Context context,String fontName)
    {

        super(context);
        this.fontName=fontName;
        if (isInEditMode()) return; //Won't work in Eclipse graphical layout
        setTypeface();
    }

    public CustomFonts(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) return;
        setTypeface();
    }

    public CustomFonts(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) return;
        setTypeface();
    }

    private void setTypeface() {
        if (RobotoTextView == null) {
            RobotoTextView = Typeface.createFromAsset(getContext().getAssets(), fontName);
        }
        setTypeface(RobotoTextView);
    }
}
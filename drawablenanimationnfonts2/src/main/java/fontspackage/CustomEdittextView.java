package fontspackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;


public class CustomEdittextView extends AppCompatEditText
{

    private static Typeface typefaceEdittext;


    public CustomEdittextView(Context context)
    {
        super(context);
        if (isInEditMode()) return; //Won't work in Eclipse graphical layout
        setTypeface();
    }

    public CustomEdittextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) return;
        setTypeface();
    }

    public CustomEdittextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) return;
        setTypeface();
    }

    private void setTypeface() {
        if (typefaceEdittext == null) {
            typefaceEdittext = Typeface.createFromAsset(getContext().getAssets(), DefineYourAppFont.fontName);
        }
        setTypeface(typefaceEdittext);
    }
}
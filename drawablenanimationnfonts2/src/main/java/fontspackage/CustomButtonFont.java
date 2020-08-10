package fontspackage;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;


public class CustomButtonFont extends AppCompatButton
{
    private static Typeface typefaceButton;


    public CustomButtonFont(Context context)
    {
        super(context);
        if (isInEditMode()) return; //Won't work in Eclipse graphical layout
        setTypeface();
    }

    public CustomButtonFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) return;
        setTypeface();
    }

    public CustomButtonFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) return;
        setTypeface();
    }

    private void setTypeface() {
        if (typefaceButton == null) {
            typefaceButton = Typeface.createFromAsset(getContext().getAssets(), DefineYourAppFont.fontName);
        }
        setTypeface(typefaceButton);
    }
}
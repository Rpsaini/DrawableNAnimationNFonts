package customDrawable;

import android.graphics.drawable.GradientDrawable;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class CustomDrawable
{



    public GradientDrawable defaultViewDrawable(final AppCompatActivity appCompatActivity,
                                                final int shapType,
                                                final int backgroundColor,
                                                final int borderColor,
                                                final int boderWidth,
                                                final int radiiLeftTopCorner,
                                                final int radiiLeftextenstion,
                                                final int radiiRightTopCorner,
                                                final int radiiRightExtension,
                                                final int radiiRightBottomCorner,
                                                final int radiiBottomExtension,
                                                final int radiiLeftBottomCorner,
                                                final int radiiLeftBottomExtension) {

        GradientDrawable shape = new GradientDrawable();
        shape.setShape(shapType);
        shape.setCornerRadii(new float[]{radiiLeftTopCorner, radiiLeftextenstion, radiiRightTopCorner,
                radiiRightExtension,
                radiiRightBottomCorner, radiiBottomExtension, radiiLeftBottomCorner, radiiLeftBottomExtension});
        shape.setColor(backgroundColor);
        shape.setStroke(boderWidth, borderColor);


        return shape;
    }



    public GradientDrawable onClikViewDrawable(final AppCompatActivity appCompatActivity,
                                               final int shapType,
                                               final int backgroundColor,
                                               final int borderColor,
                                               final int boderWidth,
                                               final int radiiLeftTopCorner,
                                               final int radiiLeftextenstion,
                                               final int radiiRightTopCorner,
                                               final int radiiRightExtension,
                                               final int radiiRightBottomCorner,
                                               final int radiiBottomExtension,
                                               final int radiiLeftBottomCorner,
                                               final int radiiLeftBottomExtension,
                                               final boolean isViewClied,
                                               final int viewClickedColorBcgroung,
                                               final DrawableCallBackInterface drawableCallBackInterface) {

        if (isViewClied) {
            GradientDrawable shape = new GradientDrawable();
            shape.setShape(shapType);
            shape.setCornerRadii(new float[]{radiiLeftTopCorner, radiiLeftextenstion, radiiRightTopCorner,
                    radiiRightExtension,
                    radiiRightBottomCorner, radiiBottomExtension, radiiLeftBottomCorner, radiiLeftBottomExtension});
            shape.setColor(viewClickedColorBcgroung);
            shape.setStroke(boderWidth, borderColor);


            Handler hnd=new Handler();
            hnd.postDelayed(new Runnable() {
                @Override
                public void run() {

                    GradientDrawable shape = new GradientDrawable();
                    shape.setShape(shapType);
                    shape.setCornerRadii(new float[]{radiiLeftTopCorner, radiiLeftextenstion, radiiRightTopCorner,
                            radiiRightExtension,
                            radiiRightBottomCorner,radiiBottomExtension, radiiLeftBottomCorner,radiiLeftBottomExtension});
                    shape.setColor(backgroundColor);
                    shape.setStroke(boderWidth, borderColor);
                    drawableCallBackInterface.isViewclicked(shape);
                }
            },1000);


            return shape;
        } else {
            GradientDrawable shape = new GradientDrawable();
            shape.setShape(shapType);
            shape.setCornerRadii(new float[]{radiiLeftTopCorner, radiiLeftextenstion, radiiRightTopCorner,
                    radiiRightExtension,
                    radiiRightBottomCorner, radiiBottomExtension, radiiLeftBottomCorner, radiiLeftBottomExtension});
            shape.setColor(backgroundColor);
            shape.setStroke(boderWidth, borderColor);
            return shape;
        }
    }
}

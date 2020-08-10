package com.app.drawablenanimationnfonts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomFonts latoBoldTextView=new CustomFonts(this,"fonts/LatoBold.ttf");

        setContentView(R.layout.activity_main);
        // public static final int RECTANGLE = 0;
//         public static final int OVAL = 1;
//         public static final int LINE = 2;
//         public static final int RING = 3;


        final Button buttonclick = findViewById(R.id.buttonclick);
        buttonclick.setBackground(defaultViewDrawable(MainActivity.this,
                0, getResources().getColor(android.R.color.holo_red_dark),
                 getResources().getColor(android.R.color.darker_gray),
                2, 10,
                10, 10, 10,
                10, 10,
                10, 10));



        buttonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick.setBackground(onClikViewDrawable(MainActivity.this, 0, getResources().getColor(android.R.color.holo_blue_bright),
                        getResources().getColor(android.R.color.darker_gray),
                        2, 10, 10, 10, 10,
                        10, 10, 10, 10, true, getResources().getColor(android.R.color.holo_green_light), new DrawableCallBackInterface() {
                            @Override
                            public void isViewclicked(GradientDrawable gradientDrawable) {
                                buttonclick.setBackground(gradientDrawable);
                            }
                        }));
              }
        });


    }





    public GradientDrawable defaultViewDrawable(final AppCompatActivity appCompatActivity, final int shapType, final int backgroundColor, final int borderColor, final int boderWidth,
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



    public GradientDrawable onClikViewDrawable(final AppCompatActivity appCompatActivity, final int shapType, final int backgroundColor, final int borderColor, final int boderWidth,
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

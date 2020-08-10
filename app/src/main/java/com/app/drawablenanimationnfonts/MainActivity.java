package com.app.drawablenanimationnfonts;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // public static final int RECTANGLE = 0;
//         public static final int OVAL = 1;
//         public static final int LINE = 2;
//         public static final int RING = 3;

        ObjectAnimator();


//        final Button buttonclick = findViewById(R.id.buttonclick);
//        buttonclick.setBackground(defaultViewDrawable(MainActivity.this,
//                0, getResources().getColor(android.R.color.holo_red_dark),
//                 getResources().getColor(android.R.color.darker_gray),
//                2, 10,
//                10, 10, 10,
//                10, 10,
//                10, 10));



//        buttonclick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                buttonclick.setBackground(onClikViewDrawable(MainActivity.this, 0, getResources().getColor(android.R.color.holo_blue_bright),
//                        getResources().getColor(android.R.color.darker_gray),
//                        2, 10, 10, 10, 10,
//                        10, 10, 10, 10, true, getResources().getColor(android.R.color.holo_green_light), new DrawableCallBackInterface() {
//                            @Override
//                            public void isViewclicked(GradientDrawable gradientDrawable) {
//                                buttonclick.setBackground(gradientDrawable);
//                            }
//                        }));
//              }
//        });


    }






    private void ObjectAnimator()
    {
       final EditText editText =findViewById(R.id.editTextBorder);
       final LinearLayout BottomView =findViewById(R.id.BottomView);
       final TextView textViewOnclick =findViewById(R.id.textViewOnclick);

       editText.setVisibility(View.GONE);

        textViewOnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator  anim = ObjectAnimator.ofFloat(BottomView, "translationY", 0f, -600f);
                anim.setDuration(1000);//set duration
                anim.start();//start animation
                anim.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation)
                    {
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        textViewOnclick.setVisibility(View.GONE);
                        editText.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
            }
        });


        findViewById(R.id.buttonclick).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ObjectAnimator  anim = ObjectAnimator.ofFloat(BottomView, "translationY", -600f, 0f);
                anim.setDuration(1000);//set duration
                anim.start();//start animation

                anim.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animation) {
                        super.onAnimationCancel(animation);
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        textViewOnclick.setVisibility(View.VISIBLE);
                        editText.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {
                        super.onAnimationRepeat(animation);
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                    }

                    @Override
                    public void onAnimationPause(Animator animation) {
                        super.onAnimationPause(animation);
                    }

                    @Override
                    public void onAnimationResume(Animator animation) {
                        super.onAnimationResume(animation);
                    }
                });
            }
        });


    }











}

package com.example.a9_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static int trigger = 0;
    static float scaleX=1, scaleY =1;
    static float angle = 0;
    static float color = 1;
    static float satur = 1;
    static View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new MyGraphicView(this);
        setContentView(view);
        setTitle("연습문제9-5");
        registerForContextMenu(view);
    }

    private static class MyGraphicView extends View {

        public MyGraphicView(Context context) {
            super(context);
        }


        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Bitmap picture = BitmapFactory.decodeResource(getResources(),
                    R.drawable.yeonghun);
            Paint paint = new Paint();


            int cenX = this.getWidth() / 2;
            int cenY = this.getHeight() / 2;
            int picX = (this.getWidth() - picture.getWidth())/2;
            int picY = (this.getHeight() - picture.getHeight())/2;


            switch(trigger){
                case 0:
                    canvas.drawBitmap(picture, picX, picY, null);
                    break;

                case 1:
                    scaleX += 0.2f;
                    scaleY += 0.2f;
                    canvas.scale(scaleX, scaleY, cenX, cenY);
                    canvas.drawBitmap(picture, picX, picY, null);
                    break;

                case 2:
                    scaleX -= 0.2f;
                    scaleY -= 0.2f;
                    canvas.scale(scaleX, scaleY, cenX, cenY);
                    canvas.drawBitmap(picture, picX, picY, null);
                    break;

                case 3:
                    angle += 20;
                    canvas.rotate(angle, cenX, cenY);
                    canvas.drawBitmap(picture, picX, picY, null);
                    break;

                case 4:
                    color = color + 0.2f;
                    float[] array1 = { color, 0, 0, 0, 0,
                            0, color, 0, 0, 0,
                            0, 0, color, 0, 0,
                            0, 0, 0, 1, 0};
                    ColorMatrix cm1 = new ColorMatrix(array1);
                    paint.setColorFilter(new ColorMatrixColorFilter(cm1));
                    canvas.drawBitmap(picture, picX, picY, paint);
                    break;

                case 5:
                    color = color - 0.2f;
                    float[] array3 = { color, 0, 0, 0, 0,
                            0, color, 0, 0, 0,
                            0, 0, color, 0, 0,
                            0, 0, 0, 1, 0};
                    ColorMatrix cm3 = new ColorMatrix(array3);
                    paint.setColorFilter(new ColorMatrixColorFilter(cm3));
                    canvas.drawBitmap(picture, picX, picY, paint);
                    break;

                case 6:

                    float[] array2 = { 1, 0, 0, 0, 0,
                                       0, 1, 0, 0, 0,
                                       0, 0, 1, 0, 0,
                                       0, 0, 0, 1, 0};
                    ColorMatrix cm2 = new ColorMatrix(array2);
                    if (satur ==0) satur = 1;
                    else satur = 0;

                    if(satur ==0) cm2.setSaturation(satur);
                    paint.setColorFilter(new ColorMatrixColorFilter(cm2));
                    canvas.drawBitmap(picture, picX, picY, paint);
                    break;


            }


            picture.recycle();
        }

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,1,0,"확대");
        menu.add(0,2,0,"축소");
        menu.add(0,3,0,"회전");
        menu.add(0,4,0,"밝게");
        menu.add(0,5,0,"어둡게");
        menu.add(0,6,0,"그레이영상");

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case 1:
                trigger = 1;
                view.invalidate();
                return true;
            case 2:
                trigger = 2;
                view.invalidate();
                return true;
            case 3:
                trigger = 3;
                view.invalidate();
                return true;
            case 4:
                trigger = 4;
                view.invalidate();
                return true;
            case 5:
                trigger = 5;
                view.invalidate();
                return true;
            case 6:
                trigger = 6;
                view.invalidate();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
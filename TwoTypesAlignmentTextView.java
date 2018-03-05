package exam.recite.view;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
public class TwoTypesAlignmentTextView extends TextView{
    private StaticLayout myStaticLayout;
    private TextPaint tp;

    public TwoTypesAlignmentTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        initView();
    }

    private void initView() {
        tp = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        tp.setTextSize(getTextSize());
        tp.setColor(getCurrentTextColor());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (getLineCount()>1){
            myStaticLayout = new StaticLayout(getText(), tp, getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }else {
            myStaticLayout = new StaticLayout(getText(), tp, getWidth(), Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, true);
        }
        myStaticLayout.draw(canvas);
    }


}
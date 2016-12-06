package tom.hui.ren.widgets;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NoScrollRecycleView extends RecyclerView {

    public NoScrollRecycleView(Context context) {
        super(context);
    }

    public NoScrollRecycleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoScrollRecycleView(Context context, AttributeSet attrs, int style) {
        super(context, attrs, style);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return true;
    }
}
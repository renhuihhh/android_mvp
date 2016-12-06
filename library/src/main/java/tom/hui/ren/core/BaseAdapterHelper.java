package tom.hui.ren.core;

import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.support.v7.widget.RecyclerView;

import com.google.android.agera.Result;
import com.google.android.agera.Supplier;
import com.google.android.agera.Updatable;

/**
 * @author renhui
 * @date 16-10-28
 * @desc 抽象的recycle item与adapter之间的helper
 */

public abstract class BaseAdapterHelper<T> implements Supplier<Result<T>>, Updatable {
    protected RecyclerView.Adapter mAdapter;
    protected int                  mIndex;
    protected BaseView             mBaseView;

    public abstract BaseAdapterHelper<T> with(@NonNull RecyclerView.ViewHolder holder);

    public abstract void load(@NonNull T object);

    @NonNull
    public abstract BaseAdapterHelper<T> on(@NonNull RecyclerView.Adapter adapter);

    @NonNull
    public abstract BaseAdapterHelper<T> indexOf(@Size(min = 0) int position);

    @NonNull
    public abstract BaseAdapterHelper<T> inView(@NonNull BaseView view);
}

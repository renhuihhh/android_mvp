package tom.hui.ren.core;

import android.support.annotation.NonNull;

import com.google.android.agera.MutableRepository;
import com.google.android.agera.Result;
import com.google.android.agera.Supplier;

/**
 * @author renhui
 * @date 16-8-26
 * @desc 抽象的数据提供者的父类
 */
public abstract class BaseSupplier<T> implements Supplier<Result<T>> {
    protected BasePresenter mPresenter;

    public BaseSupplier() {
    }

    public BaseSupplier(@NonNull BasePresenter presenter, @NonNull MutableRepository supplier) {
        mPresenter = presenter;
    }

    @NonNull
    public abstract Result<T> loadData();
}

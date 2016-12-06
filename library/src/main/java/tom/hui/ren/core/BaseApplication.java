package tom.hui.ren.core;

import android.app.Application;
import android.support.annotation.NonNull;

/**
 * @author renhui
 * @date 16-11-11
 * @desc 基础抽象的Application
 */

public abstract class BaseApplication<T> extends Application {
    public abstract void buildCommonComponent();

    @NonNull
    public abstract T getComponent();
}

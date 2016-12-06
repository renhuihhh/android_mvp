package tom.hui.ren.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * @author renhui
 * @date 16-10-9
 * @desc 抽象的持久化操作接口
 */

public interface BasePersistence<T> {
    public void saveData(@NonNull T data);

    public void deleteData(@NonNull T data);

    @Nullable
    public T retrieveData();
}

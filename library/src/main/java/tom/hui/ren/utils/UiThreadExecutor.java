package tom.hui.ren.utils;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.Executor;

/**
 * @author renhui
 * @date 16/9/8
 * @desc uiThread线程
 */

public class UiThreadExecutor  implements Executor {
    private static final Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    public void execute(Runnable command) {
        mHandler.post(command);
    }

    public static UiThreadExecutor newUiThreadExecutor() {
        return new UiThreadExecutor();
    }

    private UiThreadExecutor() {
    }
}

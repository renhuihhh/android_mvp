package tom.hui.ren.utils;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import tom.hui.ren.core.R;

/**
 * @author renhui
 * @date 16-11-21
 * @desc 根据场景协助生成AlertDialog的工具类
 */

public class DialogUtil {
    public static void showConfirmDialog(Context context, String content, String leftBtn, String rightBtn, final
    AlertDialog.OnClickListener
        listener) {

        final AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.show();
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.left_btn) {
                    listener.onClick(alertDialog, AlertDialog.BUTTON_NEGATIVE);
                } else if (view.getId() == R.id.right_btn) {
                    listener.onClick(alertDialog, AlertDialog.BUTTON_POSITIVE);
                }
            }
        };
        alertDialog.setMessage(content);
        alertDialog.getWindow()
                   .setContentView(R.layout.layout_confirm_dialog);
        ((TextView) alertDialog.findViewById(R.id.dialog_content)).setText(content);
        Button leftButton = (Button) alertDialog.findViewById(R.id.left_btn);
        leftButton.setText(leftBtn);
        Button rightButton = (Button) alertDialog.findViewById(R.id.right_btn);
        rightButton.setText(rightBtn);
        leftButton.setOnClickListener(onClickListener);
        rightButton.setOnClickListener(onClickListener);
    }

    public static AlertDialog getAndShowLoadingDialog(Context context, String content) {
        AlertDialog loadingDialog = new AlertDialog.Builder(context).create();
        loadingDialog.show();
        loadingDialog.getWindow()
                     .setContentView(R.layout.layout_loading_dialog);
        ((TextView) loadingDialog.findViewById(R.id.loading_dlg_echo_text)).setText(content);
        return loadingDialog;
    }

    public static AlertDialog getAndShowLoadingDialog(Context context, @DrawableRes int drawableResId,
        String content) {
        AlertDialog loadingDialog = new AlertDialog.Builder(context).create();
        loadingDialog.show();
        loadingDialog.getWindow()
                     .setContentView(R.layout.layout_loading_dialog1);
        ImageView imageView = (ImageView) loadingDialog.findViewById(R.id.loading_dlg_image1);
        imageView.setImageResource(drawableResId);
        RotateAnimation animation = new RotateAnimation(0, 360*3, RotateAnimation.RELATIVE_TO_SELF, 0.5F,
            RotateAnimation.RELATIVE_TO_SELF, 0.5F);
        animation.setDuration(2000*3);
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.RESTART);
        ((TextView) loadingDialog.findViewById(R.id.loading_dlg_echo_text)).setText(content);
        imageView.startAnimation(animation);
        return loadingDialog;
    }

    public static AlertDialog getAndShowInputDialog(Context context) {
        AlertDialog loadingDialog = new AlertDialog.Builder(context).create();
        loadingDialog.show();
        loadingDialog.getWindow()
                     .setContentView(R.layout.layout_input_dialog);
        return loadingDialog;
    }
}

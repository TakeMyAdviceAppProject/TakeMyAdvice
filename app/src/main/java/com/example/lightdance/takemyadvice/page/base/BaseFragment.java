package com.example.lightdance.takemyadvice.page.base;

import android.app.Fragment;
import android.widget.Toast;

import com.example.lightdance.takemyadvice.app.MessageLevel;

/**
 * @author LightDance
 * @date 2018/2/2.
 * @description 想采用fragment充当界面，activity扮演presenter的角色
 */

public class BaseFragment extends Fragment {

    /**
     * 参数表详见 {@see com.example.lightdance.takemyadvice.app.MessageLevel}
     * @param message
     * @param level 默认为TOAST
     */
    public void showMessage(String message , MessageLevel level){
        level = MessageLevel.TOAST;
        switch (level){
            case TOAST:
                Toast.makeText(getActivity() , message , Toast.LENGTH_SHORT);
                break;
            case TOAST_IMPORTANT:
                Toast.makeText(getActivity() , message , Toast.LENGTH_LONG);
                break;
            case SNACKBAR:
                Toast.makeText(getActivity() , message + "from snackbar" , Toast.LENGTH_SHORT);
            default:
                break;
        }
    }
}

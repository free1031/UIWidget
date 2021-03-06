package com.aries.ui.view.alpha.delegate;

import android.view.View;

import com.aries.ui.helper.alpha.AlphaViewHelper;

/**
 * Created: AriesHoo on 2018/3/14/014 9:44
 * E-Mail: AriesHoo@126.com
 * Function: 控制View alpha度代理类
 * Description:
 */
public class AlphaDelegate {

    private View mView;
    private AlphaViewHelper mAlphaViewHelper;

    public AlphaDelegate(View view) {
        this.mView = view;
    }

    public AlphaViewHelper getAlphaViewHelper() {
        if (mAlphaViewHelper == null) {
            mAlphaViewHelper = new AlphaViewHelper(mView);
        }
        return mAlphaViewHelper;
    }
}

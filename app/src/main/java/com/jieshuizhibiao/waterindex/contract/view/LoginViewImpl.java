package com.jieshuizhibiao.waterindex.contract.view;


import com.jieshuizhibiao.waterindex.contract.IBaseViewImpl;

import java.util.Map;

/**
 * Created by WanghongHe on 2018/12/3 11:05.
 * 回调ui的接口函数
 */

public interface LoginViewImpl extends IBaseViewImpl {
    void onEdtContentsLegal();

    void onEdtContentsIllegal(Map<String, Boolean> verify);

    void onLoginSuccess();

    void onLoginFailed(String msg);
}

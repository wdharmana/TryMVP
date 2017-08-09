package com.wdharmana.trymvp.views.base;

public interface Presenter<T extends View> {

    void onAttach(T view);
    void onDetach();

}

package com.wdharmana.trymvp.views.result;


import com.wdharmana.trymvp.views.base.Presenter;

public class ResultPresenter implements Presenter<ResultView> {
    private ResultView mView;

    @Override
    public void onAttach(ResultView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void showResult(String text) {
        mView.onShowResult(text);
    }
}

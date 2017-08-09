package com.wdharmana.trymvp.views.main;

import com.wdharmana.trymvp.models.Data;
import com.wdharmana.trymvp.views.base.Presenter;

public class MainPresenter implements Presenter<MainView> {
    private MainView mView;

    @Override
    public void onAttach(MainView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void showFragment() {

        final Data data = new Data();
        data.setText("Hai! Im Data.");

        mView.onShowFragment(data);

    }

}

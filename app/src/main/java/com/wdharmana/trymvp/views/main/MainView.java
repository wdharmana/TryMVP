package com.wdharmana.trymvp.views.main;


import com.wdharmana.trymvp.models.Data;
import com.wdharmana.trymvp.views.base.View;

public interface MainView extends View {
    void onShowFragment(Data data);
}

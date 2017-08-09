package com.wdharmana.trymvp.views.result;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wdharmana.trymvp.R;

public class ResultFragment extends Fragment implements ResultView {

    ResultPresenter presenter;

    public static ResultFragment newInstance() {
        return new ResultFragment();
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initPresenter();
        onAttachView();
    }

    private void initPresenter() {
        presenter = new ResultPresenter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false);
    }


    @Override
    public void onAttachView() {
        presenter.onAttach(this);
        setResult();
    }

    @Override
    public void onDetachView() {
        presenter.onDetach();
    }

    @Override
    public void onShowResult(String text) {
        final TextView textView = (TextView) getActivity().findViewById(R.id.tv_result);
        textView.setText(text);
    }

    @Override
    public void onDestroyView() {
        onDetachView();
        super.onDestroyView();
    }

    private void setResult() {
        final Bundle bundle = getArguments();
        final String text = bundle.getString("data");

        presenter.showResult(text);
    }
}

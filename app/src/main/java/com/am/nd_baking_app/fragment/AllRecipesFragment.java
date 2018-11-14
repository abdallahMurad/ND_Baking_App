package com.am.nd_baking_app.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.am.nd_baking_app.R;

import butterknife.BindView;
import butterknife.Unbinder;

public class AllRecipesFragment extends Fragment {
    @BindView(R.id.recipes_recycler_view)
    RecyclerView mRecipesRecyclerView;
    @BindView(R.id.pull_to_refresh)
    SwipeRefreshLayout mPullToRefresh;
    @BindView(R.id.noDataContainer)
    ConstraintLayout mNoDataContainer;

    public AllRecipesFragment() {
        // Required empty public constructor
    }

}

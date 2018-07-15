package com.example.android.newsappstage1;

import java.util.ArrayList;
import android.content.Context;
import android.content.AsyncTaskLoader;

public class NewsLoader extends AsyncTaskLoader<ArrayList<News>> {
    private String mUrl;


    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    public ArrayList<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        //ArrayList<News> news = Query.fetchNewsdata(mUrl, getContext());
        ArrayList<News> news = (ArrayList<News>) QueryUtils.fetchNewsData(mUrl);
        return news;
    }


}

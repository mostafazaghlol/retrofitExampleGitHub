package com.mostafa.android.retrofitexamplegithub;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mostafa on 2/6/18.
 */

class GitHubAdapter extends ArrayAdapter {

    public GitHubAdapter(@NonNull Context context, List<GitHubRepo> resource) {
        super(context, 0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.modifiedlist, parent, false);
        }
        GitHubRepo gitHubRepo = (GitHubRepo) getItem(position);
        TextView txNameOfBook = (TextView) listItemView.findViewById(R.id.text11);
        txNameOfBook.setText(gitHubRepo.getfull_name());
        return listItemView;

    }
}

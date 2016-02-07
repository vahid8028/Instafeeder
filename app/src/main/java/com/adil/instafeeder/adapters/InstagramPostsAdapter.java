package com.adil.instafeeder.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.adil.instafeeder.R;
import com.adil.instafeeder.models.InstagramPost;
import com.adil.instafeeder.utils.Utils;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by adil on 2/3/16.
 */
public class InstagramPostsAdapter extends ArrayAdapter<InstagramPost>{

    private static final String TAG = InstagramPostsAdapter.class.getSimpleName();
    private MinifiedCommentsAdapter commentsAdapter;

    public InstagramPostsAdapter(Context context, int resource, List<InstagramPost> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;

        if (v == null) {
            LayoutInflater li = LayoutInflater.from(getContext());
            v = li.inflate(R.layout.post_item, null);
        }

        InstagramPost post = getItem(position);

        TextView tvUserName = (TextView) v.findViewById(R.id.username);
        tvUserName.setText(post.user.username);

        TextView tvTime = (TextView) v.findViewById(R.id.timeDiff);
        tvTime.setText(Utils.getRelativeTimeSpan(post.createdTime));

        ImageView imgProfile = (ImageView) v.findViewById(R.id.ivProfilePicture);
        imgProfile.setImageResource(0);
        Picasso.with(getContext()).load(post.user.imageUrl).into(imgProfile);

        ImageView imgView = (ImageView) v.findViewById(R.id.ivPhoto);
        imgView.setImageResource(0);
        Picasso.with(getContext()).load(post.imageUrl).into(imgView);

        TextView tvLikesCount = (TextView) v.findViewById(R.id.likesCount);
        tvLikesCount.setText(Utils.templatifyLikesCount(post.likesCount));

        TextView tvCaptionUsername = (TextView) v.findViewById(R.id.tvCaptionUsername);
        tvCaptionUsername.setText(post.user.username);

        TextView tvCaption = (TextView) v.findViewById(R.id.tvCaption);
        tvCaption.setText(post.caption);

        TextView tvCommentsCount = (TextView) v.findViewById(R.id.tvCommentsCount);
        tvCommentsCount.setText(Utils.templatifyCommentsCount(post.commentsCount));

        commentsAdapter = new MinifiedCommentsAdapter(getContext(), R.layout.minified_comment, post.fetchLastTwoComments());
        ListView lvComments = (ListView) v.findViewById(R.id.lvMinifiedComments);
        lvComments.setAdapter(commentsAdapter);

        Log.i(TAG, "likesCount: " + post.likesCount + " caption: " + post.caption + " commentsCount: " + post.commentsCount + " user: " + post.user);

        return v;
    }
}

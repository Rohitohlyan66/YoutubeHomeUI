package com.example.youtubehomeui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<Data> data;
    Context context;


    public RecyclerAdapter(List<Data> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.thumbnail.setImageResource(data.get(position).getThumbnailImage());
        holder.profilePicture.setImageResource(data.get(position).getProfileImage());
        holder.videoTime.setText(data.get(position).getVideoDuration());
        holder.videoTitle.setText(data.get(position).getTitle());
        holder.channelName.setText(data.get(position).getChannelName());
        holder.views.setText(data.get(position).getViews());
        holder.releaseTime.setText(data.get(position).getReleaseTime());

        holder.popUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(context, v);
                popupMenu.inflate(R.menu.popup_menu_layout);
                popupMenu.show();


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.watch_later:
                                Toast.makeText(context, item.getTitle().toString() + " " + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
                            case R.id.save_toPlaylist:
                                Toast.makeText(context, item.getTitle().toString() + " " + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
                            case R.id.report:
                                Toast.makeText(context, item.getTitle().toString() + " " + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
                            case R.id.download:
                                Toast.makeText(context, item.getTitle().toString() + " " + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
                            case R.id.dont_recommend:
                                Toast.makeText(context, item.getTitle().toString() + " " + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
                            case R.id.not_interested:
                                Toast.makeText(context, item.getTitle().toString() + " " + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
                            case R.id.share:
                                Toast.makeText(context, item.getTitle().toString() + " " + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
                            default:
                                return false;
                        }

                    }
                });
            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView thumbnail, profilePicture, popUp;
        TextView videoTime, videoTitle, channelName, views, releaseTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            thumbnail = itemView.findViewById(R.id.thumb);
            profilePicture = itemView.findViewById(R.id.profile_pic);
            popUp = itemView.findViewById(R.id.pop_up_menu);
            videoTime = itemView.findViewById(R.id.video_time);
            videoTitle = itemView.findViewById(R.id.video_title);
            channelName = itemView.findViewById(R.id.channel_name);
            views = itemView.findViewById(R.id.video_views);
            releaseTime = itemView.findViewById(R.id.video_release_date);


        }

    }
}

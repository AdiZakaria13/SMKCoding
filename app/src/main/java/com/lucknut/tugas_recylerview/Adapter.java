package com.lucknut.tugas_recylerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private SetEvents setEvents;
    private List<Novel> NovelList;
    private Context context;

    public interface SetEvents {
        void onItemCLick(Novel novel);
    }

    public Adapter(Context context, @NonNull List<Novel> NovelList, SetEvents setEvents){
        this.context = context;
        this.setEvents = setEvents;
        this.NovelList = NovelList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_novel , viewGroup,false);
        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Novel novel = NovelList.get(i);
        viewHolder.bind(novel, setEvents);
    }

    @Override
    public int getItemCount() {
        return NovelList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        private CardView cardView;
        private TextView novelName;
        private ImageView novelPoster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.Novel_card);
            novelName = itemView.findViewById(R.id.iNovelname);
            novelPoster = itemView.findViewById(R.id.iNovelposter);
        }

        public void bind(final Novel novel, final SetEvents setEvents) {
            novelPoster.setImageResource(novel.getPoster());
            novelName.setText(novel.getName());
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setEvents.onItemCLick(novel);
                }
            });
        }
    }
}




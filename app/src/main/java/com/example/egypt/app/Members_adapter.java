package com.example.egypt.app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ahmed Dongl on 3/6/2015.
 */

    // our ViewHolder.
    // caches our views
      class ViewHolder
    {
        TextView name ;
        TextView relation ;
        ImageView image ;
    }

public class Members_adapter extends ArrayAdapter<Member> {

    Activity activity;
    int layoutResourceId;
    List<Member> membersItems = null;

    public Members_adapter(Activity activity, int layoutResourceId, List<Member> membersItems) {
        super(activity,layoutResourceId,membersItems);
        this.activity = activity;
        this.layoutResourceId = layoutResourceId;
        this.membersItems=membersItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder  holder = null;

        if (convertView == null) {

            // inflate the layout
            LayoutInflater inflater = ((Activity)activity).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);

            // well set up the ViewHolder
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.relation = (TextView) convertView.findViewById(R.id.relation);
            holder.image = (ImageView) convertView.findViewById(R.id.iv_done);

            // store the holder with the view.
            convertView.setTag(holder);
        }
        else
        {
            // we've just avoided calling findViewById() on resource every time
            // just use the viewHolder
            holder = (ViewHolder) convertView.getTag();
        }
          Member obj = membersItems.get(position);
          holder.name.setText(obj.name);
          holder.relation.setText(obj.relation);

        //set image
        if(obj.image){
            holder.image.setImageResource(R.drawable.done_h);
        }

        return convertView;
    }
}


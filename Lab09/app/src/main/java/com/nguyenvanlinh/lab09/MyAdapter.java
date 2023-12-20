package com.nguyenvanlinh.lab09;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
public class MyAdapter extends BaseAdapter {
    Context context;
    List<Course> dskh = new ArrayList<>();
    public MyAdapter(Context context, List<Course> dskh) {
        this.context = context;
        this.dskh = dskh;
    }
    @Override
    public int getCount() {
        if ((dskh.size()>0) && (! dskh.isEmpty()))
            return dskh.size();
        return 0;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null)
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_course,
                    parent, false);
        TextView tv1 = convertView.findViewById(R.id.idCourse);
        TextView tv2 = convertView.findViewById(R.id.nameCourse);
        TextView tv3 = convertView.findViewById(R.id.durationCourse);
        TextView tv4 = convertView.findViewById(R.id.dateCourse);
        TextView tv5 = convertView.findViewById(R.id.desCourse);
        tv1.setText(String.valueOf(dskh.get(position).getId()));
        tv2.setText(dskh.get(position).getCourseName().toString());
        tv3.setText(dskh.get(position).getCourseDuration().toString());
        tv4.setText(dskh.get(position).getCourseTracks().toString());
        tv5.setText(dskh.get(position).getCourseDescription().toString());
        return convertView;
    }
}
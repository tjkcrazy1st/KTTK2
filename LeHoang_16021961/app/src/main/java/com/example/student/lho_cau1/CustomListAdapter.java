package com.example.student.lho_cau1;
        import android.content.Context;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;
        import java.util.List;

public class CustomListAdapter  extends BaseAdapter {

    private List<HoaHau> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(Context aContext,  List<HoaHau> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_row, null);
            holder = new ViewHolder();
            holder.hinhAnhView= (ImageView) convertView.findViewById(R.id.imageView_hoahau);
            holder.hoaHauView = (TextView) convertView.findViewById(R.id.textView_hoahauName);
            holder.namSinhView = (TextView) convertView.findViewById(R.id.textView_namSinh);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        HoaHau hoaHau = this.listData.get(position);
        holder.hoaHauView.setText(hoaHau.getHoaHauName());
        holder.namSinhView.setText(hoaHau.getNamSinh());

        int imageId = this.getMipmapResIdByName(hoaHau.getHinhanhName());

        holder.hinhAnhView.setImageResource(imageId);

        return convertView;
    }

    // Tìm ID của Image ứng với tên của ảnh (Trong thư mục mipmap).
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();

        // Trả về 0 nếu không tìm thấy.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView hinhAnhView;
        TextView hoaHauView;
        TextView namSinhView;
    }

}
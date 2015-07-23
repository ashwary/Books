package com.example.aishwary.books;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import model.Book;


public class MainActivity extends ActionBarActivity  {

    private ListView mListView;
    private List<Book> mItems = new ArrayList<>();
    private ListDataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);
         setListAdapter();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




                public void setListAdapter(){
                    mAdapter = new ListDataAdapter(this);
                    mListView.setAdapter(mAdapter);
                }

    public class ListDataAdapter extends BaseAdapter {
        private LayoutInflater mInflater;

        public ListDataAdapter(Context context) {
            mInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return mItems.size();
        }

        @Override
        public Object getItem(int position) {
            return mItems.get(position);
        }

        @Override
        public long getItemId(int position) {
            return (position);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder = null;
            Book item = mItems.get(position);

            if (convertView == null) {
                convertView = mInflater.inflate(
                        R.layout.item_book_list_view, null);
                holder = new ViewHolder();
                holder.txtTitle = (TextView) convertView
                        .findViewById(R.id.txtTitle);
                holder.txtAuthor = (TextView) convertView
                        .findViewById(R.id.txtAuthor);
                holder.btnDelete = (Button) convertView.findViewById(R.id.btnDelete);
                convertView.setTag(holder);

            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            return convertView;
        }
    }

    class ViewHolder {
        private TextView txtTitle;
        private TextView txtAuthor;
        private Button btnDelete;

    }
}

package com.example.aishwary.books;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import model.Book;

/**
 * Created by Aishwary on 7/22/2015.
 */
public class BookDetailActivity extends ActionBarActivity implements View.OnClickListener {

    private Book mBook;
    private String mBookId;
    private TextView mTxtTitle;
    private TextView mTxtAuthor;
    private TextView mTxtPublisher;
    private TextView mTxtCategories;
    private TextView mTxtLastChecked;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        mTxtTitle = (TextView) findViewById(R.id.txtTitle);
        mTxtAuthor = (TextView) findViewById(R.id.txtAuthor);
        mTxtCategories = (TextView) findViewById(R.id.txtCategories);
        mTxtPublisher = (TextView) findViewById(R.id.txtPublisher);
        mTxtLastChecked = (TextView) findViewById(R.id.txtLastChecked);

        findViewById(R.id.btnCheckout).setOnClickListener(this);


    }


     @Override
     public void onClick(View v) {

    }
}

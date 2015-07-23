package com.example.aishwary.books;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

import Retrofit.BookApiClient;

/**
 * Created by Aishwary on 7/23/2015.
 */
public class AddBookActivity extends ActionBarActivity implements View.OnClickListener{

    private EditText mTxtTitle;

    private EditText mTxtAuthor;

    private EditText mTxtPublisher;

    private EditText mTxtCategories;

    private BookApiClient mApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mTxtTitle = (EditText) findViewById(R.id.txtTitle);
        mTxtAuthor = (EditText) findViewById(R.id.txtAuthor);
        mTxtPublisher = (EditText) findViewById(R.id.txtPublisher);
        mTxtCategories = (EditText) findViewById(R.id.txtCategories);

        findViewById(R.id.btnAdd).setOnClickListener(this);


        mApiClient = new BookApiClient();


    }

    @Override
    public void onClick(View v) {

    }
}

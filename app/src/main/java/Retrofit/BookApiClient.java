package Retrofit;

import java.util.List;

import model.Book;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.Path;

/**
 * Created by Aishwary on 7/23/2015.
 */
public class BookApiClient {

    private static final String API_URL = "https://interview-api.bytemark.co";

    private IBookApi getEndpoint(){
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(API_URL).build();

        IBookApi api = restAdapter.create(IBookApi.class);
        return api;
    }

    public void getAllBooks(Callback<List<Book>> callback){
        IBookApi api = getEndpoint();
        api.getAllBooks(callback);
    }

    public void addBook(Book book, Callback<Book> callback){
        IBookApi api = getEndpoint();
        api.addBook(book, callback);
    }

    public void getBookByPath(@Path("bookPath") String bookPath, Callback<Book> callback){
        bookPath = checkPath(bookPath);
        IBookApi api = getEndpoint();
        api.getBookByPath(bookPath, callback);
    }

    public void updateBookByPath(@Path("bookPath") String bookPath, Book book, Callback<Book> callback){
        bookPath = checkPath(bookPath);
        IBookApi api = getEndpoint();
        api.updateBookByPath(bookPath, book, callback);
    }

    public void delBookByPath(@Path("bookPath") String bookPath, Callback<Object> callback){
        bookPath = checkPath(bookPath);
        IBookApi api = getEndpoint();
        api.delBookByPath(bookPath, callback);
    }

    public void delAllBooks(Callback<Object> callback){
        IBookApi api = getEndpoint();
        api.delAllBooks(callback);
    }

    private String checkPath(String path){
        if(path != null){
            path = path.replace("/book/", "books/");
        }
        return path;
    }

}



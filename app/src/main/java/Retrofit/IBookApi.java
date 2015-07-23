package Retrofit;

import java.util.List;

import model.Book;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by Aishwary on 7/23/2015.
 */
public interface IBookApi {
    @GET("/books")
    void getAllBooks(Callback<List<Book>> callback);

    @POST("/books")
    void addBook(@Body Book book, Callback<Book> callback);

    @GET("/books/{bookId}")
    void getBookByPath(@Path("bookId") String bookId, Callback<Book> callback);

    @PUT("/books/{bookId}")
    void updateBookByPath(@Path("bookId") String bookId, @Body Book book, Callback<Book> callback);

    @DELETE("/books/{bookId}")
    void delBookByPath(@Path("bookId") String bookId, Callback<Object> callback);

    @DELETE("/clean")
    void delAllBooks(Callback<Object> callback);
}

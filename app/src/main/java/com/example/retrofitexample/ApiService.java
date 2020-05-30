package com.example.retrofitexample;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ApiService  {

    @GET("posts")
    Call<List<Post>> getPost(@Query("userId")Integer[] userId,
                             @Query("_sort") String sort,
                             @Query("_order") String order

    );

    @GET("posts")
    Call<List<Post>> getPost(
            @QueryMap Map<String,String> parameters);

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);

    @GET
    Call<List<Comment>> getComments(@Url String url);


    @POST("posts")
    Call<Post> createPost(@Body Post post);

}

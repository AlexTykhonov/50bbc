package com.tae.a50bbc;



import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AnekInter
{
    String BASE_URL = "http://umorili.herokuapp.com/api/";


    @GET("get")
    Observable <List<PojoAnek>> getAnekData(@Query("site")String site, @Query("name") String name, @Query("num") int num);
}


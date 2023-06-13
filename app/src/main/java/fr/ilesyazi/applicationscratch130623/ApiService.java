package fr.ilesyazi.applicationscratch130623;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("users/{id}")
    Call<User> getUser(@Path("id") String userId);

    @GET("users/{name}")
    Call<User> getName(@Path("name") String userName);
}

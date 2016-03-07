package android.danielckv.rapidapi_example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MyApiEndpointInterface {

    @POST("newuser")
    Call<User> createUser(@Body User user);

    @GET("getuser/{email}")
    Call<User> getUser(@Path("email") String email);
}

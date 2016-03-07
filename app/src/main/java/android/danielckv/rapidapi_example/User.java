package android.danielckv.rapidapi_example;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    int mId;

    @SerializedName("name")
    String mName;

    @SerializedName("email")
    String mEmail;

    public User(int id, String name, String email) {
        this.mId = id;
        this.mName = name;
        this.mEmail = email;
    }
}

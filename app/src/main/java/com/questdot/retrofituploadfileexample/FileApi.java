package com.questdot.retrofituploadfileexample;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface FileApi {


    @Multipart
    @POST("uploads.php")
    Call<Respond> uploadImage(@Part MultipartBody.Part file);
}

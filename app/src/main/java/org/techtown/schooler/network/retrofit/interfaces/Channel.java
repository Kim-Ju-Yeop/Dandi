package org.techtown.schooler.network.retrofit.interfaces;

import org.techtown.schooler.Model.CreateChannelRequest;
import org.techtown.schooler.network.Data;
import org.techtown.schooler.network.response.Response;

import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface Channel {
    @GET("/channel")
    Call<Response<Data>> GetChannel(@Header("x-access-token")String token);

    @GET("/channel/search")
    Call<Response<Data>> SearchChannel(@Header("x-access-token")String token,
                                       @Query("channel_name") String channel_name);

    @POST("channel/add")
    Call<Response<Data>> AddChannel(@Header("x-access-token")String token,
                                    @Body CreateChannelRequest createChannelRequest);

    @DELETE("/channel/delete")
    Call<Response<Data>> DeleteChannel(@Header("x-access-token")String token,
                                       @Body String channel_id);

    @GET("/channel/join")
    Call<Response<Data>> JoinChannel(@Header("x-access-token")String token,
                                     @Query("channel_id")String channel_id);

    @GET("/channel/leave")
    Call<Response<Data>> LeaveChannel(@Header("x-access-token")String token,
                                     @Body String channel_id);

    @GET("/channel/info")
    Call<Response<Data>> ChannelInfo(@Header("x-access-token")String token,
                                     @Query("channel_id") String channel_id);

    @Multipart
    @POST("changeCompanyLogo")
    Call<Response> uploadThumbnail(@Header("x-access-token")String token,
                                         @Part MultipartBody.Part thumbnail,
                                         @Part ("name") RequestBody name,
                                         @Query("channel_id") String channel_id);
}
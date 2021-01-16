package bd.gov.bottomnavigationbar.interfaces;

import bd.gov.bottomnavigationbar.model.ApplyResponse;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {

    @GET("govt")
    Call<ApplyResponse> getApplyResponse();


}

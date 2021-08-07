package ac.id.atmaluhur.uas_keperluanku;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface JsonPlaceHolderAPI {
    @GET("minggu1.php")
    Call<List<MingguSatuPost>> getMingguSatuPosts();

    @GET("minggu1.php")
    Call<List<MingguSatuPost>> getMingguSatuPosts(@QueryMap Map<String, String> parameters);

    @GET("minggu2.php")
    Call<List<MingguDuaPost>> getMingguDuaPosts();

    @GET("minggu2.php")
    Call<List<MingguDuaPost>> getMingguDuaPosts(@QueryMap Map<String, String> parameters);

    @GET("minggu3.php")
    Call<List<MingguTigaPost>> getMingguTigaPosts();

    @GET("minggu3.php")
    Call<List<MingguTigaPost>> getMingguTigaPosts(@QueryMap Map<String, String> parameters);

    @GET("minggu4.php")
    Call<List<MingguEmpatPost>> getMingguEmpatPosts();

    @GET("minggu4.php")
    Call<List<MingguEmpatPost>> getMingguEmpatPosts(@QueryMap Map<String, String> parameters);

}

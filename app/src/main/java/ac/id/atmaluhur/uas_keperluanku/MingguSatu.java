package ac.id.atmaluhur.uas_keperluanku;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MingguSatu extends AppCompatActivity {
    private TextView textViewResult;
    private JsonPlaceHolderAPI JsonAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minggu_satu);

        textViewResult = findViewById(R.id.text_minggu1_result);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.8.100/keperluan/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonAPI = retrofit.create(JsonPlaceHolderAPI.class);
        getMingguSatuPosts();
    }

    private void getMingguSatuPosts(){
        Map<String, String> parameters = new HashMap<>();
        Call<List<MingguSatuPost>> call = JsonAPI.getMingguSatuPosts();
        call.enqueue(new Callback<List<MingguSatuPost>>() {
            @Override
            public void onResponse(Call<List<MingguSatuPost>> call, Response<List<MingguSatuPost>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<MingguSatuPost> posts = response.body();
                for (MingguSatuPost post : posts) {
                    String content = "";
                    content += "IDM1: " + post.getIdm1() + "\n";
                    content += "Nama Barang : " + post.getNamaBarang() + "\n";
                    content += "Merk : " + post.getMerk() + "\n";
                    content += "Harga : " + post.getHarga() + "\n";
                    content += "--------------------------------------------------------------" +
                            "-------------------------------------------" + "\n" ;
                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<MingguSatuPost>> call, Throwable t) {
                textViewResult.setText(t.getMessage());

            }
        });
    }

}
package ac.id.atmaluhur.uas_keperluanku;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MingguDua extends AppCompatActivity {
    private TextView textViewResult;
    private JsonPlaceHolderAPI JsonAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minggu_dua);

        textViewResult = findViewById(R.id.text_minggu2_result);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.8.100/keperluan/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonAPI = retrofit.create(JsonPlaceHolderAPI.class);
        getMingguDuaPosts();
    }

    private void getMingguDuaPosts(){
        Map<String, String> parameters = new HashMap<>();
        Call<List<MingguDuaPost>> call = JsonAPI.getMingguDuaPosts();
        call.enqueue(new Callback<List<MingguDuaPost>>() {
            @Override
            public void onResponse(Call<List<MingguDuaPost>> call, Response<List<MingguDuaPost>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<MingguDuaPost> posts = response.body();
                for (MingguDuaPost post : posts) {
                    String content = "";
                    content += "IDM1: " + post.getIdm2() + "\n";
                    content += "Nama Barang : " + post.getNamaBarang() + "\n";
                    content += "Merk : " + post.getMerk() + "\n";
                    content += "Harga : " + post.getHarga() + "\n";
                    content += "--------------------------------------------------------------" +
                            "-------------------------------------------" + "\n" ;
                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<MingguDuaPost>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }
}
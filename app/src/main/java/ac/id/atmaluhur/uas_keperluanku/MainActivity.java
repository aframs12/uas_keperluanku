package ac.id.atmaluhur.uas_keperluanku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // perpindahan
    public void minggu1(View View){ // void dari onclick
        Intent i = new Intent(MainActivity.this, MingguSatu.class); // direct ke class java
        startActivity(i);
    }

    public void minggu2(View View){
        Intent i = new Intent(MainActivity.this, MingguDua.class);
        startActivity(i);
    }

    public void minggu3(View View){
        Intent i = new Intent(MainActivity.this, MingguTiga.class);
        startActivity(i);
    }

    public void minggu4(View View){
        Intent i = new Intent(MainActivity.this, MingguEmpat.class);
        startActivity(i);
    }
}
package com.example.root.tokobukubarokah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.root.tokobukubarokah.network.ApiServices;
import com.example.root.tokobukubarokah.network.InitRetrofit;
import com.example.root.tokobukubarokah.response.ResponseDaftarBuku;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView listBuku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inisialisais
        listBuku = (RecyclerView) findViewById(R.id.list_buku);


        // Method get daftar buku
        getDaftarBuku();

        // Buat adapter
        BukuAdapter adapter = new BukuAdapter(this);

        // set adapter ke RecyclerView
        listBuku.setAdapter(adapter);
        // set Layout manager
        listBuku.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDaftarBuku() {
        // Panggil api services
        ApiServices api = InitRetrofit.getInstance();
        // Siapkan request
        Call<ResponseDaftarBuku> call = api.request_tampil_buku();
        // Kirim requestnya
        call.enqueue(new Callback<ResponseDaftarBuku>() {
            @Override
            public void onResponse(Call<ResponseDaftarBuku> call, Response<ResponseDaftarBuku> response) {
                //
                Log.d("Response", "" +  response.body().toString());
            }

            @Override
            public void onFailure(Call<ResponseDaftarBuku> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}

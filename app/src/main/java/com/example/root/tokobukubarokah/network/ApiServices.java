package com.example.root.tokobukubarokah.network;

import com.example.root.tokobukubarokah.response.ResponseDaftarBuku;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by root on 29/12/17.
 */

public interface ApiServices {
    // Request #1 tampil semua buku
    @GET("lihat_buku.php")
    Call<ResponseDaftarBuku> request_tampil_buku();
    // Request #2 lihat detail buku

}

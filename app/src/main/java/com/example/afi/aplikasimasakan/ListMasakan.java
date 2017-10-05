package com.example.afi.aplikasimasakan;

/**
 * Created by ASUS on 05/10/2017.
 */

public class ListMasakan {
    private int gambarMasakan;
    private String judulMasakan;
    private String deskripsiMasakan;

    private int DetailGambar;
    private String DetailJudul;
    private String DetailDeskripsi;

    public ListMasakan(int gambarMasakan, String judulMasakan, String deskripsiMasakan, int detailGambar, String detailJudul, String detailDeskripsi) {
        this.gambarMasakan = gambarMasakan;
        this.judulMasakan = judulMasakan;
        this.deskripsiMasakan = deskripsiMasakan;
        DetailGambar = detailGambar;
        DetailJudul = detailJudul;
        DetailDeskripsi = detailDeskripsi;
    }

    public int getGambarMasakan() {
        return gambarMasakan;
    }

    public String getJudulMasakan() {
        return judulMasakan;
    }

    public String getDeskripsiMasakan() {
        return deskripsiMasakan;
    }

    public int getDetailGambar() {
        return DetailGambar;
    }

    public String getDetailJudul() {
        return DetailJudul;
    }

    public String getDetailDeskripsi() {
        return DetailDeskripsi;
    }
}

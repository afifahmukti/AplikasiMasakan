package com.example.afi.aplikasimasakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView gambarMasakan;
    TextView judulMasakan;
    TextView deskripsiMasakan;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gambarMasakan = (ImageView)findViewById(R.id.GambarMasakan);
        judulMasakan = (TextView)findViewById(R.id.JudulMasakan);
        deskripsiMasakan = (TextView)findViewById(R.id.DeskripsiMakanan);
        recyclerView = (RecyclerView)findViewById(R.id.RecycleMasakan);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        String[] judulMasakan = {"Tahu Gimbal", "Coto Makasaar", "Nasi Grombyang", "Daging Rendang", "Nasi Gandul"};

        int[] gambarMasakan = {R.drawable.tahuhimbal, R.drawable.coto, R.drawable.sotogrombrang, R.drawable.rendang, R.drawable.nasigandul};

        String[] deskripsiMasakan = {" Tahu Gimbal adalah salah satu menu masakan khas dari kota semarang, bagi anda yang mungkin merantau dan kangen dengan masakan masakan khas semarang, situs resep ini hari ini disajikan spesial untuk anda.",
                "Soto Asal Makassar yang disebut juga Coto ini, memiliki rasa yang khas! Rasa gurih dan kenikmatan daging, paru serta jeroannya akan membuatmu tak dapat melupakannya!\n",
                "Diberi nama demikian sebab soto ini disajikan bersama nasi yang dicampur dengan kuah yang banyak sehingga membuatnya 'bergoyang'. Salah satu ciri khas soto ini adalah adanya kelapa parut sangrai yang ditumbuk sebagai taburan.",
                "Rendang sapi termasuk salah satu menu yang paling banyak dicari orang baik direstoran ataupun dirumah makan padang. Memang wajar saja apabila menu ini banyak dicari orang selain karena harganya yang terjangkau menu ini memang mempunyai daya tarik tersendiri dan kelezatan yang dimana apabila kita pintar didalam pengolahannya bisa membuat kita menjadi bersemangat untuk makan.",
                "Hari minggu acara kumpul keluarga, gimana kalau masak nasi gandul?Meski membuatnya agak rumit karena bumbunya banyak, pasti tidak rugi kalau kenal rasa dan penyajiannya yang unik nasinya \"Nggandul\"tidak nempel di piring tapi di daun. Oya masih punya banyak kacang almond dan kurma ditambahkan aja biar ala timur tengah haaa. Sayang kita masak sama-sama yuk! Nasi gandulnya makannya pakai suru (sendok daun)pasti asyik. Si kecil ajak kita sama-sama makan di gubuk taman rumah pasti rasanya makin maknyus, nyam-nyam seru dan makin segar perut juga suasana."};

        String[] DetailJudul = {"Tahu Gimbal", "Coto Makasaar", "Nasi Grombyang", "Daging Rendang", "Nasi Gandul"};

        String[] DetailDeskripsi = {"Bahan-bahan/bumbu-bumbu:\n" +
                "\n" +
                "1 buah tahu cina, potong 2×2 cm\n" +
                "100 ml air\n" +
                "1/2 sendok teh garam\n" +
                "100 gram kol, diiris tipis, seduh sampai layu\n" +
                "2 tangkai seledri, diiris halus untuk taburan\n" +
                "2 sendok makan bawang merah goreng untuk taburan\n" +
                "kerupuk udang kecil untuk pelengkap\n" +
                "minyak untuk menggoreng\n" +
                "Bahan Gimbal Udang :\n" +
                "\n" +
                "300 gram udang, dikupas\n" +
                "150 gram tepung terigu protein sedang\n" +
                "25 gram tepung beras\n" +
                "1 sendok teh garam\n" +
                "1/4 sendok teh merica bubuk\n" +
                "2 butir telur, dikocok lepas bubuk\n" +
                "150 ml air\n" +
                "Bahan Saus (per Porsi):\n" +
                "\n" +
                "2 buah cabai rawit merah\n" +
                "1 sendok teh petis\n" +
                "1 siung bawang putih\n" +
                "1/2 sendok teh gula merah\n" +
                "1/2 sendok teh garam\n" +
                "30 gram kacang tanah kulit, digoreng, dihaluskan\n" +
                "2 sendok teh kecap manis\n" +
                "2 sendok teh air asam jawa\n" +
                "75 ml air\n" +
                "Cara membuat:\n" +
                "\n" +
                "Rendam tahu dalam air dan garam. Diamkan 5 menit. Goreng sampai matang. Sisihkan.\n" +
                "Gimbal udang, aduk tepung terigu, tepung beras, garam, merica bubuk, dan air. Tambahkan telur. Aduk rata. Masukkan udang. Aduk rata. Ambil 1 sendok sayur adonan. Goreng sampai matang. Sisihkan.\n" +
                "Saus, haluskan cabai rawit, petis, bawang putih, gula merah, dan garam. Masukkan kacang tanah, ulek rata. Tambahkan kecap manis, air asam, dan air sambil diulek rata.\n" +
                "Tata potongan tahu, kol, dan gimbal udang. Siramkan saus. Taburi seledri dan bawang goreng. Sajikan bersama kerupuk udang.\n" +
                "\n" +
                " \n" +
                "Langkah memasak diatas dengan bahan dan bumbu yang di butuhkan anda bisa membuat Tahu Gimbal ini Untuk 7 porsi masakan yang siap untuk disajikan untuk seluruh keluarga anda.\n",
                "BAHAN\n" +
                        "\n" +
                        "350 g daging sapi, potong dadu\n" +
                        "350 g paru sapi, potong dadu\n" +
                        "1 L air\n" +
                        "900 g kacang tanah\n" +
                        "1 bawang bombai\n" +
                        "3 siung bawang merah\n" +
                        "9 siung bawang putih, haluskan\n" +
                        "2 batang daun bawang, potong 2\n" +
                        "3 batang serai, memarkan\n" +
                        "3 cm lengkuas, memarkan\n" +
                        "2 buah jeruk nipis\n" +
                        "1sdt jinten, tumbuk halus\n" +
                        "2 sdm Tauco\n" +
                        "1 sdt Garam,\n" +
                        "1 sdt Gula\n" +
                        "1 ½ sdt Merica\n" +
                        "bawang goreng\n" +
                        "Sambal tauco:\n" +
                        "150 gTauco\n" +
                        "100 ml Air\n" +
                        "8 buah cabai rawit merah\n" +
                        "Pelengkap :\n" +
                        "Ketupat\n" +
                        "Bawang goreng\n" +
                        "Daun bawang\n" +
                        "INSTRUKSI\n" +
                        "\n" +
                        "Persiapan bumbu:\n" +
                        "Haluskan bawang bombay,bawang merah, bawang putih, minyak\n" +
                        "Haluskan kacang tanah yang sudah digoreng dengan blender, tingkat kehalusan kacang disesuaikan dengan selera.\n" +
                        "Masukkan lengkuas. Serai, jinten dan bumbu yang telah dihaluskan, tumis hingga harum\n" +
                        "Masukkan daging, Tambahkan air, rebus hingga mendidih.\n" +
                        "Setelah mendidih, masukkan paru.\n" +
                        "Masukkan kacang dan tauco kedalam rebusan, rebus sampai daging mulai matang.\n" +
                        "Bumbui dengan garam, merica dan gula.\n" +
                        "Rebus hingga kuah berkurang dan mulai mengental.\n" +
                        "Sajikan, lalu tambahkan daun bawang yang sudah diiris, bawang goreng dan jeruk nipis pada saat penyajian. Sajikan bersama ketupat dan sambal tauco.\n" +
                        "Sambal tauco:\n" +
                        "Blender bumbu tauco bersama dengan cabai rawit dan sedikit air.",
                "Bahan:\n" +
                        "400 gram daging sapi, potong dadu\n" +
                        "1/4 butir kelapa, parut, sangrai\n" +
                        "Bumbu yang dihaluskan:\n" +
                        "8 butir bawang merah\n" +
                        "4 siung bawang putih\n" +
                        "4 buah kluwek, rebus, ambil daging buahnya\n" +
                        "2 sdt irisan gula merah\n" +
                        "2 sdt garam\n" +
                        "3 sdm tauco\n" +
                        "2 lembar daun salam\n" +
                        "2 batang serai, memarkan\n" +
                        "1.5 liter air\n" +
                        "2 sdm bawang goreng\n" +
                        "\n" +
                        "Cara Memasak\n" +
                        "Cara membuat:\n" +
                        "Campur daging dengan kelapa sangrai, bumbu halus, dan bumbu lainnya.\n" +
                        "Rebus sampai daging empuk dan air berkurang. Angkat, sajikan dengan taburan bawang goreng.",
                "Bahan Rendang Daging :\n" +
                        "daging sapi lulur 500 gram, potong melebar kurang lebih 12 bagian\n" +
                        "daun kunyit 2 lembar\n" +
                        "daun jeruk 2 lembar\n" +
                        "serai 2 batang, memarkan\n" +
                        "pekak 1 buah\n" +
                        "kelapa parut sangrai 2 sendok makan\n" +
                        "santan 1000-1500 ml dari 2 butir kelapa\n" +
                        "minyak goreng 2 sendok makan\n" +
                        "\n" +
                        "Resep Bumbu Halus Rendang Daging :\n" +
                        "bawang merah 10 butir\n" +
                        "bawang putih 6 siung\n" +
                        "cabai merah 150 gram\n" +
                        "cabai rawit sesuai selera\n" +
                        "kemiri 5 butir\n" +
                        "jinten 1/2 sendok teh\n" +
                        "ketumbar 1 sendok teh\n" +
                        "kunyit 1/2 cm\n" +
                        "jahe 1 cm\n" +
                        "garam secukupnya\n" +
                        "\n" +
                        "Cara Membuat Rendang Daging :\n" +
                        "Panaskan minyak, tumis bumbu halus, daun kunyit, daun jeruk, serai dan pekak hingga harum.\n" +
                        "Masukkan daging, aduk hingga berubah warna.\n" +
                        "Tuang santan dan tambahkan kelapa parut sangrai, masak di atas api sedang sambil diaduk perlahan hingga mendidih.\n" +
                        "Kecilkan api, masak hingga daging matang, berminyak dan kecoklatan.\n" +
                        "Angkan dan sajikan.",
                "Bahan-bahan\t\n" +
                        "5 porsi\n" +
                        "300 gram daging sapi\n" +
                        "200 gram jeroan sapi rebus air rebusan dibuang biar sehat\n" +
                        "100 gram almond cincang untuk taburan dan dihaluskan bersama bumbu\n" +
                        "4 sdm Kecap manis\n" +
                        "10 buah Cabe rawit dan 2 siung bawang putih kukus haluskan ditambah kecap untuk sambal\n" +
                        "4 buah Cabai merah\n" +
                        "10 siung Bawang merah\n" +
                        "8 siung Bawang putih\n" +
                        "3 buah Kapulaga geprak\n" +
                        "1 sdt Jintan\n" +
                        "1 sdm ketumbar\n" +
                        "4 buah kemiri\n" +
                        "3 lembar Daun salam\n" +
                        "3 cm Lengkuas geprak\n" +
                        "3 cm Jahe\n" +
                        "1 cm Kunyit\n" +
                        "4 cm kayu manis\n" +
                        "2 sdm gula aren\n" +
                        "secukupnya garam\n" +
                        "1/2 sdt gula pasir\n" +
                        "1 sdm merica\n" +
                        "1/4 sdt pala\n" +
                        "1 batang sere\n" +
                        "2 buah cengkeh\n" +
                        "1 buah belimbing wuluh, iris\n" +
                        "2 buah daun jeruk\n" +
                        "4 cm kunci\n" +
                        "4 lembar kayu secang untuk menambah warna\n" +
                        "4 buah kurma untuk menambah rasa manis\n" +
                        "1/2 sdt terasi Pati\n" +
                        "secukupnya Bawang merah dan putih goreng\n" +
                        "2 sdm madu\n" +
                        "2 buah kluwak rendam dengan 100ml air hangat\n" +
                        "500 ml santan sedang\n" +
                        "300 ml santan kental\n" +
                        "Langkah\t\n" +
                        "50 menit\n" +
                        "\n" +
                        "Rebus daging dengan 600 ml air sere,kayu manis, salam,lengkuas,cengkeh Kapulaga hingga keluar kaldunya. Pisahkan daging dan kaldu. Iris daging menjadi 5.\n" +
                        "\n" +
                        "Siapkan semua bumbu yang dihaluskan. Haluskan bumbu, jangan lupa kluwaknya, sementara air rendaman kluwak jangan dibuang. Siapkan santan.\n" +
                        "\n" +
                        "Tumis masukkan daging dan jeroan, tambahkan kecap manis,madu, air rendaman kluwak dan air kaldu. Biarkan meresap tambahkan santan encer.\n" +
                        "\n" +
                        "Ambil irisan daging dan jeroan goreng dengan teflon hingga kecoklatan. Angkat dan gunting-gunting daging, jeroan.\n" +
                        "\n" +
                        "Setelah diambil daging dan jeroan lalu tambahkan santan kental. Aduk-aduk kuah gandul hingga matang.\n" +
                        "\n" +
                        "Hidangkan dengan menata nasi diatas daun pisang guyur dengan kuah irisan daging/ jeroan diatasnya, taburi kenari. Jangan lupa sambal kecapnya. Tempe goreng buat pelengkap\n"};

        int[] DetailGambar = {R.drawable.tahuhimbal, R.drawable.coto, R.drawable.sotogrombrang, R.drawable.rendang, R.drawable.nasigandul};

        ArrayList<ListMasakan>listMasakan = new ArrayList<>();
        ListMasakan masakan;
        for (int i=0; i<judulMasakan.length;i++){
             masakan = new ListMasakan(gambarMasakan[i],judulMasakan[i], deskripsiMasakan[i], DetailGambar[i], DetailJudul[i], DetailDeskripsi[i]);
            listMasakan.add(masakan);
        }


        MasakanAdapter masakanAdapter = new MasakanAdapter(this,listMasakan);
        recyclerView.setAdapter(masakanAdapter);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}

package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class HospitalData extends AppCompatActivity {
    private static final String[] hospitalName ={
            "RSUD dr.Saiful Anwar Malang",
            "RS Prima Husada",
            "RSU Karsa Husada",
            "RS Universitas Muhammadiyah Malang",
            "RS Lavalette Malang",
            "RS Panti Waluya Sawahan Malang",
            "RSU Wava Husada Malang",
            "RS Tk. II Dr. Soepraoen",
            "RSUD Kanjuruhan Kab. Malang",
            "RSI Gondanglegi"
    };


    private static final String[] hospitalDetail={
            "Rumah Sakit Saiful Anwar Malang, salah satu RSUD Kelas A dan yang paling ramai di Jawa Timur. Jangkauan layanannya bukan hanya bagi warga Malang-Batu melainkan juga meliputi pasien dari Pasuruan, Probolinggo, Lumajang ke Timur bahkan Hingga Blitar ke Barat.",
            "RS Prima Husada merupakan rumah sakit yang selalu berkomitmen untuk menjaga kualitas pelayanan dan fasilitas rumah sakit sehingga pasien merasa aman dan nyaman dalam menjalani proses pengobatan.",
            "Rumah Sakit Karsa Husada Batu sudah berdiri sejak 1912 yang sekarang berada dibawah naungan Dinas Kesehatan Provinsi Jawa Timur. Rumah Sakit Karsa Husada Batu memiliki Visi mewujudkan rumah sakit yang menjadi pilihan masyarakat, dengan Misi memberikan pelayanan kesehatan yang aman, ramah dan berkualitas, menerapkan tatakelola yang professional dan akuntabel, dan mewujudkan rumah sakit umum sebagai RSU kelas B berpendidikan.",
            "Rumah sakit Universitas Muhammadiyah Malang diresmikan pada tanggal 17 Agustus 2013 bertepatan dengan hari kemerdekaan Republik Indonesia yang ke 68. Rumah sakit ini merupakan sarana penunjang pendidikan dan merupakan salah satu profit center dari Universitas Muhammadiyah Malang.",
            "Rumah Sakit Lavalette adalah salah satu rumah sakit di pusat kota Malang yang dikelola oleh PT Perkebunan Nusantara XI. Rumah Sakit Lavalette berada di dekat lintasan kereta api kawasan Celaket yang sejuk dan rindang dengan fasilitas yang modern.",
            "RS. Panti Waluya Sawahan Malang berdiri sejak tahun 1929, dimana sudah cukup usia dan pengalaman dalam memberikan pelayanan kesehatan. RS. Panti Waluya Malang selalu ikut dalam perkembangan IPTEK Kesehatan yang sejalan dengan perkembangan zaman. Bahkan tidak hanya IPTEK yang berkembang, SDM dalam segala bidang, bidang pelayanan kesehatan di RS. Panti Waluya Sawahan Malang juga berkembang pesat.",
            "Rumah Sakit Wava Husada Malang beroperasi sejak tanggal 18 Januari 2006, dibawah naungan PT. Abna Saman Hudi Sautika Husada. Rumah Sakit Wava Husada Malang memiliki Visi menjadi rumah sakit unggulan dalam pelayanan untuk mencapai kepuasan pelanggan. Dengan Misi menjangkau dan melayani pelanggan secara profesional dan sepenuh hati, menyediakan SDM yang berkompeten dengan mengutamakan Mutu & Keselamatan pasien, serta menyediakan prasarana dan sarana yang berkualitas.",
            "Rumah Sakit Tentara dokter Soepraoen Malang adalah salah satu rumah sakit tingkat II di Malang. Siapa yang sangka, rumah sakit yang beroperasi di bawah kendali Kesdam V/Brawijaya ini memiliki sejarah yang panjang. Sejarah tersebut menjadi bagian dari perkembangan Kota Malang pada zaman pendudukan Belanda hingga era kemerdekaan.",
            "RSUD Kanjuruhan merupakan rumah sakit  Milik Pemerintah Kabupaten Malang dengan type Kelas B Non Pendidikan, Berstandar SMM ISO 9001:2015 serta Lulus Akreditasi Tingkat Paripurna. Berdiri di lahan seluas 32.140 m2  dan Luas bangunan 17.550 m2.",
            "Rumah Sakit Islam (RSI) Gondanglegi merupakan salah satu rumah sakit tingkat kecamatan di Kabupaten Malang. Sebagai rumah sakit tingkat kecamatan, RSI Gondanglegi bisa dibilang lengkap secara peralatan dan pelayanan dokternya."

    };

    private static final int[] hospitalImages={
            R.drawable.rsu_saiful_anwar,
            R.drawable.rsu_prima_husada,
            R.drawable.rs_karsa_husada,
            R.drawable.rs_universitas_muhammaddiyah_malang,
            R.drawable.rs_lavalette_malang,
            R.drawable.rs_panti_waluya_sawahan,
            R.drawable.rsu_wava_husada_malang,
            R.drawable.rsu_dr_soepraoen,
            R.drawable.rsud_kanjuruhan_kepanjen_malang,
            R.drawable.rsi_gondanglegi

    };

    private static final String[] hospitalRoom={
            "Tersedia 37 Ruang Isolasi",
            "Tersedia 6 Ruang Isolasi",
            "Tersedia 28 Ruang Isolasi",
            "Tersedia 30 Ruang Isolasi",
            "Tersedia 8 Ruang Isolasi",
            "Tersedia 12 Ruang Isolasi",
            "Tersedia 2 Ruang Isolasi",
            "Tersedia 19 Ruang Isolasi",
            "Tersedia 24 Ruang Isolasi",
            "Tersedia 4 Ruang Isolasi"
    };

    private static  final String[] hospitalPhone={
            "(0341) 362101",
            "(0341) 458679",
            "(0341) 596898",
            "(0341) 561666",
            "(0341) 470805",
            "(0341) 366033",
            "(0341) 393000",
            "(0341) 325112",
            "(0341) 395041",
            "(0341) 879047"
    };

    private static final String[] hospitalAddress={
            "Jl. Jaksa Agung Suprapto No. 2, Klojen, Kec. Klojen, Kota Malang, Jawa Timur 65111",
            "Jl.Raya Mondoroko, Mondoroko, Banjararum,Kec. Singosari, Malang, Jawa Timur 65153",
            "Jl. Ahmad Yani No. 11–13, Batu Jawa Timur - Indonesia",
            "JL. RAYA TLOGOMAS NO 45 MALANG Malang, Jawa Timur, Indonesia 65144",
            "Jl. W.R Supratman No. 10 Malang",
            "Jl. Nusakambangan No.56, Kasin, Kec. Klojen, Kota Malang, Jawa Timur 65117",
            "Jl. Panglima Sudirman No.99A, Lemah Duwur, Dilem, Kec. Kepanjen",
            "JL. S. Supriyadi, No. 22, Sukun, Kec. Sukun, Kota Malang, Jawa Timur 65139",
            "Jl. Panji No.100, Krajan,Panggungrejo, Kec. Kepanjen, Malang, Jawa Timur 65163",
            "Jl. Hayam Wuruk No.66, Krajan, Gondanglegi Wetan, Kec. Gondanglegi, Malang, Jawa Timur 65174"
    };

    static ArrayList<Hospital> getListData(){
        ArrayList<Hospital> list = new ArrayList<>();
        for (int position=0 ; position< hospitalName.length; position++){
            Hospital hospital = new Hospital();
            hospital.setNama(hospitalName[position]);
            hospital.setDetail(hospitalDetail[position]);
            hospital.setPhoto(hospitalImages[position]);
            hospital.setAddress(hospitalAddress[position]);
            hospital.setRoom(hospitalRoom[position]);
            hospital.setPhone(hospitalPhone[position]);
            list.add(hospital);
        }
        return list;
    }
}

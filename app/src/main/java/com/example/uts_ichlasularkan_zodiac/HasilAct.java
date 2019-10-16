package com.example.uts_ichlasularkan_zodiac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HasilAct extends AppCompatActivity {
    String get_nama,get_tanggal;
    TextView nama_zodiak,isi_zodiak,bulan_zodiak,textView3,textView4;
    ImageView icon_zodiak,btn_back;
    Animation logo_splash,btt,ttb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        nama_zodiak = findViewById(R.id.nama_zodiak);
        isi_zodiak = findViewById(R.id.isi_zodiak);
        bulan_zodiak = findViewById(R.id.bulan_zodiak);
        icon_zodiak = findViewById(R.id.icon_zodiak);
        btn_back = findViewById(R.id.btn_back);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);


        logo_splash = AnimationUtils.loadAnimation(this,R.anim.logo_splash);
        btt = AnimationUtils.loadAnimation(this,R.anim.btt);
        ttb = AnimationUtils.loadAnimation(this,R.anim.ttb);

        icon_zodiak.startAnimation(logo_splash);
        isi_zodiak.startAnimation(btt);
        bulan_zodiak.startAnimation(btt);
        nama_zodiak.startAnimation(btt);
        textView3.startAnimation(btt);
        textView4.startAnimation(btt);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goback = new Intent(HasilAct.this,ZodiacHome.class);
                startActivity(goback);
            }
        });

        Bundle b = getIntent().getExtras();
        get_nama = b.getString("parse_nama");
        get_tanggal = b.getString("parse_tanggal");

        String[] items1 = get_tanggal.split("/");
        String date1=items1[0];
        String month=items1[1];
        String year=items1[2];



        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 12) || (Integer.parseInt(date1)<=19 && Integer.parseInt(month) == 1)){
        icon_zodiak.setImageResource(R.drawable.capricorn);
        nama_zodiak.setText("Capricorn");
        isi_zodiak.setText("Orang yang lahir pada tanggal antara 21 Desember sampai 19 Januari berada di " +
                "bawah pengaruh zodiak Capricorn, yang berlambang kambing. Orang yang berzodiak Capricorn " +
                "mengutamakan kesuksesan, status, posisi, reputasi");

        bulan_zodiak.setText("Capricorn memang bercita – cita mencari kekuasaan dalam karir sehingga Anda harus siap bekerja dengan tekun");
        }

        if ((Integer.parseInt(date1)>20 && Integer.parseInt(month) == 1) || (Integer.parseInt(date1)<=18 && Integer.parseInt(month) == 2)){
            icon_zodiak.setImageResource(R.drawable.aquarius);
            nama_zodiak.setText("Aquarius");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 20 Januari sampai 18 Febuari berada di bawah pengaruh zodiak Aquarius, yang berlambang gelombang (alur air). Orang Aquarius tertarik dengan petualangan dan berjiwa kemanusiaan");
            bulan_zodiak.setText("Kelahiran Aquarius ini biasanya tekun bekerja dan ingin orang lain sama tekun dalam bekerja sama. Lantaran itu, Aquarius menyukai karir yang mengikat");
        }

        if ((Integer.parseInt(date1)>19 && Integer.parseInt(month) == 2) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 3)){
            icon_zodiak.setImageResource(R.drawable.piscess);
            nama_zodiak.setText("Pisces");
            isi_zodiak.setText("Orang yang lahir antara tanggal 19 Febuari sampai 20 Maret dikatakan bernaung di bawah zodiak Pisces, yang berlambang ikan. ");
            bulan_zodiak.setText("Orang berzodiak Pisces suka pada pujian dan mengharapkan ungkapan cinta dari kekasih." +
                    " Justru itu, seseorang yang berkeperibadian kuat adalah pendamping yang tepat untuk Pisces");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 3) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 4)){
            icon_zodiak.setImageResource(R.drawable.aries);
            nama_zodiak.setText("Aries");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 21 Maret sampai 20 April dikatakan bernaung di bawah zodiak Aries, yang berlambang Biri-biri jantan");
            bulan_zodiak.setText("Aries punya daya pesona yang tinggi. Dalam pergaulan, Aries kelihatan lincah, pintar, berkeperibadian kuat dan teman bual yang mengasyikan. ");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 4) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 5)){
            icon_zodiak.setImageResource(R.drawable.tauruss);
            nama_zodiak.setText("Taurus");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 21 April sampai 20 Mei dikatakan bernaung di bawah zodiak Taurus, yang berlambang Lembu Jantan");
            bulan_zodiak.setText("Cancer dan Virgo adalah pasangan yang ideal bagi Taurus. Cancer memang pendamping tepat bagi Taurus. Keperibadian Cancer yang matang dan tidak berubah – ubah sesuai dengan cita rasa Taurus. ");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 5) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 6)){
            icon_zodiak.setImageResource(R.drawable.gemini);
            nama_zodiak.setText("Gemini");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 21 Mei sampai 20 Juni dikatakan bernaung di bawah zodiak Gemini, yang berlambang Saudara Kembar");
            bulan_zodiak.setText("\n" +
                    "Pendamping yang cocok untuk Gemini adalah seseorang yang cerdas dan memahami cita rasa Gemini yang selalu berubah – ubah. Zodiak Aries dan Taurus adalah pasangan yang tepat buat Anda. ");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 6) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 7)){
            icon_zodiak.setImageResource(R.drawable.cancer);
            nama_zodiak.setText("Cancer");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 21 Juni sampai 20 Juli dikatakan bernaung di bawah zodiak Cancer, yang berlambang Kepiting.");
            bulan_zodiak.setText("Seseorang yang berperibadian yang matang adalah pasangan yang ideal buat Cancer. Di sini, zodiak Taurus dan Virgo merupakan pendamping yang ideal bagi Cancer.");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 7) || (Integer.parseInt(date1)<=21 && Integer.parseInt(month) == 8)){
            icon_zodiak.setImageResource(R.drawable.leooo);
            nama_zodiak.setText("Leo");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 21 Juli sampai 21 Agustus dikatakan bernaung di bawah zodiak Leo, yang berlambang Singa.");
            bulan_zodiak.setText("Leo suka bergaul sehingga tidak dapat berdampingan dengan seseorang yang cemburu dan mengungkung. Dalam situasi ini, Libra, Sagitarius, dan Taurus adalah pendamping ideal buat Leo. ");
        }

        if ((Integer.parseInt(date1)>22 && Integer.parseInt(month) == 8) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 9)){
            icon_zodiak.setImageResource(R.drawable.virgo);
            nama_zodiak.setText("Virgo");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 22 Agustus hingga 22 September dikatakan bernaung di bawah zodiak Virgo, yang berlambang Seorang Gadis.");
            bulan_zodiak.setText("Zodiak Cancer dapat menjadi teman atau kekasih yang baik bagi Virgo. Sementara bersama Virgo yang serius, Cancer yang cemburu; tidak akan merasa resah. ");
        }

        if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 9) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 10)){
            icon_zodiak.setImageResource(R.drawable.libra);
            nama_zodiak.setText("Libra");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 23 September sampai 22 Oktober dikatakan bernaung di bawah zodiak Libra, yang berlambang Alat Penimbang (Dacin).");
            bulan_zodiak.setText("Libra adalah seorang kekasih yang cerdas dan selalu menjaga perbuatan dan pertuturannya agar kekasihnya tidak tersinggung. Pendamping yang ideal buat Libra adalah Taurus dan Leo.");
        }

        if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 10) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 11)){
            icon_zodiak.setImageResource(R.drawable.scorpio);
            nama_zodiak.setText("Scorpio");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 23 Oktober sampai 22 November dikatakan bernaung di bawah zodiak Scorpio, yang berlambang kalajengking.");
            bulan_zodiak.setText("Orang yang bernaung di bawah lambang Taurus dan Cancer merupakan pendamping yang sesuai untuk Scorpio. Taurus adalah pedamping yang diperlukan oleh Scorpio.");
        }

        if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 11) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 12)){
            icon_zodiak.setImageResource(R.drawable.sagitarius);
            nama_zodiak.setText("Sagitarius");
            isi_zodiak.setText("Orang yang lahir pada tanggal antara 23 November sampai 20 Desember dikatakan bernaung di bawah zodiak Sagitarius, yang berlambang Pemanah. ");
            bulan_zodiak.setText("Sagitarius seorang kekasih yang setia. Pasangan yang dilakukan adalah bukan dari jenis yang cemburu. Jadi, pasangan yang cocok dengan Sagitarius adalah Aries dan Gemini.");
        }

    }
}

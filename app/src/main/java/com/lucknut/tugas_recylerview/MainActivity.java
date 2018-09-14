package com.lucknut.tugas_recylerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Novel> novelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Novelku");
        }

        recyclerView = findViewById(R.id.mainRecycler);

        novelList = new ArrayList<>();
        novelList.add(new Novel(R.drawable.dunia_sophie,  "Dunia Sophie", "Sophie, seorang pelajar sekolah menengah berusia empat belas tahun. Suatu hari sepulang sekolah, dia mendapat sebuah surat misterius yang hanya berisikan satu pertanyaan: “Siapa kamu?” Belum habis keheranannya, pada hari yang sama dia mendapat surat lain yang bertanya: “Dari manakah datangnya dunia?” Seakan tersentak dari rutinitas hidup sehari-hari, surat-surat itu membuat Sophie mulai mempertanyakan soal-soal mendasar yang tak pernah dipikirkannya selama ini. Dia mulai belajar filsafat."));
        novelList.add(new Novel(R.drawable.nightmare, "Nightmare", "Ini adalah liburan musim dingin terburuk bagi Jowy. Jowy Bright melewati liburan musim dingin di rumah bibinya yang berada di Desa Scar winter. Di desa itu terdapat sebuah mitos yang mengatakan bahwa disana terdapat roh wanita jahat yang berusaha untuk bertahan hidup dengan cara menyerang lelaki , yang kerap disebut wanita salju. Baru saja beberapa hari ia di sana, sudah berbagai hal tidak menyenangkan terjadi. Mulai dari sosok yang ia temukan berada di beranda kamarnya, seorang tak dikenal yang berada di rumah bibinya, juga seorang gadis yang melemparnya dengan bongkahan es hingga ia berdarah. Semua itu tampak cukup aneh bagi Jowy. Semua hal tersebut seakan mengatakan bahwa ia tak seharusnya berada di Desa Scar Winter. Dan benar saja. Suatu kejadian seakan menjadi pertanda bagi prasangka Jowy selama ini, dan tidak akan pernah membuat kehidupan Jowy menjadi tenang. Jowy menjadi saksi mata atas kematian teman-temannya. Namun, kesaksian itu malah membuat dirinya semakin terpojok karena Jowylah satu-satunya yang telah melihat “dia”, si wanita salju. Dan wanita salju itu tidak akan perna membuat owy bertahan hidup lebih lama lagi. Namun di balik itu semua, Jowy telah mempelajari suatu kenyataan pahit. Janganlah mempercayai apa pun yang ada di Desa Scar Winter."));
        novelList.add(new Novel(R.drawable.psychopat, "psycopat", "Psikopat. Bila mendengar istilah ini, biasanya akan membuat siapapun langsung membayangkan sosok seram seorang pembunuh kriminal (lengkap dengan topengnya), bersenjatakan pisau besar, tajam dan berkilat dalam genggaman, siap untuk menyiksa dan membunuh serta memutilasi korban-korbannya Apakah benar bahwa sosok psikopat seperti itu dalam bayangan anda? nah, marilah kita lihat sejenak fakta-faktanya dari hasil penelitian para ahli psikologi : Psikopat berasal dari kata psyche yang berarti jiwa dan pathos yang berarti penyakit. Psikopat tak sama dengan skizofrenia karena seorang psikopat sadar sepenuhnya atas perbuatannya. Gejalanya sendiri sering disebut dengan psikopati, dan pengidapnya sering disebut sebagai “orang gila tanpa gangguan mental” Psikopat, ternyata memiliki tampilan yang jauh berbeda dengan gambaran diatas tadi. Dr. Hervey Cleckley, psikiater yang dianggap salah satu peneliti perintis tentang Psikopat, menulis dalam bukunya “The Mask of Sanity” (1947, dalam Hare, 1993), menggambarkan Psikopat sebagai pribadi yang “likeable, charming, intelligent, alert, impressive, confidence-inspiring, an a great success with the ladies”, tetapi sekaligus juga “irresponsible, self destructive, and the like”. Demikian pula Dr. Robert Hare, dalam bukunya “Without Conscience: The disturbing world of the Psychopaths among us“ (1993)."));
        novelList.add(new Novel(R.drawable.dunia_sophie,  "Dunia Sophie", "Sophie, seorang pelajar sekolah menengah berusia empat belas tahun. Suatu hari sepulang sekolah, dia mendapat sebuah surat misterius yang hanya berisikan satu pertanyaan: “Siapa kamu?” Belum habis keheranannya, pada hari yang sama dia mendapat surat lain yang bertanya: “Dari manakah datangnya dunia? Seakan tersentak dari rutinitas hidup sehari-hari, surat-surat itu membuat Sophie mulai mempertanyakan soal-soal mendasar yang tak pernah dipikirkannya selama ini. Dia mulai belajar filsafat."));
        novelList.add(new Novel(R.drawable.nightmare, "Nightmare", "Ini adalah liburan musim dingin terburuk bagi Jowy. Jowy Bright melewati liburan musim dingin di rumah bibinya yang berada di Desa Scar winter. Di desa itu terdapat sebuah mitos yang mengatakan bahwa disana terdapat roh wanita jahat yang berusaha untuk bertahan hidup dengan cara menyerang lelaki , yang kerap disebut wanita salju. Baru saja beberapa hari ia di sana, sudah berbagai hal tidak menyenangkan terjadi. Mulai dari sosok yang ia temukan berada di beranda kamarnya, seorang tak dikenal yang berada di rumah bibinya, juga seorang gadis yang melemparnya dengan bongkahan es hingga ia berdarah Semua itu tampak cukup aneh bagi Jowy. Semua hal tersebut seakan mengatakan bahwa ia tak seharusnya berada di Desa Scar Winter. Dan benar saja. Suatu kejadian seakan menjadi pertanda bagi prasangka Jowy selama ini, dan tidak akan pernah membuat kehidupan Jowy menjadi tenang. Jowy menjadi saksi mata atas kematian teman-temannya. Namun, kesaksian itu malah membuat dirinya semakin terpojok karena Jowylah satu-satunya yang telah melihat “dia”, si wanita salju. Dan wanita salju itu tidak akan perna membuat owy bertahan hidup lebih lama lagi. Namun di balik itu semua, Jowy telah mempelajari suatu kenyataan pahit. Janganlah mempercayai apa pun yang ada di Desa Scar Winter."));



        Adapter novelAdapter = new Adapter(MainActivity.this, novelList, new Adapter.SetEvents() {
            @Override
            public void onItemCLick(Novel novel) {
                Intent intent = new Intent(MainActivity.this, Novel_detail.class);
                intent.putExtra("novel", novel);
                startActivity(intent);
            }
        });

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(novelAdapter);
    }
}

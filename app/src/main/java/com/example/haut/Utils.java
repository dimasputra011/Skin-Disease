package com.example.haut;

import android.net.Uri;

import java.util.HashMap;

public class Utils {

    public static Uri imgVar;

    public static HashMap<Integer, String> hashMap = new HashMap<Integer, String>() {{
        put(0,"Actinic keratoses");
        put(1,"Basal cell carcinoma");
        put(2,"Benign keratosis-like lesions");
        put(3,"Dermatofibroma");
        put(4,"Melanocytic nevi");
        put(5,"Vascular lesions");
        put(6,"Melanoma");
    }};

    public static HashMap<Integer, String> hashMapInfo = new HashMap<Integer, String>() {{
        put(0,"Actinic keratosis atau sering juga disebut solar keratosis, adalah gangguan yang menyebabkan kulit kasar dan bersisik akibat paparan ultraviolet dari sinar matahari dalam waktu lama (umumnya selama bertahun-tahun). Biasanya, kondisi ini terjadi pada wajah, bibir, telinga, lengan, kulit kepala, leher, atau kaki. ");
        put(1,"Basal cell carcinoma  salah satu jenis kanker kulit yang ditandai dengan kemunculan benjolan yang mudah berdarah. Benjolan ini dapat bertambah besar seiring berjalannya waktu. Benjolan tersebut timbul pada area tubuh yang sering terpapar sinar matahari dan umumnya tidak terasa nyeri.");
        put(2,"Benign keratosis atau sering juga disebut Keratosis seboroik adalah benjolan seperti kutil yang tumbuh di permukaan kulit dan bisa bertambah seiring waktu. Kondisi ini lebih sering terjadi pada orang dewasa, terutama yang lanjut usia. Keratosis seboroik dapat tumbuh di permukaan kulit mana pun.");
        put(3,"Dermatofibroma adalah jenis tumor kulit non-kanker yang sangat umum. Tumor ini terdiri dari kombinasi sel fibroblastik, histiosit, dan jenis jaringan ikat yang disebut kolagen. Tumor berkembang di lapisan kulit disebut dermis. Nama lain dari dermatofibroma adalah histiositoma fibrosa jinak.");
        put(4,"A melanocytic nevus adalah bercak berwarna yang terdapat di atas permukaan kulit. Bercak berwarna ini berasal dari sel-sel melanosit, yakni pembentuk warna kulit dan rambut. Kondisi ini umumnya muncul saat lahir atau segera setelah lahir, terbanyak pada dewasa muda, dan menurun pada orang tua.");
        put(5,"Vascular lesions adalah kelainan yang relatif umum terjadi pada kulit dan jaringan di bawahnya, yang lebih dikenal sebagai tanda lahir. Ada tiga kategori utama lesi vaskular: Hemangioma, Malformasi Vaskular, dan Granuloma Piogenik.");
        put(6,"Melanoma adalah salah satu jenis kanker kulit yang terjadi akibat pertumbuhan sel melanosit secara tidak normal. Penyakit ini termasuk jenis kanker kulit ganas yang dapat menyebar dengan cepat ke organ tubuh lain, seperti mata, hidung, tenggorokan, otak, dan paru-paru.");
    }};

}

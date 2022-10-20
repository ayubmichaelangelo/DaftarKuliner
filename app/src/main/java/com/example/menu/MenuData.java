package com.example.menu;

import java.util.ArrayList;

public class MenuData {

    private static String[] menuName = {
            "Garang Asem",
            "Nasi Jangkrik",
            "Lentog Tanjung",
            "Nasi Pindang",
            "Soto Kudus"

    };

    private static String [] menuDetail = {
            "Garang asem terbuat dari daging ayam, lalu dibumbui bersama kuah santan. Memasaknya pun memakai daun pisang, jadi makin sedap.",
            "Nasi jangkrik disajikan dengan potongan daging kerbau, tahu, dan kuah bersantan dengan daun jati sebagai pembungkusnya.",
            "Lentog tanjung biasa jadi menu sarapan, terdiri dari lontong, sayur nangka muda, lodeh tahu, dan sambal. Makin nikmat kalau ada sate telur puyuh.",
            "Disajikan dengan daun pisang, nasi pindang punya rasa gurih dan manis. Ada daging kerbau dengan kuah pindang sebagai pelengkapnya.",
            "Soto Kudus pasti familiar di telingamu. Biasanya disajikan di mangkuk kecil, dilengkapi daging ayam, seledri, taoge, dan taburan bawang goreng."

    };

    private static int [] menuImage = {
            R.drawable.garangasem,
            R.drawable.nasijangkrik,
            R.drawable.lentogtanjung,
            R.drawable.nasipindang,
            R.drawable.sotokudus,

    };

    static ArrayList<Menu> getListData(){
        ArrayList<Menu> list = new ArrayList<>();
        for(int position = 0; position <menuName.length; position++){
            Menu menu = new Menu();
            menu.setName(menuName[position]);
            menu.setDetail(menuDetail[position]);
            menu.setPhoto(menuImage[position]);
            list.add(menu);
        }
        return list;
    };
}

package com.alfanthariq.timelinerecyclersample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alfanthariq on 12/05/2018.
 */

public class KegiatanSource {
    List<Kegiatan> list;

    public KegiatanSource(){
        list = new ArrayList<Kegiatan>();
        list.add(new Kegiatan("12/05/2018", "Sabtu","09:00", "Persiapan berangkat"));
        list.add(new Kegiatan("12/05/2018", "Sabtu","10:00", "Sampai tujuan"));
        list.add(new Kegiatan("12/05/2018", "Sabtu","11:00", "Perjalanan ke spot diving"));
        list.add(new Kegiatan("12/05/2018", "Sabtu","13:00", "Diving"));
        list.add(new Kegiatan("12/05/2018", "Sabtu","14:00", "Snorkeling"));
        list.add(new Kegiatan("12/05/2018", "Sabtu","17:00", "Makan makan"));
        list.add(new Kegiatan("12/05/2018", "Sabtu","20:00", "Sharing"));
        list.add(new Kegiatan("12/05/2018", "Sabtu","21:00", "Acara bebas"));

        list.add(new Kegiatan("13/05/2018", "Minggu","09:00", "Makan pagi"));
        list.add(new Kegiatan("13/05/2018", "Minggu","10:00", "Berangkat ke spot surfing"));
        list.add(new Kegiatan("13/05/2018", "Minggu","11:00", "Mulai surfing"));
        list.add(new Kegiatan("13/05/2018", "Minggu","16:00", "Istirahat"));
        list.add(new Kegiatan("13/05/2018", "Minggu","17:00", "Kembali ke penginapan"));

        list.add(new Kegiatan("14/05/2018", "Senin","09:00", "Makan pagi"));
        list.add(new Kegiatan("14/05/2018", "Senin","10:00", "Berangkat ke spot surfing"));
        list.add(new Kegiatan("14/05/2018", "Senin","11:00", "Mulai surfing"));
        list.add(new Kegiatan("14/05/2018", "Senin","16:00", "Istirahat"));
        list.add(new Kegiatan("14/05/2018", "Senin","17:00", "Kembali ke penginapan"));
    }

    public List<Kegiatan> getList() {
        return list;
    }
}

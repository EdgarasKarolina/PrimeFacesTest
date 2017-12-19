package com.codenotfound.primefaces;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "tvService")
@ApplicationScoped
public class TvStationServices
{
    private final static String[] stations;

    private final static String[] webs;

    private final static String[] isPrivates;

    static {
        stations = new String[10];
        stations[0] = "DR";
        stations[1] = "TV2";

        webs = new String[10];
        webs[0] = "DR.dk";
        webs[1] = "TV2.dk";

        isPrivates = new String[10];
        isPrivates[0] = "No";
        isPrivates[1] = "Yes";
    }

    public List<TvStation> createStations(int size) {
        List<TvStation> list = new ArrayList<TvStation>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new TvStation(stations[i], webs[i], isPrivates[i]));
        }
        return list;
    }
}

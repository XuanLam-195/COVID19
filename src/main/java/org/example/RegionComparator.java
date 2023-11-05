package org.example;

import java.util.Comparator;

public class RegionComparator implements Comparator<Covid19Data> {

    @Override
    public int compare(Covid19Data d1, Covid19Data d2) {
        String region1 = d1.getRegion();
        String region2 = d2.getRegion();
        return region1.compareTo(region2);
    }
}

package org.example;

import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data gruppe1, Covid19Data gruppe2) {
        String alderGruppe1 = gruppe1.getAlderGruppe();
        String alderGruppe2 = gruppe2.getAlderGruppe();
        return alderGruppe1.compareTo(alderGruppe2);
    }
}

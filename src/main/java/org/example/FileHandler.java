package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> loadAllAgeGroups() {
        ArrayList<Covid19Data> covids = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);
            sc.nextLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Covid19Data covid = null;
        while (sc.hasNextLine()) {
            String covidLine = sc.nextLine();
            String[] attributes = covidLine.split(";");
            covid = new Covid19Data(
                    attributes[0],
                    attributes[1],
                    Integer.parseInt(attributes[2]),
                    Integer.parseInt(attributes[3]),
                    Integer.parseInt(attributes[4])
            );
            covids.add(covid);
        }
        sc.close();
        return covids;
    }
}





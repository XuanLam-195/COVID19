package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> covids = fh.loadAllAgeGroups();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        Collections.sort(covids, new Comparator<Covid19Data>() {
            @Override
            public int compare(Covid19Data covid1, Covid19Data covid2) {
                return covid1.getRegion().compareTo(covid2.getRegion());
            }
        });
        System.out.println("Sort after Region");

        Collections.sort(covids, new Comparator<Covid19Data>() {
            @Override
            public int compare(Covid19Data covid1, Covid19Data covid2) {
                return covid1.getAlderGruppe().compareTo(covid2.getAlderGruppe());
            }
        });
        System.out.println("Sort after Alder Grupper");

        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Sort by Region");
            System.out.println("2. Sort by Age Group");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Collections.sort(covids, new RegionComparator());
                    System.out.println("Sorted by Region");
                    break;
                case 2:
                    Collections.sort(covids, new AldersGruppeComparator());
                    System.out.println("Sorted by Aldersgruppe");
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            if (!exit) {
                for (Covid19Data covid : covids) {
                    System.out.println(covid);
                }
            }
        }
        scanner.close();
    }
}

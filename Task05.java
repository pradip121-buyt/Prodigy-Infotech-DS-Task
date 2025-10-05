package com.prodigy.tasks;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.Histogram;

public class Task05 {
    public static void main(String[] args) {
        try {
            Table accidents = Table.read().csv("src/main/resources/US_Accidents.csv");
            System.out.println(accidents.structure());
            System.out.println(accidents.summary());

            // Accidents by weather condition
            Plot.show(Histogram.create("Accidents by Weather",
                    accidents, "Weather_Condition"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package com.prodigy.tasks;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.BarPlot;

public class Task02 {
    public static void main(String[] args) {
        try {
            Table titanic = Table.read().csv("src/main/resources/titanic.csv");
            System.out.println(titanic.structure());
            System.out.println(titanic.summary());

            // Example Visualization: Survival by Gender
            Plot.show(BarPlot.create("Survival by Gender",
                    titanic, "Sex", "Survived"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
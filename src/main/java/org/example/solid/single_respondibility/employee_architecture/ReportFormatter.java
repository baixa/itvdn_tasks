package org.example.solid.single_respondibility.employee_architecture;

public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object o, FormatType formatType) {
        formattedOutput = switch (formatType) {
            case CSV -> convertObjectToCSV(o);
            case XML -> convertObjectToXML(o);
        };
    }

    private String convertObjectToXML(Object o) {
        return "converted to XML " + o.toString();
    }

    private String convertObjectToCSV(Object o) {
        return "converted to CSV " + o.toString();
    }
}

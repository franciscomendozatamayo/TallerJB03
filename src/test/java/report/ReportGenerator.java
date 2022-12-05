package report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {

    public static void main(String []args){
        String ruta= new File("").getAbsolutePath()+"/build/reports/cucumber/";
        File reportFolder= new File(ruta+"JBGroupReport");

        List<String> jsonList = new ArrayList<>();
        jsonList.add(ruta+"report.json");

        Configuration configuration = new Configuration(reportFolder,"Taller Movile Cucumber");
        configuration.setBuildNumber("v2.0");
        configuration.addClassifications("owner","jbgroup");
        configuration.addClassifications("branch","master");
        configuration.addClassifications("suite","regression");

        ReportBuilder reportBuilder = new ReportBuilder(jsonList,configuration);
        reportBuilder.generateReports();
    }


}

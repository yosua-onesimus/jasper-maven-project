package edu.yggdrasil.solution.jasper.maven.project;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author Yosua Onesimus
 * @since 13.07.20
 * @version 13.07.20
 */
public class Main {

    public static void main(String[] args) {
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    "D:\\YosuaOnesimus\\www\\github\\jasper-maven-project\\src\\main\\resources\\sampleJasper.jasper", null);
            new JasperViewer(jasperPrint, false).setVisible(true);
        } catch (Exception exception) {
        }
    }
}

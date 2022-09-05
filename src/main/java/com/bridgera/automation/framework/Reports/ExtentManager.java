package com.bridgera.automation.framework.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("SN2.0 Test Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Test Report", "Spectranet 2.0");
        extentReports.setSystemInfo("Author", "Gautam");
        return extentReports;
    }
}

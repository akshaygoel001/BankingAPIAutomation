package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {
    private static final Logger logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        logger.info(result.getMethod().getMethodName()+" started!!!!");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info(result.getMethod().getMethodName()+ " success!!!!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error(result.getMethod().getMethodName()+" failed!!!!");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info(result.getMethod().getMethodName() +" skipped!!!!");
    }

    @Override
    public void onStart(ITestContext context) {
        logger.info("test suited started!!!!");
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("test suite finished!!!!");
    }

}

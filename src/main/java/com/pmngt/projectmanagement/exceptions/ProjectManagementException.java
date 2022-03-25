package com.pmngt.projectmanagement.exceptions;

public class ProjectManagementException extends RuntimeException {

    // The purpose of creating these exception classes, is to hide any technical information that may pop up
//    during a regular exception. REST apis will always have a exception occuring and we want to present that
//    exception message in a understandable format.
    public ProjectManagementException(String exceptionMessage) {
        super(exceptionMessage);
    }
}

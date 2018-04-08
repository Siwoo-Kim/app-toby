package com.siwoo.projpa.web.support;

public class BindingModelAttributeFailedWebServiceException extends WebServiceException {
    private static final String code = "error.web.binding.model";

    public BindingModelAttributeFailedWebServiceException(String message) {
        super(message, code);
    }

    public BindingModelAttributeFailedWebServiceException(String message, Throwable cause) {
        super(message, cause, code);
    }
}

package com.siwoo.projpa.web.support;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.BindingResult;

public class BindingResultSupporter {

    @Getter @Setter @ToString
    public static class FieldError {
        private String field;
        private String value;
        public FieldError() {
        }
        public FieldError(String field, String value) {
            this.field = field;
            this.value = value;
        }
    }

    public static FieldError getFieldError(BindingResult bindingResult) {
        return new FieldError(bindingResult.getFieldError().getField(), bindingResult.getFieldError().getField());
    }

}

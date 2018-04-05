package com.siwoo.projpa.domain.criteria;

import com.siwoo.projpa.domain.support.CriteriaException;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Set;

public class CriteriaSupporter {

    public static void throwIfSizeNotMatches(Class<?> clazz, Set<?> searches, Object... args) {
        int count =0;
        for(Object obj: args) {
            if(obj instanceof String){
                if(StringUtils.hasText((String) obj)) {
                    count++;
                }
            } else {
                if(obj != null) {
                    count++;
                }
            }


        }
        if(count != searches.size()) {
            throw new CriteriaException("Search Set size does not match with Arguments", "error.notMatch.criteria." + clazz.getSimpleName().toLowerCase() );
        }
    }
}

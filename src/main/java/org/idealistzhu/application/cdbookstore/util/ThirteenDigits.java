package org.idealistzhu.application.cdbookstore.util;

import java.lang.annotation.*;

import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER,
         ElementType.TYPE })
@Documented
public @interface ThirteenDigits
{
}
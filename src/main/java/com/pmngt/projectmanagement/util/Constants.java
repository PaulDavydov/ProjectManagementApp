package com.pmngt.projectmanagement.util;

import lombok.experimental.UtilityClass;

@UtilityClass // Marks class as final, generates a private no-arg const., and allows methods/fields to be static
public class Constants {
    public static final String ACTIVATION_EMAIL = "http://localhost:8081f/api/auth/accountVerification";
}

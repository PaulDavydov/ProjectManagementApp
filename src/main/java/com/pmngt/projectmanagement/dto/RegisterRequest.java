package com.pmngt.projectmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest { // DTO (data transfer object). Will transfer registration info for users.
    private String username;
    private String email;
    private String password;
}

package com.example.mailsender.email;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmailDTO(
        @Email String to,
        @NotBlank String subject,
        @NotBlank String body) {

}

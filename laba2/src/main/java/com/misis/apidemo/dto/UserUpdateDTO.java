package com.misis.apidemo.dto;

import jakarta.validation.constraints.NotBlank;
import java.util.Optional;

public record UserUpdateDTO(
    Optional<@NotBlank String> name,
    Optional<@NotBlank String> email
) {
}

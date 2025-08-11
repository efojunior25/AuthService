package com.xunim.authservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
@Builder
public class UserResponseDTO {

    private UUID id;
    private String username;
    private String email;
    private Set<String> roles;
}

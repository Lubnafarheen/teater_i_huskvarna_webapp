package se.lexicon.teaterwebapp.model.Dto;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Getter
@Setter

public class UserDto {
    @NotEmpty
    @Size(min = 4, max = 40)
    private String username;
    @Size(min = 4, max = 40)
    private String password;
    @NotNull
    @Valid
    private List<RoleDto> roles;
}

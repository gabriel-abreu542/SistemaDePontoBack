package br.com.projetos.models.dto;

import br.com.projetos.models.entities.enums.TipoUsuario;
import jakarta.validation.constraints.NotBlank;

public interface UserDTO {

    public record Response(
            Long id,
            String nome,
            TipoUsuario tipo
    ){}

    public record CreateRequest(
            @NotBlank
            String nome,
            @NotBlank
            TipoUsuario tipo
    ){}

    public record UpdateRequest(
            @NotBlank
            String nome,
            @NotBlank
            TipoUsuario tipo
    ){}

}

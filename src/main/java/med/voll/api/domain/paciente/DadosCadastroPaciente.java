package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(

		@NotBlank(message = "Nome é obrigatorio") String nome,
		@NotBlank @Email(message = "Campo de email e obrigatorio") String email,
		@NotBlank(message = "campo de Telefone e obrigatorio ") String telefone,
		@NotBlank(message = "campo de cpf e obrigatorio") @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}") String cpf,
		@NotNull(message = "campo de endereço são obrigatorios") @Valid DadosEndereco endereco) {
}

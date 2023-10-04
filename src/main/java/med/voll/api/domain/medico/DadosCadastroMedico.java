package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(@NotBlank(message = "Nome é obrigatorio")
// @notblank quer dizer que esse campo e obrigatorio e nao pode ser nulo
String nome,

		@NotBlank @Email(message = "Campo de email e obrigatorio")
		// @email significa que esse campo e de um email
		String email,

		@NotBlank(message = "campo de Telefone e obrigatorio ")

		String telefone,

		@NotBlank(message = "campo de CRM e obrigatorio ") @Pattern(regexp = "\\d{4,6}") String crm,

		@NotNull(message = "Especialidade do medico  e obrigatorio ")
		// @not null esta dizendo que esse campo não e nulo
		Especialidade especialidade,

		@NotNull(message = "campo  obrigatorio ") @Valid // @valid quer dizer que esse campo tem um outro campo dentro
															// dele que tem que
															// ser validado
		DadosEndereco endereco) {

}

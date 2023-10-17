package dio.primeirospassos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.primeirospassos.app.SistemaMensagem;

@SpringBootApplication
public class SpringScopeSingletonPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringScopeSingletonPrototypeApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}

}

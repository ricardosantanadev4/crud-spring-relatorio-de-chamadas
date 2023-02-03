package br.com.rsds.crudspringrelatoriodechamadas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.rsds.crudspringrelatoriodechamadas.model.Relatorio;
import br.com.rsds.crudspringrelatoriodechamadas.repository.RelatorioRepository;

@SpringBootApplication
public class CrudSpringRelatorioDeChamadasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringRelatorioDeChamadasApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(RelatorioRepository relatorioRepository) {
		return args -> {
			relatorioRepository.deleteAll();
			Relatorio relatorio = new Relatorio();
			relatorio.setData("02/02/2023");
			relatorio.setHora("00:14:10");
			relatorio.setOrigem("081988889805");
			relatorio.setDestino("6001");
			relatorio.setSituacao("Atendida");
			relatorio.setDuracao("00:00:10");
			relatorio.setProtocolo("1673107377.43099");
			relatorioRepository.save(relatorio);
		};
	}
}

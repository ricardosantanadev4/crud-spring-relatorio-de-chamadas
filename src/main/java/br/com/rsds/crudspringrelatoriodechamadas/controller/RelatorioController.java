package br.com.rsds.crudspringrelatoriodechamadas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rsds.crudspringrelatoriodechamadas.model.Relatorio;
import br.com.rsds.crudspringrelatoriodechamadas.repository.RelatorioRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/relatorio")
@AllArgsConstructor
public class RelatorioController {

	RelatorioRepository relatorioRepository;

	@GetMapping
	public List<Relatorio> list() {
		List<Relatorio> relatorio = relatorioRepository.findAll();
		return relatorio;
	}
}

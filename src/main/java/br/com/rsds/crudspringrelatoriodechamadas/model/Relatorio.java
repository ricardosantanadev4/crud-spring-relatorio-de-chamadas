package br.com.rsds.crudspringrelatoriodechamadas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "RELATORIO")
@Data
public class Relatorio {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	@Column(name = "DATA", nullable = false, length = 10)
	private String data;
	@Column(name = "HORA", nullable = false, length = 8)
	private String hora;
	@Column(name = "ORIGEM", nullable = false, length = 12)
	private String origem;
	@Column(name = "DESTINO", nullable = false, length = 12)
	private String destino;
	@Column(name = "SITUACAO", nullable = false, length = 12)
	private String situacao;
	@Column(name = "DURACAO", nullable = false, length = 8)
	private String duracao;
	@Column(name = "PROTOCOLO", nullable = false, length = 100)
	private String protocolo;
}

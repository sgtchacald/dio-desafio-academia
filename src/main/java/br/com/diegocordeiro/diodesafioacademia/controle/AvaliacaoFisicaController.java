package br.com.diegocordeiro.diodesafioacademia.controle;

import br.com.diegocordeiro.diodesafioacademia.modelo.AvaliacaoFisica;
import br.com.diegocordeiro.diodesafioacademia.modelo.form.AvaliacaoFisicaForm;
import br.com.diegocordeiro.diodesafioacademia.servico.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  @Autowired
  private AvaliacaoFisicaServiceImpl service;

  @PostMapping
  public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<AvaliacaoFisica> getAll(){
    return service.getAll();
  }

}

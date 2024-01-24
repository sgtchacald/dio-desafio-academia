package  br.com.diegocordeiro.diodesafioacademia.controle;

import br.com.diegocordeiro.diodesafioacademia.modelo.Matricula;
import br.com.diegocordeiro.diodesafioacademia.modelo.form.MatriculaForm;
import br.com.diegocordeiro.diodesafioacademia.servico.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

  @Autowired
  private MatriculaServiceImpl service;

  @PostMapping
  public Matricula create(@Valid @RequestBody MatriculaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
    return service.getAll(bairro);
  }

}


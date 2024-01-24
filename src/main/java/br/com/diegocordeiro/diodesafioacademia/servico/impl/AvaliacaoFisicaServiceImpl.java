package br.com.diegocordeiro.diodesafioacademia.servico.impl;

import br.com.diegocordeiro.diodesafioacademia.modelo.Aluno;
import br.com.diegocordeiro.diodesafioacademia.modelo.AvaliacaoFisica;
import br.com.diegocordeiro.diodesafioacademia.modelo.form.AvaliacaoFisicaForm;
import br.com.diegocordeiro.diodesafioacademia.modelo.form.AvaliacaoFisicaUpdateForm;
import br.com.diegocordeiro.diodesafioacademia.repositorio.AlunoRepository;
import br.com.diegocordeiro.diodesafioacademia.repositorio.AvaliacaoFisicaRepository;
import br.com.diegocordeiro.diodesafioacademia.servico.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

  @Autowired
  private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setPeso(form.getPeso());
    avaliacaoFisica.setAltura(form.getAltura());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return null;
  }

  @Override
  public List<AvaliacaoFisica> getAll() {

    return avaliacaoFisicaRepository.findAll();
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}

package usjt.eleicao2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import usjt.eleicao2.model.Candidato;
import usjt.eleicao2.model.Candidatos;

@Controller
@RequestMapping("/eleicao")
public class EleicaoController {
	@Autowired
	private Candidatos icandidatos;

	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaCandidatos");
		modelAndView.addObject("icandidatos", icandidatos.findAll());
		modelAndView.addObject(new Candidato());
		return modelAndView;
	}

	@PostMapping
	public String salvar(Candidato candidato) {
		this.icandidatos.save(candidato);
		return "redirect:/eleicao";
	}
}

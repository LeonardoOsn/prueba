package com.LeonardoLopez.Org.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.LeonardoLopez.Org.Model.Categoria;
import com.LeonardoLopez.Org.Model.Vacante;
import com.LeonardoLopez.Org.Service.IntCategorias;
import com.LeonardoLopez.Org.Service.IntVacantes;

@Controller
public class HomeController {
	
	@Autowired
	private IntVacantes VacantesServceImp;
	@Autowired
	private IntCategorias CategoriasServceImp;
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		List<Vacante> lista = VacantesServceImp.obtenerTodas();
		List<Categoria> catego = CategoriasServceImp.ObtenerTodas();
		model.addAttribute("vacantes", lista);
		model.addAttribute("categorias", catego);
		return "home";
	}
}

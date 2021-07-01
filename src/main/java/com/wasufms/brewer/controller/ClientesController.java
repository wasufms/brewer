package com.wasufms.brewer.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class ClientesController {
	
	@RequestMapping("/clientes/novo")
	public String novo() {
		return "cliente/CadastroCliente";
	}
	
	/*@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
		
		if(result.hasErrors()) {
			return novo(cerveja);
		}
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso");
		System.out.println(">>> SKU: "+cerveja.getSku());
		return "redirect:/cervejas/novo";
	}*/
	
}

package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Samsung Galaxy S20");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/61NKqOyMPGL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Samsung-Galaxy-128GB-Cinza/dp/B085TRDPZ4/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=s20&qid=1604520551&sr=8-1");
		pedido.setDescricao("Uma descrição qualquer para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}

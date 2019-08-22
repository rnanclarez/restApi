package com.nanclarez.restapi.usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/usuario")
public class usuarioController {
//	private static final Logger logger = LoggerFactory.getLogger(CitySearch.class);

	@Autowired
	private userRepo usuarios;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public List<Usuario> search() {
		List<Usuario> u = (List<Usuario>) usuarios.findAll();
		return u;
	}

}

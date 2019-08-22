package com.nanclarez.restapi.usuarios;

import org.springframework.data.repository.CrudRepository;

public interface userRepo extends CrudRepository<Usuario, Long> {
	Usuario findByNome(String nome);
}

package com.backendAsd.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IManejadorCrud <T,I extends Serializable> extends JpaRepository<T, I>{
	
	public <S extends T> S save(S entity) ;

	public <S extends T> S save(S entity, String usuario ) ;
	
	public <S extends T> List <S> saveAll (List<S> entity, String usuario);

}

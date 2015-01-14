package br.com.java.repository;

import br.com.java.model.Usuario;

public class UsuarioRepository extends BaseRepository<Usuario>
{
	@Override
	public Usuario get(Object key)
	{
		return super.get(usuarios -> usuarios.where(usuario -> usuario.getId() == (int) key).First());
	}
}

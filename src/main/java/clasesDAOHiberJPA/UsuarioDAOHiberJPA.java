package clasesDAOHiberJPA;

import org.springframework.stereotype.Repository;

import Daos.UsuarioDAO;
import clases.Usuario;

@Repository
public class UsuarioDAOHiberJPA extends GenericoDAOHibernateJPA<Usuario> implements UsuarioDAO {

	public UsuarioDAOHiberJPA() {
		this.persistentClass = Usuario.class;		
	}
	
	public String login(String usr){
		return null;
	}


}

package clasesDAOHiberJPA;

import org.springframework.stereotype.Repository;

import Daos.UsuariosDAO;
import clases.Publicacion;

@Repository
public class PublicacionDAOHiberJPA extends GenericoDAOHibernateJPA<Publicacion> implements UsuariosDAO {

	public PublicacionDAOHiberJPA() {
		this.persistentClass = Publicacion.class;		
	}


}

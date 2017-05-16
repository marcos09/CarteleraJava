package clasesDAOHiberJPA;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import Daos.CarteleraDAO;
import clases.Cartelera;
@Repository
public class CarteleraDAOHiberJPA<T> extends GenericoDAOHibernateJPA<Cartelera> implements CarteleraDAO {
	
	public CarteleraDAOHiberJPA() {
		this.persistentClass = Cartelera.class;		
	}
	
	
	@Override
	public List<Cartelera> recuperar(){
		
		
		Query consulta= em.createQuery("from Cartelera c where c.padre is null");
		
		List<Cartelera> resultado = consulta.getResultList();
		if (resultado.isEmpty()){
			return null;
		}
		return resultado;	

	}

	
}

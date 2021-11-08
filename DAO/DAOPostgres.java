package DAO;

import Modelo.HibernateUtil;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;

public class DAOPostgres implements InterfazDAO {
    private Session sesion;
    
    public DAOPostgres() {
        
    }
    
    @Override
    public void abrirSesion() {
        HibernateUtil.buildSessionFactory();
        HibernateUtil.openSessionAndBindToThread();
        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @Override
    public void cerrarSesion() {
        this.sesion.close();
    }

    @Override
    public List recuperarTodos(Class clase) {
        Query query = sesion.createQuery("FROM " + clase.getName() + " C ORDER BY C.id");
        List resultado = new ArrayList<>();
        resultado = query.list();
        return resultado;
    }

    @Override
    public void agregarObjeto(Object objeto) {
        this.sesion.beginTransaction();
        this.sesion.save(objeto);
        this.sesion.getTransaction().commit();
    }
    
    @Override
    public void borrarObjeto(Object objeto) {
        this.sesion.beginTransaction();
        this.sesion.delete(objeto);
        this.sesion.getTransaction().commit();
    }

    @Override
    public void actualizarObjeto(Object objeto) {
        this.sesion.beginTransaction();
        this.sesion.update(objeto);
        this.sesion.getTransaction().commit();
    }

}

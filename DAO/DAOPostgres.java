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
        Query query = sesion.createQuery("FROM " + clase.getName());
        List resultado = new ArrayList<>();
        resultado = query.list();
        return resultado;
    }

}

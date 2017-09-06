package unac.dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import unac.database.AccesoDB;
import unac.entity.CustomerTO;
import unac.service.ICrudDao;

public class CustomerDAO implements ICrudDao<CustomerTO> {

    
    Connection cn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String sql;
    CustomerTO cli;
    
    @Override
    public void create(CustomerTO t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            
            CallableStatement cs = cn.prepareCall("{call usp_Empleado_Adicionar(?,?,?,?,?,?)}");
            cs.setString(1, t.getFname());
            cs.setString(1, t.getLname());
            cs.setString(1, t.getEmail());
            cs.setString(1, t.getAddress());
            cs.setString(1, t.getCustomerid());
            cs.setString(1, t.getActive());
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void update(CustomerTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(CustomerTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerTO findForId(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerTO> readAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

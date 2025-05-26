package DaoImpl;



import Dao.GenericDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;

/**
 * Clase base para DAOs que maneja la conexión.
 */
public abstract class GenericDAOImpl<T, ID> implements GenericDAO<T, ID> {
    protected final Connection conn;
    protected final Logger logger = LogManager.getLogger(this.getClass());

    public GenericDAOImpl(Connection conn) {
        this.conn = conn;
    }
}

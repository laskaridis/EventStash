package it.laskaridis.eventstash;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by lefteris on 3/16/17.
 */
public class PersistenceHelper {

    private static final EntityManager entityManager;
    static {
        entityManager = Persistence.
                createEntityManagerFactory("eventstash-test-jpa").
                createEntityManager();
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }
}

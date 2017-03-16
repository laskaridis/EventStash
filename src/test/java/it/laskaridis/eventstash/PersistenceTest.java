package it.laskaridis.eventstash;

import org.junit.After;
import org.junit.Before;

import javax.persistence.EntityTransaction;

/**
 * Created by lefteris on 3/16/17.
 */
public class PersistenceTest {

    @Before
    public void createTransaction() {
    }

    @After
    public void rollbackTransaction() {
        EntityTransaction tx = PersistenceHelper.getEntityManager().getTransaction();
        if (tx.isActive()) {
            tx.rollback();
        }
    }
}

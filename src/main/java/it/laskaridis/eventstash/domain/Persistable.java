package it.laskaridis.eventstash.domain;

import java.io.Serializable;

public interface Persistable<T extends Serializable> {
    boolean save();
}

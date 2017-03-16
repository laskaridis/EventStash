package it.laskaridis.eventstash.domain;

import java.io.Serializable;

public class Model<T extends Serializable> implements Persistable<T>, Validatable<T> {

    public boolean save() {
        return false;
    }

    public boolean isValid() {
        return false;
    }

    public boolean validate() {
        return false;
    }
}
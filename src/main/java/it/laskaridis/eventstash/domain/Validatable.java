package it.laskaridis.eventstash.domain;

import java.io.Serializable;

public interface Validatable<T extends Serializable> {
    boolean isValid();
    boolean validate();
}

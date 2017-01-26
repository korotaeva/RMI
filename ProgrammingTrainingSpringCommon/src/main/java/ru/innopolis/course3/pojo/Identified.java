package ru.innopolis.course3.pojo;

import java.io.Serializable;

/**
 * Created by korot on 26.12.2016.
 * Интерфейс идентифицируемых объектов.
 */

public interface Identified<PK extends Serializable> {

    /** Возвращает идентификатор объекта */
    public PK getId();
}

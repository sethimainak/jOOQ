/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.firebird.rdb.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.firebird.rdb.DefaultSchema;
import org.jooq.meta.firebird.rdb.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rdb$relationConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = -465440119;

    /**
     * The reference instance of <code>RDB$RELATION_CONSTRAINTS</code>
     */
    public static final Rdb$relationConstraints RDB$RELATION_CONSTRAINTS = new Rdb$relationConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>RDB$RELATION_CONSTRAINTS.RDB$CONSTRAINT_NAME</code>.
     */
    public final TableField<Record, String> RDB$CONSTRAINT_NAME = createField(DSL.name("RDB$CONSTRAINT_NAME"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_CONSTRAINTS.RDB$CONSTRAINT_TYPE</code>.
     */
    public final TableField<Record, String> RDB$CONSTRAINT_TYPE = createField(DSL.name("RDB$CONSTRAINT_TYPE"), SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$RELATION_CONSTRAINTS.RDB$RELATION_NAME</code>.
     */
    public final TableField<Record, String> RDB$RELATION_NAME = createField(DSL.name("RDB$RELATION_NAME"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_CONSTRAINTS.RDB$DEFERRABLE</code>.
     */
    public final TableField<Record, String> RDB$DEFERRABLE = createField(DSL.name("RDB$DEFERRABLE"), SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$RELATION_CONSTRAINTS.RDB$INITIALLY_DEFERRED</code>.
     */
    public final TableField<Record, String> RDB$INITIALLY_DEFERRED = createField(DSL.name("RDB$INITIALLY_DEFERRED"), SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$RELATION_CONSTRAINTS.RDB$INDEX_NAME</code>.
     */
    public final TableField<Record, String> RDB$INDEX_NAME = createField(DSL.name("RDB$INDEX_NAME"), SQLDataType.CHAR(31), this, "");

    private Rdb$relationConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$relationConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>RDB$RELATION_CONSTRAINTS</code> table reference
     */
    public Rdb$relationConstraints(String alias) {
        this(DSL.name(alias), RDB$RELATION_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>RDB$RELATION_CONSTRAINTS</code> table reference
     */
    public Rdb$relationConstraints(Name alias) {
        this(alias, RDB$RELATION_CONSTRAINTS);
    }

    /**
     * Create a <code>RDB$RELATION_CONSTRAINTS</code> table reference
     */
    public Rdb$relationConstraints() {
        this(DSL.name("RDB$RELATION_CONSTRAINTS"), null);
    }

    public <O extends Record> Rdb$relationConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, RDB$RELATION_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.RDB$INDEX_12);
    }

    @Override
    public Rdb$relationConstraints as(String alias) {
        return new Rdb$relationConstraints(DSL.name(alias), this);
    }

    @Override
    public Rdb$relationConstraints as(Name alias) {
        return new Rdb$relationConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$relationConstraints rename(String name) {
        return new Rdb$relationConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$relationConstraints rename(Name name) {
        return new Rdb$relationConstraints(name, null);
    }
}

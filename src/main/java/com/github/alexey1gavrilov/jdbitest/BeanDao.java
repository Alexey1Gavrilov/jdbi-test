package com.github.alexey1gavrilov.jdbitest;

import java.util.List;
import java.util.Optional;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface BeanDao {
  @SqlQuery("SELECT * FROM test")
  List<Bean> getAll();

  @SqlUpdate("INSERT INTO test VALUES ("
       + "NULL,"
       + ":string1,"
       + ":string2,"
       + ":string3,"
       + ":string4,"
       + ":string5,"
       + ":string6,"
       + ":string7,"
       + ":string8,"
       + ":long1,"
       + ":long2,"
       + ":long3,"
       + ":long4,"
       + ":long5,"
       + ":long6,"
       + ":long7,"
       + ":long8,"
       + ":decimal1,"
       + ":decimal2,"
       + ":decimal3,"
       + ":decimal4,"
       + ":decimal5,"
       + ":decimal6,"
       + ":decimal7,"
       + ":decimal8"
      + ")")
  @GetGeneratedKeys
  long insert(@BindBean Bean bean);

  @SqlQuery("SELECT * FROM test WHERE id = :id")
  Optional<Bean> get(@Bind("id") long id);

  @SqlUpdate("DELETE FROM test WHERE id = :id")
  boolean delete(@Bind("id") long id);

  @SqlUpdate("UPDATE test SET "
      + "string1 = :string1,"
      + "string2 = :string2,"
      + "string3 = :string3,"
      + "string4 = :string4,"
      + "string5 = :string5,"
      + "string6 = :string6,"
      + "string7 = :string7,"
      + "string8 = :string8,"
      + "long1 = :long1,"
      + "long2 = :long2,"
      + "long3 = :long3,"
      + "long4 = :long4,"
      + "long5 = :long5,"
      + "long6 = :long6,"
      + "long7 = :long7,"
      + "long8 = :long8,"
      + "decimal1 = :decimal1,"
      + "decimal2 = :decimal2,"
      + "decimal3 = :decimal3,"
      + "decimal4 = :decimal4,"
      + "decimal5 = :decimal5,"
      + "decimal6 = :decimal6,"
      + "decimal7 = :decimal7,"
      + "decimal8 = :decimal8"
      + " WHERE id = :id")
  boolean update(@BindBean Bean bean);
}

package com.github.alexey1gavrilov.jdbitest;

import org.assertj.core.api.Assertions;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.reflect.BeanMapper;

public class Tester {
  private static final String CREATE_TABLE = "CREATE TABLE test (\n"
      + "  id IDENTITY PRIMARY KEY,\n"
      + "\n"
      + "  STRING1 VARCHAR(100),\n"
      + "  STRING2 VARCHAR(100),\n"
      + "  STRING3 VARCHAR(100),\n"
      + "  STRING4 VARCHAR(100),\n"
      + "  STRING5 VARCHAR(100),\n"
      + "  STRING6 VARCHAR(100),\n"
      + "  STRING7 VARCHAR(100),\n"
      + "  STRING8 VARCHAR(100),\n"
      + "\n"
      + "  long1 BIGINT,\n"
      + "  long2 BIGINT,\n"
      + "  long3 BIGINT,\n"
      + "  long4 BIGINT,\n"
      + "  long5 BIGINT,\n"
      + "  long6 BIGINT,\n"
      + "  long7 BIGINT,\n"
      + "  long8 BIGINT,\n"
      + "\n"
      + "  decimal1 DECIMAL,\n"
      + "  decimal2 DECIMAL,\n"
      + "  decimal3 DECIMAL,\n"
      + "  decimal4 DECIMAL,\n"
      + "  decimal5 DECIMAL,\n"
      + "  decimal6 DECIMAL,\n"
      + "  decimal7 DECIMAL,\n"
      + "  decimal8 DECIMAL\n"
      + ");";

  public static void main(String[] args) {
    final Jdbi jdbi = Jdbi.create("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1").installPlugins();
    jdbi.registerRowMapper(BeanMapper.factory(Bean.class));

    jdbi.useHandle(h -> h.execute(Constants.CREATE_TABLE_SQL));

    jdbi.useExtension(
        BeanDao.class,
        dao -> {
          final long time = System.currentTimeMillis();

          for (int i = 0; i < 1000; i++) {
            final long id = dao.insert(Bean.create());
            final Bean updated = Bean.create();
            updated.setId(id);
            Assertions.assertThat(dao.update(updated)).isTrue();
            Assertions.assertThat(dao.getAll()).hasSize(1);
            Assertions.assertThat(dao.get(id)).isNotEmpty();
            Assertions.assertThat(dao.delete(id)).isTrue();
          }

          System.out.println(System.currentTimeMillis() - time);
        });
  }
}


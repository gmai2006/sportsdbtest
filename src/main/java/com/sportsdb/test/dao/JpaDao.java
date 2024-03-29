/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.sportsdb.test.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

@Stateless
public interface JpaDao {
  /**
   * Get entity manager.
   *
   * @return Return entity manager.
   */
  public EntityManager getEntityManager();

  /**
   * Retrieve all records type E with a maximum number of returned records.
   *
   * @param queryStr A query string.
   * @param e An entity.
   * @param <E> An entity type.
   * @param max A maximum number of returned records.
   * @return A list of entities type E
   */
  <E> List<E> select(String queryStr, Class<E> e, int max);

  /**
   * Retrieve all records type E.
   *
   * @param queryStr A query string.
   * @param e An entity.
   * @param <E> An entity type.
   * @return A list of entities type E
   */
  public <E> List<E> selectAll(String queryStr, Class<E> e);

  /**
   * Find an entity.
   *
   * @param id An entity id.
   * @param e An entity.
   * @param <E> An entity type.
   * @return The same entity.
   */
  <E> E find(Class<E> e, Object id);

  /**
   * Create an entity.
   *
   * @param e An entity.
   * @param <E> An entity type.
   * @return The same entity.
   */
  <E> E create(E e);

  /**
   * Create entities in batch.
   *
   * @param list of entities to be persisted.
   * @param <E> The entity type.
   * @return The total count.
   */
  <E> int batchCreate(List<E> list);

  /**
   * Delete the entity.
   *
   * @param id The entity Id.
   * @param e An entity.
   * @param <E> An entity type.
   */
  <E> void delete(Class<E> e, Object id);

  /**
   * Update the entity.
   *
   * @param e An entity.
   * @param <E> An entity type.
   * @return The same entity.
   */
  public <E> E update(E e);

  /** Delete all air load tables. */
  public <E> void deleteAll(Class<E> e);
}

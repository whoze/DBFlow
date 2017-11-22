package com.raizlabs.android.dbflow.sql.language

import com.raizlabs.android.dbflow.sql.language.property.IProperty

/**
 * Description: Provides a standard set of methods for ending a SQLite query method. These include
 * groupby, orderby, having, limit and offset.
 */
interface Transformable<T> {

    fun groupBy(vararg nameAliases: NameAlias): Where<T>

    fun groupBy(vararg properties: IProperty<*>): Where<T>

    fun orderBy(nameAlias: NameAlias, ascending: Boolean): Where<T>

    fun orderBy(property: IProperty<*>, ascending: Boolean): Where<T>

    fun orderBy(orderBy: OrderBy): Where<T>

    fun limit(count: Int): Where<T>

    fun offset(offset: Int): Where<T>

    fun having(vararg conditions: SQLOperator): Where<T>

    fun orderByAll(orderBies: List<OrderBy>): Where<T>
}
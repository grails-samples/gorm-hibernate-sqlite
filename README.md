# Gorm Hibernate SQLite

Grails sample application which uses GORM Hibernate with SQLite

## Custom Dialect

Hibernate does not offer an official dialect for SQLite. We use a thirdparty dialect for SQLite.

https://github.com/gwenn/sqlite-dialect

We copy the [SQLiteDialect](https://github.com/grails-samples/gorm-hibernate-sqlite/blob/master/src/main/groovy/org/hibernate/dialect/SQLiteDialect.java) 
and [SQLiteDialectIdentityColumnSupport](https://github.com/grails-samples/gorm-hibernate-sqlite/blob/master/src/main/groovy/org/hibernate/dialect/identity/SQLiteDialectIdentityColumnSupport.java)
files to our project.

## Add SQLite JDBC dependency

https://github.com/grails-samples/gorm-hibernate-sqlite/blob/master/build.gradle#L49

````
    runtime "org.xerial:sqlite-jdbc:3.18.0"
````

## Configure Datasource to use SQLite Dialect and SQLite dirver

https://github.com/grails-samples/gorm-hibernate-sqlite/blob/master/grails-app/conf/application.yml#L102

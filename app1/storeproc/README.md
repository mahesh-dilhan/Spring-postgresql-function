### Postgresql Function call with Spring#
```shell
2021-07-01 22:38:17.962  INFO 14000 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
org.springframework.jdbc.core.JdbcTemplate@2f6e92ca
{returnvalue=1}
2021-07-01 22:38:18.049  WARN 14000 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2021-07-01 22:38:18.733  INFO 14000 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-07-01 22:38:18.741  INFO 14000 --- [           main] i.m.s.storeproc.StoreprocApplication     : Started StoreprocApplication in 8.348 seconds (JVM running for 8.606)
<==========---> 80% EXECUTING [31s]

```

```sql
create extension -> uuid
```

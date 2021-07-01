package io.mahesh.springjava.storeproc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class StoredProcedure {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String PROC_NAME ="copydata";

    @PostConstruct
    public void init() {
        System.out.println(jdbcTemplate);

//        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
//                .withSchemaName("play")
//               // .withCatalogName(catalog)
//                .withProcedureName("copydata");
//        System.out.println(jdbcCall.execute());

        System.out.println(new SimpleJdbcCall (jdbcTemplate)
                .withFunctionName ("copydata")
                .withSchemaName ("play").execute()
        );
    }
}

package edu.citytech.cst.loadxml;

import java.sql.ResultSet;

public interface SQLExecutable <T> {
    T exec(ResultSet rs) throws Exception;
}

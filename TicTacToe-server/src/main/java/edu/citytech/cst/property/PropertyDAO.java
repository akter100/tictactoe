package edu.citytech.cst.property;

import edu.citytech.cst.loadxml.Property;
import edu.citytech.cst.loadxml.SQLExecutable;
import edu.citytech.cst.loadxml.SQLUtility;

import java.util.List;

import static edu.citytech.cst.loadxml.DBConnection.getConnection;

public class PropertyDAO {


    final static String sql = "select * from Properties";
    public static List<Property> findAll() {

        SQLExecutable<Property> exec = rs ->{
            var property = new Property(
                    rs.getString("id")
                    ,rs.getFloat("cost")
                    ,rs.getFloat("downPayment")
                    ,rs.getString("state")
                    ,rs.getFloat("percentage")
                    ,rs.getFloat("netIncome"));

            return property;

        };

       List<Property> list = SQLUtility.findAll(sql,getConnection(),exec);

        return list;

    }

    }



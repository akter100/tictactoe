package edu.citytech.cst.loadxml;

import edu.citytech.cst.pieChart.GroupByStateDAO;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

      GroupByStateDAO.findAll().forEach(System.out::println);


      // SelectProperties.findAll().forEach(System.out::println);
        //getXml();
       // loadDataFromXML();
    }

    public static void loadDataFromXML() {
        List<Property> propertyList = new ArrayList<>();
        XMLUtility.process("/Users/beaut/data/properties.xml", "property", element -> {
            var property = new Property(element);
            propertyList.add(property);

        });

        PropertyInsert.process(propertyList);
    }



    public static void getXml() {
        XMLUtility.process("/Users/beaut/data/properties.xml", "property", element -> {
            var properties = new Property(element);
            System.out.println(properties);
        });
    }

}

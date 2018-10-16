package com.utils;


import org.springframework.core.convert.converter.Converter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class costomConvertor implements Converter<String,Date>{
    @Override
    public Date convert(String source) {
        Date date = null;
        if (!"".equals(source) && source != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = sdf.parse(source);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return date;
    }
}

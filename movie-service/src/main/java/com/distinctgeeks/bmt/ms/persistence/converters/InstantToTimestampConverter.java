package com.distinctgeeks.bmt.ms.persistence.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
//@Converter(autoApply = true)
public class InstantToTimestampConverter implements AttributeConverter<Instant, Date> {
    @Override
    public Date convertToDatabaseColumn(Instant instant) {
       return Date.valueOf(LocalDate.ofInstant(instant, ZoneId.systemDefault()));
    }

    @Override
    public Instant convertToEntityAttribute(Date dbDate) {
        return dbDate.toInstant();
    }
}

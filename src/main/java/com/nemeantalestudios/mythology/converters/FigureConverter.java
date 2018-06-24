package com.nemeantalestudios.mythology.converters;

import com.nemeantalestudios.mythology.models.Gender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FigureConverter {

    @ReadingConverter
    public static class GenderConverter implements Converter<String, Gender> {

        @Override
        public Gender convert(final String source) {
            String male = "male";
            String female = "female";

            if ("".equals(source)) {
                return null;
            } else if (!(male.equals(source) || female.equals(source))) {
                return null;
            }
            return Gender.valueOf(source.toUpperCase());
        }
    }

}
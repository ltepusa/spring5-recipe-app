package guru.springframework.converters;

import com.sun.istack.Nullable;
import guru.springframework.commands.UnitMeasureCommand;
import guru.springframework.model.UnitMeasure;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class UnitMeasureCommandToUnitMeasure implements Converter<UnitMeasureCommand, UnitMeasure> {

    @Synchronized
    @Nullable
    @Override
    public UnitMeasure convert(UnitMeasureCommand source) {
        if(source == null) {
            return null;
        }
        final UnitMeasure um = new UnitMeasure();
        um.setId(source.getId());
        um.setDescription(source.getDescription());
        return um;
    }
}

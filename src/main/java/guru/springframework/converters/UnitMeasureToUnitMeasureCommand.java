package guru.springframework.converters;

import guru.springframework.commands.UnitMeasureCommand;
import guru.springframework.model.UnitMeasure;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class UnitMeasureToUnitMeasureCommand implements Converter<UnitMeasure, UnitMeasureCommand> {

    @Synchronized
    @Nullable
    @Override
    public UnitMeasureCommand convert(UnitMeasure unitMeasure) {

        if (unitMeasure != null) {
            final UnitMeasureCommand umc = new UnitMeasureCommand();
            umc.setId(unitMeasure.getId());
            umc.setDescription(unitMeasure.getDescription());
            return umc;
        }
        return null;
    }
}

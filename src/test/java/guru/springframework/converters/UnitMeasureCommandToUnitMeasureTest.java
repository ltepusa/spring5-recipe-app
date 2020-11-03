package guru.springframework.converters;

import guru.springframework.commands.UnitMeasureCommand;
import guru.springframework.model.UnitMeasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitMeasureCommandToUnitMeasureTest {
    public static final String DESCRIPTION = "description";
    public static final Long LONG_VALUE = new Long(1L);

    UnitMeasureCommandToUnitMeasure converter;

    @Before
    public void setUp() throws Exception {
        converter = new UnitMeasureCommandToUnitMeasure();
    }

    @Test
    public void testNullParameter() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new UnitMeasureCommand()));
    }

    @Test
    public void convert() throws Exception {
        //given
        UnitMeasureCommand command = new UnitMeasureCommand();
        command.setId(LONG_VALUE);
        command.setDescription(DESCRIPTION);

        //when
        UnitMeasure um = converter.convert(command);

        //then
        assertNotNull(um);
        assertEquals(LONG_VALUE, um.getId());
        assertEquals(DESCRIPTION, um.getDescription());
    }
}

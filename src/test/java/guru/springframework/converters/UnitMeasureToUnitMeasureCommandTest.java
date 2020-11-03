package guru.springframework.converters;

import guru.springframework.commands.UnitMeasureCommand;
import guru.springframework.model.UnitMeasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jt on 6/21/17.
 */
public class UnitMeasureToUnitMeasureCommandTest {

    public static final String DESCRIPTION = "description";
    public static final Long LONG_VALUE = new Long(1L);

    UnitMeasureToUnitMeasureCommand converter;

    @Before
    public void setUp() throws Exception {
        converter = new UnitMeasureToUnitMeasureCommand();
    }

    @Test
    public void testNullObjectConvert() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObj() throws Exception {
        assertNotNull(converter.convert(new UnitMeasure()));
    }

    @Test
    public void convert() throws Exception {
        //given
        UnitMeasure uom = new UnitMeasure();
        uom.setId(LONG_VALUE);
        uom.setDescription(DESCRIPTION);
        //when
        UnitMeasureCommand uomc = converter.convert(uom);

        //then
        assertEquals(LONG_VALUE, uomc.getId());
        assertEquals(DESCRIPTION, uomc.getDescription());
    }
}

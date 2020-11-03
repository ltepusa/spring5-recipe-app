package guru.springframework.service;

import guru.springframework.commands.UnitMeasureCommand;
import guru.springframework.converters.UnitMeasureToUnitMeasureCommand;
import guru.springframework.model.UnitMeasure;
import guru.springframework.repository.UnitMeasureRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class UnitMeasureServiceImplTest {

    UnitMeasureToUnitMeasureCommand unitMeasureToUnitMeasureCommand = new UnitMeasureToUnitMeasureCommand();
    UnitMeasureService service;

    @Mock
    UnitMeasureRepository unitMeasureRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        service = new UnitMeasureServiceImpl(unitMeasureRepository, unitMeasureToUnitMeasureCommand);
    }

    @Test
    public void listAllUms() throws Exception {
        //given
        Set<UnitMeasure> unitMeasures = new HashSet<>();
        UnitMeasure um1 = new UnitMeasure();
        um1.setId(1L);
        unitMeasures.add(um1);

        UnitMeasure um2 = new UnitMeasure();
        um2.setId(2L);
        unitMeasures.add(um2);

        when(unitMeasureRepository.findAll()).thenReturn(unitMeasures);

        //when
        Set<UnitMeasureCommand> commands = service.listAllUms();

        //then
        assertEquals(2, commands.size());
        verify(unitMeasureRepository, times(1)).findAll();
    }
}

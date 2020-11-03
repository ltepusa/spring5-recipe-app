package guru.springframework.service;

import guru.springframework.commands.UnitMeasureCommand;
import guru.springframework.converters.UnitMeasureToUnitMeasureCommand;
import guru.springframework.repository.UnitMeasureRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UnitMeasureServiceImpl implements UnitMeasureService {

    private final UnitMeasureRepository unitMeasureRepository;
    private final UnitMeasureToUnitMeasureCommand unitMeasureToUnitMeasureCommand;

    public UnitMeasureServiceImpl(UnitMeasureRepository unitMeasureRepository, UnitMeasureToUnitMeasureCommand unitMeasureToUnitMeasureCommand) {
        this.unitMeasureRepository = unitMeasureRepository;
        this.unitMeasureToUnitMeasureCommand = unitMeasureToUnitMeasureCommand;
    }

    @Override
    public Set<UnitMeasureCommand> listAllUms() {

        return StreamSupport.stream(unitMeasureRepository.findAll()
                .spliterator(), false)
                .map(unitMeasureToUnitMeasureCommand::convert)
                .collect(Collectors.toSet());
    }
}

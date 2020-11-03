package guru.springframework.service;

import guru.springframework.commands.UnitMeasureCommand;

import java.util.Set;

public interface UnitMeasureService {
    Set<UnitMeasureCommand> listAllUms();
}

package ru.geekbrains.gbpatterns.systemic.unit_of_work;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class SimpleController {
    @Autowired
    private final SimpleService simpleService;

    public void get(){
        UnitOfWork.newCurrent();
        simpleService.doLogic();
        UnitOfWork.getCurrent().commit();
    }
}

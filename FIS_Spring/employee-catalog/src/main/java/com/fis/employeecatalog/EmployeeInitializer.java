package com.fis.employeecatalog;



import java.util.stream.Stream;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class  EmployeeInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    EmployeeInitializer (EmployeeRepository employeeRepository) {
        this.employeeRepository =employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("RM", "Jin", "Suga", "J hope", "Jimin", "V", "jung kook")
                .forEach(item -> employeeRepository.save(new Employee(item)));

        employeeRepository.findAll().forEach(System.out::println);
    }
}
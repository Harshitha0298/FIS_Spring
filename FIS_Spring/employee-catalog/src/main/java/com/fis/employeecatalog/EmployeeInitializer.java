package com.fis.employeecatalog;



import java.util.stream.Stream;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class  EmployeeInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    EmployeeInitializerEmployeeRepository employeeRepository) {
        this.employeeRepository =employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> employeeRepository.save(new Employee(employee)));

        employeeRepository.findAll().forEach(System.out::println);
    }
}
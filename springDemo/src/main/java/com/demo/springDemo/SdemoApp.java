package com.demo.springDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.springDemoSTS")  // Ensures beans are scanned
public class SdemoApp implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringDemoApplication.class);

    public static void main(String[] args) {
        logger.info("🚀 Starting SpringDemoApplication...");
        SpringApplication.run(SpringDemoApplication.class, args);
        logger.info("✅ Application Started Successfully!");
    }

    @Override
    public void run(String... args) {
        // Retrieve ApplicationContext
        ApplicationContext context = SpringApplication.run(SpringDemoApplication.class);

        // Get Employee Bean
        Employee emp = context.getBean(Employee.class);

        // Print Employee Details
        logger.info("👤 Employee Details: " + emp.getEmployeeDetails());
    }
}

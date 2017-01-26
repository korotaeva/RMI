package ru.innopolis.course3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import ru.innopolis.course3.bl.PracticalAssignmentsBL;
import ru.innopolis.course3.bl.SubjectBL;
import ru.innopolis.course3.bl.UserBL;

/**
 * Created by korot on 26.01.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("ru.innopolis.course3")
public class WebAppConfig extends WebMvcConfigurerAdapter {




    @Bean
    public RmiServiceExporter practicalAssignmentsBL(PracticalAssignmentsBL practicalAssignmentsBL) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("PracticalAssignmentsBL");
        rmiServiceExporter.setService(practicalAssignmentsBL);
        rmiServiceExporter.setServiceInterface(PracticalAssignmentsBL.class);
        rmiServiceExporter.setRegistryPort(5000);
        return rmiServiceExporter;
    }

    @Bean
    public RmiServiceExporter userBL(UserBL userBL) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("UserBL");
        rmiServiceExporter.setService(userBL);
        rmiServiceExporter.setServiceInterface(UserBL.class);
        rmiServiceExporter.setRegistryPort(5000);
        return rmiServiceExporter;
    }

    @Bean
    public RmiServiceExporter subjectBL(SubjectBL subjectBL) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("SubjectBL");
        rmiServiceExporter.setService(subjectBL);
        rmiServiceExporter.setServiceInterface(SubjectBL.class);
        rmiServiceExporter.setRegistryPort(5000);
        return rmiServiceExporter;
    }
}

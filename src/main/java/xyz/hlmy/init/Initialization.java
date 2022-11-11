package xyz.hlmy.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import xyz.hlmy.service.MessageMasterService;

import javax.annotation.PostConstruct;

/**
 * @author hlmy
 * 自动初始化
 */
@Configuration
public class Initialization {
    public final Logger log = LoggerFactory.getLogger(Initialization.class);

    private final MessageMasterService messageMasterService;


    @Autowired
    public Initialization(MessageMasterService messageMasterService) {
        this.messageMasterService = messageMasterService;
    }


    @PostConstruct
    public void init() {
        log.info("System Start To Initialization");
        //消息初始化
        messageMasterService.messageInitialization();
        log.info("System End To Initialization");
    }
}

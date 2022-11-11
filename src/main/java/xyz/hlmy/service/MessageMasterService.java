package xyz.hlmy.service;

import xyz.hlmy.pojo.MessageMaster;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author lipenghui
 * @description 针对表【MESSAGE_MASTER】的数据库操作Service
 * @createDate 2022-11-11 09:16:45
 */
public interface MessageMasterService extends IService<MessageMaster> {


    void messageInitialization();
}

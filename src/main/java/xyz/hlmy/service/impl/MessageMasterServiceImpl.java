package xyz.hlmy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.hlmy.constant.MsgConstant;
import xyz.hlmy.pojo.MessageMaster;
import xyz.hlmy.service.MessageMasterService;
import xyz.hlmy.mapper.MessageMasterMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hlmy
 * @description 针对表【MESSAGE_MASTER】的数据库操作Service实现
 * @createDate 2022-11-11 09:16:45
 */
@Service
public class MessageMasterServiceImpl extends ServiceImpl<MessageMasterMapper, MessageMaster> implements MessageMasterService {


    private final MessageMasterMapper masterMapper;

    @Autowired
    public MessageMasterServiceImpl(MessageMasterMapper masterMapper) {
        this.masterMapper = masterMapper;
    }


    /**
     * 消息初始化
     */
    @Override
    public void messageInitialization() {
        QueryWrapper<MessageMaster> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("\"code\" ");
        List<MessageMaster> messageMasters = masterMapper.selectList(wrapper);
        messageMasters.forEach(messageMaster -> {
            MsgConstant.MESSAGE.put(messageMaster.getMsgId(), messageMaster.getMsgDoc());
        });
    }
}





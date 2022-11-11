package xyz.hlmy.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName MESSAGE_MASTER
 */
@TableName(value ="MESSAGE_MASTER")
@Data
public class MessageMaster implements Serializable {
    /**
     * 信息Id
     */
    @TableId(value = "msg_id")
    private Integer msgId;

    /**
     * 信息内容
     */
    @TableField(value = "msg_doc")
    private String msgDoc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MessageMaster other = (MessageMaster) that;
        return (this.getMsgId() == null ? other.getMsgId() == null : this.getMsgId().equals(other.getMsgId()))
            && (this.getMsgDoc() == null ? other.getMsgDoc() == null : this.getMsgDoc().equals(other.getMsgDoc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMsgId() == null) ? 0 : getMsgId().hashCode());
        result = prime * result + ((getMsgDoc() == null) ? 0 : getMsgDoc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", msgId=").append(msgId);
        sb.append(", msgDoc=").append(msgDoc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}

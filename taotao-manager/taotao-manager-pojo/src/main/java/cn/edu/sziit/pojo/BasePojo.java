package cn.edu.sziit.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 75741
 */
public abstract class BasePojo  implements Serializable {

    private Date created;

    private Date updated;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}

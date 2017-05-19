package org.pronet.common.vo;

/**
 * Created by pr250155 on 5/18/17.
 */


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class  UserVo {
    private String firstName;
    private String lastName;
    private String guid;

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGuid() {
        return guid;
    }

    @XmlElement
    public void setGuid(String guid) {
        this.guid = guid;
    }
}

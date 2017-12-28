package team.hyznrj.esgsmanager.entity;

import java.util.Date;

/**
 * 
 * @ClassName  User 
 * @Description  TODO 
 * @author 何伟涛
 * @date   2017年12月27日下午10:27:25
 */
public class User {
    private Long userid;

    private String username;

    private String userphone;

    private String useremail;

    private String useraccount;

    private String userpassword;

    private Integer userstatus;

    private Integer userseniormemberstatus;

    private Date userseniormembercreatedate;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount == null ? null : useraccount.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    public Integer getUserseniormemberstatus() {
        return userseniormemberstatus;
    }

    public void setUserseniormemberstatus(Integer userseniormemberstatus) {
        this.userseniormemberstatus = userseniormemberstatus;
    }

    public Date getUserseniormembercreatedate() {
        return userseniormembercreatedate;
    }

    public void setUserseniormembercreatedate(Date userseniormembercreatedate) {
        this.userseniormembercreatedate = userseniormembercreatedate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", userphone=").append(userphone);
        sb.append(", useremail=").append(useremail);
        sb.append(", useraccount=").append(useraccount);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", userstatus=").append(userstatus);
        sb.append(", userseniormemberstatus=").append(userseniormemberstatus);
        sb.append(", userseniormembercreatedate=").append(userseniormembercreatedate);
        sb.append("]");
        return sb.toString();
    }
}
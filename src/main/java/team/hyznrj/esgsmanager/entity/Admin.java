package team.hyznrj.esgsmanager.entity;

/**
 * 
 * @ClassName  Admin 
 * @Description  TODO 
 * @author 何伟涛
 * @date   2017年12月27日下午10:26:25
 */
public class Admin {
    private Long adminid;

    private String adminname;

    private String adminphone;

    private String adminemail;

    private String adminaccount;

    private String adminpassword;

    private Integer adminstatus;

    private String adminjurisdiction;

    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminphone() {
        return adminphone;
    }

    public void setAdminphone(String adminphone) {
        this.adminphone = adminphone == null ? null : adminphone.trim();
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail == null ? null : adminemail.trim();
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount == null ? null : adminaccount.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public Integer getAdminstatus() {
        return adminstatus;
    }

    public void setAdminstatus(Integer adminstatus) {
        this.adminstatus = adminstatus;
    }

    public String getAdminjurisdiction() {
        return adminjurisdiction;
    }

    public void setAdminjurisdiction(String adminjurisdiction) {
        this.adminjurisdiction = adminjurisdiction == null ? null : adminjurisdiction.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminid=").append(adminid);
        sb.append(", adminname=").append(adminname);
        sb.append(", adminphone=").append(adminphone);
        sb.append(", adminemail=").append(adminemail);
        sb.append(", adminaccount=").append(adminaccount);
        sb.append(", adminpassword=").append(adminpassword);
        sb.append(", adminstatus=").append(adminstatus);
        sb.append(", adminjurisdiction=").append(adminjurisdiction);
        sb.append("]");
        return sb.toString();
    }
}
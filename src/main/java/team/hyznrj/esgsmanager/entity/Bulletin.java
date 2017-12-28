package team.hyznrj.esgsmanager.entity;

import java.util.Date;

/**
 * 
 * @ClassName  Bulletin 
 * @Description  TODO 
 * @author 何伟涛
 * @date   2017年12月27日下午10:26:47
 */
public class Bulletin {
    private Long bulletinid;

    private String bulletintype;

    private String bulletintypepath;

    private String adminname;

    private Date bulletincreatetime;

    private Date bulletinedittime;

    private Integer bulletinstatus;

    public Long getBulletinid() {
        return bulletinid;
    }

    public void setBulletinid(Long bulletinid) {
        this.bulletinid = bulletinid;
    }

    public String getBulletintype() {
        return bulletintype;
    }

    public void setBulletintype(String bulletintype) {
        this.bulletintype = bulletintype == null ? null : bulletintype.trim();
    }

    public String getBulletintypepath() {
        return bulletintypepath;
    }

    public void setBulletintypepath(String bulletintypepath) {
        this.bulletintypepath = bulletintypepath == null ? null : bulletintypepath.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public Date getBulletincreatetime() {
        return bulletincreatetime;
    }

    public void setBulletincreatetime(Date bulletincreatetime) {
        this.bulletincreatetime = bulletincreatetime;
    }

    public Date getBulletinedittime() {
        return bulletinedittime;
    }

    public void setBulletinedittime(Date bulletinedittime) {
        this.bulletinedittime = bulletinedittime;
    }

    public Integer getBulletinstatus() {
        return bulletinstatus;
    }

    public void setBulletinstatus(Integer bulletinstatus) {
        this.bulletinstatus = bulletinstatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bulletinid=").append(bulletinid);
        sb.append(", bulletintype=").append(bulletintype);
        sb.append(", bulletintypepath=").append(bulletintypepath);
        sb.append(", adminname=").append(adminname);
        sb.append(", bulletincreatetime=").append(bulletincreatetime);
        sb.append(", bulletinedittime=").append(bulletinedittime);
        sb.append(", bulletinstatus=").append(bulletinstatus);
        sb.append("]");
        return sb.toString();
    }
}
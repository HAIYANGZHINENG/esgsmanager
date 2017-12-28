package team.hyznrj.esgsmanager.entity;
/**
 * 
 * @ClassName  JurisdictionKey 
 * @Description  TODO 
 * @author 何伟涛
 * @date   2017年12月27日下午10:26:13
 */
public class JurisdictionKey {
    private String jurisdictionname;

    private String finenessname;

    public String getJurisdictionname() {
        return jurisdictionname;
    }

    public void setJurisdictionname(String jurisdictionname) {
        this.jurisdictionname = jurisdictionname == null ? null : jurisdictionname.trim();
    }

    public String getFinenessname() {
        return finenessname;
    }

    public void setFinenessname(String finenessname) {
        this.finenessname = finenessname == null ? null : finenessname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jurisdictionname=").append(jurisdictionname);
        sb.append(", finenessname=").append(finenessname);
        sb.append("]");
        return sb.toString();
    }
}
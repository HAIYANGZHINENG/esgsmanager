package team.hyznrj.esgsmanager.entity;

public class Userinfo {
    private Long userid;

    private String useradress;

    private String usersex;

    private String usereducation;

    private String userresearcharea;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUseradress() {
        return useradress;
    }

    public void setUseradress(String useradress) {
        this.useradress = useradress == null ? null : useradress.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUsereducation() {
        return usereducation;
    }

    public void setUsereducation(String usereducation) {
        this.usereducation = usereducation == null ? null : usereducation.trim();
    }

    public String getUserresearcharea() {
        return userresearcharea;
    }

    public void setUserresearcharea(String userresearcharea) {
        this.userresearcharea = userresearcharea == null ? null : userresearcharea.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", useradress=").append(useradress);
        sb.append(", usersex=").append(usersex);
        sb.append(", usereducation=").append(usereducation);
        sb.append(", userresearcharea=").append(userresearcharea);
        sb.append("]");
        return sb.toString();
    }
}
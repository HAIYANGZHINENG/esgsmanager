package team.hyznrj.esgsmanager.entity;

public class Userinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userId
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userAdress
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    private String useradress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userSex
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    private String usersex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userEducation
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    private String usereducation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userResearchArea
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    private String userresearcharea;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userId
     *
     * @return the value of userinfo.userId
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userId
     *
     * @param userid the value for userinfo.userId
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userAdress
     *
     * @return the value of userinfo.userAdress
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public String getUseradress() {
        return useradress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userAdress
     *
     * @param useradress the value for userinfo.userAdress
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public void setUseradress(String useradress) {
        this.useradress = useradress == null ? null : useradress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userSex
     *
     * @return the value of userinfo.userSex
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public String getUsersex() {
        return usersex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userSex
     *
     * @param usersex the value for userinfo.userSex
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userEducation
     *
     * @return the value of userinfo.userEducation
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public String getUsereducation() {
        return usereducation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userEducation
     *
     * @param usereducation the value for userinfo.userEducation
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public void setUsereducation(String usereducation) {
        this.usereducation = usereducation == null ? null : usereducation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userResearchArea
     *
     * @return the value of userinfo.userResearchArea
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public String getUserresearcharea() {
        return userresearcharea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userResearchArea
     *
     * @param userresearcharea the value for userinfo.userResearchArea
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public void setUserresearcharea(String userresearcharea) {
        this.userresearcharea = userresearcharea == null ? null : userresearcharea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
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
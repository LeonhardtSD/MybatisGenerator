package com.gao.pojo;

public class Myuser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myuser.uid
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myuser.uname
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    private String uname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myuser.age
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myuser.phone
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    private String phone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myuser.uid
     *
     * @return the value of myuser.uid
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myuser.uid
     *
     * @param uid the value for myuser.uid
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myuser.uname
     *
     * @return the value of myuser.uname
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myuser.uname
     *
     * @param uname the value for myuser.uname
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myuser.age
     *
     * @return the value of myuser.age
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myuser.age
     *
     * @param age the value for myuser.age
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myuser.phone
     *
     * @return the value of myuser.phone
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myuser.phone
     *
     * @param phone the value for myuser.phone
     *
     * @mbg.generated Mon Apr 02 08:47:27 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}
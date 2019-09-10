package com.Discountsafe.LB_C.codestorage;

public class Role {

    public int id;

       @column (name"rolename" )
    private string role;

    @column (name"roledescription" )
    private string description;

    public int getId() {
        return id;
    }
    public int setId(int id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDesccription() {
        return desctription;
    }

    public void setDesription(String desc) {
        this.desctription = desc;
    }
}

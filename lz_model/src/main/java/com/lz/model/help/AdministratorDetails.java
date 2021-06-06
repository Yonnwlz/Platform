package com.lz.model.help;

import com.lz.model.pojo.Admin;
import com.lz.model.pojo.Menus;
import com.lz.model.pojo.Rolerela;

import java.io.Serializable;
import java.util.List;

/***
 * 管理员详情类
 */
public class AdministratorDetails implements Serializable {
    private static final long serialVersionUID = 7585356464012284562L;
    private Admin admin;

    private Rolerela rolerela;

    private List<Menus> menusList;

    public AdministratorDetails() {
    }

    public AdministratorDetails(Admin admin, Rolerela rolerela, List<Menus> menusList) {
        this.admin = admin;
        this.rolerela = rolerela;
        this.menusList = menusList;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Rolerela getRolerela() {
        return rolerela;
    }

    public void setRolerela(Rolerela rolerela) {
        this.rolerela = rolerela;
    }

    public List<Menus> getMenusList() {
        return menusList;
    }

    public void setMenusList(List<Menus> menusList) {
        this.menusList = menusList;
    }
}

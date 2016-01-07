/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rmu.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Beeby
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
    private String user;
    private String prssword;
    private String todo;

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the prssword
     */
    public String getPrssword() {
        return prssword;
    }

    /**
     * @param prssword the prssword to set
     */
    public void setPrssword(String prssword) {
        this.prssword = prssword;
    }

    /**
     * @return the todo
     */
    public String getTodo() {
        return todo;
    }

    /**
     * @param todo the todo to set
     */
    public void setTodo(String todo) {
        this.todo = todo;
    }
    
    
}

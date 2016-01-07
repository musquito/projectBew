/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rmu.action;

import com.rmu.form.LoginForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Beeby
 */
public class loginAction extends DispatchAction {

    String result;

    public ActionForward login(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        LoginForm loginForm = (LoginForm) form;
//        UserDao userDao = new UserDao();
//        UesrBean uesrBean = null;

        String username = loginForm.getUser();
        String password = loginForm.getPrssword();

        System.out.println("username==:" + username);
        System.out.println("password==:" + password);
        try {
//            uesrBean = userDao.selectById(username, password);
            if (username.equals(password)) {
                System.out.println("1");
                request.getSession().setAttribute("uesrBean", username);
                result = "success";
                System.out.println("2");
            } else {
                String message = "user or password incorrect !";
                System.out.println("3");
                request.setAttribute("message", message);
                result = "error";
            }
            System.out.println("4");
        } catch (Exception e) {
            e.printStackTrace();

        }
        return mapping.findForward(result);
    }

    public ActionForward baseLayout(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        return mapping.findForward("baseLayout");
    }
}

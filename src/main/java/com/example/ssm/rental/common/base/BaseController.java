package com.example.ssm.rental.common.base;

import com.example.ssm.rental.common.enums.UserRoleEnum;
import com.example.ssm.rental.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * 收藏
 *
 * @author 言曌
 * @date 2021/3/13 2:28 下午
 */
@Controller
public abstract class BaseController {


    @Autowired
    private HttpServletRequest request;


    /**
     * 渲染404页面
     *
     * @return redirect:/404
     */
    public String renderNotFound() {
        return "forward:/404";
    }


    /**
     * 渲染404页面
     *
     * @return redirect:/404
     */
    public String renderNotAllowAccess() {
        return "redirect:/403";
    }

    /**
     * 获得登录用户
     *
     * @return
     */
    public User getLoginUser() {
        User user = (User) request.getSession().getAttribute("user");
        return user;
    }

    /**
     * 当前用户ID
     *
     * @return
     */
    public Long getLoginUserId() {
        User user = getLoginUser();
        if (user == null) {
            return null;
        }
        return user.getId();
    }

    /**
     * 当前用户是管理员
     *
     * @return
     */
    public Boolean loginUserIsAdmin() {
        User loginUser = getLoginUser();
        if (loginUser != null) {
            return UserRoleEnum.ADMIN.getValue().equalsIgnoreCase(loginUser.getRole());
        }

        return false;
    }

    /**
     * 当前用户是租客
     *
     * @return
     */
    public Boolean loginUserIsCustomer() {
        User loginUser = getLoginUser();
        if (loginUser != null) {
            return UserRoleEnum.CUSTOMER.getValue().equalsIgnoreCase(loginUser.getRole());
        }

        return false;
    }


    /**
     * 当前用户是房东
     *
     * @return
     */
    public Boolean loginUserIsOwner() {
        User loginUser = getLoginUser();
        if (loginUser != null) {
            return UserRoleEnum.OWNER.getValue().equalsIgnoreCase(loginUser.getRole());
        }

        return false;
    }


}

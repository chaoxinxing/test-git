package com.pactera.springboot.controller;

import com.pactera.springboot.code.YesOrNo;
import com.pactera.springboot.model.Member;
import com.pactera.springboot.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class LoginController {
    @Autowired
    private MemberService memberService;

    /**
     * 注册页面
     *
     * @return
     */
    @GetMapping("/register")
    public Object register() {
        return "register";
    }

    /**
     * 注册提交
     *
     * @return
     */
    @PostMapping(value = "/submitRegister")
    public Object submitRegister(Member member, Model model,
                                 HttpServletRequest request) throws Exception {
        if (null == member || StringUtils.isEmpty(member.getCode())
                || StringUtils.isEmpty(member.getName())) {
            model.addAttribute("msg", "参数错误");
            return "error";
        }

        if (null != memberService.findByPrimaryKey(member.getCode())) {
            model.addAttribute("msg", "会员号已被注册");
            return "error";
        }
        member.setRegisterTime(new Date());
        member.setStatus(YesOrNo.YES.getValue());
        memberService.insert(member);

        return "login";
    }

    /**
     * 登录页面
     *
     * @return
     */
    @GetMapping(value = {"/login", "/"})
    public Object login() {
        return "login";
    }

    /**
     * 退出登录
     *
     * @param request
     * @return
     */
    @GetMapping(value = {"/logout"})
    public Object logout(HttpServletRequest request) {
        request.getSession().removeAttribute("member");

        return "login";
    }

    /**
     * 登录提交
     *
     * @return
     */
    @PostMapping("/submitLogin")
    public Object submitLogin(String code, String password, Model model,
                              HttpServletRequest request) {
        String msg = null;
        if (StringUtils.isEmpty(code) || StringUtils.isEmpty(password)) {
            msg = "参数错误";
        } else {
            Member member = this.memberService.findByPrimaryKey(code);
            if (null == member) {
                msg = "用户不存在";
            } else if (!password.equals(member.getPassword())) {
                msg = "用户密码错误";
            }
            request.getSession().setAttribute("member", member);
        }
        if (null != msg) {
            model.addAttribute("msg", msg);
            return "error";
        }

        return "redirect:/home";
    }

    /**
     * home主页
     *
     * @return
     */
    @GetMapping("/home")
    public Object home(Model model, HttpServletRequest request) {
        return "home";
    }
}

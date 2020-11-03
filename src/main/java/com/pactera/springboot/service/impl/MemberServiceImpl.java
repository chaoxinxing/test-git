package com.pactera.springboot.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pactera.springboot.mapper.MemberMapper;
import com.pactera.springboot.model.Member;
import com.pactera.springboot.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Lance
 * @create: 2020-09-19
 **/
@Service
public class MemberServiceImpl extends BaseServiceImpl<Member> implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public BaseMapper<Member> getMapper() {
        return memberMapper;
    }
}
